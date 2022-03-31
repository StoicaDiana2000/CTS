package seminar6;

public class Tramvai extends MijlocTransport {

    private String vatman;

    public Tramvai(String vatman) {
        this.vatman = vatman;
    }

    public String getVatman() {
        return vatman;
    }

    public void setVatman(String vatman) {
        this.vatman = vatman;
    }

    public Tramvai(int nrInmatriculare, String vatman) {
        super(nrInmatriculare);
        this.vatman = vatman;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return null;
    }
}
