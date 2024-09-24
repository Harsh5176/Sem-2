
 class Time {
    int hour;
    int min;

    //default constructor  
    Time(){
        this.hour = 13;
        this.min = 30;
    }

    //peramiteraise constructor 
    Time(int hour,int min){

        this.hour = hour;
        this.min = min;
    }

    //adition method
    //here object's datatype is nonpremitive  

    void add(Time t){

        int h = this.hour + t.hour;
        int m = this.min + t.min;

        if(m>60){
            h++;
            m=m-60;
        }
    }
}
public class TimeDemo {

    public static void main(String[] args) {
        System.out.println();
    }
}
