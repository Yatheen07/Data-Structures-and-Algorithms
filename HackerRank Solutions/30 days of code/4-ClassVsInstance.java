import java.io.*;
import java.util.*;

public class Person {
    private int age;

	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
          if(initialAge < 0){
              this.age = 0;
              System.out.println("Age is not valid, setting age to 0.");
              return;
          }
          this.age = initialAge;
	}

	public void amIOld() {
        int a = this.age;
        if(a<13){
            System.out.println("You are young.");
        }
        else if(a>=18){
            System.out.println("You are old.");
        }
        else{
            System.out.println("You are a teenager.");
        }
	}

	public void yearPasses() {
  		// Increment this person's age.
          this.age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
