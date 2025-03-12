import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonManager {

    // Define the file name for storing tasks
    private static final String TASKS_FILE_NAME = "tasks.json";

    // Method to save tasks to a JSON file
    public void saveTasksToJson(List<Task> tasks) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Enable pretty printing of JSON
            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            // Create the file if it doesn't exist
            File file = new File("bin/" + TASKS_FILE_NAME);
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("File 'tasks.json' created.");
                } else {
                    System.out.println("Failed to create the file.");
                    return;
                }
            }

            // Write the tasks list to the JSON file
            mapper.writeValue(file, tasks);
            System.out.println("Tasks saved to tasks.json");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to load tasks from the JSON file
    public List<Task> loadTasksFromJson() {
        ObjectMapper mapper = new ObjectMapper();
        List<Task> tasks = null;
        try {
            // Read JSON file and convert it into a List of Task objects
            File file = new File("bin/" + TASKS_FILE_NAME);
            if (file.exists()) {
                tasks = mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(List.class, Task.class));
                System.out.println("Tasks loaded from tasks.json");
            } else {
                System.out.println("tasks.json file does not exist, starting with an empty list.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tasks;
    }
}
