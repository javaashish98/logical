package com.nt.stream;

import java.util.function.BiConsumer;

public class Test01_BiConsumerTest {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> add=(x,y)->{System.out.print(x+y);};
		add.accept(90, 80);
		
	}

}
