package p1;

public class StarPattern1 {

	public static void main(String[] args) {
		
		int limit = 20; //entered by user
		int firstrow=1,lastrow=limit;
		for(int row = 1;row<=limit;row++)
		{
			for(int col = 1;col<=row;col++)
			{
				if(row == firstrow || row == lastrow)
				{
					System.out.print(" * ");
				}
				else
				{
					if(col == 1 || col == row) System.out.print(" * ");
					else System.out.print(" - ");
				}
				
			}
			System.out.print("\n");
		
		}
		
		
	}
}
