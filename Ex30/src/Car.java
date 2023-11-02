
/*  Scrivere un programma che contenga una classe
 che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori
 (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
 */

public class Car {

    private int displacement;

    private String plate;

    private String brand;

    private String model;

    public Car(int displacement,String plate, String brand, String model) {
        this.displacement = displacement;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int setDisplacement(int displacement) {
        this.displacement = displacement;
        return displacement;
    }

    public String getPlate() {
        return plate;
    }

    public String setPlate(String plate) {
        this.plate = plate;
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public String setBrand(String brand) {
        this.brand = brand;
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String setModel(String model) {
        this.model = model;
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "displacement='" + displacement + '\'' +
                ", plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
