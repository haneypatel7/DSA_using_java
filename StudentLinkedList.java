import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks;
    Student next;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.next = null;
    }
}

public class StudentLinkedList {
    private Student head;

    public StudentLinkedList() {
        head = null;
    }

    public void insertStudent(int rollNo, String name, int marks) {
        Student newStudent = new Student(rollNo, name, marks);

        if (head == null || name.compareTo(head.name) <= 0) {
            newStudent.next = head;
            head = newStudent;
        } else {
            Student current = head;
            while (current.next != null && name.compareTo(current.next.name) > 0) {
                current = current.next;
            }
            newStudent.next = current.next;
            current.next = newStudent;
        }
    }

    public void deleteStudent(int rollNo) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Record with Roll No. " + rollNo + " deleted.");
            return;
        }

        Student current = head;
        while (current.next != null && current.next.rollNo != rollNo) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Record with Roll No. " + rollNo + " deleted.");
        } else {
            System.out.println("Record with Roll No. " + rollNo + " not found.");
        }
    }

    public void displayStudents() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            System.out.println("Student Records:");
            Student current = head;
            while (current != null) {
                System.out.println("Roll No: " + current.rollNo + ", Name: " + current.name + ", Marks: " + current.marks);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert Student Record");
            System.out.println("2. Delete Student Record");
            System.out.println("3. Display All Records");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Marks: ");
                    int marks = scanner.nextInt();
                    studentList.insertStudent(rollNo, name, marks);
                    break;

                case 2:
                    System.out.print("Enter Roll No to delete: ");
                    int deleteRollNo = scanner.nextInt();
                    studentList.deleteStudent(deleteRollNo);
                    break;

                case 3:
                    studentList.displayStudents();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
