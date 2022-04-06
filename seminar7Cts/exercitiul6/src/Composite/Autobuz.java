package Composite;

import java.util.concurrent.ExecutionException;

public class Autobuz implements NodAbstract{
    private String producator;
    private int nrLocuri;
    private String model;

    @Override
    public String toString() {
        return "Autobuz{" +
                "producator='" + producator + '\'' +
                ", nrLocuri=" + nrLocuri +
                ", model='" + model + '\'' +
                '}';
    }

    public Autobuz(String producator, int nrLocuri, String model) {
        this.producator = producator;
        this.nrLocuri = nrLocuri;
        this.model = model;
    }

    @Override
    public void afiseazaDescriere() {

        this.toString();
    }

    @Override
    public NodAbstract get(int poz) throws ExecutionException{
        throw new ExecutionException(null);    }

    @Override
    public void add(NodAbstract nodAbstract) throws ExecutionException {

        throw new ExecutionException(null);
    }

    @Override
    public void remove(NodAbstract nodAbstract) throws ExecutionException {
        throw new ExecutionException(null);


    }
}
