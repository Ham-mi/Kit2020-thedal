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

	
	// �ش� ���ڱ����� �������� ��ȯ
	private int randint(int num) {
		return rand.nextInt(num);
	}
	
	//������ŭ ���� ��ȯ
	int[] randints(int num) {
		int[] array = new int[num];
		for(int i=0;i<num;i++) {
			//0����
			while(array[i]==0) {
				array[i]=randint(choicehard);
				// ����� �������. ū���� �迭 �ڿ� ������ �ڸ��� �ٲ۴�.
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
		//������ �������� ��� ���� �̻�� 2��° �迭���� ���ڸ� ��(11~)�� �����Ѵ�.
		if(choiceCalc>=3) {
			for(int j=1;j<num;j++) {
				if(array[j]>11) {
					//10���� ������ ���������� ��ȯ
					array[j]%=10;
					//���� �������� 0�̶�� ������+1�� ��ȯ�Ͽ� ���Ѵ�. 0~8
					if(array[j]==0) array[j]+=(rand.nextInt(9)+1);
				}
			}
		}
	return array;
	}

}
