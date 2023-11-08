package esercizio33;

public class Rettangolo extends Forma{

    @Override
    public void calcolaArea() {
        System.out.println("L'area del rettangolo è: " + getBase() * getAltezza());
    }
}
