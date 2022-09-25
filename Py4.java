class Py4{

public static void main(String args[]){

	int i,j,k;
	
	for(i=1;i<=9;i++)
	{
		for(j=9;j>=i;j--){
			System.out.print("  ");
			
		}
		for(j=1;j<=i-1;j++)
		{
		
			System.out.print(j + " ");
		}
		for(k=i;k>=1;k--)
		{
		
			System.out.print(k + " ");
		}
		System.out.println();
	}	
		
  }
}
