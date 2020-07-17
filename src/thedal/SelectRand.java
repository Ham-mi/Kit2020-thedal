package thedal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class SelectRand {
	public SelectRand(){
		rand = new Random();
	}
	
	private Random rand;
	private int choicehard;
	private int choiceCalc;
	
	public int getChoicehard() {
		return choicehard;
	}
	public int getChoiceCalc() {
		return choiceCalc;
	}
	public void setChoicehard(int choicehard) {
		this.choicehard = choicehard;
	}
	public void setchoiceCalc(int choiceCalc) {
		this.choiceCalc = choiceCalc;
	}

	
	// 해당 숫자까지의 랜덤값을 반환
	private int randint(int num) {
		return rand.nextInt(num);
	}
	
	//갯수만큼 숫자 반환
	int[] randints(int num) {
		int[] array = new int[num];
		for(int i=0;i<num;i++) {
			//0방지
			while(array[i]==0) {
				array[i]=randint(choicehard);
				// 빼기와 나누기용. 큰값이 배열 뒤에 있을때 자리를 바꾼다.
				if(choiceCalc>=2) {
/*					for(int j=1;j<num;j++) {
						if(i>=j&&array[j]>array[j-1]) {
							int tmp = array[j];
							array[j] = array[j-1];
							array[j-1] = tmp;
						}
					}*/
				}
			}
		}
		Integer[] arrayInt = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayInt[i] = Integer.valueOf(array[i]);
		}
		Arrays.sort(arrayInt, Collections.reverseOrder());
		
		for (int i = 0; i < arrayInt.length; i++) {
			array[i] = arrayInt[i].intValue();
		}
		//곱셈과 나누셈의 경우 보통 이상시 2번째 배열부터 두자리 값(11~)을 방지한다.
		if(choiceCalc>=3) {
			for(int j=1;j<num;j++) {
				if(array[j]>11) {
					//10으로 나누어 나머지값을 반환
					array[j]%=10;
					//만약 나머지가 0이라면 랜덤값+1을 반환하여 더한다. 0~8
					if(array[j]==0) array[j]+=(rand.nextInt(9)+1);
				}
			}
		}
	return array;
	}

}
