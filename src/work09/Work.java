package work09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 9章
 * 日付処理
 * 
 * @author kengo-t
 *
 */

public class Work {

	public static void main(String[] args) {
		
		/*
		 * 現在の日付から、入力された日数後の日付を成形して表示する
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int d=-1;
		while(d<=0){
			System.out.println("正の整数を入力してください");
			try {
				d = Integer.parseInt(sc.next());			
			} catch (Exception e) {
				System.out.println("不正な入力値です");
				continue;
			}
		}
		
		String date = DateTimeFormatter.ofPattern("y年M月d日")
										.format(LocalDate.now().plusDays(d));
		
		System.out.println(d+"日後は"+date+"です");
		
	}

}
