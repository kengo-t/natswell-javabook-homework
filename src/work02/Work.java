package work02;

public class Work {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		System.out.println("---work2-1---");
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+" x "+j+" = "+i*j);				
			}
		}
		
		
		System.out.println("---work2-2---");
		Product p1 = new Product("����",200);
		Product p2 = new Product("���[�O���g",�P00);
		p1.printPrice();
		p2.printPrice();
		
		
		System.out.println("---work2-3---");
		Grade g1 = new Grade("�R�c",90,60,70);
		Grade g2 = new Grade("����",0,55,80);
		Grade g3 = new Grade("���",20,40,100);
		g1.printData();
		g2.printData();
		g3.printData();
	}

}
