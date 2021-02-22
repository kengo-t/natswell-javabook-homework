package work13;

import java.util.ArrayList;
import java.util.List;

/**
 * 生徒追加条件がスコアである大学クラス
 * 
 * @author kengo-t
 *
 */

public class UniversityA implements School{
	
	protected String universityName;
	protected List<Student> listStudents;
	
	
	/**
	 * @param universityName 大学名
	 */
	public UniversityA(String universityName) {
		this.universityName = universityName;
		this.listStudents = new ArrayList<>();
	}
	
	@Override
	public String getName(){
		return universityName;
	}
	
	@Override
	public List<Student> list() {
		return listStudents;
	}

	@Override
	public boolean add(Student student) {
		if(student.getScore() < 50) {
			return false;
		}else{
			listStudents.add(student);
			return true;
		}
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
