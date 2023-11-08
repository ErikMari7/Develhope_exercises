package esercizio33;

public class Rettangolo extends Forma{

    @Override
    public int calcolaArea() {
        return getBase() * getAltezza();
    }
}
