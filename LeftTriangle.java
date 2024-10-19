
public class LeftTriangle {

	public static void main(String[] args) {
		int i,j,k,row=5;
		for(i=1;i<=row;i++)
		{
			for(j=row;j>i;j--) 
			{
				System.out.print(" ");
			}
				for(k=1;k<=i;k++)
					{
						System.out.print("*");
					}
				System.out.println();
	}

}
}
