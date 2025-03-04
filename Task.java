import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    public static int globlalId = 0;
    int id;
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
        globlalId++;
        this.id = globlalId;
        this.description = description;
        this.createdAt = dateAndTime();
        this.status = "todo";
    }

    public String dateAndTime () {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }




    public String toString () {
        return "id: " + id + ", description: " + description + "status: " + status + ", createdAt: " + createdAt;
    }
}



