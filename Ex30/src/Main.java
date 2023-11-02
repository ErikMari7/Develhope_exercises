public class Main {
    public static void main(String[]args) {

        Car car1 = new Car(999, "CF588GM", "Fiat", "Panda");

        System.out.println("Car1: " + car1);

        System.out.println("Car1 cilindrata con getter: " + car1.getDisplacement());
        System.out.println("Car1 targa con getter: " + car1.getPlate());
        System.out.println("Car1 marca con getter: " + car1.getBrand());
        System.out.println("Car1 modello con getter: " + car1.getModel());



        System.out.println("Car1 cilindrata con setter: " + car1.setDisplacement(4000));
        System.out.println("Car1 targa con setter: " + car1.setPlate("HFD837K"));
        System.out.println("Car1 marca con setter: " + car1.setBrand("Ferrari"));
        System.out.println("Car1 modello con setter: " + car1.setModel("SF90"));

        System.out.println("Car1 dopo setter: " + car1);
    }

}