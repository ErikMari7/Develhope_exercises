package esercizio34;

public class Triangolo extends Forma{
    @Override
    public double calcolaArea() {
        return (getBase() * getAltezza()) /2;
    }
}
