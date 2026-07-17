public class Media {

    private String title;
    private int year;
    private boolean isAvailable;

    public Media(String title, int year){
        if (title.isBlank()){
            throw new IllegalArgumentException("Ungültiger Titel");
        }
        this.title = title;
        this.year = year;
        this.isAvailable = true;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        if (title.isBlank()){
            throw new IllegalArgumentException("Ungültiger Titel");
        }
        this.title = title;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void rent(){
        if (!this.isAvailable){
            // Variante 1:
//            System.err.println("Das Medium " + title + " ist bereits verliehen.");
//            return; //Vorzeitiges Beenden der Methode
            // Variante 2:
            throw new IllegalArgumentException("Das Medium " + title + " ist bereits verliehen.");
        }
        this.isAvailable = false;
    }

    public void giveBack(){
        this.isAvailable = true;
    }

    public String toString(){
        return "Titel: " + title +
                ", Jahr: " + year +
                ", verfügbar: " + isAvailable;
    }

}
