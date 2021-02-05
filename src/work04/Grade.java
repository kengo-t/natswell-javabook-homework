
package work04;

public class Grade {
	private String name;
	private int english,japanese,math;
	
	Grade(String name, int english, int japanese, int math){
		this.name=name;
		this.english=english;
		this.japanese=japanese;
		this.math=math;
	}
	
	public int calSum() {
		return english + japanese + math;
	}

	public String getName() {
		return name;
	}

	public int getEnglish() {
		return english;
	}

	public int getJapanese() {
		return japanese;
	}

	public int getMath() {
		return math;
	}
	
	
}