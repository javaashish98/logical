package com.nt.stream;

import java.util.function.BiFunction;

public class Test02_BiFunctionTest {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> biFunction=(x,y)->{
			return x*y;
		};
		System.out.println(biFunction.apply(60, 80));
	}

}
