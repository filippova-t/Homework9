public class Author {
   private String firstNameAuthor;
    private String lastNameAuthor;

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

    @Override
    public String toString () {
        return firstNameAuthor + " " + lastNameAuthor;
    }

    @Override
    public boolean equals (Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        } Author b = (Author) other;
        return firstNameAuthor.equals (b.firstNameAuthor) && lastNameAuthor.equals (b.lastNameAuthor);
    }
    @Override
    public int hashCode () {
        return java.util.Objects.hash (firstNameAuthor, lastNameAuthor);
    }
}
