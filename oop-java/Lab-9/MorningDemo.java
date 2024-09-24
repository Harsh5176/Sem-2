/*
 1. Write an application that executes two threads. One thread
displays "Good Morning" every 1000 milliseconds & another thread
displays "Good Afternoon" every 3000 milliseconds. Create the
threads by implementing the Runnable interface.

 */
class A extends Thread {
    public void run(){
        try {
            int i=1;
            while(i!=0){
                    System.out.println("Good Morning");
                    sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
class B extends  Thread {
    public void run(){
       try {
        int i=1;
        while(i!=0){
                System.out.println("Good Afternoon");
                sleep(3000);
        }
       } catch (Exception e) {
        // TODO: handle exception
       }
    }
}

public class MorningDemo{
    public static void main (String [] args){

        A a =new A();
       B b =new B();
        
       Thread G1=new Thread(a);
       Thread A1=new Thread(b);
       
       G1.start();
        A1.start();
    }
}