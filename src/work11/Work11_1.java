package work11;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Java本格入門11章
 * マルチスレッド
 * 
 * @author kengo-t
 *
 */

public class Work11_1 {

	/*
	 * 時間（指定した秒数）がかかる処理を複数スレッドで実行し、かかった時間を出力する
	 */
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		//スレッド数1,2,4,6で実行
		list.add(executeMultiThread(1));
		list.add(executeMultiThread(2));
		list.add(executeMultiThread(4));
		list.add(executeMultiThread(6));
		
		list.stream().forEach(System.out::println);
		
	}

	/**
	 * 
	 * {@code SampleProcess}クラスのrunメソッドを、指定されたスレッド数で実行する
	 * 
	 * @param num 同時に動かすスレッド数
	 * @return 実行にかかった時間
	 */
	public static String executeMultiThread(int num) {
		
		int time = LocalTime.now().getMinute()*60 + LocalTime.now().getSecond();

		ExecutorService executor = Executors.newFixedThreadPool(num);

		executor.execute(new SampleProcess(5, "A     "));
		executor.execute(new SampleProcess(2, " B    "));
		executor.execute(new SampleProcess(4, "  C   "));
		executor.execute(new SampleProcess(1, "   D  "));
		executor.execute(new SampleProcess(6, "    E "));
		executor.execute(new SampleProcess(2, "     F"));

		executor.shutdown();

		while(!executor.isTerminated()){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return "スレッド数"+num+"での実行時間: "+(LocalTime.now().getMinute()*60 + LocalTime.now().getSecond() - time)+"s";
	}

}
