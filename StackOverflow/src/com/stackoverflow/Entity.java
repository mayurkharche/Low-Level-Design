package com.stackoverflow;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Entity {

	Integer entityId;
	Member creator;
	Map<VoteType, Integer> votes;
	Date createdDate;
	List<Comment> comments;
	
	public Boolean flagEntity() {return null;}
	public Boolean voteEntity() {return null;}
	public Boolean addComment(Comment comment) {return null;}
}
