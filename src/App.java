import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        AdminPanel adminPanel = new AdminPanel();
        Scanner scanner = new Scanner(System.in);
        String request = "Yes";
        while(request.equalsIgnoreCase("yes"))
        {
            System.out.print("Enter Student ID : ");
            String studentId = scanner.nextLine();
            System.out.print("Enter Name : ");
            String name = scanner.nextLine();
            System.out.print("Enter Course : ");
            String course = scanner.nextLine();
            Student student = new Student(studentId, name, course);
            adminPanel.createStudent(student);

            System.out.println("Wanna add? Y/N : ");
            request = scanner.nextLine();
        }

        System.out.println(adminPanel.getStudentList());

        // adminPanel.deleteStudent("1001");

        // System.out.println("Deleting ID : 1001 ------------------");

        // System.out.println(adminPanel.getStudentList());

        // System.out.println("Searching id 1001");
        System.out.println(adminPanel.searchStudent("1001"));

        scanner.close();

    }
}
