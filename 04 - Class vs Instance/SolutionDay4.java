import java.util.Scanner;

public class SolutionDay4 {
	private int age;	
	  
	public SolutionDay4(int initialAge) {
  		// Add some more code to run some checks on initialAge
		if(initialAge < 0){
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
		else {
			this.age = initialAge;
		}
		this.age = initialAge;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			SolutionDay4 p = new SolutionDay4(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        if(this.age < 13) {
        	System.out.println("You are young.");
        }
        else if (this.age >= 13 && this.age < 18) {
        	System.out.println("You are a teenager.");
        }
        else {
        	System.out.println("You are old.");
        }
       
	}

	public void yearPasses() {
  		// Increment this person's age.
		this.age++;
	}
}
