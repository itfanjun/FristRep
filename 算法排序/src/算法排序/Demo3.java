package �㷨����;

import java.util.Arrays;

/**
 * 
 * @author fj
 *��������
 */

public class Demo3 {
	public static void main(String[] args) {
		int[] array = {2,5,3,6,8,7,1,9};
		int[] inserSore = inserSore(array);
		System.err.println("ѡ������Ľ��"+Arrays.toString(inserSore));
	}
	
	public static int[] inserSore(int[] array) {
		if(array.length==0)
			return array;
		int current;
		//����Ĭ�ϼ����һ��Ԫ���Ѿ�������
		for (int i = 0; i < array.length-1; i++) {
			int index=i;
			current=array[i+1];
			while(index>=0 && current<array[index]) {
				
				array[index+1]=array[index];
				index--;
				
			}
			array[index+1]=current;
		}
		return array;
	}
	
}
