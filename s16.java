class s16{

public static void main(String args[]){

	int i,j;
	
	for(i=1;i<=5;i++)
	{
		
		for(j=4;j>=i;j--){
			
			System.out.print("  ");
		}
		
		for(j=1;j<=i;j++)
		{
			if(i==3&&j==2){
			System.out.print("  ");
			continue;
			}
				
				
			if(i==4&&j==2){
				System.out.print("   ");
				if(i==4&&j==3){
				System.out.print("    ");
				}
				System.out.print(" *");
				break;
			}
			
			
			System.out.print("* ");
			
		}
	
		
		System.out.println();
	}	
		
  }
}
