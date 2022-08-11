public class Main {

    public static void addNewBook(Book newBook, Book [] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                break;
            } else if (i >= 7) {
                System.out.println("Нет свободного места, чтобы добавить книгу");
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
                johnTolkien.toString());
        System.out.println(harryPotterAndThePhilosophersStone.getBookName() + " " +
                harryPotterAndThePhilosophersStone.getPublishingYear() + " "
                + joanneRowling.toString());

        theLordOfTheRings.setPublishingYear(2018);
        System.out.println(theLordOfTheRings.getBookName() + " " + theLordOfTheRings.getPublishingYear() + " " +
                johnTolkien.toString());
        System.out.println();

        //доп задание Средний уровень
        Book[] arraysOfBooks = {theLordOfTheRings, harryPotterAndThePhilosophersStone, null, null, null, null, null};

        Author francisFitzgerald = new Author("Фрэнсис", "Фитцджеральд");
        Book theGreatGatsby = new Book("Великий Гэтсби", francisFitzgerald, 1996);

       Book theGreatGatsby1997 = new Book("Великий Гэтсби", francisFitzgerald, 1997);
        Author francisScottFitzgerald = new Author("Фрэнсис", "Фитцджеральд");
        addNewBook(theGreatGatsby, arraysOfBooks);

        printListOfBooks(arraysOfBooks);

        //проверка метода toString
        System.out.println(harryPotterAndThePhilosophersStone.toString ());
        //проверки метода equals
        System.out.println (theGreatGatsby.equals (theGreatGatsby1997));
        System.out.println(francisFitzgerald.equals (francisScottFitzgerald));
        System.out.println(francisFitzgerald.equals (johnTolkien));

        }

    }



