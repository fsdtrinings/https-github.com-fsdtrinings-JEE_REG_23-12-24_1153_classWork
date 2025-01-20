package p1;

import java.lang.annotation.Retention;
import java.util.Comparator;
import java.util.stream.Stream;

public class Demo1 {

	
	
	
	public static void main(String[] args) {
		
		int maxValue  = Stream.of(15,16,70,90,30).min((a,b)->{
			return a-b;
		}).get();
		
		System.out.println(maxValue);
		
		System.out.println(" ----------------------");
		
		Stream.of(15,16,70,90,30)
		.filter((a)->{
			if(a>50) return true;
			else return false;
		}).
		map(a->{
			a++;
			return a;
		})
		//.forEach(System.out::println);		
	/*	.forEach(x->{
			System.out.println(x);
		});*/
		.forEach(x->System.out.println(x));
		
		
	}
}
