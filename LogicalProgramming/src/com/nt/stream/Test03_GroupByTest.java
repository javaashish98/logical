package com.nt.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test03_GroupByTest {

	public static void main(String[] args) {

		List<String> items=List.of("banana","apple","khajur","banana","apple","papaya");
		Map<String,Long> result=items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		result.forEach((x,y)->System.out.println(x+" "+y));
	}

}
