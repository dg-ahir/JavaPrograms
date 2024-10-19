import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		 int age;
		 int weight;
		 char choice;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter your age: ");
		 age = sc.nextInt();
		 
		 if(age>=18) {
			 System.out.print("Enter your weight: ");
	            weight = sc.nextInt();
	            
			 if(weight>50) {
				 System.out.println("You are eligible to donate blood");
			 }
			 else {
				 System.out.println("You are not eligible to donate blood");
			 }
		 }
		 else {
			 System.out.println("Age must be greater than 18");
		 }
		 sc.close();
}
}
