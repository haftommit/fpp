package week1lesson2;
import java.lang.String;

/**
 * @author haftomtesfay
 *
Student0's correct count is 7
Student1's correct count is 6
Student2's correct count is 5
Student3's correct count is 4
Student4's correct count is 8
Student5's correct count is 7
Student6's correct count is 7
Student7's correct count is 7

*/
public class Q8{

	public static void main(String[] args) {
		
		String[][] studentAnswers = {{"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
									{"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
									{"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
									{"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
									{"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
									{"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
									{"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
									{"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"}};
		
		String[] answerKey = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
		
		for(int i = 0; i <8 ; i++){
			int score = 0;
			for(int j=0; j<10; j++){
				if(studentAnswers[i][j].equals(answerKey[j]))
					score++;
					}
			System.out.println("Student"+i+"'s correct count is " +score);
			
	}
	}	
}
