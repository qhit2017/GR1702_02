package lishaoqing;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeImplements implements IGrade {

	void help() {
		System.out.println("----高考评分系统----");
		System.out.println("1	录入考生的高考信息");
		System.out.println("2	显示所有考生信息");
		System.out.println("3	查询最高分, 包括: 总分最高分 和 单科最高分");
		System.out.println("4	退出功能");
	}

	@Override
	public void add(ArrayList<Grade> arrayList, Scanner sc) {

		String s = sc.next();
		String[] arr = s.split(",");
		if (arr.length != 5) {
			System.out.println("你输入的格式不对");
		} else {
			Grade g = new Grade();
			g.setName(arr[0]);
			g.setNumber(arr[1]);
			g.setLanguage(Double.parseDouble(arr[2]));
			g.setMath(Double.parseDouble(arr[3]));
			g.setEnglish(Double.parseDouble(arr[4]));
			// g.setScore(Double.parseDouble(arr[5]));

			arrayList.add(g);

			System.out.println(g.toString());
		}
	}

	@Override
	public void info(ArrayList<Grade> arrayList) {
		// TODO Auto-generated method stub
		for (Grade grade : arrayList) {
			System.out.println(grade.toString());
		}
	}

	@Override
	public void max(ArrayList<Grade> arrayList, Scanner sc) {
		System.out.println("---最高分查询系统---");
		System.out.println("请输入对应数字指令：");
		System.out.println("1  查询语文最高分");
		System.out.println("2  查询数学最高分");
		System.out.println("3  查询英语最高分");
		System.out.println("4  退出");

		boolean isexit = true;
		while (isexit) {
			int nextInt = sc.nextInt();
			switch (nextInt) {
			case 1:
				double maxLanguage = 0;

				for (int i = 0; i < arrayList.size(); i++) {
					double language = arrayList.get(i).getLanguage();

					if (language > maxLanguage) {
						maxLanguage = language;
					}
				}
				System.out.println("语文最高分为：" + maxLanguage);

				break;
			case 2:
				double maxMath = 0;

				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getMath() > maxMath) {
						maxMath = arrayList.get(i).getMath();
					}
				}
				System.out.println("数学最高分为：" + maxMath);
				break;
			case 3:
				double maxEnglish = 0;
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getEnglish() > maxEnglish) {
						maxEnglish = arrayList.get(i).getEnglish();
					}
				}
				System.out.println("英语最高分为：" + maxEnglish);
				break;
			case 4:
				isexit = false;
				break;
			default:
				break;
			}
		}
		System.out.println("您已退出最高分查询系统");
	}

}
