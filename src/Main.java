public class Main {
    public static void main(String[] args){

        Author westermann = new Author("Westermann", 1957);
        Author tolkien = new Author("J.R.R. Tolkien", 1892);
        Author kitRyan = new Author("Kit Ryan", 1960);

        Film botched = new Film("Botched",
                2007,
                kitRyan,
                "Horror",
                "English");
        //impliziter Aufruf von toString(), wenn die Methode für das Objekt existiert:
        System.out.println(botched);

        System.out.println(botched.getTitle());

        Book rechnungswesen = new Book("Rechnungswesen",
                2025,
                westermann,
                "Sachbuch",
                663);
        rechnungswesen.setPagenumbers(520);
        System.out.println(rechnungswesen);

        Magazine bravo = new Magazine("Bravo",
                1998,
                379);
        System.out.println(bravo);

        bravo.rent(); //available wird zu false
        bravo.giveBack(); // available wird zu true
        bravo.rent(); // und wieder zu false
    }
}
