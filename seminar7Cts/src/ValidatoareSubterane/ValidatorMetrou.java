package ValidatoareSubterane;

public class ValidatorMetrou implements ValidatorSubteran{
    @Override
    public void valideazaCalatorie() {
        System.out.println("valideaza calatorie");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Valideaza abonament");

    }
}
