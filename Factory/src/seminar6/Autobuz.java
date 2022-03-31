package seminar6;


public class Autobuz extends MijlocTransport{
    private String numeSofer;



    public Autobuz(int nrInmatriculare, String numeSofer) {
        super(nrInmatriculare);
        this.numeSofer = numeSofer;
    }

    public Autobuz() {
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                "} " + super.toString();
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException{
        return (MijlocTransport) this.clone();

    }
}
