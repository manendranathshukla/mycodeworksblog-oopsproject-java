package blogapp;

public class Comment {
	
	private String fullname;
	private String email;
	private String message;
	private Post post;
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public Comment(String fullname, String email, String message, Post post) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.message = message;
		this.post = post;
	}
	@Override
	public String toString() {
		return "Comment [fullname=" + fullname + ", email=" + email + ", message=" + message +  "]";
	}
	
	
}
