package thedal;

//return ���� �޾� ��� ���� �����ִ� Ŭ����
public class Choice {
	private String say;
	
	//�������� ����
	boolean choiceGame(int num) {
		switch(num) {
			case 1: return true;
			case 2: return false;
			default: return false;
		}
	}
	
	//��� ��� ����
	Calc choiceCalc(int num) {
		Calc calc = new Calc();
		switch(num) {
			case 1: say = "���ϱ⸦ �����ϼ̽��ϴ�."; break;
			case 2: say = "���⸦ �����ϼ̽��ϴ�."; break;
			case 3: say = "���ϱ⸦ �����ϼ̽��ϴ�.";break;
			case 4: say = "�����⸦ �����ϼ̽��ϴ�"; break;
			default: say = "���� ����!";
		}
		System.out.println(say);
		calc.setChoiceCalc(num);
		return calc;
	}
	//���̵� ����
	int choiceHard(int num) {
		int choice = 0;
		
		switch(num) {
			case 1: say = "������ �����ϼ̽��ϴ�."; choice= 11;   break;
			case 2: say = "������ �����ϼ̽��ϴ�."; choice= 51;  break;
			case 3: say = "������� �����ϼ̽��ϴ�."; choice= 101; break;
			default: say = "���� ����!";
		}
		System.out.println(say);
		return choice;
	}
}
