public class ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna)
    {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron=liczbaStron;
        this.dostepna = dostepna;
    }

   public void wypiszInfo(){
        System.out.println("Twoja książka o nazwie; " + tytul + " autorstwa " + autor + ", o dlugosic "+ liczbaStron);
        System.out.print(" jest "+ (dostepna ? "dostepna" : "niedostepna"));
   }

   public void wypozycz() {
       if(dostepna) {
       dostepna = false;
       System.out.println("wypozyczono ksiazke; " + tytul);
       }else {
       System.out.println("niestety ksiazki nie ma, zostala wypozyczona przez kogos innego");
       }
       }
public void zwroc(){
        if(!dostepna){
            dostepna= true;
            System.out.println("dziekujemy za oddanie ksiazki; "+ tytul);
        }else{
            System.out.println("to nie nasza ksiazka, chyba ze kradziona");
        }

}


   }


