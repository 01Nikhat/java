public class Book {
    static int totalBooks;
    String title;
    String author;
    String isbookName;
    Boolean isBorrowed;
    static {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }
    Book(String isbookName, String title, String author){
        this.isbookName = isbookName;
        this.author = author;
        this.title = title;
    }
    Book(String isbookName, String title){
        this(isbookName,title,"Unknown");
    }
    static int getTotalBooks(){
        return totalBooks;
    }

     void borrowBooks(){
        if (isBorrowed){
            System.out.println("Book is borrowed");
        }
        else {
            System.out.println("Book is not borrowed");
        }

    }
    public int returnBook(){
        return totalBooks;
    }


}
