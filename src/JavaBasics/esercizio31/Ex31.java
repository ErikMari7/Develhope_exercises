package JavaBasics.esercizio31;


//Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
//        Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
//        Nel main dichiarare un oggetto di tipo Auto.
//        In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi

class Car {

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

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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



