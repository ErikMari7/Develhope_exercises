package esercizio33;

public class Rettangolo extends Forma{
    int base = 12;
    int altezza = 14;
    int area = base * altezza;
    @Override
    public void calcolaArea() {
        System.out.println("Area del Rettangolo: " + area);
    }
}
