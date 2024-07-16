package Surprise;

import java.util.Arrays;

public class ancestry {
public static class Node {
	String name;
	Node[] child;
	
	public Node(String value) {
		this.name = value;
		this.child = new Node[10];
	}
	
}


public static void main(String args[]) {
	String[][] ancestor = {{"Paari", "Karikalan"},{"Udhiran", "Sendhan"},{"Sendhan", "Arulmozhi"},{"Karikalan", "Sendhan"},{"ram","Udhiran"},{"sen","Udhiran"}};
	//String  parents[][] = new String[ancestor.length*2][5];
	String temp[] = new String[5];
	
	String name = "Sendhan";
	int j=0;
	
	for(int i=0;i<ancestor.length;i++) {
		if(ancestor[i][1].equals(name)) {
			temp[j++] = ancestor[i][0];
	}
}
	System.out.println(Arrays.toString(temp));
	int count =0 ;
	for(int k=0;k<j;k++) {
	for(int l=0;l<ancestor.length;l++) {
		//System.out.println(k+" "+l);
		if(ancestor[l][1].equals(temp[k])) {
			//System.out.println(ancestor[l][1]);
			count++;
		}
	}
	}
	
	System.out.println(count);
}
}
