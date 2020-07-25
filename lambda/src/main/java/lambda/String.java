package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class String 
{

	public static void main(String[] args) {
		List<String> list = Arrays.asList("madam","hero","racecar","liril","ball","palindrome");
		filterPalindrome(list,Palindrome::check).forEach(System.out::println);
	}

	private static List<String> filterPalindrome(List<String> list, Predicate<String> myPredicate) {
		return list.stream().filter(str -> myPredicate.test(str)).collect(Collectors.toList());
	}

}
