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

    public Author(String firstName, String lastName, String country, boolean isAlive, int age, List<Book> books){
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.books = books;



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
    public List<Book> books;


    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        String s = "Author{";
                if(this.firstName != null) s += "firstName='" + firstName + '\'';
                if(this.lastName != null) s += ", lastName='" + lastName + '\'' ;
                if(this.country != null) s += ", country='" + country + '\'';
                if(!this.isAlive) s += ", isAlive=" + this.isAlive;
                if(this.age != 0) s += ", age=" + age;
               s += '}';
        return s;
    }

    public static final String authorsFirstName = "What is your favorite author's first name?";
    public static final String authorsLastName = "What is your favorite author's last name?";
    public static final String authorsCountry = "Where is your favorite author from?";
    public static final String isAuthorAlive = "Is your favorite author alive?(Y/N)";
    public static final String ageOfAuthor = "How old is your favorite author?";
    public static final String bookInfo = "Would you like to enter book info? (Y/N)";
}
