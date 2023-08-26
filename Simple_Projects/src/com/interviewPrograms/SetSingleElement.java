package com.interviewPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSingleElement {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("ashik");
		set.add("Kumar");
		System.out.println(set);
		Iterator<String> iterate = set.iterator();
		
		while(iterate.hasNext()) {
			String element = iterate.next();
			System.out.println(element);
		}
		
	}

}
