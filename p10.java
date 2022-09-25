class p10{

public static void main(String args[]){

	int i,j;
	
	
	for(i=0;i<=4;i++)
	{	
		int E=69;
		for(j=4;j>=i;j--)
		{
			System.out.print(" ");
		
		}
		
		for(j=0;j<=i;j++)
		{
		
			System.out.print((char)(E-j) + " ");
			
		}
		
		System.out.println();
	}	
		
  }
}
