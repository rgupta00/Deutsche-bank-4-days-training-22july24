package demo.java8.session1.ex2;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import static java.util.stream.Collectors.*;


public class DemoLambdaExpession2 {

 public static void printMe(String data){
	 System.out.println(data);
 }

	
	public static void main(String[] args) {
		
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 540),
						new Book(121, "java advance", "gunika", 540),
						new Book(11, "python", "ekta", 840),
						new Book(621, "c programming", "gunika", 300));

		//declartive code => opt is not ur job ==> jvm :)
		books.stream()
		.filter(b->b.getPrice()>=400)
		.sorted(Comparator.comparing(Book::getPrice))
		.map(b->b.getTitle())
		.forEach(name-> System.out.println(name));
		
		//find all the java books names sorted by price
//		Collections.sort(books, new Comparator<Book>() {
//			@Override
//			public int compare(Book o1, Book o2) {
//				return Double.compare(o1.getPrice(), o2.getPrice());
//			}
//		});
//		List<String>names=new ArrayList<>();
//		for(Book b: books) {
//			names.add(b.getTitle());
//		}
//		
//		for(String name: names) {
//			System.out.println(name);
//		}
		
		
		//classical way
		
		
		
//		List<String> booksNames=books.stream()
//				.filter(b->b.getTitle().contains("java"))
//				.map(b->b.getTitle())
//				.collect(toList());
//		
//		booksNames.forEach(title-> System.out.println(title));


	}
}
