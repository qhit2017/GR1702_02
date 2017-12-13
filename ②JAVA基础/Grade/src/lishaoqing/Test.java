package lishaoqing;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Grade> arrayList = new ArrayList<Grade>();
		GradeImplements gradeImplements = new GradeImplements();
		Scanner sc = new Scanner(System.in);
		gradeImplements.help();
		boolean isExit = true;
		while (isExit) {
			int key = sc.nextInt();
			switch (key) {
			case 1:
				gradeImplements.add(arrayList, sc);
				break;
			case 2:
				gradeImplements.info(arrayList);
				break;
			case 3:
				gradeImplements.max(arrayList, sc);
				break;
			case 4:
				isExit=false;
				break;

			default:
				System.out.println("请输入正确的指令");
				break;
			}
		}
		System.out.println("拜拜");
	}

}
