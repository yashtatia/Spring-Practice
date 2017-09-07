
public class Message {
	private String message;
	public Message() {
		System.out.println("Message constr");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void init() {
		System.out.println("Inside init message");
	}
	
	public void destroy() {
		System.out.println("Inside destroy message");
	}
	
	public void finalize() {
		System.out.println("In finalize message");
	}
}
