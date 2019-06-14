package 算法排序;

import java.util.Arrays;

/*
 * 选择排序   
 * */

public class Demo2 {
	public static void main(String[] args) {
		int[] array = {2,5,3,6,8,7,1,9};
		int[] chooseSore = chooseSore(array);
		System.err.println("选择排序的结果"+Arrays.toString(chooseSore));
	}
	private static int[] chooseSore(int[] array) {
		if(array.length==0)
			return array;
		for (int i = 0; i < array.length; i++) {
			//假设minIndex这个索引的值最小
			int minIndex=i;
			
			for (int j = i; j < array.length; j++) {
				//二次循环，找出数组中最小的那个数，放在min索引的位置
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
