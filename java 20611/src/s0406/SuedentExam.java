package s0406;

public class SuedentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student kim = new Student();
		Student an; 
		an = new Student();
		
		
		kim.name = "�ȵ���";
		kim.number = 20611;
		kim.phone = "010-3161-4816";
		kim.School="���ΰ�";
		System.out.println("�̸�:" + kim.name);
		System.out.println("��ȣ:" + kim.number);
		System.out.println("��ȭ:" + kim.phone);
		System.out.println("�б� �̸�:"+kim.School);
		
		an.name = "��ƹ���";
		an.number = 11100;
		an.phone = "011-294-4816";
		System.out.println("�̸�:" + an.name);
		System.out.println("��ȣ:" + an.number);
		System.out.println("��ȭ:" + an.phone);
		System.out.println("�б� �̸�:"+an.School);
		System.out.println("�� �л� ��:"+Student.count);
		
		
		
		
		
	}

}
