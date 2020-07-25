package lambda;
import java.util.*;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Strings
{

	public static void main(String[] args) 
	{
		List<String> List = Arrays.asList("aloha","add","david","ask","aaa","Abc");
		long count = List.stream()
                .filter(x -> x.startsWith("a")) 
                   .count(); 
       System.out.printf("List %s has %d strings which startsWith 'a' %n", List, count);

           List<String> filtered = List.stream()
                    .filter(x -> x.length()== 3)
                   .collect(Collectors.toList());
          System.out.printf("Original List : %s, filtered list : %s %n", List, filtered);
		filterPrefix(List).forEach(System.out::println);
	}

	private static List<String> filterPrefix(List<String> list)
	{
		return List.stream().filter(s -> s.length()==3 && s.charAt(0)=='a').collect(Collectors.toList());
	}

}