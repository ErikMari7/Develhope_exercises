package esercizio33;

public class Rettangolo extends Forma{

    private double base;
    private double altezza;

    public Rettangolo(double base,double altezza) {
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
        return getBase() * getAltezza();
    }
}



