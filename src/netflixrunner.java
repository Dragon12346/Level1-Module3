
public class netflixrunner {
public static void main(String[] args) {
	Movie Moovie1 = new Movie("NotTwilight", 1);
	Movie Moovie2 = new Movie("Jason", 4);
	Movie Moovie3 = new Movie("TIG", 5);
	Movie Moovie4 = new Movie("Shrek", 3);
	Movie Moovie5 = new Movie("NotTwilight2", 2);
	
	System.out.println(Moovie1.getTitle() + "" + Moovie1.getTicketPrice());
	System.out.println(Moovie2.getTitle() + "" + Moovie2.getTicketPrice());
	System.out.println(Moovie3.getTitle() + "" + Moovie3.getTicketPrice());
	System.out.println(Moovie4.getTitle() + "" + Moovie4.getTicketPrice());
	System.out.println(Moovie5.getTitle() + "" + Moovie5.getTicketPrice());
	
	NetflixQueue q = new NetflixQueue();
	q.addMovie(Moovie1);
	q.addMovie(Moovie2);
	q.addMovie(Moovie3);
	q.addMovie(Moovie4);
	q.addMovie(Moovie5);
	q.printMovies();
	System.out.println(q.getBestMovie());
	q.sortMoviesByRating();
	System.out.println(q.getMovie(1));
}
}
