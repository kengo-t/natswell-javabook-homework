package work06;

import java.util.OptionalInt;

/**
 * Java本格入門6章
 * 例外
 * 
 * @author kengo-t
 *
 */

public class Work {

	public static void main(String[] args) {
		
		//呼び出し先でNullPointerExceptionが発生、自動的に呼び出し元に伝搬し最終的にスレッド(この場合メインプログラム)が終了
//		sample1();
		//try-catchした場合
		try {
			sample1();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//例外発生
		try {
			Student s= new Student("田中", 140);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		OptionalInt oi1 = OptionalInt.empty();
		OptionalInt oi2 = OptionalInt.of(7);
		if(oi1.isPresent()) {
			System.out.println(oi1);
		}
		//上と同様の処理になる
		oi2.ifPresent(System.out::println);
		
		
	}
	
	public static void sample1() {
		String string = null;
		System.out.println(string.length());
	}

}
