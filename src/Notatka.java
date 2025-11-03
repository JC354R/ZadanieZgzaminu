/**
 * nazwa klasy: Notatka
 * opis:        klasa przeznaczona do robienia notatek
 * pola: licznikNotatek - pole numeryczne przechowujace liczbe notatek
 *       identyfikator - pole numeryczne przechowujace unikatowy numer nlotatki
 *       tytulNotatki - pole tekstowe przechowujace tutul notatki
 *       trescnotatki - pole tekstowe przechowujace tresc notatki
 * autor: 12345678910
 *
 */
public class Notatka {
    private static int licznikNotatek;
    private int identyficator;
    protected String tytulNotatki;
    protected String trescNotatki1;

    public Notatka(String tytulNotatki, String trescNotatki1){
        licznikNotatek++;
        identyficator = licznikNotatek;
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki1 = trescNotatki1;
    }

    public void wypiszTytulTresc(){
        System.out.println("tytul: "+tytulNotatki+" Tresc: "+trescNotatki1);

    }

    public void diagnostyczna(){
        System.out.println(tytulNotatki+ ", "+trescNotatki1+", "+licznikNotatek+", "+identyficator);

    }
}
