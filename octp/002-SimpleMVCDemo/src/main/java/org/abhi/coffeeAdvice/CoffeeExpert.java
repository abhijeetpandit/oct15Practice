package org.abhi.coffeeAdvice;

import java.util.ArrayList;
import java.util.List;

public class CoffeeExpert {
	public List<String> getCoffeeList(String color) {
		
		List<String> advices = new ArrayList<String>();
		if(color.equals("light")) {
			advices.add("irish coffee");
			advices.add("light coffee");
		} else  {
			advices.add("nescoffee");
			advices.add("Black coffee");
		} 
		
		return advices;
	}
}
