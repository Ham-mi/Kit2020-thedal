package thedal;

//return 값을 받아 사용 값을 돌려주는 클래스
public class Choice {
	private String say;
	
	//시작종료 선택
	boolean choiceGame(int num) {
		switch(num) {
			case 1: return true;
			case 2: return false;
			default: return false;
		}
	}
	
	//계산 방법 선택
	Calc choiceCalc(int num) {
		Calc calc = new Calc();
		switch(num) {
			case 1: say = "더하기를 선택하셨습니다."; break;
			case 2: say = "빼기를 선택하셨습니다."; break;
			case 3: say = "곱하기를 선택하셨습니다.";break;
			case 4: say = "나누기를 선택하셨습니다"; break;
			default: say = "선택 오류!";
		}
		System.out.println(say);
		calc.setChoiceCalc(num);
		return calc;
	}
	//난이도 선택
	int choiceHard(int num) {
		int choice = 0;
		
		switch(num) {
			case 1: say = "쉬움을 선택하셨습니다."; choice= 11;   break;
			case 2: say = "보통을 선택하셨습니다."; choice= 51;  break;
			case 3: say = "어려움을 선택하셨습니다."; choice= 101; break;
			default: say = "선택 오류!";
		}
		System.out.println(say);
		return choice;
	}
}
