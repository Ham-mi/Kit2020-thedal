package thedal;

import java.util.InputMismatchException;
import java.util.Scanner;

//문장을 출력하고 값을 선택받는 클래스

public class Sentence {
	public Sentence(){
		if(sc==null) {
			sc= new Scanner(System.in);
		}
	}
	Scanner sc;
	int number;
	
	//2개를 선택
		int select(String say,String c1,String c2) {
			
			while(true) {
				try {
					System.out.println(say);
					System.out.println(c1);
					System.out.println(c2);
					System.out.print(">> ");
					
					//nextInt는 엔터값이 입력되어있어 오류발생을 시킴. 해당 값을 모두 받아 int로 변환하는 과정을 거친다.
					number = Integer.parseInt(sc.nextLine());
					//입력받은 값이 2보다 크다면 오류를 발생시킴.
					if(number>2) throw new MyException();
					break;
				}catch(InputMismatchException e) {
					System.err.println("입력값 오류 발생");
				}catch(NumberFormatException e) {
					System.err.println("입력값 오류 발생");
				}catch(MyException e) {
					System.err.println("입력값 오류 발생");
				}
			}
			return number;
		}
	//3개를 선택
	int select(String say,String c1,String c2, String c3) {
		
		while(true) {
			try {
				System.out.println(say);
				System.out.println(c1);
				System.out.println(c2);
				System.out.println(c3);
				System.out.print(">> ");
				
				number = Integer.parseInt(sc.nextLine());
				if(number>3) throw new MyException();
				break;
			}catch(InputMismatchException e) {
				System.err.println("입력값 오류 발생");
			}catch(NumberFormatException e) {
				System.err.println("입력값 오류 발생");
			}catch(MyException e) {
				System.err.println("입력값 오류 발생");
			}
		}
		return number;
	}
	//4개 선택시
	int select(String say,String c1,String c2, String c3,String c4) {
		
		while(true) {
			try {
				System.out.println(say);
				System.out.println(c1);
				System.out.println(c2);
				System.out.println(c3);
				System.out.println(c4);
				System.out.print(">> ");
				
				number = Integer.parseInt(sc.nextLine());
				if(number>4) throw new MyException();
				break;
			}catch(InputMismatchException e) {
				System.err.println("입력값 오류 발생");
			}catch(NumberFormatException e) {
				System.err.println("입력값 오류 발생");
			}catch(MyException e) {
				System.err.println("입력값 오류 발생");
			}
			
		}
		
		return number;
	}
	int answer(int[] array,int operint) {
		String oper = null;
		switch(operint) {
			case 1:oper = "+"; break;
			case 2:oper = "-"; break;
			case 3:oper = "*"; break;
			case 4:oper = "/"; break;
		}
		
		while(true) {
			try {
			for(int i =0;i<array.length;i++) {
				System.out.print(array[i]);
				if(i!=array.length-1) System.out.print(oper);
			}
			System.out.println("= ");
			number = Integer.parseInt(sc.nextLine());
			break;
		}catch(InputMismatchException e) {
			System.err.println("입력값 오류 발생");
		}catch(NumberFormatException e) {
			System.err.println("입력값 오류 발생");
		}
		}
		return number;
	}
	boolean check(int result, int answer) {
		if(result == answer) {
			System.out.println("정답");
			return true;
		}else {
			System.out.println("오답");
			return false;
		}
	}
}
