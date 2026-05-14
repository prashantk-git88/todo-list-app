package Developer;
import java.util.Scanner;
import java.util.ArrayList;
public class ToDoList {
    public static void main(String[]args){
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== To-Do List App ===");

        do {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet!");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete!");
                    } else {
                        System.out.print("Enter task number to delete: ");
                        int num = sc.nextInt();
                        if (num >= 1 && num <= tasks.size()) {
                            System.out.println("Deleted: " + tasks.get(num - 1));
                            tasks.remove(num - 1);
                        } else {
                            System.out.println("Invalid number!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
