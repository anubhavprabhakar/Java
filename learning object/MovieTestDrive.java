class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing Now!");
    }
}

public class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        one.title = "Gone With The Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;

        System.out.println("\nTitle: " + one.title + "\nGenre: " + one.genre + "\nRating: " + one.rating);
        System.out.println("\nTitle: " + two.title + "\nGenre: " + two.genre + "\nRating: " + two.rating);
        System.out.println("\nTitle: " + three.title + "\nGenre: " + three.genre + "\nRating: " + three.rating);
    }
}