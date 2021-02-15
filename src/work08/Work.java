package work08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import work04.sample;

public class Work {

	 /**
	 * Java本格入門8章
	 * ファイル操作 
	 * 
	 * @author kengo-t
	 *
	 */
	
	public static void main(String[] args) {
		
		
		//8章まとめドキュメント読み込みここに
	
		/*
		 * studentファイル（行ごとに　名前,スコア）を読み込み、
		 * 数値(名前に対応するスコア)が５０以上のデータのみで構成されるような
		 * over50studentlistファイルを作成する
		 * 
		 */
		
		
		//読み込み先ファイルのパスを指定
		Path path1 = Paths.get("./src/work08/data/studentlist.txt");
		//書き込み先ファイルのパスを指定
		Path path2 = Paths.get("./src/work08/data/over50studentlist.txt");
		//入力ファイルから1行ごとに読み込み、スコアに応じて出力ファイルに書き込み
		try (BufferedReader br = Files.newBufferedReader(path1, StandardCharsets.UTF_8);
				BufferedWriter bw = Files.newBufferedWriter(path2, StandardCharsets.UTF_8)){
			br.lines()
				.map(s -> s.split(","))
				.filter(s -> Integer.parseInt(s[1])>=50)
				.map(s -> s[0]+","+s[1]+"\n")
				.forEach(s -> {
					try {
						bw.append(s);
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}