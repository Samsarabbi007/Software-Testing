package assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Testing_elements {
	 List<List<Integer>> Combinations = new ArrayList<List<Integer>>();
	 Integer TotalInputs;
	 List<Integer>inputFile = new ArrayList<Integer>();
	
	public void TakeInputs(int test) {

		for(int i=0;i<inputFile.size();i++) {	
			Integer min,max;
			min = inputFile.get(i);
			max = inputFile.get(i+1);
			i++;
			List<Integer>row = new ArrayList<>();
			//worst case
			if( test==1) {
				row.add(min-1);
				row.add(min);
				row.add(min+1);
				row.add(max-1);
				row.add(max);
				row.add(max+1);
			}
			// robust case
			else if( test==2){
				
				row.add(min);
				row.add(min+1);
				row.add(max-1);
				row.add(max);
			}
			// boundary case
			else {
				
				row.add(min);
				row.add(max);
			}
			Combinations.add(row);	
		}
	}
	
	
	public void Combination() {
		List<List<Integer>> Answer= new ArrayList<List<Integer>>();
		List<List<Integer>> finalAnswer= new ArrayList<List<Integer>>();
		
		for(int i=0;i<Combinations.get(0).size();i++) {
			List<Integer>temp = new ArrayList<Integer>();
			temp.add(Combinations.get(0).get(i));
			Answer.add(temp);
		}
		for(int i=0;i<Answer.size();i++) {
		}
		
		for(int i=1;i<Combinations.size();i++) {
			for(int k=0;k<Answer.size();k++) {
				List<Integer>t= new ArrayList<Integer>();
				t= Answer.get(k);
				for(int j=0;j<Combinations.get(i).size();j++){
					
					List<Integer>template= new ArrayList<Integer>();
					for(int ii=0;ii<t.size();ii++)template.add(t.get(ii));
					template.add(Combinations.get(i).get(j));
					finalAnswer.add(template);
					
				}
				
			}
			for(int p=0;p<finalAnswer.size();p++)Answer.add(finalAnswer.get(p));
		}
		
		int n=0;
		for(int i=0;i<finalAnswer.size();i++) {
			
			if(finalAnswer.get(i).size()==TotalInputs) {
				System.out.println(n+1+"       "+finalAnswer.get(i));
				n++;
			}
		}
		Combinations.clear();
	}
}
