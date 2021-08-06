package com.nt.collection;

public class BooksInfo {
	
	private String authorName;
	private String bookName;
	public BooksInfo(String authorName, String bookName) {
		super();
		this.authorName = authorName;
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "BooksInfo [authorName=" + authorName + ", bookName=" + bookName + "]";
	}

}
