package p2;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if(t>100)return false;
				else return true;
			}
		};
		
		Stream.of(14,80,96,37,74,30,90,88,75,81).filter(x->{
			if(x>100)return false;
			else return true;
		});
		
		
		
		Stream.of(14,80,96,37,74,30,90,88,75,81).filter(p);
		
		
	}
}
