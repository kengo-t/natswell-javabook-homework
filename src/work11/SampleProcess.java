package work11;

import java.time.LocalTime;

/**
 * 
 * コンストラクタで指定された秒数の時間がかかる処理をもつrunメソッドを含むクラス
 * 
 * @author kengo-t
 *
 */

public class SampleProcess implements Runnable{

	private int sec;
	private String name;

	/**
	 * @param sec 処理にかける時間
	 * @param name 実行中のログ出力のためのスレッド名
	 */
	public SampleProcess(int sec, String name) {
		if(sec < 30) {
			this.sec = sec;			
		}else {
			this.sec = 30;
		}
		this.name = name;
	}

	/**
	 * 
	 */
	
	@Override
	public void run() {
		
		//sec秒かかる何らかの処理
		{
			int time = LocalTime.now().getMinute()*60 + LocalTime.now().getSecond();
			int cnt=0;
			try {
				while(LocalTime.now().getMinute()*60 + LocalTime.now().getSecond() - time < sec) {
					Thread.sleep(10);
					System.out.println(name+cnt);
					cnt++;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
