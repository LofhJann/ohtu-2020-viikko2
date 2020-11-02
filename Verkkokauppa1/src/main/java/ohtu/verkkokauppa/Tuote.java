
package ohtu.verkkokauppa;


public class Tuote {
    private int id;
    private String nimi;
    private int hinta;

    public Tuote(int id, String nimi, int hinta) {
        this.id = id;
        this.nimi = nimi;
        this.hinta = hinta;
    }

    public boolean equals(Object o) {
        Tuote t = (Tuote)o;
        
        return id==t.id;
    }

    public int getId() {
        return id;
    }

    public int getHinta() {
        return hinta;
    }

    public String toString() {
        return nimi;
    }            
    
}
