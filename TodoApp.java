import java.util.Scanner;

public class TodoApp {

	//////////////////////////////////////////////
	// Public methods
	public static void main(String[] args) {
		TodoApp todoApp = new TodoApp();
		// todoApp.todoList.print();
		todoApp.run();
	}

	public void run() {
        while (true) {
            printMenu();
			String input = scan.nextLine();
			if (input.equals("1"))
				addTask();
			else if (input.equals("2"))
				markAsCompleted();
			else if (input.equals("3"))
				viewTasks();
			else if (input.equals("4")) {
				System.out.println("Exiting TodoApp. Goodbye!");
				System.exit(0);
			}
			else
				System.out.println("Invalid choice. Please try again.");
        }
    }

	//////////////////////////////////////////////
	// Private methods
	private void addTask() {
		String	title;
		String	desc = "";

		System.out.print("Title: ");
		title = scan.nextLine();
		// System.out.print("Description: ");
		// desc = scan.nextLine();
		
		Task	task = new Task(0, title, desc, false);
		todoList.addTask(task);
	}

	private void viewTasks() {
		todoList.print();
	}

	private void markAsCompleted() {
		int	id;

		System.out.print("Task ID: ");
		id = scan.nextInt();
		scan.nextLine();
		todoList.markAsCompleted(id);
	}

	private void printMenu() {
        System.out.println("\n--- Todo List Menu ---");
        System.out.println("1. Add a new task");
        System.out.println("2. Mark a task as completed");
        System.out.println("3. View tasks");
        System.out.println("4. Exit");
    }

	//////////////////////////////////////////////
	// Constructors
	public TodoApp() {
		todoList = new TodoList();
		scan = new Scanner(System.in);
	}

	//////////////////////////////////////////////
	// Data
	TodoList	todoList;
	Scanner		scan;
}
