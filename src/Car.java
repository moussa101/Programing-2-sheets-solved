public class Car implements Comparable<Car> {
    private final String Make;
    private static String Model = "BMW";
    private int yearofman;
    private double price;

    public Car(String make, String model, int yearofman, double price) {
        Make = make;
        Model = model;
        this.yearofman = yearofman;
        this.price = price;
    }



    public String getMake() {
        return Make;
    }



    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYearofman() {
        return yearofman;
    }

    public void setYearofman(int yearofman) {
        this.yearofman = yearofman;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        return this.yearofman -o.yearofman;
    }
}
