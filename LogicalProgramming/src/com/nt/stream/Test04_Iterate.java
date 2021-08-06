package com.nt.stream;

import java.util.stream.Stream;

public class Test04_Iterate {

	public static void main(String[] args) {

		Stream.iterate(5,n->n+5).limit(10).forEach(System.out::println);
	}

}
