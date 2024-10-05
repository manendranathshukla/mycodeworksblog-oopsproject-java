package blogapp;

import java.util.Date;
import java.util.List;

public class Post {
	
	private int postId;
	private String title;
	private String desc;
	private Author author;
	private List<Comment> comments;
	private Category category;
	private int noOfLikes;
	private Post prePost;
	private Post nextPost;
	private Date createdDate;
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getNoOfLikes() {
		return noOfLikes;
	}
	public void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}
	public Post getPrePost() {
		return prePost;
	}
	public void setPrePost(Post prePost) {
		this.prePost = prePost;
	}
	public Post getNextPost() {
		return nextPost;
	}
	public void setNextPost(Post nextPost) {
		this.nextPost = nextPost;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Post(int postId, String title, String desc, Author author, Category category,
			int noOfLikes, Post prePost, Post nextPost, Date createdDate) {
		super();
		this.postId = postId;
		this.title = title;
		this.desc = desc;
		this.author = author;
		this.category = category;
		this.noOfLikes = noOfLikes;
		this.prePost = prePost;
		this.nextPost = nextPost;
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return postId + "\n"+title + "\n" + desc + "\nWritten By:" + author +  "category=" + category + "\nnoOfLikes=" + noOfLikes + "\nprePost=" + prePost
				+ "\nnextPost=" + nextPost + "\ncreatedDate=" + createdDate;
	}
	
	
	

}
