package work03;

public class Work {

	public static void main(String[] args) {

		System.out.println("---work3-1---");
		Account account = new Account("�R�c",0);
		operateAccount(account,OperateType.DEPOSIT,10000);
		operateAccount(account,OperateType.WITHDRAW,20000);
		operateAccount(account,OperateType.WITHDRAW,5000);


		System.out.println("---work3-2---");
		for (EvaluateType et : EvaluateType.values()) {
			System.out.println(et.getEval()+": "+et.getLower()+" - "+et.getUpper());
		}



		System.out.println("---work3-3---");
		GradeA g1 = new GradeA("�R�c",90,60,70);
		GradeB g2 = new GradeB("����",0,55,80);
		System.out.println(g1.getName()+": "+g1.getUniversityName()+", �p�� "+g1.englishGrade()+", ����@"+g1.japaneseGrade()+", ���w "+g1.mathGrade());
		System.out.println(g2.getName()+": "+g2.getUniversityName()+", �p�� "+g2.englishGrade()+", ����@"+g2.japaneseGrade()+", ���w "+g2.mathGrade());


	}

	public static void operateAccount(Account account, OperateType operate,int amount) {
		switch (operate) {
		case DEPOSIT: {
			account.deposit(amount);
			System.out.println(account.getName()+"����̌���: ���� "+amount+" �~: �c�� "+account.getBalance()+" �~");
			break;
		}
		case WITHDRAW: {
			System.out.println(account.getName()+"����̌���: �o�� "+account.withdraw(amount)+" �~: �c�� "+account.getBalance()+" �~");
			break;
		}
		}
	}
}
