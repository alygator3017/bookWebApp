package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Alyson
 */
public class AuthorService {
    
    private List<Author> authors; 
    public AuthorService(){
        initTestData();
    }
    public final List<Author> getAllAuthors(){
        return authors;
    }
    
    private void initTestData() {
        authors = new ArrayList<>(Arrays.asList(new Author(1432, "Austen, Jane"), new Author(2354, "Bronte, Charolotte"), new Author(5341, "Martin, George R.R")));
    }
    
//    public static void main(String[] args) {
//        AuthorService as = new AuthorService();
//        List<Author> authors = as.getAllAuthors();
//        for(Author at: authors){
//            System.out.println(at.toString());
//        }
//    }

    
}
