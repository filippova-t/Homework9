public class Main {

    public static void addNewBook(Book newBook, Book [] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                break;
            }

        }
    }

    public static void printListOfBooks ( Book [] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getBookName() + ": " + books[i].getAuthorName() +
                        ": " + books[i].getPublishingYear());
            }
        }
    }

    public static void main(String[] args) {


        Author johnTolkien = new Author("Джон", "Толкиен");
        Author joanneRowling = new Author("Джоан", "Роулинг");
        Book theLordOfTheRings = new Book("Властелин колец", johnTolkien, 2016);
        Book harryPotterAndThePhilosophersStone = new Book("Гарри Поттер и философский камень", joanneRowling,
                2001);


        System.out.println(theLordOfTheRings.getBookName() + " " + theLordOfTheRings.getPublishingYear() + " " +
                theLordOfTheRings.getAuthorName());
        System.out.println(harryPotterAndThePhilosophersStone.getBookName() + " " +
                harryPotterAndThePhilosophersStone.getPublishingYear() + " "
                + harryPotterAndThePhilosophersStone.getAuthorName());

        theLordOfTheRings.setPublishingYear(2018);
        System.out.println(theLordOfTheRings.getBookName() + " " + theLordOfTheRings.getPublishingYear() + " " +
                theLordOfTheRings.getAuthorName());
        System.out.println();

        //доп задание Средний уровень
        Book[] arraysOfBooks = {theLordOfTheRings, harryPotterAndThePhilosophersStone, null, null, null, null, null};

        Author francisFitzgerald = new Author("Фрэнсис", "Фитцджеральд");
        Book theGreatGatsby = new Book("Великий Гэтсби", francisFitzgerald, 1996);

        addNewBook(theGreatGatsby, arraysOfBooks);

        printListOfBooks(arraysOfBooks);

        }

    }



