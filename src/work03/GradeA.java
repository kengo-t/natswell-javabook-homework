package work03;

public class GradeA implements University{
	private String name,universityName;
	private int english,japanese,math;
	
	GradeA(String name,int english, int japanese, int math){
		this.name=name;
		this.universityName="A‘åŠw";
		this.english=english;
		this.japanese=japanese;
		this.math=math;
	}

	public int calAvg() {
		return  (english + japanese + math) / 3;
	}
	
	public String englishGrade() {
		return evaluateGrade(english);
	}
	
	public String japaneseGrade() {
		return evaluateGrade(japanese);
	}

	public String mathGrade() {
		return evaluateGrade(math);
	}

	public String getName() {
		return name;
	}

	public String getUniversityName() {
		return universityName;
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

	@Override
	public String evaluateGrade(int score) {
		if(score<60)return "F";
		else if(score<65)return "D";
		else if(score<75)return "C";
		else if(score<85)return "B";
		else if(score<95)return "A";
		else if(score<=100)return "A+";
		else return "";
	}
		
}