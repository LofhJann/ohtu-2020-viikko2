package ohtu.verkkokauppa;

public interface Pankki {

    static Pankki getInstance() {return getInstance(new PankkiImpl());}

    static Pankki getInstance(Pankki pankki) {return pankki;}

    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}
