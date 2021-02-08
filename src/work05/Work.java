package work05;

import java.util.ArrayList;
import java.util.List;

public class Work {

	public static void main(String[] args) {

//		Sample.sampleCode();

		/*
		 * work05
		 * ラムダ式とStreamAPI
		 * 
		 * いくつかの生徒のデータから特定のデータを取り出す
		 */

		List<Student> students = new ArrayList<Student>();
		students.add(new Student("佐藤", 1, 75));
		students.add(new Student("鈴木", 2, 26));
		students.add(new Student("高橋", 3, 85));
		students.add(new Student("田中", 1, 99));
		students.add(new Student("伊藤", 2, 36));
		students.add(new Student("山本", 3, 82));
		students.add(new Student("中村", 1, 83));
		students.add(new Student("小林", 2, 71));
		students.add(new Student("加藤", 3, 5));
		students.add(new Student("吉田", 1, 93));

		//クラスnのメンバー表示
		int n=2;
		System.out.println("クラス"+(n));
		students.stream()
			.filter(s -> (s.getClassroom() == n))
			.map(s -> s.getName())
			.forEach(System.out::println);
		
		System.out.println("-------------------------");
		//スコア順に上位5人表示
		students.stream()
			.sorted((s1,s2) -> s2.getScore() - s1.getScore())
			.limit(5)
			.map(s -> "スコア:"+s.getScore()+" 名前:"+s.getName()+" クラス:"+s.getClassroom())
			.forEach(System.out::println);

		System.out.println("-------------------------");
		

	}

}