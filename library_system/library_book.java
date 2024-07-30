public class library_book extends book {
    private String libraryCode;

    public library_book(String title, String author, String libraryCode) {
        super(title, author);
        this.libraryCode = libraryCode;
    }

    public String getLibraryCode() {
        return libraryCode;
    }
}