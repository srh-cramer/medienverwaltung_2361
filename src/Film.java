public class Film extends Media{
    private Author director;
    private String genre;
    private String language;

    public Film(String title, int year, Author director, String genre, String language) {
        super(title, year);
        this.director = director;
        this.genre = genre;
        this.language = language;
    }

    public Author getDirector() {
        return this.director;
    }

    public void setDirector(Author director) {
        this.director = director;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
//        char[] olCharArray = language.toCharArray();
//        Character[] ol = new Character[olCharArray.length];
//        for (int i = 0; i < olCharArray.length; i++){
//            ol[i] = olCharArray[i];
//        }
//        for (Integer i = 0; i < 10; i++){
//            for (int c = 0; c < ol.length; c++){
//                if (i.toString().equals(ol[c].toString())){
//                    throw new IllegalArgumentException("Sprache enhält Ziffer");
//                }
//            }
//        }
        this.language = language;
    }

    @Override
    public String toString(){
        return super.toString() +
                ", Regisseur: " + director +
                ", Genre: " + genre +
                ", Originalsprache: " + language;
    }
}
