package �㷨����;

import java.util.Arrays;

/*
 * ѡ������   
 * */

public class Demo2 {
	public static void main(String[] args) {
		int[] array = {2,5,3,6,8,7,1,9};
		int[] chooseSore = chooseSore(array);
		System.err.println("ѡ������Ľ��"+Arrays.toString(chooseSore));
	}
	private static int[] chooseSore(int[] array) {
		if(array.length==0)
			return array;
		for (int i = 0; i < array.length; i++) {
			//����minIndex���������ֵ��С
			int minIndex=i;
			
			for (int j = i; j < array.length; j++) {
				//����ѭ�����ҳ���������С���Ǹ���������min������λ��
				if(array[minIndex]>array[j]) {
					int temp=array[minIndex];
					array[minIndex]=array[j];
					array[j]=temp;
				}
				
			}
		}
		return array;
		
		
	}

}
