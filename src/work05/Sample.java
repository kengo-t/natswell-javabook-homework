package work05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {
	
	public static void sampleCode() {
		
		List<Student> members = new ArrayList<>();
		members.add(new Student("�R�c",1,70));
		members.add(new Student("����",1,50));
		members.add(new Student("�c��",1,90));
		
		//�X�g���[���쐬
		members.stream()
		//���ԑ���i�����j
			.filter(m -> m.getScore() >= 60)
		//�I�[����
//			.forEach(m -> System.out.println(m.getNumber()+"."+m.getName()));
		//�����_���ŋL�q
//			.forEach((Member m) -> {
//				System.out.println(m.getNumber());
//				System.out.println("."+m.getName());
//				});
		//��������Ȃ�()�ƌ^���ȗ���
		//��������Ȃ�{}�͏ȗ���
			.forEach(m -> System.out.println(m.getNumber()+"."+m.getName()));
		
		//�X�g���[���쐬
		members.stream()
		//���ԏ��� ���O�̃X�g���[���쐬
		//�����_���ŋL�q
//			.map(m -> m.getName())
		//���\�b�h�Q�� �����̊֐��^�C���^�[�t�F�[�X�̈����ƌ^����v���Ă����烁�\�b�h�����ł���
			.map(Student::getName)
		//�I�[����
		//���\�b�h�Q�Ƃ�
//			.forEach(System.out::println);
		//�����_����
			.forEach(name -> System.out.println(name));
		
		
		//�z�񂩂�stream�쐬 Arrays��stream���\�b�h�g�p
		int[] nums = {1,2,3,4,5};
		Arrays.stream(nums).forEach(System.out::println);
		

	}

}
