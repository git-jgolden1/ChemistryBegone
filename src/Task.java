public class Task {
    enum Priority {
        LOW,
        MEDIUM,
        HIGH
    }
    String taskName;
    Priority priority;
    boolean completed = false;

    public void complete() {
        this.completed = true;
    }

    Task(String taskName, Priority priority) {
        this.taskName = taskName;
        this.priority = priority;
    }
}
