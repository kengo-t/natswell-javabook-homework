package work05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {
	
	public static void sampleCode() {
		
		List<Student> members = new ArrayList<>();
		members.add(new Student("山田",1,70));
		members.add(new Student("佐藤",1,50));
		members.add(new Student("田中",1,90));
		
		//ストリーム作成
		members.stream()
		//中間操作（複数可）
			.filter(m -> m.getScore() >= 60)
		//終端操作
//			.forEach(m -> System.out.println(m.getNumber()+"."+m.getName()));
		//ラムダ式で記述
//			.forEach((Member m) -> {
//				System.out.println(m.getNumber());
//				System.out.println("."+m.getName());
//				});
		//引数が一つなら()と型名省略可
		//処理が一つなら{}は省略可
			.forEach(m -> System.out.println(m.getNumber()+"."+m.getName()));
		
		//ストリーム作成
		members.stream()
		//中間処理 名前のストリーム作成
		//ラムダ式で記述
//			.map(m -> m.getName())
		//メソッド参照 代入先の関数型インターフェースの引数と型が一致していたらメソッドを代入できる
			.map(Student::getName)
		//終端処理
		//メソッド参照で
//			.forEach(System.out::println);
		//ラムダ式で
			.forEach(name -> System.out.println(name));
		
		
		//配列からstream作成 Arraysのstreamメソッド使用
		int[] nums = {1,2,3,4,5};
		Arrays.stream(nums).forEach(System.out::println);
		

	}

}
