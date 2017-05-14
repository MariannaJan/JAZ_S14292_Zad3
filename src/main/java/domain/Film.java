package main.java.domain;

import java.util.ArrayList;

public class Film {
	
	private int id;
	private String title;
	private String description;
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	private ArrayList<Comment> commentList = new ArrayList<Comment>();
	private double avscore = 0;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	public ArrayList<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(ArrayList<Comment> commentList) {
		this.commentList = commentList;
	}
	
	public void addScore(Score score) {
		this.scoreList.add(score);
	}
	
	public double getAverageScore() {
		
		int sum = 0;

		
		for(Score s : this.scoreList){
			sum+= s.getScore();
		}
		
		avscore = sum/scoreList.size();
		

		
		return avscore;
	}
	
	public void addComment(Comment comment) {
		commentList.add(comment);
	}
	
	
	
	
	
}
