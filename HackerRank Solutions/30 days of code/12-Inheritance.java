import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName
			+ 	"\nID: " + idNumber);
	}

}

class Student extends Person{
	private int[] scores;

    Student(String firstName,String lastName,int id,int[] scores){
        super(firstName,lastName,id);
        this.scores = scores;
    }

    public char calculate(){
        int sum = 0;
        int length = this.scores.length;
        for(int i: this.scores){
            sum+=i;
        }
        float avg = sum/length;
        char result;
        if(avg<=100 && avg >=90) result = 'O';
        else if(avg<90 && avg>=80) result = 'E';
        else if(avg<80 && avg>=70) result = 'A';
        else if(avg<70 && avg>=55) result = 'P';
        else if(avg<55 && avg>=40) result = 'D';
        else result = 'T';

        return result;
    }
    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
