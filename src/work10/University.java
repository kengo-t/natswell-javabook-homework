package work10;

import java.util.ArrayList;
import java.util.List;

/**
 * 大学として生徒の管理を行う抽象クラス
 * 
 * @author kengo-t
 *
 */

public abstract class University implements School{
	
	protected String universityName;
	protected List<Student> listStudents;
	
	
	/**
	 * @param universityName 大学名
	 */
	protected University(String universityName) {
		this.universityName = universityName;
		listStudents = new ArrayList<>();
	}
	
	@Override
	public String getName(){
		return universityName;
	}
	
	@Override
	public List<Student> list() {
		return listStudents;
	}
	
	/**
	 * @param student 追加したい生徒
	 * @return 追加に成功した場合:{@code true}
	 */
	@Override
	public abstract boolean add(Student student);

	/**
	 * @param score 評価するスコア
	 * @return　評価に対応する文字列
	 */
	public abstract String evaluateGrade(int score);
}
