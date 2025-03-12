# Project-Task-Tracker

Due to using maven, if i was to use the cli to run the app, it would
result in a too long command to execute it; all the contrary of hat i
was going for.
The best thing would have been to download the JAR dependecies so that
i can still run the Main with short normal Cli commands

________________________________________________________________________

I removed maven


# Task Tracker CLI

## Description
Task Tracker CLI is a simple command-line application for managing tasks. Users can add, update, delete, and list tasks, as well as update their status. The application stores tasks in a JSON file for persistence.

## Features
- Add tasks with a description.
- Delete tasks by ID.
- Update a task's description.
- Change a task's status (`todo`, `in-progress`, `done`).
- List all tasks or filter by status.
- Saves and loads tasks from a JSON file.

## Prerequisites
- Java 8 or later
- Jackson library for JSON handling (included in `lib` folder)

## Installation
1. **Clone the repository** (if using Git):
   ```sh
   git clone <your-repository-url>
   cd Project-Task-Tracker
   ```
2. **Ensure the required JAR files are in the `lib/` folder**:
   - `jackson-databind.jar`
   - `jackson-core.jar`
   - `jackson-annotations.jar`

## Compilation
To compile the project, run:
```sh
javac -cp "lib/*" -d bin src/*.java
```

## Usage
After compiling, you can run the program with the following commands:

### Add a Task
```sh
java -cp "bin;lib/*" Main add "Buy groceries"
```

### Delete a Task
```sh
java -cp "bin;lib/*" Main delete 1
```

### Update a Task's Description
```sh
java -cp "bin;lib/*" Main update 1 "Buy groceries and cook dinner"
```

### Change Task Status
```sh
java -cp "bin;lib/*" Main status 1 done
```

### List All Tasks
```sh
java -cp "bin;lib/*" Main list
```

### List Tasks by Status
```sh
java -cp "bin;lib/*" Main listTodo
java -cp "bin;lib/*" Main listInProgress
java -cp "bin;lib/*" Main listDone
```

## File Structure
```
Project-Task-Tracker/
│── src/
│   ├── Main.java
│   ├── Task.java
│   ├── TaskManager.java
│   ├── JsonManager.java
│── lib/
│   ├── jackson-databind.jar
│   ├── jackson-core.jar
│   ├── jackson-annotations.jar
│── bin/  (compiled .class files and tasks.json file)
```

## Notes
- If running on **Mac/Linux**, replace `;` with `:` in the classpath (`-cp "bin:lib/*"`).
- The `tasks.json` file is automatically created in `bin/` and used for storing tasks.

## Future Enhancements
- Implement filtering tasks by date.
- Add support for task priorities.
- Improve command-line interaction.

## License
This project is open-source and free to use.

