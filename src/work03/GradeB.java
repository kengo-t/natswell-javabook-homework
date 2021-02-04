package work03;

public class GradeB implements University{
	private String name,universityName;
	private int english,japanese,math;
	
	GradeB(String name, int english, int japanese, int math){
		this.name=name;
		this.universityName="B‘åŠw";
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
		if(score<60)return "•s‰Â";
		else if(score<70)return "‰Â";
		else if(score<80)return "—Ç";
		else if(score<100)return "—D";
		else return "";
	}
	
}