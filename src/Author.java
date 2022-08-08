public class Author {
    String firstNameAuthor;
    String lastNameAuthor;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;

    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }

    public String getLastNameAuthor() {
        return this.lastNameAuthor;
    }

    public String toString () {
        return firstNameAuthor + " " + lastNameAuthor;
    }
}
