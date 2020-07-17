package thedal;


//���� ���� ������ �޴� Ŭ����
public class Calc {

	private int choiceCalc;
	private int answer=0;

	public int getChoiceCalc() {
		return choiceCalc;
	}
	public void setChoiceCalc(int choiceCalc) {
		this.choiceCalc = choiceCalc;
	}
	public int getAnswer(int[] array) {
		//�������� ����
		doCalc(array);
		return answer;
	}
	
	//�����ڿ� ���� �� ��ȯ
	private void doCalc(int[] array) {
		switch(choiceCalc) {
			case 1: answer=plus(array); break;
			case 2: answer=sub(array); break;
			case 3: answer=multi(array); break;
			case 4: answer=div(array); break;
		}
	}
	
	//���ϱ� �����
	private int plus(int[] array) {
		for(int i=0; i<array.length;i++) {
			answer += array[i];
		}
		return answer;
	}
	//���� �����
	private int sub(int[] array) {
		answer = array[0];
		for(int i=1; i<array.length;i++) {
			answer -= array[i];
		}
		return answer;
	}
	//���ϱ� �����
	private int multi(int[] array) {
		answer = array[0];
		for(int i=1; i<array.length;i++) {
			answer *= array[i];
		}
		return answer;
	}
	//������ �����
	private int div(int[] array) {
		answer = array[0];
		for(int i=1; i<array.length;i++) {
			answer /= array[i];
		}
		return answer;
	}
}
