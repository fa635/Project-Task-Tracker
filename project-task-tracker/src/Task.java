import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    public Task() {}

    @JsonCreator
    public Task (@JsonProperty("description") String description) {
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


    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String toString () {
        return "id: " + id + ", description: " + description + "status: " + status + ", createdAt: " + createdAt;
    }
}



