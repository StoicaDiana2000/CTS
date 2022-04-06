import ValidatoareTereste.ValidatorTerestru;
import ValidatoreSubterane.ValidatorMetrou;

public class Adapter extends ValidatorMetrou implements ValidatorTerestru {
    @Override
    public void valideazaBilet() {

        super.valideazaCalatorie();
    }
}
