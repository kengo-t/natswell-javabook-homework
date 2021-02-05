package work07;

import java.io.UnsupportedEncodingException;

public class Work {

	public static void main(String[] args) {

		work1();
		work2();
		work3();
		work4();

	}

	public static void work1(){

		System.out.println("---work7-1---");
		String[] strings = {"orange","apple","peach"};
		StringBuilder sb = new StringBuilder();
		for (String string : strings) {
			sb.append("\"");
			sb.append(string);
			sb.append("\",");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);

	}

	public static void work2(){

		System.out.println("---work7-2---");
		String[] strings = {"takami-h","taro-y","hirata.takami","t-hirata","TAKAMI-H"};
		for (String string : strings) {
			if(isCorrectName(string)) {
				System.out.println(": OK");
			}else {
				System.out.println(": NG");
			}
		}

	}

	public static boolean isCorrectName(String name) {

		String[] strings = name.split("-");
		if(strings.length != 2) {
			return false;
		}
		if(strings[0].matches("[a-z]+") && strings[1].matches("[a-z]")) {
			return true;
		}else {
			return false;
		}
	}

	public static void work3(){

		System.out.println("---work7-3---");
		Account account = new Account("山田",0);
		operateAccount(account,OperateType.DEPOSIT,10000);
		operateAccount(account,OperateType.WITHDRAW,20000);
		operateAccount(account,OperateType.WITHDRAW,5000);

	}
	
	public static void operateAccount(Account account, OperateType operate,int amount) {
		switch (operate) {
		case DEPOSIT: {
			account.deposit(amount);System.out.printf("%sさんの口座: 入金 %10d 円: 残高 %10d 円\n",account.getName(),amount,account.getBalance());
			break;
		}
		case WITHDRAW: {
			System.out.printf("%sさんの口座: 出金 %10d 円: 残高 %10d 円\n",account.getName(),account.withdraw(amount),account.getBalance());
			break;
		}
		}
	}

	public static void work4(){

		System.out.println("---work7-4---");
		byte[] byts = {-114, -106, -111, 79, -118, 119, -113, 75, -126, -51, -113, 73, -105, -71, -126, -59,
				-126, -73, -127, 66, -126, -88, -108, -26, -126, -22, -105, 108, -126, -59, -126, -75,
				-126, -67, -127, 66};
		String string="";
		try {
			string = new String(byts,"MS932");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(string);


	}
	
}