package com.booksort.arraylist;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getBookTitle().compareTo(o2.getBookTitle());
	}

}