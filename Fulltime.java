public class Fulltime extends Teacher {
    private int annualSalary;
    private int unit;

    public Fulltime(String name, int age, int number, String subject, int annualSalary, int unit) {
        super(name, age, number, subject);
        this.annualSalary = annualSalary;
        this.unit = unit;
    }

    public int getAnnualSalary() {
        return this.annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getUnit() {
        return this.unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    @Override
    public void print() {
        super.print(); 
        System.out.println("Annual Salary: " + annualSalary); 
        System.out.println("Unit: " + unit); 
    }
}
