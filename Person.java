/**
 * This program organizes the records of Springfield University's staff and students
 * @author Vanshita Uthra
 * @since 2021-08-05
 */
public class Person {
	private String firstName;
	private String lastName;
	private int age;

	
	// constructor
	/**
	 * This method calls all the set methods
	 * @param firstName A string, the first name of the person
	 * @param lastName A string, the last name of the person
	 * @param age An integer, the age of the person
	 * @throws HRException When values are illegal 
	 * @return none
	 */
	public Person(String firstName, String lastName, int age) throws HRException {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		
	}
	/**
	 * This method sets the first name of the person
	 * @param firstName A string, the first name of the person
	 * @return none
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	/**
	 * This method sets the last name of the person
	 * @param lastName
	 * @return none
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * This method sets the age of the person
	 * @param age An integer, the age of the person
	 * @return none
	 * @throws HRException When the age is than 15
	 */
	public void setAge(int age) throws HRException{
		if(age >= 15) {
			this.age= age;
		}
		else {
			throw new HRException("Invalid age");
		}
	}
	/**
	 * This method returns the first name of the person
	 * @param none 
	 * @return firstName The first name of the person
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * This method returns the last name of the person
	 * @param none
	 * @return lastName the last name of the person
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * This method returns the age of the person
	 * @param none
	 * @return age, returns the age of the person
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * This method compares the age of person3 and person4
	 * @param person4 A person 
	 * @return ageDiff An integer, the difference between the age of person3 and person4
	 */
	public int compareTo(Person person4) {	
		//subtract the ages
		int ageDiff = 0;
		if(getAge() > person4.getAge()) {
			ageDiff = getAge() - person4.getAge();
			System.out.println(getFirstName() + "is" + " " + ageDiff + " " + "years older than "+ person4.getFirstName());
		}
		else {
			ageDiff = person4.getAge() - getAge();
			System.out.println(person4.getFirstName() + " " + "is " + ageDiff + " " + "years older than "+ getFirstName());
		}
		return ageDiff;
			
	}


	@Override
	/**
	 * This method changes all the attributes to a string
	 * @param none
	 * @return statement A string with all the attributes of the Person class
	 */
	public String toString() {
		String statement = ("First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age);
		return statement;
	}

	

}
