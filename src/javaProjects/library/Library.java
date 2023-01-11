package javaProjects.library;

public class Library {
    public static void main(String[] args) {

        Book[] books = { new Book("Lord of the Rings", "J.R.R. Tolkien", "Atlantis", 1992),
                new Book("A Games of Thrones", "Georg R.R. Martin", "S-ka", 1998),
                new Book("Lord of the Rings", "J.R.R. Tolkien", "Atlantis", 1992)
        };


        System.out.println("book 1: " + books[0].toString());
        System.out.println("book 2: " + books[1].toString());
        System.out.println("The same? - " + books[0].equals(books[1]));
        System.out.println();

        System.out.println("book 1: " + books[0].toString());
        System.out.println("book 3: " + books[2].toString());
        System.out.println("The same? - " + books[0].equals(books[2]));
    }
}
