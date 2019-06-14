package 算法排序;

import java.util.Arrays;

/*
 * 冒泡排序   它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来
 * */

public class Demo1 {

	public static void main(String[] args) {
		int[] array = {1,5,3,6,8,7,2,9};
		int[] buttleSor = buttleSor(array);
		
		System.err.println(Arrays.toString(buttleSor));
	}
	
	private static int[] buttleSor(int[] array) {
		if(array.length==0)
		return array;
		int temp=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
				
			}
			
		}
		return array;
		
	}
}
