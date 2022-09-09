package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

	public static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comment = new ArrayList<>();
	
	
	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public void addComment(Comment comment) {
		this.comment.add(comment);
	}
	
	public LocalDateTime getMoment() {
		return moment;
	}
	
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Integer getLikes() {
		return likes;
	}
	
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public List<Comment> getComment() {
		return comment;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title + "\n");
		sb.append(this.likes + " Likes - ");
		sb.append(this.moment.format(fmt1) + "\n");
		sb.append(this.content + "\n");
		sb.append("Coments:\n");
		for(Comment c : comment) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
