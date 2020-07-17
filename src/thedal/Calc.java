package thedal;


//값을 통한 연산을 받는 클래스
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
		//값연산을 실행
		doCalc(array);
		return answer;
	}
	
	//연산자에 따른 값 반환
	private void doCalc(int[] array) {
		switch(choiceCalc) {
			case 1: answer=plus(array); break;
			case 2: answer=sub(array); break;
			case 3: answer=multi(array); break;
			case 4: answer=div(array); break;
		}
	}
	
	//더하기 결과값
	private int plus(int[] array) {
		for(int i=0; i<array.length;i++) {
			answer += array[i];
		}
		return answer;
	}
	//빼기 결과값
	private int sub(int[] array) {
		answer = array[0];
		for(int i=1; i<array.length;i++) {
			answer -= array[i];
		}
		return answer;
	}
	//곱하기 결과값
	private int multi(int[] array) {
		answer = array[0];
		for(int i=1; i<array.length;i++) {
			answer *= array[i];
		}
		return answer;
	}
	//나누기 결과값
	private int div(int[] array) {
		answer = array[0];
		for(int i=1; i<array.length;i++) {
			answer /= array[i];
		}
		return answer;
	}
}
