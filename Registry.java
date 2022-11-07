import java.util.ArrayList;

public class Registry {
	public static void main(String args[]) throws HRException {
		ArrayList<Person> personDB = new ArrayList<Person>();
		// Undergraduate
		Person person3 = new Undergraduate("Bob", "Jones", 18, 15856, 1,5, 65000, true, true, MajorType.ENGINEERING);
		personDB.add(person3);
		
		// Support Staff
		Person person4 = new SupportStaff("Betty", "Craig", 45, 87585, DepartmentType.ENGINEER, 10, 60, 22);
		personDB.add(person4);
		
		// Faculty Member
		Person person5 = new FacultyMember("Jake", "Wright", 36, 52545, DepartmentType.EDUC, 7, DegreeType.BACHELOR);
		personDB.add(person5);
		
		// Graduate
		Person person6 = new Graduate("Sara", "Tyner", 25, 52548, 2,4, 75000, true, 2000, Program.PHD);
		personDB.add(person6);
		
		
		for(Person element: personDB) {
			System.out.println(element);
		}
		// compare person3 to person4
		person3.compareTo(person4);
	}
}
