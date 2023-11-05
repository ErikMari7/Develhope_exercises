package esercizio31;

class Main {
    public static void main(String[]args) {

        Car car1 = new Car(999, "CF588GM", "Fiat", "Panda");

        System.out.println("Car1: " + car1);




        car1.setDisplacement(4000);
        car1.setPlate("HFD837K");
        car1.setBrand("Ferrari");
        car1.setModel("SF90");

        System.out.println("Car1 dopo setter: " + car1);
    }

}
