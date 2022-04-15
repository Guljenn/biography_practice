import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args){

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
        This will be our actual program that we define author and his books
        In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

        Full name = Stefan Zweig
        County = Austria
        Is still alive: No (28 November 1881 – 22 February 1942)
        Some of his books as listed below:

        BookName                            Genre           TotalPage
        Amok                                tale            189
        The Royal Game                      novella         53
        24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE

        Scanner userInput = new Scanner(System.in);


        System.out.println(Author.authorsFirstName);
        String firstName = userInput.next();

        System.out.println(Author.authorsLastName);
        String lastName = userInput.next();

        System.out.println(Author.authorsCountry);
        String country = userInput.next();

        System.out.println(Author.isAuthorAlive);
        String isAlive = userInput.next();

        do{
            System.out.println(Author.ageOfAuthor);
            int age = userInput.nextInt();

            System.out.println(Author.listOfBooks);
            String bookInfo = userInput.next();

            if(bookInfo.toLowerCase().startsWith("y")) {
                System.out.println(Book.nameOfBook);
                String nameOfBook = userInput.next();

                System.out.println(Book.genreOfBook);
                String genre = userInput.next();

                System.out.println(Book.pagesOfBook);
                int pages = userInput.nextInt();
            }

            Author myAuthor = new Author(firstName, lastName, country, true, age, List<myAuthor>);
            ArrayList<Author> newList = new ArrayList<>();
            newList.add(myAuthor);
            System.out.println(newList);

        } while(isAlive.toLowerCase().startsWith("y"));











    }
}
