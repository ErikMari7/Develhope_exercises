package esercizio33;

public class Rettangolo extends Forma{

    @Override
    public double calcolaArea() {
        return getBase() * getAltezza();
    }
}

