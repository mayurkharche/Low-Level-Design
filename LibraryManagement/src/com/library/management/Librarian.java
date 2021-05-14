package com.library.management;

public class Librarian extends SystemUser {

	public void addBookItem(BookItem bookItem) {}
	public BookItem deleteBookItem (String barCode) {return null;}
	public BookItem editBookItem(BookItem bookItem) {return null;}
	
	@Override
	BookReservationDetail getReservationDetails(Book book) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	void updateReservationDetails(BookReservationDetail reservationDetails) {
		// TODO Auto-generated method stub
		
	}
	@Override
	BookReservationDetail reserveBook(BookItem bookItem) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	BookIssueDetail issueBook(BookItem bookItem) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	BookIssueDetail renewBook(BookItem bookItem) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	void returnBook(BookItem bookItem) {
		// TODO Auto-generated method stub
		
	}
}
