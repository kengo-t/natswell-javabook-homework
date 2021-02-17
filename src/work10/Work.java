package work10;

import java.util.ArrayList;
import java.util.List;

/**
 * Java本格入門10章
 * オブジェクト指向
 * 
 * @author kengo-t
 *
 */

public class Work {

	public static void main(String[] args) {
		
		/*
		 * 学校としての生徒管理機能はインターフェース(School)とし、
		 * 抽象クラス（University）で、そのインターフェースを実装
		 * 
		 * University型としてサブクラスをインスタンス化することで
		 * サブクラスでの実装メソッド(add,evaluateGrade)は異なるが、メソッド呼び出しは同じ記述で扱っている
		 * （サブクラスの実装内容を気にする必要なく扱うことができる）
		 * 
		 */
		
		List<University> universities = new ArrayList<>();
		universities.add(new UniversityA("A大学", new ArrayList<Student>()));
		universities.add(new UniversityB("B大学", new ArrayList<Student>()));
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("田中", 20, 70));
		students.add(new Student("佐藤", 10, 40));
		students.add(new Student("鈴木", 30, 60));
		students.add(new Student("山本", 40, 20));
		
		for (Student student : students) {
			for (University university : universities) {
				if(university.add(student)) {
					System.out.println(student.getName()+"さんは"+university.getName()+"に参加しました");
					break;
				}
				else {
					System.out.println(student.getName()+"さんは"+university.getName()+"に参加できませんでした");	
				}
			}
		}
		System.out.println();
		
		for (University university : universities) {
			System.out.println(university.getName());
			university.list().stream()
				.map(s -> s.getName()+"　評価:"+university.evaluateGrade(s.getScore()))
				.forEach(System.out::println);
		}
				
	}

}
