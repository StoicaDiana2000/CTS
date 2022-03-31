package seminar6;

public abstract class MijlocTransport implements Cloneable {
    private int nrInmatriculare;

    public MijlocTransport() {

    }

    public int getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(int nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public MijlocTransport(int nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        return "MijlocTransport{" +
                "nrInmatriculare='" + nrInmatriculare + '\'' +
                '}';
    }

    public abstract  MijlocTransport copiaza() throws CloneNotSupportedException;




}
