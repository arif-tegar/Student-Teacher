public class PartTime extends Teacher {
    private int hoursWorked;
    private int annualSalary;


    public PartTime(String name, int age, int number, String subject, int annualSalary, int hoursWorked) {
        super(name, age, number, subject);
        this.annualSalary = annualSalary;
        this.hoursWorked = hoursWorked;
    }

        public int getHoursWorked() {
            return this.hoursWorked;
        }
    
        public void setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
        }
    
        public int getAnnualSalary() {
            return this.annualSalary;
        }
    
        public void setAnnualSalary(int annualSalary) {
            this.annualSalary = annualSalary;
        }

        @Override
        public void print() {
        super.print(); 
        System.out.println("Annual Salary: " + annualSalary); 
        System.out.println("Hours Worked: " + hoursWorked); 
    }
}