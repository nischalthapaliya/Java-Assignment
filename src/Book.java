
public class Book {
    String bookName;
    int ISBN;
    String author;
    double price;

    public Book(String B, int I, String A, double P){
        this.bookName = B;
        this.ISBN = I;
        this.author = A;
        this.price = P;
    }
    public String getBookName(){
        return bookName;
    }
    public int getISBN() {
        return ISBN;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice() {
        return price;
    }
    public String displayBook(){
        return ("The book "+this.bookName+" by "+this.author+" with ISBN "+this.ISBN+" costs "+this.price);
    }

    public static void main(String[] args) {
        Book book = new Book("Harry Potter",98603456,"J.K Rowling", 799.99);
        System.out.println(book.displayBook());
    }
}
