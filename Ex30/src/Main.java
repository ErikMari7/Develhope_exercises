public class Main {
    public static void main(String[]args) {

        Car car1 = new Car(999, "CF588GM", "Fiat", "Panda");

        System.out.println(java.util.Arrays.toString(new Car[]{car1}));

        System.out.println("Car1 cilindrata con getter: " + car1.getDisplacement());
        System.out.println("Car1 targa con getter: " + car1.getPlate());
        System.out.println("Car1 marca con getter: " + car1.getBrand());
        System.out.println("Car1 modello con getter: " + car1.getModel());

        car1.setDisplacement(4000);
        car1.setPlate("HFD837K");
        car1.setBrand("Ferrari");
        car1.setModel("SF90");

        System.out.println("Car1 con setter: " + car1);
    }

}