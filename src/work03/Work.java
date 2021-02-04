package work03;

public class Work {

	public static void main(String[] args) {

		System.out.println("---work3-1---");
		Account account = new Account("山田",0);
		operateAccount(account,OperateType.DEPOSIT,10000);
		operateAccount(account,OperateType.WITHDRAW,20000);
		operateAccount(account,OperateType.WITHDRAW,5000);


		System.out.println("---work3-2---");
		for (EvaluateType et : EvaluateType.values()) {
			System.out.println(et.getEval()+": "+et.getLower()+" - "+et.getUpper());
		}



		System.out.println("---work3-3---");
		GradeA g1 = new GradeA("山田",90,60,70);
		GradeB g2 = new GradeB("佐藤",0,55,80);
		System.out.println(g1.getName()+": "+g1.getUniversityName()+", 英語 "+g1.englishGrade()+", 国語　"+g1.japaneseGrade()+", 数学 "+g1.mathGrade());
		System.out.println(g2.getName()+": "+g2.getUniversityName()+", 英語 "+g2.englishGrade()+", 国語　"+g2.japaneseGrade()+", 数学 "+g2.mathGrade());


	}

	public static void operateAccount(Account account, OperateType operate,int amount) {
		switch (operate) {
		case DEPOSIT: {
			account.deposit(amount);
			System.out.println(account.getName()+"さんの口座: 入金 "+amount+" 円: 残高 "+account.getBalance()+" 円");
			break;
		}
		case WITHDRAW: {
			System.out.println(account.getName()+"さんの口座: 出金 "+account.withdraw(amount)+" 円: 残高 "+account.getBalance()+" 円");
			break;
		}
		}
	}
}
