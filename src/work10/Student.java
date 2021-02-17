package work10;

/**
 * 生徒データを表すクラス
 * 
 * @author kengo-t
 *
 */
public class Student{

	private String name;
	private int age;
	private int score;
	
	/**
	 * @param name 生徒の名前
	 * @param age 生徒の年齢
	 * @param score 生徒の成績
	 */
	public Student(String name,int age, int score){
		this.name = name;
		this.age = age;
		this.score=score;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getScore() {
		return score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
