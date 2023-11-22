import java.util.*;

public class StudentsGradesP7{
    public static void main(String[] args) {
    Map<String, String> studentGrades = new TreeMap<>();
studentGrades.put("leana", "A");
studentGrades.put("naman", "B");
studentGrades.put("samarth", "C"); 

System.out.println("List of students : ");
System.out.println(studentGrades);
Scanner scanner = new Scanner(System.in);

        while (true) {

  System.out.println("Options:");
 System.out.println("1 . Add Student");
System.out.println("2. Remove Student");
    System.out.println("3. Modify Grade");
            System.out.println("4. Print All Grades");
   System.out.println("5. Exit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

 switch (option) {
 case 1:
       System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();
                    studentGrades.put(name, grade);
                    System.out.println("Student added.");

System.out.println("List of students : ");
System.out.println(studentGrades);

                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    name = scanner.nextLine();
                    if (studentGrades.containsKey(name)) {
                        studentGrades.remove(name);
                        System.out.println("Student removed.");

System.out.println("List of students : ");
System.out.println(studentGrades);

                    } else {
                        System.out.println("Student not found.");
                    }

                    break;

                case 3:
                    System.out.print("Enter student name to modify: ");
                    name = scanner.nextLine();
                    if (studentGrades.containsKey(name)) {
                        System.out.print("Enter new grade: ");
                        grade = scanner.nextLine();
                        studentGrades.put(name, grade);
                        System.out.println("Grade modified.");
                        
System.out.println("List of students : ");
System.out.println(studentGrades);

                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Student Grades:");
                    for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }
        }
        
    

    }
}