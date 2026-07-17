public class Book extends Media {

    private Author author;
    private String genre;
    private int pagenumbers;

    public Book(String title, int year, Author author, String genre, int pagenumbers){
        super(title, year);
        this.author = author;
        this.genre = genre;
        this.setPagenumbers(pagenumbers); //inkludiert Validierung der Seitenzahl
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPagenumbers() {
        return this.pagenumbers;
    }

    public void setPagenumbers(int pagenumbers) {
        if (pagenumbers >= 1){
            this.pagenumbers = pagenumbers;
        } else{
            throw new IllegalArgumentException("Ungültige Seitenanzahl");
        }
    }
    @Override
    public String toString(){
        return super.toString() +
                ", Autor: " + author +
                ", Genre: " + genre +
                ", Seitenzahl: " + pagenumbers;
    }

}
