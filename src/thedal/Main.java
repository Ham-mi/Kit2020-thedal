package thedal;
/*
 * // ������ ����		
// 1. ���ϱ�		
// 2. ����		
// 3. ���ϱ�		
// 4. ������		
// 0. ����		
// 1 -> ���ϱ� ������ 10 ���� ���� ������		
// ����� �� Ʋ���� �� ��� ���ְ� �ٽ� ���� �޴� ���		
// �׿� ���굵 ���� ���� �������		
// ���ڰ� �ԷµǸ� ����ó������ �غ�����~		
// ����� ���ص� ��(����ó����)		
// ��ü������ �� �� �ִµ� ���� �غ��ϴ�.		
// ���� �޼ҵ忡�� �ּ����� �ڵ常 �ְ� for(;;)		
// �� Ŭ������ �żҵ�� ���� �غ�����~		
// Ŭ������ ������ ����� ����� ���� �޼ҵ忡 �� �����		
// ���߿� ©�󳻱� �ϴ°� ���Ҽ� �ִ�.		
 * */
public class Main {
	public static void main(String[] args) {
		Sentence st = new Sentence();
		Choice ch = new Choice();
		SelectRand sr = new SelectRand();
		Calc cl = new Calc();
		int num,num2;
		int[] arrayRand;
		int result,answer;
		int correct = 0,wrong=0,doGame=10;
		
		while(true) {
			//���� ���� ����
			System.out.println("");
			num = st.select("������ ����", "1.����", "2.����");
			if(ch.choiceGame(num)==false){
				//���� ���ý� while ����
				break;
			}
			correct=0; wrong=0;
			
			//������ ����
			System.out.println("");
			num = st.select("���� ����", "1.���ϱ�", "2.����", "3.���ϱ�","4.������");
			//Calc,Rand Ŭ������ ������ ���갪�� �ѱ��.
			cl = ch.choiceCalc(num);
			sr.setchoiceCalc(num);
			
			//���̵��� ����
			System.out.println("");
			num2 = st.select("���̵� ����", "1.����(1~10)", "2.����(1~50)", "3.�����(1~100)");
			//Rand Ŭ������ ������ ���̵����� �ѱ��.
			sr.setChoicehard(ch.choiceHard(num2));
			
			//���̵� ���� ���� Ƚ���� �־� �� Ƚ����ŭ �������� �����´�.
			for(int i=0;i<doGame;i++) {
				arrayRand = sr.randints(num2+1);
				result = cl.getAnswer(arrayRand);
				answer = st.answer(arrayRand, sr.getChoiceCalc());
				if(st.check(result, answer)) correct++;
				else wrong++;
			}
			System.out.println("");
			System.out.println("����� : " + correct + "����� : " + wrong);
			
		}
		
		
	}

}
