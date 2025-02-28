import java.util.ArrayList;

public class TaskManager {

    public ArrayList<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask (Task task) {
        this.tasks.add(task);
    }


    public void displayTasks () {
        for (Task task : tasks) {
           System.out.println(task.description);
        }
         
    }

}
