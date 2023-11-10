package esercizio37;
public class Rettangolo extends Forma {

    private double base;
    private double altezza;

    private TipoForma tipo;


    public Rettangolo(double base,double altezza,TipoForma tipo) {
        this.base = base;
        this.altezza = altezza;
        this.tipo = tipo;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", tipo=" + tipo +
                '}';
    }
}

