package com.stackoverflow;

import java.util.List;

public class Question extends Entity {

	List<EditHistory> editHistoryList;
	List<Answer> answers;
	List<Tag> tags;
	String title;
	String description;
	
	Answer acceptedAnswer;
	
	QuestionStatus questionStatus;
	
	public void addTag(Tag tag) {}
	public void addAnswer(Answer answer) {}
	public void addEditHistory(EditHistory editHistory) {}
	public void addAcceptedAnswer() {}
}
