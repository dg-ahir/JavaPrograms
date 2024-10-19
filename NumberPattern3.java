import java.util.Scanner;

public class NumberPattern3 {

	public static void main(String[] args) {
		int i, j, rows;
		char choice;
		Scanner sc= new Scanner(System.in);
		
		do {
		System.out.print("Enter the number of rows you want to print: ");
		rows = sc.nextInt();
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+ "");
			}
			System.out.println();
		}
		
		System.out.print("Do you want to enter another number (Y/N)? ");
        choice = sc.next().charAt(0);
	}
		while (choice == 'Y' || choice == 'y');
		
		 System.out.println("Program terminated.");
	        sc.close();
}
}
