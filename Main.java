package MAin;


import seminar6.Autobuz;
import seminar6.AutobuzBilder;
import seminar6.AutobuzBuiderV2;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz;
        AutobuzBilder builder=new AutobuzBilder();
        autobuz=builder.build();


        Autobuz autobuz1;
        autobuz1=new AutobuzBilder().setNumeSofer("Vasile").build();
        Autobuz autobuz2;
        autobuz2=new AutobuzBilder().setStop(false).setNrInmatriculare("BB33333335").build();

        System.out.println(autobuz);
        System.out.println(autobuz1);
        System.out.println(autobuz2);


       // autobuz.setNrlinii(666);
        //obiectul meu nu este final si petru asta setrgem public de la setteri
       // System.out.println(autobuz);


        AutobuzBuiderV2 autobuzBuiderV2=new AutobuzBuiderV2();
        Autobuz a1=autobuzBuiderV2.setStop(true).setOpenDoors(true).setText("La multi ani!").build();
        Autobuz a2=autobuzBuiderV2.setNumeSofer("Vasile").build();
        Autobuz a3=autobuzBuiderV2.build();


        System.out.println("Noile autobuze");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }

}
