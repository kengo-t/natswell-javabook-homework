package work13;

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
	
	/**
	 * 生徒の名前を返す
	 * @return 生徒の名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 生徒の年齢を返す
	 * @return 生徒の年齢
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 生徒のスコアを返す
	 * @return 生徒のスコア
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * 生徒の名前を更新する
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 生徒の年齢を更新する
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * 生徒のスコアを更新する
	 * @param score
	 */
	public void setScore(int score) {
		this.score = score;
	}
}
