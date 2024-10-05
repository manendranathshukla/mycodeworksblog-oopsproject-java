package blogapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BlogApplication {
	public List<Post> posts;
	public List<Category> categories;
	public List<Author> authors;
	public List<Comment>comments;

	public BlogApplication() {
		this.posts = new ArrayList<>();
		this.categories= new ArrayList<>();
		this.authors= new ArrayList<>();
		this.comments= new ArrayList<>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlogApplication app= new BlogApplication();
		
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("***********Welcome To MyCodeWorks Blog App********");
			System.out.println("1. Show Posts");
			System.out.println("2. Add Post");
			System.out.println("3. Add Author");
			System.out.println("4. Add Comment");
			System.out.println("5. Add Category");
			System.out.println("6. Show Post By Author Name");
			System.out.println("********Please Enter your choice*****");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				showPosts( app);
				break;
			case 2:
				addPost(app,sc);
				break;
			case 3:
				addAuthor(app,sc);
				break;
			case 4:
				addComment(app,sc);
				break;

			case 5:
				addCategory(app, sc);
				break;
			case 6:
				showPostByAuthorName(app,sc);
				break;
			default:
				System.out.println("*****App Terminated*****");
				System.exit(0);

			}

		}

	}

	public static void showPosts(BlogApplication app) {
		System.out.println("********List of Posts*******");
		if(app.posts == null) {
			System.out.println("**No post available**");
		}else if(app.posts.size() == 0) {
			System.out.println("**No post available**");
		}else {
			
		for(Post p : app.posts) {
			System.out.println(p.toString());
		}
		}
	}

	public static void addPost(BlogApplication app,Scanner sc) {
		System.out.println("******Creating New Post*******");
		System.out.println("Enter post id :");
		int id=sc.nextInt();
		System.out.println("Enter post title :");
		String title=sc.next();
		System.out.println("Enter post description :");
		String desc=sc.nextLine();
		System.out.println("Select Author :");
		for(Author a:app.authors) {
			System.out.println(a.getAuthorId() +"-" + a.getAuthorName());
		}
		int authId=sc.nextInt();
		Author at= app.authors.get(authId-1);
		System.out.println("Select Category :");
		int cIndex=1;
		for(Category c:app.categories) {
			System.out.println(cIndex +"-" + c.getCategoryName());
			cIndex++;
		}
		int catIndex=sc.nextInt();
		Category cat= app.categories.get(catIndex-1);
		if(app.posts.size()>0) {
		System.out.println("Select Prev Post :");
		int pIndex=1;
		for(Post p:app.posts) {
			System.out.println(pIndex +"-" + p.getTitle());
			pIndex++;
		}
		int prevIndex=sc.nextInt();
		Post prevPost= app.posts.get(prevIndex-1);
		System.out.println("Select Next Post :");
		int nIndex=1;
		for(Post n:app.posts) {
			System.out.println(nIndex +"-" + n.getTitle());
			nIndex++;
		}
		int nextPIndex=sc.nextInt();
		Post nextPost= app.posts.get(nextPIndex-1);
		app.posts.add(new Post(id,title,desc,at,cat,0,prevPost,nextPost,new Date()));

		}else {
		app.posts.add(new Post(id,title,desc,at,cat,0,null,null,new Date()));
		}
		System.out.println("******Post Created Successfully*******");
	}

	public static void addAuthor(BlogApplication app,Scanner sc) {
		System.out.println("******Enter Author Details*******");
		System.out.println("Enter Author ID :");
		int id=sc.nextInt();
		System.out.println("Enter Author Name :");
		String name=sc.next();
		System.out.println("Enter Author Email :");
		String email=sc.next();
		app.authors.add(new Author(id,name,email));
		
		System.out.println("******Author Added Successfully*******");
	}

	public static void addCategory(BlogApplication app,Scanner sc) {
		System.out.println("******Enter Post Category Name*******");
		String c=sc.next();
		app.categories.add(new Category(c));
		
		System.out.println("******Category Added Successfully*******");

	}

	public static void addComment(BlogApplication app,Scanner sc) {
		System.out.println("******Enter Comment Message Here *******");
		String cmt=sc.next();
		System.out.println("Enter FullName:");
		String fn=sc.next();
		System.out.println("Enter Email:");
		String em=sc.next();
		System.out.println("Select Post for which you want to add comment:");

		int nIndex=1;
		for(Post n:app.posts) {
			System.out.println(nIndex +"-" + n.getTitle());
			nIndex++;
		}
		int nextPIndex=sc.nextInt();
		Post nextPost= app.posts.get(nextPIndex-1);
		Comment mycmt=new Comment(fn,em,cmt,nextPost);
		app.comments.add(mycmt);
		nextPost.setComments(app.comments);
		
		
		System.out.println("******Comment Added Successfully*******");
	}

	public static void showPostByAuthorName(BlogApplication app,Scanner sc) {
		System.out.println("******Search Posts By Author Name*******");
		System.out.println("Enter author name :");

		String s = sc.next();
		
		for(Post p: app.posts) {
			if(p.getAuthor().getAuthorName().equals(s)) {
				System.out.println(p.toString());
			}
		}
		
		

	}
}
