import java.util.Scanner;

class Node {
    int bookId;
    String bookTitle;
    double price;
    Node prev, next;

    Node(int bookId, String bookTitle, double price) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.price = price;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList {
    Node head;

    void insert(int bookId, String bookTitle, double price) {
        Node newNode = new Node(bookId, bookTitle, price);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    void delete(int bookId) {
        Node current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found!");
    }

    void searchByTitle(String bookTitle) {
        Node current = head;
        boolean found = false;
        while (current != null) {
            if (current.bookTitle.equalsIgnoreCase(bookTitle)) {
                found = true;
                System.out.println("Book ID: " + current.bookId + ", Book Title: " + current.bookTitle + ", Price: " + current.price);
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    void display() {
        Node current = head;
        if (current == null) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Library Records:");
        while (current != null) {
            System.out.println("Book ID: " + current.bookId + ", Book Title: " + current.bookTitle + ", Price: " + current.price);
            current = current.next;
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        DoublyLinkedList library = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Insert a record");
            System.out.println("2. Delete a record by Book ID");
            System.out.println("3. Search by Book Title");
            System.out.println("4. Display Library");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    System.out.print("Enter Book Title: ");
                    scanner.nextLine(); // Consume newline
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    library.insert(bookId, bookTitle, price);
                    System.out.println("Record inserted successfully!");
                    break;
                case 2:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteBookId = scanner.nextInt();
                    library.delete(deleteBookId);
                    break;
                case 3:
                    System.out.print("Enter Book Title to search: ");
                    scanner.nextLine(); // Consume newline
                    String searchTitle = scanner.nextLine();
                    library.searchByTitle(searchTitle);
                    break;
                case 4:
                    library.display();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
