package Surprise;

public class numberinwords {
	public static void main(String args[]) {
	int n=3311;
	int temp = n;
	int count=0;
	int arr[];
	String ones[] = {"one", "two", "three", "four", "five", "six", "seven", "eight","nine", ""};
	String teen[] = {"eleven","twelve","thirteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	String tens[] = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	while(temp>0) {
		temp/=10;
		count++;
	}
	
	arr = new int[count];
	temp = n;
	for(int i=0;i<count;i++) {
		arr[i]=temp%10;
		temp=temp/10;
	}
	
	for(int i=count;i>=0;i--) {
		if(i<=2) {
			if(arr[i]==2) {
				//if(arr[i-1]==0) continue;
				System.out.print(tens[arr[i]-1]+" "+ones[(arr[i-1]-1>=0?arr[i-1]-1:9)]);
				break;
			}
			if(arr[i]==1) {
				if(arr[i-1]==0) continue;
				System.out.print(teen[arr[i-1]-1]);
				break;
			}
		}
		if(i>2) {
			if(i==3) {
				if(arr[i-1]==0) continue;
				System.out.print(ones[(arr[i-1]-1>=0?arr[i-1]-1:10)]+" "+"hundred ");
			}
			if(i==4 && count<=4) {
				System.out.print(ones[arr[i-1]-1]+" "+"thousand ");
				if(arr[i-2]==0) System.out.println("and");
			}
			if(i==5) {
				System.out.print(tens[arr[i-1]-1]+" "+ones[(arr[i-1]-1>=0?arr[i-2]-1:9)] +" "+"thousand and ");
			}
			if(i==6 && count<=6) {
				System.out.print(ones[arr[i-1]-1]+" "+"Lakh ");
			}
			if(i==7) {
				System.out.print(tens[arr[i-1]-1]+" "+ones[(arr[i-2]-1>=0?arr[i-2]-1:9)] +" "+"lakh ");
			}
		}
	}
	
	
	}
}
