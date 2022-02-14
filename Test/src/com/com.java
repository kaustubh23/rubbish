package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class com {

	public static void main(String[] args) {

		String[] values = { "A", "B", "C", "D" };

		List<String> list = Arrays.asList(values);
		list.stream().filter(e -> e.equalsIgnoreCase("D")).forEach(System.out::println);
	}

}
