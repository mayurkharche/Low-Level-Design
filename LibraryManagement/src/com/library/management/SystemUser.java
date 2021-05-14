package com.library.management;

public abstract class SystemUser extends Person {

	String email;
	String phoneNumber;
	
	Account account;
	
	Search searchObj;
	
	abstract BookReservationDetail getReservationDetails(Book book);
	abstract void updateReservationDetails(BookReservationDetail reservationDetails);
	abstract BookReservationDetail reserveBook(BookItem bookItem);
	abstract BookIssueDetail issueBook(BookItem bookItem);
	abstract BookIssueDetail renewBook(BookItem bookItem);
	abstract void returnBook(BookItem bookItem);
}
