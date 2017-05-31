/*
 * To be used with "BinarySearchLimitedLibrary.java" , "LinearSearchLimitedLibrary.java"
 *  or "SortingLimitedLibrary.java"
 */

public class Book {
	
	//private data members
	private String title;
	private String author;
	private String publisher;
	private int crdate;
	
	/**
	 * Constructor
	 * @param title
	 * @param author
	 * @param publisher
	 * @param crdate
	 */
	public Book(String title, String author, String publisher, int crdate) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.crdate = crdate;
	}
	/**
	 * Returns title
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Updates title
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Returns author
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Updates author
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Returns publisher
	 * @return publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * Updates publisher
	 * @param publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * Returns copyright date
	 * @return crdate
	 */
	public int getCrdate() {
		return crdate;
	}

	/**
	 * Updates copyright date
	 * @param crdate
	 */
	public void setCrdate(int crdate) {
		this.crdate = crdate;
	}
	
	/**
	 * Returns String description of Book.
	 */
	public String toString() {
		String description = "";
		description += "Title: \t" + title + "\n";
		description += "Author: \t" + author + "\n";
		description += "Publisher: \t" + publisher + "\n";
		description += "Copyright Date: \t" + crdate + "\n";
		return description;
	}
	
}
