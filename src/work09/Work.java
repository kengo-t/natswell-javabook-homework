package work09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

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
		 * 
		 * 日付データのファイルを100日後の日付に変更したファイルを生成する
		 * 
		 */
		
		Path from = Paths.get("./src/work09/date.txt");
		List<String> strings=null;
		try(BufferedReader br = Files.newBufferedReader(from)){
			strings = br.lines().collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		Path to = Paths.get("./src/work09/plus100Date.txt");
		//LocalDateクラスに変換するためのフォーマットを作成
		DateTimeFormatter format = DateTimeFormatter.ofPattern("y-M-d");
		try(BufferedWriter bw = Files.newBufferedWriter(to)){
			for (String str : strings) {
				//フォーマットに従ってLocalDateクラスのインスタンスに変換したのち100日後に変更
				LocalDate temp = LocalDate.from(format.parse(str)).plusDays(100);
				//元のフォーマットに戻し出力ファイルに書き込む
				bw.append(format.format(temp)+"\n");
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}