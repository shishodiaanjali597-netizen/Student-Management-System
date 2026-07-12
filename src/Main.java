import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        
        while(true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Email");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Section: ");
                    String section = sc.nextLine();
                    System.out.print("CGPA: ");
                    double cgpa = sc.nextDouble();
                    dao.addStudent(new Student(name, email, phone, section, cgpa));
                    break;
                    
                case 2:
                    dao.getAllStudents();
                    break;
                    
                case 3:
                    System.out.print("Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Email: ");
                    String newEmail = sc.nextLine();
                    dao.updateStudent(id, newEmail);
                    break;
                    
                case 4:
                    System.out.print("Student ID to delete: ");
                    int delId = sc.nextInt();
                    dao.deleteStudent(delId);
                    break;
                    
                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
