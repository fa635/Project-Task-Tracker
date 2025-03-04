public class Main { 
    public static void main(String[] args) {

        TaskManager taskList = new TaskManager();
        
        //Task myTask = new Task("buy food");
        taskList.addTask("buy food");

        //Task myOtherTask = new Task("buy land");
        taskList.addTask("buy land");

        taskList.deleteTask(1);

        taskList.displayTasks();
        
    }
}

