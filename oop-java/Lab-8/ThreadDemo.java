class A extends Thread {
    public void run(){
        try {
            for(int i=0;i<10;i++){
                if(i%2==0){
                    System.out.println(i);
                    sleep(500);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
class B extends  Thread {
    public void run(){
       try {
        for(int i=0;i<10;i++){
            if(i%2==1){
                System.out.println(i);
                sleep(500);
            }
        }
       } catch (Exception e) {
        // TODO: handle exception
       }
    }
}

public class ThreadDemo{
    public static void main (String [] args){

        A a =new A();
       B b =new B();
        
       Thread t1=new Thread(a);
       Thread t2=new Thread(b);
       
       t1.start();
        t2.start();
    }
}