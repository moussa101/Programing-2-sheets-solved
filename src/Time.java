
    public class Time {
        int Hours;
        int Minutes;
        int Seconds;

        public Time() {
        }
        public Time(int h, int m,int s) {

            Hours = h;
            Minutes = m;
            Seconds = s;
        }

        public int getHours(){

            return Hours;
        }
        public int getMinutes(){

            return Minutes;
        }
        public int getSeconds(){

            return Seconds;
        }

        public void addHour(){

            if (Hours==23)
                Hours=0;
            else
                Hours++;
        }
        public void addMinute(){

            if (Minutes==59){
                Minutes =0;
                addHour();
            }
            else
                Minutes++;
        }
        public void addSecond(){
            if (Seconds==59){
                Seconds=0;
                addMinute();
            }
            else
                Seconds++;
        }
        public boolean compare(Time a){
            if (this.Minutes==a.Minutes&&this.Seconds==a.Seconds&&this.Hours==a.Hours)
                return true;

            else
                return false;
        }

        public static boolean compare(Time a, Time b){
            if (b.Minutes==a.Minutes&&b.Seconds==a.Seconds&&b.Hours==a.Hours)
                return true;

            else
                return false;
        }

        public void display(){

            System.out.println("Hour: "+Hours+" Mintue: "+Minutes+" Second: "+Seconds);
        }

        public String toString(){

            String a= "Hour: "+Hours+" Mintue: "+Minutes+" Second: "+Seconds;

            return a;
        }



        public static void main(String[]args){

            Time a2= new Time(23,59,58);

            a2.addSecond();

            a2.display();

        }
    }

