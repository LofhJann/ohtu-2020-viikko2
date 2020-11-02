package ohtu.verkkokauppa;
public interface Varasto {

    static Varasto getInstance() {return getInstance(new VarastoImpl());}

    static Varasto getInstance(Varasto varasto) {return varasto;}

    Tuote haeTuote(int id);

    int saldo(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);

    void alustaTuotteet();
}
