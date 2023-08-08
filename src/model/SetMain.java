package model;
import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        // Create TaskData object
        TaskData taskData = new TaskData();

        // Sample Tasks
        Task task1 = new Task("ProjectA", "Task 1", "Ann", Priority.HIGH, Status.IN_QUEUE);
        Task task2 = new Task("ProjectB", "Task 2", "Bob", Priority.MED, Status.ASSIGNED);
        Task task3 = new Task("ProjectA", "Task 3", "Carol", Priority.LOW, Status.IN_PROGRESS);

        // Add tasks to the respective employees
        taskData.getAnnsTasks().add(task1);
        taskData.getBobsTasks().add(task2);
        taskData.getCarolsTasks().add(task3);

        // Example usage
        Set<Task> allTasks = taskData.getTasks("all");
        for (Task task : allTasks) {
            System.out.println("Project: " + task.getProject() + ", Description: " + task.getDescription());
        }
    }
}
