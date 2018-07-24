package basic;

import java.lang.reflect.Array;

public class ArrayCalc {

	public static void main(String[] args) {
		int [] array= {1,2,3,4,5};
		int minn = findmin(array);
		System.out.println("minimum value of array is " +minn);
		
		
		int maxx = findmax(array);
		System.out.println("maximim value of array is " +maxx);
		
		
		
		int avg= findavg(array);
		System.out.println("average value of array is " + avg);

	}
	
	public static int findmin(int [] arr) {
		int min= arr[0];
		for(int i = 0;i<arr.length;i++) {
			if (arr[i]<min) {
				min= arr[i];
			}
		}
		return min;
	}

	
	
	public static int findmax(int [] arr) {
		int max= arr[0];
		for(int i =0; i< arr.length; i++) {
			if (arr[i] > max) {
				max= arr[i];
			}
		}
		return max;
	}
	
	public static int findavg(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum= sum+arr[i];
			}
		return sum/arr.length;
	}
}