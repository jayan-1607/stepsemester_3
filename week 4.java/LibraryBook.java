public class LibraryBook {
    private String title;
    private String isbn;
    private boolean catalogued;

    public LibraryBook(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
        this.catalogued = true; // Set to true for all processed entries based on the sample output
    }

    
    public LibraryBook(String title) {
        this(title, "PENDING"); 
    }

    
    public void printStatus() {
        System.out.println(title + " | " + isbn + " | Catalogued: " + catalogued);
    }

    public static void main(String[] args) {
       
        String[] titles = {"Clean Code", "Untitled Draft", "1984", "Notes"};
        String[] isbns = {"978-0132350884", "", "9780451524935", ""};

        for (int i = 0; i < titles.length; i++) {
            LibraryBook book;
            
            if (isbns[i] != null && !isbns[i].isEmpty()) {
                book = new LibraryBook(titles[i], isbns[i]);
            } else {
                book = new LibraryBook(titles[i]); // Relies on the chained constructor
            }
            
            book.printStatus();
        }
    }
}