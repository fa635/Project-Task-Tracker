public class Main { 
    public static void main(String[] args) {

        TaskManager taskList = new TaskManager();
        
        Task myTask = new Task("buy food");
        taskList.addTask(myTask);

        Task myOtherTask = new Task("buy land");
        taskList.addTask(myOtherTask);

        taskList.displayTasks();
        
    }
}

