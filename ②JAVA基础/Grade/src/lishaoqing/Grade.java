package lishaoqing;

public class Grade {

	private String name;
	private String number;
	private double language;
	private double math;
	private double english;
	private double score;
	
	public Grade() {
		super();
	}

	public Grade(String name, String number, double language, double math,
			double english, double score) {
		super();
		this.name = name;
		this.number = number;
		this.language = language;
		this.math = math;
		this.english = english;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getLanguage() {
		return language;
	}

	public void setLanguage(double language) {
		this.language = language;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getScore() {
		return language+math+english;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Grade [name=" + name + ", number=" + number + ", language="
				+ language + ", math=" + math + ", english=" + english
				+ ", score=" + language+math+english + "]";
	}
	
	
}
