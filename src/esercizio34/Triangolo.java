package esercizio34;

public class Triangolo extends Forma{

    private double base;
    private double altezza;

    public Triangolo(double base,double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase(){
        return base;
    }

    public double getAltezza(){
        return altezza;
    }

    @Override
    public double calcolaArea() {
        return (getBase() * getAltezza()) /2;
    }
}
