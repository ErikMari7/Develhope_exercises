package JavaBasics.esercizio37;
public class Rettangolo extends Forma {

    private double base;
    private double altezza;


    public Rettangolo(double base, double altezza, TipoForma tipo) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}

