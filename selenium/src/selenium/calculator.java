package selenium;
import java.util.Scanner;

public class calculator {

			public static void main(String[] args) {
				//Scanner sc1 = new Scanner(System.in);
				//Scanner sc2 = new Scanner(System.in);
				int num1,num2;
				char operator;
				
				//System.out.println("Enter number1;");
				num1 = 10;
				//System.out.println("Enter number2:");
				num2 = 20;
				//System.out.println("Enter operator:");
				operator = '+';
				switch(operator) {
				case '+' : System.out.println(num1+num2);
						break;
				case '-' : System.out.println(num1-num2);
						break;
						
				}
				}
			
}