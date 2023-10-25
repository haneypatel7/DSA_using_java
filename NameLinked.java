import java.util.Scanner;

public class NameLinked {

    static class Node {
        int number;
        String name;
        Node next;

        Node(int number, String name) {
            this.number = number;
            this.name = name;
            this.next = null;
        }
    }

    Node head = null;

    public void creation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Enter the name");
        String name = sc.next();
        Node new_node = new Node(number, name);

        if (head == null) {
            head = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Student Records:");
            while (temp != null) {
                System.out.println("Number: " + temp.number + ", Name: " + temp.name);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NameLinked n = new NameLinked();

        System.out.println("Enter student records:");
        n.creation();
        n.creation();
        n.creation();
        
        System.out.println("Displaying student records:");
        n.display();
    }
}
