public class Airport {
    Flight[] planes;
    int AirportSpace;

    public Airport(int AirportSpace) {
        
     this.AirportSpace = AirportSpace;
     planes = new Flight[AirportSpace];

    }
    public void display() {
        for (int i = 0; i < planes.length; i++) {
            System.out.println(planes[i]);
        }
    }

    public void addFlight(Flight f){
        int j=0;
        boolean a = true;
        for (int i =0;i<planes.length;i++ ) {
            a=Time.compare(f.departure, planes[i].departure);
            }
        if (!a){
            System.out.println("Reached Max Number of Flights");
        }
            else {

                for (int i = 0; i < planes.length; i++) {
                    if (planes[i] == null) {
                        planes[i] = f;
                        i++;
                        break;
                    }
                }
                if (j==0)
                    System.out.println("Reached Max Number of Flights");
            }
        }
    public void transferPassenger(Flight f1, Flight f2){
        f1.removePassenger();
        f2.addPassenger();
    }
    public void registerPassenger(String destination){
        int j=0;
        for (int i =0;i<planes.length;i++){

            if (planes[i]!=null && planes[i].destinationcountry.equals(destination) && planes[i].current<planes[i].max) {
              planes[i].current++;
              j++;
              break;
            }

        }
        if(j==0) {
            System.out.println("No Avalible Flights");
        }
    }
    public static void main(String[] args) {
        Time a2= new Time (12,30,00);
        Time a1= new Time (11,30,00);

        Flight a = new Flight(100,100,"Cairo","Sharm-ElSheikh",a2,a1);
        Flight l = new Flight(100,100,"Cairo","Sharm-ElSheikh",a2,a1);
        Flight c = new Flight(99,100,"Cairo","Sharm-ElSheikh",a2,a1);

        Airport S = new Airport(5);
        S.addFlight(a);
        S.addFlight(l);
        S.addFlight(c);
        S.display();
        // S.transferPassenger(a,l);
        System.out.println(a.current+" "+l.current);
        S.registerPassenger("Sharm-ElSheikh");
        System.out.println(a.current);
        System.out.println(l.current);
        System.out.println(c.current);

    }
}