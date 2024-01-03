public class Task {
	///////////////////////////////////
	// Constructors
	public Task(int id, String title, String description, boolean status)
	{
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
	}

	///////////////////////////////////
	// Setters
	public void setStatus(boolean status) {
		this.status = status;
	}

	///////////////////////////////////
	// Getters
	public int getId() {
		return (id);
	}

	public String getTitle() {
		return (title);
	}

	public String getDescription() {
		return (description);
	}

	public boolean getStatus() {
		return (status);
	}

	//////////////////////////////////
	// Data
	private int	id;
	private String	title;
	private String	description;
	private boolean	status;
}
