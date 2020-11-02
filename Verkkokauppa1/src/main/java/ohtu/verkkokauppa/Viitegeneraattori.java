package ohtu.verkkokauppa;

public interface Viitegeneraattori {

    static Viitegeneraattori getInstance(Viitegeneraattori viitegeneraattori){return viitegeneraattori;}

    static Viitegeneraattori getInstance(){return getInstance(new ViitegeneraattoriImpl());}

    int uusi();
}
