// 5. Define class for Complex number with real and imaginary as data
// members. Create its contructor, overload the constructors. Also
// define addition method to add two complex objects.


class  ComplexNumbers{
    
    int realno;
    int imaginaryno;
    
    //contructor
    ComplexNumbers(){
    this.realno = 10;
    this.imaginaryno = 7;
    }

    //peracontructor
    ComplexNumbers(int realno ,int imaginaryno){
        
        this.realno=realno;
        this.imaginaryno=imaginaryno;
    }

    void addition(ComplexNumbers c){
        int r = this.realno + c.realno;
        int i = this.imaginaryno + c.imaginaryno; 

        System.out.println(r);
        System.out.println(i);
    }
}


public class ComplexImaginaryDemo {
    public static void main(String[] args) {

        ComplexNumbers h = new ComplexNumbers(10,3);
        ComplexNumbers H = new ComplexNumbers();
        h.addition(H);
        

    }
}