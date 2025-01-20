package p2;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerUnderstanding {

	public static void main(String[] args) {
		
		Consumer<Integer> con = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
			
				t++;
				System.out.println(t);
			}
		};
		
		Stream.of(14,80,96,37,74,30,90,88,75,181).filter(x->{
			if(x<50)return false;
			else return true;
		}).forEach(con);
		
		
	}
}
