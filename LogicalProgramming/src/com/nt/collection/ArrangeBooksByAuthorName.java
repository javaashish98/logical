package com.nt.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrangeBooksByAuthorName {

	
	public static void main(String[] args) {
	
		List<BooksInfo> bookInfo=List.of(new BooksInfo("auth1", "book1"),new BooksInfo("auth1", "book2"),new BooksInfo("auth2", "book3"),new BooksInfo("auth3", "book4"),new BooksInfo("auth3", "book5"));
		Map<String,List<String>> authBookInfo=new HashMap<String, List<String>>();
		bookInfo.forEach(books->{
			if(authBookInfo.containsKey(books.getAuthorName())){
				authBookInfo.get(books.getAuthorName()).add(books.getBookName());
			}
			else
			{
				List<String> list=new ArrayList<>();
				list.add(books.getBookName());
				authBookInfo.put(books.getAuthorName(), list);
			}
		});
		authBookInfo.forEach((x,y)->{
			System.out.println(x+" "+y);
		});
	}
	
	
	
}
