
public abstract class Staff extends Person {
	
	private int staffIDNum;
	private DepartmentType department;
	private int numYears;
	
	/**
	 * This method calls all the set method
	 * @param firstName A string, the first name of the staff
	 * @param lastName A string, the last name of the staff
	 * @param age An integer, the age of the staff
	 * @param staffIDNum An integer, the staff identification number
	 * @param department A DepartmentType, the department the staff is part of 
	 * @param numYears An integer, the number of years the staff has been in the institute
	 * @throws HRException When the values are illegal 
	 */
	public Staff(String firstName, String lastName, int age, int staffIDNum, DepartmentType department, 
			int numYears) throws HRException {
		super(firstName, lastName, age);
		setStaffIDNum(staffIDNum);
		setDepartment(department);
		setNumYears(numYears);
	}
	/**
	 * This method sets the staff identification number
	 * @param staffIDNum An integer, the staff identification number 
	 * @return none
	 */
	public void setStaffIDNum(int staffIDNum) {
		this.staffIDNum= staffIDNum;
	}
	/**
	 * The method sets the department type
	 * @param department A DepartmentType, the department the staff is in 
	 * @return none
	 */
	public void setDepartment(DepartmentType department) {
		this.department = department;
	}
	/**
	 * This method sets the number of years 
	 * @param numYears An integer, the number of years the staff has been in the institute
	 * @return none
	 * @throws HRException When the numYears is less than 0 and greater than 40
	 */
	public void setNumYears(int numYears) throws HRException {
		if(numYears > 0 && numYears < 40) {
			this.numYears = numYears;
		}
		else {
			throw new HRException("Invalid years");
		}
	}
	// This method is an abstract method that calculates the pay
	public abstract double calculatePay();
	
	/**
	 * This method returns the staff identification number 
	 * @param none
	 * @return staffIDNum An integer, the staff identification number 
	 */
	public int getStaffIDNum() {
		return staffIDNum;
	}
	/**
	 * This method returns the department of the staff
	 * @param none
	 * @return department A DepartmentType, the department that the staff is in
	 */
	public DepartmentType getDepartment() {
		return department;
	}
	/**
	 * This method returns the number of years
	 * @param none
	 * @return numYears An integer, the number of years the staff has been in the institute 
	 */
	public int getNumYears() {
		return numYears;
	}
	@Override
	/**
	 * This method changes all the attributes to a string
	 * @param none
	 * @return statement A string with all the attributes of the Person class
	 */
	public String toString() {
		String statement = ("Staff ID Number: " + staffIDNum + "\nDepartment: " + department + 
				"\nNumber of years: " + numYears);
		return statement;
	}
}
