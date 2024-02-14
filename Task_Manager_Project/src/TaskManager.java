import java.util.*;

public class TaskManager {
    HashMap<String,Task> tasks;

    public TaskManager() {
        tasks = new HashMap<>();
    }

    public void AddTasks(String name, String description, Date dueDate){
        Task task = new Task(name,description,dueDate);
        tasks.put(name,task);
    }
    public void ViewAllTasks() {
        for (Task task : tasks.values()) {
            System.out.println(task);
        }
    }
    public void MarkTaskAsCompleted(String name) {
        Task task = tasks.get(name);
        task.setCompleted(true);
        System.out.println(name + " is " + "marked as completed.");
    }
    public void DeleteTask(String name) {
        Task deletedTask = tasks.remove(name);
        if (deletedTask != null) {
            System.out.println(name + " is " + "deleted.");
        } else {
            System.out.println("Task not found.");
        }
    }
    public void TaskFilter(boolean completed) {
        List<Task> filter = new ArrayList<>();
        for (Task task : tasks.values()) {
            if (task.isCompleted() == completed) {
                filter.add(task);
            }
        }
        if (!filter.isEmpty()) {
            System.out.println("Filtered tasks:");
            for (Task task : filter) {
                System.out.println(task);
            }
        }else {
            System.out.println("No tasks found.");
        }
    }

}
