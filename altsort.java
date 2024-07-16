package Surprise;

import java.util.Arrays;

public class altsort {
public static void main(String args[]) {
	int arr[] = {12,3,45,-2,-77,30,12,3};
	
	
	int res[] = new int[arr.length];
	int point=0;
	int max = 0;
	int min = 0;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+2;j<arr.length;j+=2) {
			if(i%2==0) {
			if(arr[j]>arr[i]) {
				int temp = arr[j];
				arr[j]=arr[i];
				arr[i]= temp;
			}
		}
			else {
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]= temp;
				}
			}
		}
	}
	
	
	System.out.println(Arrays.toString(arr));
	/*
	int a1[] = new int[arr.length/2+1];
	int a2[] = new int[arr.length/2];
	int p1=0;
	int p2=0;
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			a1[p1]=arr[i];
			p1++;
		}
		else {
			a2[p2]=arr[i];
			p2++;
		}
	}
	System.out.println(p1);
	System.out.println(p2);
	
	Arrays.sort(a1);
	Arrays.sort(a2);
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			arr[i]=a1[--p1];
		}
		else {
			arr[i]=a2[a2.length-p2--];
		}
	}
	
	System.out.println(Arrays.toString(arr));*/
}

}
