package esercizio33;

public class Forma {
    private int base =62;
    private int altezza = 40;

    public int getBase(){
        return base;
    }

    public int getAltezza(){
        return altezza;
    }

    public void calcolaArea(){

        System.out.println("Per il calcolo dell'area delle forme i valori sono: " + getBase() + " e " + getAltezza());

    }
}