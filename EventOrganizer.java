package tester;

import java.util.Scanner;

import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

public class EventOrganizer {
	// fixed size hall
	public static final int HALL_CAPACITY = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int counter = 0;
		// create array to store member details
		Person[] members = new Person[HALL_CAPACITY];
		while (!exit) {
			System.out.println("1 : Register Student \n" + "2 : Register Faculty\n" + "3 : Display Info\n"
					+ " 4 : Introduce Yourself\n" + "5 : Describe nature of Work\n" + "10 :Exit");
			System.out.println("Choose Option");
			switch (sc.nextInt()) {
			case 1:
				if (counter < HALL_CAPACITY) {
					System.out.println("Enter student dtls fn ln yr cname");
					members[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next());
				} else
					System.out.println("Event Full!!!!!");

				break;
			case 2:
				if (counter < HALL_CAPACITY) {
					System.out.println("Enter Faculty dtls fn ln yrs sme");
					members[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
				} else
					System.out.println("Event Full!!!!!");

				break;
			case 3: // display member dtls
				for (Person p : members) // p=members[0]
					if (p != null)
						System.out.println(p);
				break;
			case 10:
				exit = true;
				break;
			}
		}
		sc.close();

	}

}
