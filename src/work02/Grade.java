package work02;

public class Grade {
	private String name;
	private int english,japanese,math;
	
	Grade(String name, int english, int japanese, int math){
		this.name=name;
		this.english=english;
		this.japanese=japanese;
		this.math=math;
	}
	
	public int calAvg() {
		return  (english + japanese + math) / 3;
	}
	
	public String evaluate(int subject) {
		String eval;
		if(subject<60)return "F";
		else if(subject<65)return "D";
		else if(subject<75)return "C";
		else if(subject<85)return "B";
		else if(subject<95)return "A";
		else if(subject<=100)return "A+";
		return "";
	}
	
	public void printData() {
		System.out.println(name+": 平均点　"+calAvg()+", 英語 "+evaluate(english)+", 国語　"+evaluate(japanese)+", 数学 "+evaluate(math));
	}
}