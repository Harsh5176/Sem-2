/*Create a class named Bank_Account with data memebers accountNo,
userName, email, accountType and accountBalance, Also create methods
getAccountDetails() and displayAccountDetails().*/


import java.util.Scanner;
class BankAccount{
    long accountNo;
    String userName;
    String email;
    String accountType;
    float accountBalance;

    void getAccountDetails(long accountNo, String userName,String email,String accountType,float accountBalance)
    {
        this.accountNo=accountNo;
        this.userName=userName;
        this.email=email;
        this.accountType=accountType;
        this.accountBalance=accountBalance;
        
    }

    void displayAccountDetails(){
        System.out.println("Your accontNo:-" +accountNo);
        System.out.println("Your userName:-"+userName);
        System.out.println("Your email:-"+email);
        System.out.println("Your accountType:-"+accountType);
        System.out.println("Your accountBalance :-"+accountBalance);
    }

}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long accountNo;
        String userName;
        String email;
        String accountType;
        float accountBalance;
    
        System.out.print("Enter accountNo :-");
         accountNo = sc.nextInt();
        
        System.out.print("Enter UserName :-");
         userName = sc.next();

        System.out.print("Enter email :-");
         email = sc.next();

        System.out.print("Enter accountType :-");
         accountType = sc.next();

        System.out.print("Enter accountBalance :-");
         accountBalance = sc.nextInt();

        BankAccount B1 = new BankAccount();
        B1.getAccountDetails(accountNo,userName,email,accountType,accountBalance);
        B1.displayAccountDetails();

    }
    
}
