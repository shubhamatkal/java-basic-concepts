// Define the Callback interface
interface Callback {
    void onCompletion(String message);
}

// Class performing a task
class Task {
    void executeTask(Callback callback) {
        System.out.println("Task is being executed...");
        // Simulating some work using Thread.sleep
        try {
            Thread.sleep(2000); // Simulate a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Notify the callback after the task is complete
        callback.onCompletion("Task completed successfully!");
    }
}

// Main class
public class CallbackByInterface {
    public static void main(String[] args) {
        Task task = new Task();

        // Pass an implementation of the Callback interface
        task.executeTask(new Callback() {
            @Override
            public void onCompletion(String message) {
                System.out.println("Callback received: " + message);
            }
        });

        System.out.println("Main thread continues execution...");
    }
}
