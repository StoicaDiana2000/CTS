import ValidatoareTereste.ValidatorAutobuz;
import ValidatoareTereste.ValidatorTerestru;
import ValidatoreSubterane.ValidatorMetrou;
import ValidatoreSubterane.ValidatorSubteran;

public class Main {


    public static void main(String[] args) {

        ValidatorTerestru validatorAutobuz=new ValidatorAutobuz();
        validatorAutobuz.valideazaBilet();
        validatorAutobuz.valideazaAbonament();

        ValidatorTerestru validatorMetrou=new Adapter();


    }
}
