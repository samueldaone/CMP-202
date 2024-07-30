public class main {
    public static void main(String[] args) {
        library_book book1 = new library_book("1984", "George Orwell", "LB1234");

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Library Code: " + book1.getLibraryCode());

        book1.borrowBook();
        System.out.println("Is borrowed: " + book1.isBookBorrowed());

        book1.returnBook();
        System.out.println("Is borrowed: " + book1.isBookBorrowed());
    }

}