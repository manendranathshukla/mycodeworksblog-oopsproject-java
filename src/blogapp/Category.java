package blogapp;

import java.util.List;

public class Category {
	
	private String categoryName;
	private List<Post> posts;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}
	

}
