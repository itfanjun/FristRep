package 算法排序;

import java.util.Arrays;

/**
 * 
 * @author fj
 *插入排序
 */

public class Demo3 {
	public static void main(String[] args) {
		int[] array = {2,5,3,6,8,7,1,9};
		int[] inserSore = inserSore(array);
		System.err.println("选择排序的结果"+Arrays.toString(inserSore));
	}
	
	public static int[] inserSore(int[] array) {
		if(array.length==0)
			return array;
		int current;
		//可以默认假设第一个元素已经被排序
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
