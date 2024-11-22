public class Student extends Person {
    private int score;
    private String major;

    public Student(String name, int age, int number, int score, String major) {
        super(name, age, number);
        this.score = score;
        this.major = major;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println("Score: " + score);
        System.out.println("Major: " + major);
    }
}
