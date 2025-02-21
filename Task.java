import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private static int id = 0;
    String description;
    String status;
    String createdAt;
    String updatedAt;

/*- `id`: A unique identifier for the task
- `description`: A short description of the task
- `status`: The status of the task (`todo`, `in-progress`, `done`)
- `createdAt`: The date and time when the task was created
- `updatedAt`: The date and time when the task was last updated
*/

    public Task (String description) {
        id++;
        this.description = description;
        this.createdAt = DateAndTime();
    }

    public String DateAndTime () {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }

    public String toString () {
        return "id: " + id + ", description: " + description + " createdAt: " + createdAt;
    }
}



