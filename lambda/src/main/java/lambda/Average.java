package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Average 
{

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
	      IntSummaryStatistics stats = primes.stream() 
	                                         .mapToInt((x) -> x) 
	                                         .summaryStatistics();
	      System.out.print("Avg"+ stats.getAverage());
		
		for(int i=1;i<=10;i++) 
		{
			list.add(i);
		}
		
		Object o = getAverage(list);
		Optional<Object> p =Optional.ofNullable(o);
		p.ifPresent(System.out::println);

	}

	private static Double getAverage(List<Integer> list)
	{
		 Integer sum = 0;
		 
		 for(Integer i:list)
		 {
			 sum += i;
		 }
		 
		 return 1.0*sum/list.size();
	}
	

}