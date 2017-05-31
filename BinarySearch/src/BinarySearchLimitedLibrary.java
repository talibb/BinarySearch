/*
 * Done by: Talib Bacchus
 * This program demonstrates a binary search using "Book.java"
 * A book has an title, author, publisher, and a copyright date
 * The books are then added to an array list and their titles are 
 * then converted into a numerical value
 * the books are then looked up using a binary search algorithm 
 * using the numeric value of their titles
 * 
 */

import java.util.ArrayList;
public class BinarySearchLimitedLibrary {

	public static void main(String[] args) {
		Book b1 = new Book("A", "John", "Randy", 1900);
		Book b2 = new Book("B", "Smith", "Brian", 1800);
		Book b3 = new Book("C", "Alex", "Mark", 1700);
		Book b4 = new Book("D", "Tariq", "Matt", 1600);
		Book b5 = new Book("E", "Ahmad", "Luke", 1500);
		Book b6 = new Book("F", "Vic", "Cruz", 1400);
		Book b7 = new Book("G", "Lebron", "James", 1300);
		Book b8 = new Book("I", "Fechter","Ronald", 1200);
		Book b9 = new Book("J", "Kelly","Oher", 1100);
		Book b10 = new Book("K", "Micael","Jones", 1000);
		
		ArrayList <Book> b = new ArrayList <Book>();
		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(b4);
		b.add(b5);
		b.add(b6);
		b.add(b7);
		b.add(b8);
		b.add(b9);
		b.add(b10);

	    int titleSearch= (int)(StringtoASCII("I"));

	myBinarySearch(b,titleSearch);

	}
	// converts the title of the book to a numeric value
		public static long StringtoASCII (String title)
		{
			StringBuilder sb = new StringBuilder();
	        String ascString = null;
	        long asciiInt;
	        for (int i = 0; i < title.length(); i++)
	        {
	        	sb.append((int)title.charAt(i));
	               
	         }
	                ascString = sb.toString();
	                asciiInt = Long.parseLong(ascString);
	                return asciiInt;
	                
	              
	}
	 
		// binary search
		public static void myBinarySearch(ArrayList <Book> lib, int title){
			boolean found = false;
			int first  = 0;
			int last   = lib.size() - 1;
			int middle = (first + last)/2;
	 
			while( first <= last )
			{
				if ( (int)(StringtoASCII(lib.get(middle).getTitle())) < title)
				{
					first = middle + 1;   
				}
				else if ((int)(StringtoASCII(lib.get(middle).getTitle()))==title) 
				{
					found=true;
					break;
				}
				else
					last = middle - 1;
	 
				middle = (first + last)/2;
			}
	   
			if (!found ){
				System.out.println( " is not present in the list.\n");
			}
			else
			{
				System.out.println("Found at location " + (middle + 1));
				System.out.println("Title "+lib.get(middle+1).getTitle()+", Author: "+lib.get(middle + 1).getAuthor()+", Publisher: "+lib.get(middle+1).getPublisher());

			}
	 
	}
	
		
	

	}



