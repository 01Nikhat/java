public class Book {
    static int totalBooks;
    StringDemo title;
    StringDemo author;
    StringDemo isbookName;
    Boolean isBorrowed;
    static {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }
    Book(StringDemo isbookName, StringDemo title, StringDemo author){
        this.isbookName = isbookName;
        this.author = author;
        this.title = title;
    }
    Book(StringDemo isbookName, StringDemo title){
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
