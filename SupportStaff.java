
public class SupportStaff extends Staff {
	private int numHours;
	private double basePay;
	/**
	 * This method calls all the set methods 
	 This method calls all the set method
	 * @param firstName A string, the first name of the staff
	 * @param lastName A string, the last name of the staff
	 * @param age An integer, the age of the staff
	 * @param staffIDNum An integer, the staff identification number
	 * @param department A DepartmentType, the department the staff is part of 
	 * @param numYears An integer, the number of years the staff has been in the institute
	 * @param numHours An integer, the number of hours that the staff works 
	 * @param basePay A double, the amount that the support staff gets paid 
	 * @throws HRException When there are illegal values
	 */
	public SupportStaff(String firstName, String lastName, int age, int staffIDNum, DepartmentType department,
			int numYears, int numHours, double basePay) throws HRException {
		super(firstName, lastName, age, staffIDNum, department, numYears);
		setNumHours(numHours);
		setBasePayRate(basePay);
	}
	/**
	 * This method sets the number of hours 
	 * @param numHours An integer, the number of hours the support staff works
	 * @return none
	 */
	public void setNumHours(int numHours) {
		this.numHours = numHours;
	}
	/**
	 * This method sets the base pay rate
	 * @param basePay A double, the amount that the support staff gets paid
	 * @return none
	 * @throws HRException When the base pay is less than 15
	 */
	public void setBasePayRate(double basePay) throws HRException {
		if(basePay > 15) {
			this.basePay = basePay;
		}
		else {
			throw new HRException("Invalid base pay");
		}
	}
	/**
	 * This method calculates the salary of the support staff
	 * @param none
	 * @return salary A double, the amount that the support staff gets paid 
	 */
	public double calculatePay() {
		double salary = (basePay * numHours) * 52;
		return salary;
	}
	/**
	 * This method returns the number of hours 
	 * @param none
	 * @return numHours An integer, the number of hours the support staff works
	 */
	public int getNumHours() {
		return numHours;
	}
	/**
	 * This method returns the base pay rate
	 * @param none
	 * @return basePay A double, the amount that support staff gets paid 
	 */
	public double getBaseRatePay() {
		return basePay;
	}
	
	@Override
	/**
	 * This method changes all the attributes to a string
	 * @param none
	 * @return statement A string with all the attributes of the Person class
	 */
	public String toString() {
		String statement = ( "First Name: " + super.getFirstName() + "\nLast Name: " + super.getLastName() + "\nAge: " + 
							super.getAge() + "\nStaff ID Number: " + super.getStaffIDNum() + "\nDepartment: " + 
							super.getDepartment() + "\nNumber of years: " + super.getNumYears() + "\nNumber of hours: " + 
							numHours + "\nBase pay rate: " + basePay + "\nSalary: " + calculatePay());
		return statement;
	}
	
	

}
