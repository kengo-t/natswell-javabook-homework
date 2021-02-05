package work04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Work {

	public static void main(String[] args) {

		work1();
		work2();
		work3();

	}

	public static void work1(){

		System.out.println("---work4-1---");
		Grade g1 = new Grade("山田", 70, 90, 90);
		Grade g2 = new Grade("佐藤", 80, 70, 80);
		Grade g3 = new Grade("鈴木", 95, 65, 60);
		Grade[] grades = {g1,g2,g3};

		Comparator<Grade> comparatorOfSum =  new Comparator<Grade>() {
			@Override
			public int compare(Grade o1, Grade o2) {
				return Integer.compare(o2.calSum(), o1.calSum());
			}
		};

		Comparator<Grade> comparatorOfEnglish =  new Comparator<Grade>() {
			@Override
			public int compare(Grade o1, Grade o2) {
				return Integer.compare(o2.getEnglish(), o1.getEnglish());
			}
		}; 

		Comparator<Grade> comparatorOfJapanese =  new Comparator<Grade>() {
			@Override
			public int compare(Grade o1, Grade o2) {
				return Integer.compare(o2.getJapanese(), o1.getJapanese());
			}
		}; 

		Comparator<Grade> comparatorOfMath =  new Comparator<Grade>() {
			@Override
			public int compare(Grade o1, Grade o2) {
				return Integer.compare(o2.getMath(), o1.getMath());
			}
		}; 

		Arrays.sort(grades, comparatorOfSum);
		System.out.println("合計点");
		for (Grade grade : grades) {
			System.out.println(grade.getName()+": 合計 "+grade.calSum()+": 英語 "+grade.getEnglish()+", 国語　"+grade.getJapanese()+", 数学 "+grade.getMath());
		}
		Arrays.sort(grades, comparatorOfEnglish);
		System.out.println("英語");
		for (Grade grade : grades) {
			System.out.println(grade.getName()+": 合計 "+grade.calSum()+": 英語 "+grade.getEnglish()+", 国語　"+grade.getJapanese()+", 数学 "+grade.getMath());
		}
		Arrays.sort(grades, comparatorOfJapanese);
		System.out.println("国語");
		for (Grade grade : grades) {
			System.out.println(grade.getName()+": 合計 "+grade.calSum()+": 英語 "+grade.getEnglish()+", 国語　"+grade.getJapanese()+", 数学 "+grade.getMath());
		}
		Arrays.sort(grades, comparatorOfMath);
		System.out.println("数学");
		for (Grade grade : grades) {
			System.out.println(grade.getName()+": 合計 "+grade.calSum()+": 英語 "+grade.getEnglish()+", 国語　"+grade.getJapanese()+", 数学 "+grade.getMath());
		}
	}

	public static void work2(){

		System.out.println("---work4-2---");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 1000; i++) {
			if(i%9 == 0) {
				list.add(i);
			}
		}
		System.out.println("9の倍数: "+list.size());
		for (Integer integer : list) {
			System.out.println(integer);
		}
		

	}
	
	public static void work3(){

		System.out.println("---work4-3---");
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		map.put(5,0);
		map.put(7, 0);
		map.put(9, 0);
		for (int i = 1; i <= 1000; i++) {
			if(i%5 == 0) {
				map.put(5, map.get(5)+1);
			}
			if(i%7 == 0) {
				map.put(7, map.get(7)+1);
			}
			if(i%9 == 0) {
				map.put(9, map.get(9)+1);
			}
		}
		for (Integer key : map.keySet()) {
			System.out.println(key+"の倍数の個数: "+map.get(key)+"個");
		}
		

	}
}