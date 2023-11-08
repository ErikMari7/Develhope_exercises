package esercizio33;

public class Rettangolo extends Forma{
    double Val1 = 12.5;
    double  Val2 = 14;
    double area = Val1 * Val2;
    @Override
    public void calcolaArea() {
        System.out.println("Rettangolo: " + area);
    }
}
