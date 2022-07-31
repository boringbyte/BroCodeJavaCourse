package CopyObjects;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car car) {
        this.setMake(car.getMake());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }
}
