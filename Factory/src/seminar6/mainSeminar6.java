package seminar6;

public class mainSeminar6 {


    public static void main(String[] args) {
        Autobuz a=new Autobuz(12,"diana");
        Tramvai t=new Tramvai(123,"Dorel");


        try{
            MijlocTransport a1=a.copiaza();
            MijlocTransport t1=t.copiaza();

            System.out.println("Original Autobuz"+a);
            System.out.println("Original Tramvai"+t);

            System.out.println("TRamvai"+t1);
            System.out.println("Autobuz"+a1);



        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
