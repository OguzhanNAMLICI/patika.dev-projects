public class Employee {
    private String employeeName;
    private double employeeSalary;
    private double employeeWorkHours;
    private double employeeHireYear;
    private double currentYear = 2021;

    public Employee(String employeeName , int employeeSalary , int employeeWorkHours , int employeeHireYear){
        setEmployeeName(employeeName);
        setEmployeeSalary(employeeSalary);
        setEmployeeWorkHours(employeeWorkHours);
        setEmployeeHireYear(employeeHireYear);
        showEmployeenInformation();
    }



    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public double getEmployeeWorkHours() {
        return employeeWorkHours;
    }

    public void setEmployeeWorkHours(int employeeWorkHours) {
        this.employeeWorkHours = employeeWorkHours;
    }

    public double getEmployeeHireYear() {
        return employeeHireYear;
    }

    public void setEmployeeHireYear(int employeeHireYear) {
        this.employeeHireYear = employeeHireYear;
    }


    public double salaryTax(){
        if(getEmployeeSalary() > 0 && getEmployeeSalary() < 1000 ){
            return 0.0;
        }
        else{
            return  (getEmployeeSalary() * 3)/100;
        }
    }


    public double salaryBonus(){
        if(getEmployeeWorkHours() > 40){
            return ((getEmployeeWorkHours()-40)*30);
        }
        else {
            return 0.0;
        }
    }

    public double raiseSalary(){
        if(currentYear - getEmployeeHireYear() < 10){
            return ((getEmployeeSalary()*5)/100);
        }

        if(currentYear - getEmployeeHireYear() > 9 && currentYear - getEmployeeHireYear() < 20){
            return ((getEmployeeSalary()*10)/100);
        }

        else{
            return ((getEmployeeSalary()*15)/100);
        }
    }

    public void showEmployeenInformation(){
        System.out.println("NAME: " + getEmployeeName());
        System.out.println("SALARY: " + getEmployeeSalary());
        System.out.println("WORK HOURS: " + getEmployeeWorkHours());
        System.out.println("HIRE YEAR: " + getEmployeeHireYear());
        System.out.println("TAX: " + salaryTax());
        System.out.println("SALARY BONUS: " + salaryBonus());
        System.out.println("RAISE SAlARY: " + raiseSalary());
        System.out.println("SALARY with TAXES and BONUSES: " + ((getEmployeeSalary()+salaryBonus())-salaryTax()));
        System.out.println("TOTAL SALARY: " + (((getEmployeeSalary()+salaryBonus())-salaryTax())+raiseSalary()));
    }
}




