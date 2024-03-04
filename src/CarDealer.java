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
            if(c.Model.equals(model)){
                double profit = c.price*0.02;
                this.profit+=profit;
                this.money+=c.price-profit;
                this.cars.remove(c);
                break;
            }

        }
        if (carToRemove!= null)
            System.out.println("Car Sold: "+carToRemove.Make+" "+carToRemove.price);
            else {
                System.out.println("Car not Found ");
            }

    }

    public static void main(String[] args) {

    }
}
