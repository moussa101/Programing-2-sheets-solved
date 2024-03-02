
    import java.util.*;
    public class Flight {
        String name;
        int current;
        int max;
        String departurecountry;
        String destinationcountry;
        Time duration;
        Time departure;

        public Flight() {
        }
        public Flight(int current,int max,String departurecountry,String destinationcountry,Time duration,Time dp) {
            name = "";
            int x = (int)(Math.random()*99+10);
            for (int i =0;i<3;i++){
                char y = (char)((int)(Math.random())*26+'A');
                name+=y;
            }
            name+=x;
            this.current=current;
            this.max=max;
            this.departurecountry=departurecountry;
            this.destinationcountry= destinationcountry;
            this.duration=duration;
            departure = dp;
        }

        public int getNumberofPassengers(){
            return current;
        }

        public int addPassenger(){

            if (max>current)
                return current++;
            else if (max==current)
                return current;
            else
                return 0;
        }
        public int removePassenger(){

            if (max>current)
                return current--;
            else if (current==0)
                return current;
            else
                return 0;
        }
        public void delay(Time t){
            this.departure = t;
        }

        public String toString(){
            String a = "Flight : "+name+" Departure City : "+departurecountry+" Destniation : "+destinationcountry;
            String b = a +" Departure Time : "+departure;
            return b;
        }

        public static void main (String[]args){

            Time a2= new Time (12,30,00);
            Time a1= new Time (11,30,00);

            Flight a = new Flight(50,100,"Cairo","Sharm-ElSheikh",a2,a1);
            System.out.println(a);
        }


    }
