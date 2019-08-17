package assignment;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testing_elements testing_elements=new Testing_elements();
		Scanner input = new Scanner( System.in );
		int TotalInputs = input.nextInt();
		
		for(int i=0;i<TotalInputs;i++) {
			Integer min,max;
			min = input.nextInt();
			max = input.nextInt();
			
		testing_elements.inputFile.add(min);
			testing_elements.inputFile.add(max);
		}
		
		
		
		for(int i=0;i<3;i++) {
			
			if(i==0){
				
				System.out.println("1.Worst Case");
				System.out.print("TestId   ");
				for(int j=97;j<TotalInputs+97;j++)System.out.print((char)j+"  ");
				System.out.println();
				testing_elements.TotalInputs=TotalInputs;
				testing_elements.TakeInputs(i+1);
				testing_elements.Combination();
			}else if(i==1) {
				System.out.println("2.Robust Case");
				System.out.print("TestId   ");
				for(int j=97;j<TotalInputs+97;j++)System.out.print((char)j+"  ");
				System.out.println();
				testing_elements.TakeInputs(i+1);	
				testing_elements.Combination();
			}else {
				System.out.println("3.Boundary Case");
				System.out.print("TestId   ");
				for(int j=97;j<TotalInputs+97;j++)System.out.print((char)j+"  ");
				System.out.println();
				testing_elements.TakeInputs(i+1);
				testing_elements.Combination();
			}
		}
		
	}

}


