package Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Grup implements NodAbstract{

    List<NodAbstract> lista=new ArrayList<>();

    private String denumire;

    public Grup( String denumire) {
        this.lista = new ArrayList<>();
        this.denumire = denumire;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Denumirea grupului este "+denumire);
        for(NodAbstract i:lista){
            i.afiseazaDescriere();

        }
    }

    @Override
    public NodAbstract get(int poz) throws ExecutionException {


        return lista.get(poz);
    }

    @Override
    public void add(NodAbstract nodAbstract) throws ExecutionException {

        lista.add(nodAbstract);
    }

    @Override
    public void remove(NodAbstract nodAbstract) throws ExecutionException {
        lista.remove(nodAbstract);
    }
}
