class p9{

public static void main(String args[]){

	int i,j;
	
	
	for(i=0;i<=4;i++)
	{	
		int A=65;
		for(j=4;j>=i;j--)
		{
			System.out.print(" ");
		
		}
		
		for(j=0;j<=i;j++)
		{
		
			System.out.print((char)(A+j) + " ");
			
		}
		
		System.out.println();
	}	
		
  }
}
