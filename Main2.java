import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // PILIHAN PERTAMA
        System.out.println("Pilih tipe: Student atau Teacher?");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Student")) {
            // Kalo user milih student
            System.out.println("Masukkan info untuk Student:");
            System.out.print("Name: ");
            String studentName = scanner.nextLine();
            System.out.print("Age: ");
            int studentAge = scanner.nextInt();
            System.out.print("Number: ");
            int studentNumber = scanner.nextInt();
            System.out.print("Score: ");
            int studentScore = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Major: ");
            String studentMajor = scanner.nextLine();

            // BUAT DAN PRINT STUDENT
            Student student = new Student(studentName, studentAge, studentNumber, studentScore, studentMajor);
            System.out.println("Student info:");
            student.print();
            
        } else if (choice.equalsIgnoreCase("Teacher")) {
            // Kalo user milih teacher
            System.out.println("Pilih tipe Teacher: Full Time atau Part Time?");
            String teacherType = scanner.nextLine();

            if (teacherType.equalsIgnoreCase("Full Time")) {
                // Kalo user milih FULL TIME TEACHER
                System.out.println("Masukkan info untuk Full Time Teacher:");
                System.out.print("Name: ");
                String fulltimeName = scanner.nextLine();
                System.out.print("Age: ");
                int fulltimeAge = scanner.nextInt();
                System.out.print("Number: ");
                int fulltimeNumber = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Subject: ");
                String fulltimeSubject = scanner.nextLine();
                System.out.print("Annual Salary: ");
                int fulltimeSalary = scanner.nextInt();
                System.out.print("Unit: ");
                int fulltimeUnit = scanner.nextInt();

                // BUAT DAN PRINT FULL TIME TEACHER
                Fulltime fulltime = new Fulltime(fulltimeName, fulltimeAge, fulltimeNumber, fulltimeSubject, fulltimeSalary, fulltimeUnit);
                System.out.println("Full Time Teacher info:");
                fulltime.print();

            } else if (teacherType.equalsIgnoreCase("Part Time")) {
                // Kalo user milih PART TIME TEACHER
                System.out.println("Masukkan info untuk Part Time Teacher:");
                System.out.print("Name: ");
                String partTimeName = scanner.nextLine();
                System.out.print("Age: ");
                int partTimeAge = scanner.nextInt();
                System.out.print("Number: ");
                int partTimeNumber = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Subject: ");
                String partTimeSubject = scanner.nextLine();
                System.out.print("Annual Salary: ");
                int partTimeSalary = scanner.nextInt();
                System.out.print("Hours Worked: ");
                int partTimeHours = scanner.nextInt();

                // BUAT DAN PRINT PART TIME TEACHER
                PartTime partTime = new PartTime(partTimeName, partTimeAge, partTimeNumber, partTimeSubject, partTimeSalary, partTimeHours);
                System.out.println("Part Time Teacher info:");
                partTime.print();
            } else {
                System.out.println("Tipe Teacher tidak valid.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close(); 
    }
}
