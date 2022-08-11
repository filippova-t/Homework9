public class Book {
    private String bookName;
    private Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getBookName () {
        return this.bookName;
    }
    public Author getAuthorName () {
        return this.authorName;
    }
    public int getPublishingYear () {
        return this.publishingYear;
    }

    public void setPublishingYear (int publishingYear) {
        this.publishingYear = publishingYear;
    }
    @Override
    public String toString () {
        return "\"" + bookName + "\", автор: " + authorName + ", "  + "год издания: " + publishingYear;
    }

    @Override
    public boolean equals (Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        } Book b = (Book) other;
        return bookName.equals (b.bookName) && authorName.equals (b.authorName);

    }
    @Override
    public int hashCode () {
        return java.util.Objects.hash (bookName, authorName);
    }
}
