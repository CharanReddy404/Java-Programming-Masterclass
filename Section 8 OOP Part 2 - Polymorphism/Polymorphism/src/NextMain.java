public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A","ABCD");
        movie.watchMovie();

        Adventure ABCD = (Adventure) Movie.getMovie("A","ABCD");
        ABCD.watchMovie();

        Object comedy = Movie.getMovie("C","Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchMovie();
    }
}
