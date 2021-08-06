package com.nt.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test03_StreamBuilder {

	public static void main(String[] args) {

//		Stream<String> streamBuilder=Stream.<String>builder().add("ram").add("raman").add("sunil").build();
//		List<String> list=streamBuilder.collect(Collectors.toList());
		int i=10;
		List<Integer> s=Stream.generate(()->{
			// i=0;
			return i;
		}
		).limit(20).collect(Collectors.toList());
		s.forEach(System.out::println);
		
	}

}
