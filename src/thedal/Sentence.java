package thedal;

import java.util.InputMismatchException;
import java.util.Scanner;

//������ ����ϰ� ���� ���ù޴� Ŭ����

public class Sentence {
	public Sentence(){
		if(sc==null) {
			sc= new Scanner(System.in);
		}
	}
	Scanner sc;
	int number;
	
	//2���� ����
		int select(String say,String c1,String c2) {
			
			while(true) {
				try {
					System.out.println(say);
					System.out.println(c1);
					System.out.println(c2);
					System.out.print(">> ");
					
					//nextInt�� ���Ͱ��� �ԷµǾ��־� �����߻��� ��Ŵ. �ش� ���� ��� �޾� int�� ��ȯ�ϴ� ������ ��ģ��.
					number = Integer.parseInt(sc.nextLine());
					//�Է¹��� ���� 2���� ũ�ٸ� ������ �߻���Ŵ.
					if(number>2) throw new MyException();
					break;
				}catch(InputMismatchException e) {
					System.err.println("�Է°� ���� �߻�");
				}catch(NumberFormatException e) {
					System.err.println("�Է°� ���� �߻�");
				}catch(MyException e) {
					System.err.println("�Է°� ���� �߻�");
				}
			}
			return number;
		}
	//3���� ����
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
				System.err.println("�Է°� ���� �߻�");
			}catch(NumberFormatException e) {
				System.err.println("�Է°� ���� �߻�");
			}catch(MyException e) {
				System.err.println("�Է°� ���� �߻�");
			}
		}
		return number;
	}
	//4�� ���ý�
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
				System.err.println("�Է°� ���� �߻�");
			}catch(NumberFormatException e) {
				System.err.println("�Է°� ���� �߻�");
			}catch(MyException e) {
				System.err.println("�Է°� ���� �߻�");
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
			System.err.println("�Է°� ���� �߻�");
		}catch(NumberFormatException e) {
			System.err.println("�Է°� ���� �߻�");
		}
		}
		return number;
	}
	boolean check(int result, int answer) {
		if(result == answer) {
			System.out.println("����");
			return true;
		}else {
			System.out.println("����");
			return false;
		}
	}
}
