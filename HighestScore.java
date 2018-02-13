import java.util.Scanner;
public class HighestScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of students: ");
	int numStudents = input.nextInt();
	input.nextLine();
	
	System.out.print("Enter the student name and score: ");
	String studentNameScore = input.nextLine();
	int studentScore = Integer.parseInt(studentNameScore.substring(studentNameScore.indexOf(' ') + 1, studentNameScore.length()));
	 
	for(int i = 1; i < numStudents; i++)
	{
		System.out.print("Enter the student name and score: ");
		String tempNameScore = input.nextLine();
		int tempScore = Integer.parseInt(tempNameScore.substring(tempNameScore.indexOf(' ') + 1, tempNameScore.length()));
	
		if(studentScore < tempScore)
			studentNameScore = tempNameScore;
	}
	System.out.print("The top student with the highest score is " + studentNameScore.substring(0, studentNameScore.indexOf(' ')));
	input.close();
	}
}
	


