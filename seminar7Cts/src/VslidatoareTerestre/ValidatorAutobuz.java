package VslidatoareTerestre;

public class ValidatorAutobuz implements ValidatorTerestru{


    @Override
    public void valideazaBilet() {
        System.out.println("valideaza bilet");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Valideaza Abonament");

    }
}
