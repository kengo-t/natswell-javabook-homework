package work13;

import java.util.List;

/**
 * 生徒管理機能を定義したインターフェース
 * 
 * @author kengo-t
 *
 */

public interface School {
	
	/**
	 * 生徒のリストを返します
	 * @return 生徒のリスト
	 */
	List<Student> list();
	
	/**
	 * 学校名を返します
	 * @return 学校名
	 */
	String getName();
	
	/**
	 * 生徒を登録します
	 * @param student
	 * @return 登録に成功した場合: {@code true} 
	 */
	boolean add(Student student);
	
	/**
	 * スコアに対する評価を返します
	 * @param score 評価するスコア
	 * @return　評価に対応する文字列
	 */
	public abstract String evaluateGrade(int score);
}
