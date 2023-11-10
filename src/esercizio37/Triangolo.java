package esercizio37;

public class Triangolo extends Forma {

    private double base;
    private double altezza;

    private TipoForma tipo;

    public Triangolo(double base,double altezza,TipoForma tipo) {
        this.base = base;
        this.altezza = altezza;
        this.tipo = tipo;
    }

    @Override
    public double calcolaArea() {
        return (base * altezza) /2;
    }
}
