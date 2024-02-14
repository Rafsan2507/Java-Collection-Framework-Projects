import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("\nTask Manager:");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Filter Tasks");
            System.out.print("Enter choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scan.nextLine();
                    taskManager.AddTasks(name, description, new Date());
                    break;
                case 2:
                    taskManager.ViewAllTasks();
                    break;
                case 3:
                    System.out.print("Enter task name to mark as completed: ");
                    String taskName = scan.nextLine();
                    taskManager.MarkTaskAsCompleted(taskName);
                    break;
                case 4:
                    System.out.print("Enter task name to delete: ");
                    String deleteName = scan.nextLine();
                    taskManager.DeleteTask(deleteName);
                    break;
                case 5:
                    System.out.print("Filter tasks based on their status: ");
                    boolean fil = scan.nextBoolean();
                    taskManager.TaskFilter(fil);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}