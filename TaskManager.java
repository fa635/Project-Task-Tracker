import java.util.ArrayList;

public class TaskManager {

    public ArrayList<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask (String description) {
        Task task = new Task(description);
        this.tasks.add(task);
    }

    public void deleteTask (int id) {
        // id - 1 because the index is 0 based but not the id
        tasks.remove(id - 1);
        // decrement each id by 1 after delete
        for (int i = id - 1; i < tasks.size(); i++) {
            tasks.get(i).id = tasks.get(i).id - 1;
        }
        // decrement the globalId
        Task.globlalId -= 1;
    }

    public void updateStatus (int id, String newStatus) {
        tasks.get(id - 1).status = newStatus;
    }

    public void changeDescription (int id, String newDescription) {
        tasks.get(id - 1).description = newDescription;
        tasks.get(id - 1).updatedAt = tasks.get(id - 1).dateAndTime();
    }


    public void listAllTasks () {
        for (Task task : tasks) {
           System.out.println(task.description + "; id: " + task.id + "; status: " + task.status 
           + "; date: " + task.createdAt + "; audateDate: " + task.updatedAt);
        }
         
    }

    public void listTasksTodo () {
        for (Task task : tasks) {
            if (task.status.equals("todo")) {
                System.out.println(task.description + "; id: " + task.id + "; status: " + task.status 
                + "; date: " + task.createdAt + "; audateDate: " + task.updatedAt);
            }
         }
    }

    public void listTasksInProgress () {
        for (Task task : tasks) {
            if (task.status.equals("in-progress")) {
                System.out.println(task.description + "; id: " + task.id + "; status: " + task.status 
                + "; date: " + task.createdAt + "; audateDate: " + task.updatedAt);
            }
         }
    }

    public void listTasksDone () {
        for (Task task : tasks) {
            if (task.status.equals("done")) {
                System.out.println(task.description + "; id: " + task.id + "; status: " + task.status 
                + "; date: " + task.createdAt + "; audateDate: " + task.updatedAt);
            }
         }
    }

}
