class s6{

public static void main(String args[]){

	int i,j;
	
	for(i=5;i>=1;i--)
	{
		for(j=4;j>=i;j--){
			System.out.print(" ");
			
		}
		for(j=1;j<=i;j++)
		{
		
			System.out.print("* ");
		}
		for(j=1;j<=i-1;j++){
		
			System.out.print("* ");
		
		}
		
		System.out.println();
	}	
		
  }
}
