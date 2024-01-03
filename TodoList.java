import java.util.ArrayList;
import java.util.List;

public class TodoList {
	
	///////////////////////////////////////
	// Public methods
	public void print () {
		System.out.println("---------------------------------------------");
		System.out.println("|                TODO LIST                  |");
		System.out.println("---------------------------------------------");

		if (tasks.size() == 0) {
			System.out.println("|                                           |");
			System.out.println("---------------------------------------------");
		}
		else
		{
			for (Task task : tasks) {
				if (task.getStatus() == true)
					System.out.println("|" + Constants.CHECKED_BOX + 
						String.format(" %-40s |", task.getTitle()));
				else
					System.out.println("|" + Constants.UNCHECKED_BOX + 
						String.format(" %-40s |", task.getTitle()));
			}
			System.out.println("---------------------------------------------");
		}
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public void markAsCompleted(int id) {
		for (Task task : tasks) {
			if (task.getId() == id) {
				task.setStatus(true);
				break;
			}
		}
	} 	

	///////////////////////////////////////
	// Constructors
	public TodoList() {
		tasks = new ArrayList<>();
	}
	
	///////////////////////////////////////
	// Data
	private List<Task> tasks;
}
