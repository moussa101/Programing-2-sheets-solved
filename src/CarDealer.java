import java.util.*;

public class CarDealer {
   private ArrayList<Car> cars;
   private double money;
   private double profit;

    public CarDealer(double money) {
        this.money = money;
        this.cars = new ArrayList<Car>();
        this.money=0;
    }
    public void sellCar(String model){
        Car carToRemove = null;
        for (int i = 0;i<cars.size();i++){
            Car c = cars.get(i);
            if(c.getModel().equals(model)){
                double profit = c.getPrice()*0.02;
                this.profit+=profit;
                this.money+=c.getPrice()-profit;
                this.cars.remove(c);
                break;
            }

        }
        if (carToRemove!= null)
            System.out.println("Car Sold: "+carToRemove.getMake()+" "+carToRemove.getPrice());
            else {
                System.out.println("Car not Found ");
            }

    }

    public static void main(String[] args) {

    }
}
