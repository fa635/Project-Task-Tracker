public class Main { 
    public static void main(String[] args) {

        TaskManager taskList = new TaskManager();
     

        switch (args[0]) {
            case "add":
                taskList.addTask(args[1]);
                break;
                
            case "delete":
                // Code for case value2
                break;
                
            case "update":
                // Code for case value3
                break;

            case "status":
                // Code for case value3
                break;
              
            case "list":
                // Code for case value3
                break;
               
            case "listDone":
                // Code for case value3
                break;
            
            case "listTodo":
                // Code for case value3
                break;
               
            case "listInProgress":
                // Code for case value3
                break;
               
            default:
                // Code for default case
                break;
        }
        


        /*//Task myTask = new Task("buy food");
        taskList.addTask("buy food");

        //Task myOtherTask = new Task("buy land");
        taskList.addTask("buy land");

        taskList.deleteTask(1);

        taskList.listAllTasks();

        taskList.updateStatus(1, "done");
        taskList.changeDescription(1, "buy some");

        taskList.listAllTasks();
        taskList.addTask("buy this");
        taskList.addTask("buy that");
        taskList.addTask("buy and so");
        System.out.println("");
        System.out.println("All tasks: ");
        taskList.listAllTasks();
        System.out.println("");
        System.out.println("Done tasks: ");
        taskList.updateStatus(2, "done");
        taskList.updateStatus(4, "done");
        taskList.listTasksDone();
        System.out.println("");
        System.out.println("In progress tasks: ");
        taskList.updateStatus(3, "in-progress");
        taskList.updateStatus(1, "in-progress");
        taskList.listTasksInProgress();
        System.out.println("");
        System.out.println("todo tasks: ");
        taskList.updateStatus(4, "todo");
        taskList.updateStatus(1, "todo");
        taskList.listTasksTodo(); 

        taskList.addTask("buy 5");
        */

        
    }
}

