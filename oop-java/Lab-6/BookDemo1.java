/*2. Declare a class called book having author_name as private data
member. Extend book class to have two sub classes called
book_publication & paper_publication. Each of these classes have
private member called title. Write a complete program to show
usage of dynamic method dispatch (dynamic polymorphism) to displaybook or paper publications of given author.Use command line arguments for inputting data. */


class Book{
    private String author_name;
    Book(String name){
        author_name=name;
    }
    void display(){
        System.out.println("Author:"+author_name);
    }
}

class book_publication extends Book{
    private String title;
    book_publication(String title){
        super("");
        this.title=title;
    }
    void display(){
        super.display();
        System.out.println("Book Title:"+title);
    }
}
class paper_publication extends Book{
    private String title;
    paper_publication(String title){
        super("");
        this.title=title;
    }
    void display(){
        super.display();
        System.out.println("Book Title:"+title);
    }
} 


public class BookDemo1 {
    public static void main(String[] args) {
        Book b1;
        if(args[1].equals("book")){
            b1=new book_publication(args[2]);
        }else if(args[1].equals("paper")){
            b1=new paper_publication(args[2]);
        }else{
            b1=new Book(args[0]);
        }
        b1.display();
    }
}

