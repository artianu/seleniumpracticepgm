package auto;

public class Array2DPractice {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//literal
		
		int data[][]= {{10,20},{30,40},{50,60}};
		System.out.println("Total Number of Rows: "+data.length);
		System.out.println("Total Number of Columns in one Row: "+data[0].length);
		int rowcnt=data.length;
		int colcnt=data[0].length;
		
		for(int i=0;i<rowcnt;i++)
		
		{
		
			for(int j=0;j<colcnt;j++)
				
			{
			
				System.out.print(+data[i][j]+" ");
				
			}
			
			System.out.println();
			
			}

	}

}
