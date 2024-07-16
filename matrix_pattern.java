package Surprise;

import java.util.Arrays;

public class matrix_pattern {
public static void main(String args[]) {
	int arr[][] = {
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15},
			{16,17,18,19,20},
			{21,22,23,24,25}
	};
	
	int temp[][] = new int[5][5];
	int i=0;
	int n=arr.length;
	int j=0;
	int p1=0,p2=n-1;
	boolean flag = false;
	while(i*j!=(n-1)*(n-1)) {
		System.out.println("i: "+i+"  "+"j: "+j);
		System.out.println("p1: "+p1+"  "+"p2: "+p2+"\n");
		//System.out.println(Arrays.toString(temp[0]));
		//temp[p1][p2]=arr[i][j];
		if(p2+1==n && !flag) {
			p1+=1;
			flag = true;
		}
		else if(flag && !(p2-1==0)) {
			p1--;
			p2--;
			flag = false;
			
		}
		else if(flag && p1-1==0) {
			p1++;
			p2++;
		}
		else if(flag){
			p2--;
			p1--;
		}
		if(j==n-1) {
			i++;
			j=0;
		}
		j++;
		if(i==n) break;
		
	}
	for(int k=0;k<arr.length;k++) {
		System.out.println(Arrays.toString(temp[k]));
	}
}
}
