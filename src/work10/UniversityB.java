package work10;

import java.util.List;

/**
 * 生徒追加条件が年齢である大学クラス
 * 
 * @author kengo-t
 *
 */

public class UniversityB extends University{
	
	public UniversityB(String name, List<Student> listStudents) {
		super(name);
	}

	@Override
	public String evaluateGrade(int score) {
		if(score<60)return "優";
		else if(score<70)return "良";
		else if(score<80)return "可";
		else if(score<100)return "不可";
		else return "";
	}

	@Override
	public boolean add(Student student) {
		if(student.getAge() > 20) {
			return false;
		}else{
			listStudents.add(student);
			return true;
		}
	}


}
