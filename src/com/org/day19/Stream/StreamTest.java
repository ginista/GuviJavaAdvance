package com.org.day19.Stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\antan\\Desktop\\JavaFullStackDevelopment_Guvi\\FileHandling\\Sample.txt");
		List<String> content = Files.readAllLines(path,StandardCharsets.UTF_8);
		System.out.println("Size in file: "+content.size());
		//Legacy way
		long count = 0;
		for(String word:content) {
			if(word.length()>3) {
				count++;
			}
		}
		System.out.println("Legacy way: "+count);
		
		long counts = content.stream().filter(word->word.length()>3).count();
		System.out.println("Counting greater than 3: "+counts);
		
		long count_1 = content.stream().filter(word->word.length()>3).limit(3).count();
		System.out.println("Using limit: " +count_1);
		
		//Manualy Creating streams
		Stream<String> films = Stream.of("Leo","Master");
		
		//Creating empty stream
		Stream<String> empty = Stream.empty();
		Stream<String> echos = Stream.generate(()->"Echo").limit(5);
		echos.forEach(System.out::println);
		
		//List of Random Numbers
		Stream<Double> randoms = Stream.generate(Math::random).limit(5);
		randoms.forEach(System.out::println);
		
		//Transform each data use map
		List<String> languages = content.stream().map(String::toUpperCase).collect(Collectors.toList());
		languages.forEach(System.out::println);
		
		//Print unique elements
		List<Integer> list = List.of(1,1,1,2,2,3);
		List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
		unique.forEach(System.out::println);
		
		//Sorting the list
		List<Integer> unordered = List.of(1,5,8,2,4,3);
		List<Integer> sorted = unordered.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted list: ");
		sorted.forEach(System.out::println);
		
		//For sorting in reverse order
		List<Integer> unordered_1 = List.of(1,5,8,2,4,3);
		List<Integer> sorted_1 = unordered.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reverse order Sorted list: ");
		sorted_1.forEach(System.out::println);
		
		//Finding second maximum
		Optional<Integer> secondMax = unordered.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst();
		if(secondMax.isPresent())
			System.out.println("Second max: "+secondMax.get());
		
		

	}

}
