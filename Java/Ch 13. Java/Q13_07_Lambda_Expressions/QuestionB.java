package Q13_07_Lambda_Expressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class QuestionB {
	public static int getPopulation(Collection<Country> countries, String continent) {
 		Stream<Country> sublist = countries.stream().filter( country -> {
 			return country.getContinent().equals(continent);
 		});
 		
 		Stream<Integer> populations = sublist.map(c -> c.getPopulation());
 		int population = populations.reduce(0, (a, b) -> a + b);
 		return population;
	}

	public static void main(String... args) {
		List<Country> countries = new ArrayList<>();
 		countries.add(new Country("United States", "North America", 5));
 		countries.add(new Country("Canada", "North America", 10));
 		countries.add(new Country("India", "Asia", 30));
 		System.out.println(getPopulation(countries, "North America"));
 	}

}