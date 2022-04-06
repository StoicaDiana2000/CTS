package Composite;

import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {
        //trb sa ne cream 3 grupuri ,3 mici si mari
        //un grup flota, una mare ,una mica

        NodAbstract a1=new Autobuz("Dacia",58,"aaaa");

        NodAbstract a2=new Autobuz("Dacia",45,"aaaa");
        NodAbstract a3=new Autobuz("Dacia",22,"aaaa");

        NodAbstract g1=new Grup("Autobuze mici");
        NodAbstract g2=new Grup("Autobuze mari")
;
        NodAbstract Flota=new Grup("flota");
        try {
            g2.add(a1);
            g2.add(a2);

            g1.add(a3);
            Flota.add(g1);
            Flota.add(g2);
            Flota.afiseazaDescriere();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }




    }

}
