import java.io.*;
import java.util.*;
class Movie implements Comparable<Movie> {
	private double rating;
	private String name;
	private int year;

	public int compareTo(Movie m)
	{
		return this.year - m.year;
	}

	
	public Movie(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear() { return year; }
}

class RatingCompare implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2)
	{
		if (m1.getRating() < m2.getRating())
			return -1;
		if (m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;
	}
}

class NameCompare implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}

class ComparatorEx1 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(
			new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(
			new Movie("Return of the Jedi", 8.4, 1983));

		
		while(true){
			System.out.println("Options:");
 System.out.println("1 Sort by Name");
System.out.println("2.Sort by Rating ");
System.out.println("3.Sort by year ");
           
 System.out.println("4. Exit");
System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
switch(option){
case 1:
System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (Movie movie : list)
			System.out.println(movie.getName() + " "
							+ movie.getRating() + " "
							+ movie.getYear());

break;
case 2:
	System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);
		for (Movie movie : list)
			System.out.println(movie.getRating() + " "
							+ movie.getName() + " "
							+ movie.getYear());
		break ;
case 3:

	System.out.println("\nSorted by year");
		Collections.sort(list);
		for (Movie movie : list)
			System.out.println(movie.getYear() + " "
							+ movie.getRating() + " "
							+ movie.getName() + " ");
break;
case 4:
                    System.out.println("Exiting program.");
               
                    System.exit(0);
                    default:
                    System.out.println("Invalid option. Please enter a valid option.");
    }
}
}

		}
		