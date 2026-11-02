public class book {

    private String title;
    private String author;
    private int publicationYear;
    private double numberOfPages;
    
    public book (String title, String author, int publicationYear, double numberOfPages){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
    }

    public void howLongToRead(double readerPagesPerDay){
        double daysToRead = this.numberOfPages / readerPagesPerDay;
        System.out.println("It will roughly take; " + daysToRead + " days to read this book!");
    }
    
    
    public static void main(String[] args) {
        book book1 = new book("Dune", "Frank Herbert", 1965, 412);
        book1.howLongToRead(3);
    }

}
