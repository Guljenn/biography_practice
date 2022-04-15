import java.util.ArrayList;
import java.util.List;

public class Author {

    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    //YOUR CODE HERE

    public Author(String firstName, String lastName, String country, boolean isAlive, int age, ArrayList<String> books){
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
       // this.books = books;
        this.books = new ArrayList<>(books);



    }


    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE
    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;
    public List<String> books;


    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        return "Book{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                ", age=" + age +
                ", books=" + books +
                '}';


        // QUESTIONS ABOUT AUTHOR INFORMATION


    }
    public static final String authorsFirstName = "What is your favorite author's first name?";
    public static final String authorsLastName = "What is your favorite author's last name?";
    public static final String authorsCountry = "Where is your favorite author from?";
    public static final String isAuthorAlive = "Is your favorite author alive?(Y/N)";
    public static final String ageOfAuthor = "How old is your favorite author?";
    public static final String listOfBooks = "Would you like to enter book info? (Y/N)";



}
