
public class Namaskara {
	private String message;
	
	public Namaskara() {
		System.out.println("Constr-0-");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Inside init namaskara");
	}
	
	public void destroy() {
		System.out.println("Inside destroy namaskara");
	}
	
	public void finalize() {
		System.out.println("In finalize namaskara");
	}
	
	
}
