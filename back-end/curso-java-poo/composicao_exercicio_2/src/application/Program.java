package application;

import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		LocalDateTime d01 = LocalDateTime.parse("21/06/2018 13:05:44", Post.fmt1);
		LocalDateTime d02 = LocalDateTime.parse("28/07/2018 23:14:19", Post.fmt1);
		
		Post p1 = new Post(d01, "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		p1.addComment(new Comment("Have a nice trip!"));
		p1.addComment(new Comment("Wow that's awesome!"));
		
		Post p2 = new Post(d02, "Good night guys!", "See you tomorrow", 5);
		p2.addComment(new Comment("Good night"));
		p2.addComment(new Comment("May the force be with you"));
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
