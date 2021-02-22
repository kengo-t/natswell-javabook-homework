package work13;

import java.util.ArrayList;
import java.util.List;

/**
 * 生徒追加条件が年齢である大学クラス
 * 
 * @author kengo-t
 *
 */

public class UniversityB implements School{
	
	protected String universityName;
	protected List<Student> listStudents;
	
	
	/**
	 * @param universityName 大学名
	 */
	public UniversityB(String universityName) {
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
		if(score<60)return "優";
		else if(score<70)return "良";
		else if(score<80)return "可";
		else if(score<100)return "不可";
		else return "";
	}


}
