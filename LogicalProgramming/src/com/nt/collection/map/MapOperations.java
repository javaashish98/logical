package com.nt.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.nt.dto.StudentDTO;

public class MapOperations {
	
	public static void main(String[] args) {
		Map<Integer,Double> map=new HashMap<>();
		map.put(101, 6966559d);
		map.put(102, 5966559d);
		map.put(103, 1966559d);
		map.put(104, 6966559d);
		map.put(105, 6966559d);
		map.put(106, 3966559d);
		map.put(107, 6966559d);
		map.put(108, 4966559d);
		map.put(100, 6966589d);
		new String().isEmpty();
		Map<Integer,Double> sort=map.entrySet().stream()
								.sorted(Map.Entry.comparingByValue())
								.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		sort.forEach((x,y)->{
		//	System.out.println(x+"\t"+y);
		});
		
		TreeSet<StudentDTO> dto=new TreeSet<StudentDTO>((x,y)->{
				if(x.getSno()>y.getSno())
					return 1;
				else if(x.getSno()<y.getSno())
					return -1;
				else
					return 0;
		});
		StudentDTO dto1=new StudentDTO(1001,5680d);
		System.out.println(dto1);
		StudentDTO dto2=new StudentDTO(1002,5680d);
		StudentDTO dto3=new StudentDTO(1008,5680d);
		StudentDTO dto4=new StudentDTO(1006,5680d);
		dto.add(dto1);dto.add(dto2);dto.add(dto3);dto.add(dto4);
		dto.forEach(System.out::println);
//		Collection<Double> collection=map.values();
//		List<Double> list=new ArrayList<>(collection);
//		Collections.sort(list);
//		list.forEach(System.out::println);
		
	//	Arrays.sort(collection.toArray());
	//	collection.forEach(System.out::println);
	}
	

}
