// Define the Callback interface (functional interface)
interface Callback {
    void onCompletion(String message);
}

// Class performing a task
class Task {
    void executeTask(Callback callback) {
        System.out.println("Task is being executed...");
        try {
            Thread.sleep(2000); // Simulate a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callback.onCompletion("Task completed using lambda!");
    }
}

// Main class
public class CallbackExampleLambda {
    public static void main(String[] args) {
        Task task = new Task();

        // Use a lambda expression for the callback
        task.executeTask(message -> System.out.println("Callback received: " + message));

        System.out.println("Main thread continues execution...");
    }
}
