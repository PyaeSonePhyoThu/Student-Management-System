import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        AdminPanel adminPanel = new AdminPanel();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while(option != 5)
        {
            menu();
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Enter Student Id : ");
                    String Id = scanner.nextLine();
                    System.out.print("Enter Student Name : ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Course Name : ");
                    String course = scanner.nextLine();
                    System.out.println();

                    Student student = new Student(Id, name, course);
                    adminPanel.createStudent(student);
                    break;
                
                case 2:
                    System.out.println("Displaying Students : ");
                    System.out.println(adminPanel.getStudentList());
                    break;

                case 3: 
                    System.out.println("Searching Student by Id");
                    System.out.println("Enter Id to search : ");
                    String id = scanner.nextLine();

                    System.out.println(adminPanel.searchStudent(id));
                    break;

                case 4: 
                    System.out.println("Deleting Student by Id");
                    System.out.println("Enter Id to delete student record : ");
                    id = scanner.nextLine();
                    adminPanel.deleteStudent(id);
                    break;

                case 5:
                    System.out.println("This is the project created by InnoLearn Batch-1 Students");
                    System.out.println("\t\t Thanks");

                default:
                    break;
            }
        }

        scanner.close();

    }

    public static void menu()
    {
        System.out.println("\t\tWelcome to InnoLearn Student Management System");
        System.out.println("1. Add Student");
        System.out.println("2. Display Stuents");
        System.out.println("3. Display Student by Id");
        System.out.println("4. Delete Student by Id");
        System.out.println("5. Exit from Program");
        System.out.print("Please Enter your selection: ");
    }
}
