package selenium;
import java.util.*;
public class SecondTenMark {
	public static void main(String[] args) {
		int n=10;
		int values[] = new int[n];
		values[0]=0;
		values[1]=1;

		for(int i=2;i<n;i++) {
			values[i] = values[i-1]+values[i-2];
			System.out.print(values[n-1]);
			//SecondTenMark obj = new SecondTenMark();
			//obj.getElement(next[i]);
		}
		
	}
}
