public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, int number, String subject) {
        super(name, age, number);
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
        
    @Override
    public void print() {
        super.print();
        System.out.println("Subject: " + subject);

    }
}
