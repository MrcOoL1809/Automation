import java.util.Scanner;

public class Question_26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Marks Out Of 100 :- ");
		int marks = scanner.nextInt();
		
		displayGrade(marks);
		scanner.close(); 	
	}
		public static void displayGrade(int marks) {
		if (marks >= 91 && marks <=100) {
			System.out.println("AA");
		}
		else if (marks >= 81 && marks <=90) {
			System.out.println("AB");
	    }	
		else if (marks >= 71 && marks <=80) {
			System.out.println("BB");
		}
		else if (marks >= 61 && marks <=70) {
			System.out.println("BC");
		}
		else if (marks >= 51 && marks <=60) {
			System.out.println("CD");
		}
       
		else if (marks >= 41 && marks <=50) {
			System.out.println("DD");
		}
        
		else if (marks <= 40) {
			System.out.println("Fail");
		}
        }
		

}