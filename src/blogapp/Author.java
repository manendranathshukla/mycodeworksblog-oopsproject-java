package blogapp;

import java.util.List;

public class Author {
	
	private int authorId;
	private String authorName;
	private String authorEmail;
	private List<Post> posts;
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public Author(int authorId, String authorName, String authorEmail) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorEmail = authorEmail;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", authorEmail=" + authorEmail
				+ ", posts=" + posts + "]";
	}
	
	

}
