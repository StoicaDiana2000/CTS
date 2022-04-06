import ValidatoareSubterane.ValidatorMetrou;
import ValidatoareSubterane.ValidatorSubteran;
import VslidatoareTerestre.ValidatorAutobuz;
import VslidatoareTerestre.ValidatorTerestru;
import adapter.Adapter;

public class Main {

    //adapter de obiecte
    public  static void valideazaBilet(ValidatorTerestru validatorTerestru){
        validatorTerestru.valideazaBilet();;
    }

    public static void main(String[] args) {


        ValidatorSubteran validatorMetrou=new ValidatorMetrou();
        ValidatorTerestru validatorAutobuz=new ValidatorAutobuz();

        valideazaBilet(validatorAutobuz);
        //nu merge ca nu am implementat interfata
        //valideazaBilet(validatorMetrou);
        Adapter adapter=new Adapter(validatorMetrou);
        valideazaBilet(adapter);
    }
}
