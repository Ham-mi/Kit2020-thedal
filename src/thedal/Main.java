package thedal;
/*
 * // 연산의 달인		
// 1. 더하기		
// 2. 빼기		
// 3. 곱하기		
// 4. 나누기		
// 0. 종료		
// 1 -> 더하기 문제가 10 문제 정도 나오고		
// 정답수 와 틀린수 를 출력 해주고 다시 위의 메뉴 출력		
// 그외 연산도 위와 같은 방식으로		
// 문자가 입력되면 예외처리까지 해보세요~		
// 힘들면 안해도 됨(예외처리는)		
// 전체적으로 할 수 있는데 까지 해봅니다.		
// 메인 메소드에는 최소한의 코드만 있고 for(;;)		
// 다 클래스에 매소드로 구현 해보세요~		
// 클래스는 도저히 만들기 힘드면 메인 메소드에 다 써놓고		
// 나중에 짤라내기 하는게 편할수 있다.		
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
			//시작 종료 선택
			System.out.println("");
			num = st.select("연산의 달인", "1.시작", "2.종료");
			if(ch.choiceGame(num)==false){
				//종료 선택시 while 종료
				break;
			}
			correct=0; wrong=0;
			
			//연산을 선택
			System.out.println("");
			num = st.select("연산 선택", "1.더하기", "2.빼기", "3.곱하기","4.나누기");
			//Calc,Rand 클래스에 선택한 연산값을 넘긴다.
			cl = ch.choiceCalc(num);
			sr.setchoiceCalc(num);
			
			//난이도를 선택
			System.out.println("");
			num2 = st.select("난이도 선택", "1.쉬움(1~10)", "2.보통(1~50)", "3.어려움(1~100)");
			//Rand 클래스에 선택한 난이도값을 넘긴다.
			sr.setChoicehard(ch.choiceHard(num2));
			
			//난이도 별로 연산 횟수를 넣어 그 횟수만큼 랜덤값을 가져온다.
			for(int i=0;i<doGame;i++) {
				arrayRand = sr.randints(num2+1);
				result = cl.getAnswer(arrayRand);
				answer = st.answer(arrayRand, sr.getChoiceCalc());
				if(st.check(result, answer)) correct++;
				else wrong++;
			}
			System.out.println("");
			System.out.println("정답수 : " + correct + "오답수 : " + wrong);
			
		}
		
		
	}

}
