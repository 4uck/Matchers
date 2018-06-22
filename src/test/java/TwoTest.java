import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class TwoTest {

    @Test
    public void test(){

        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        Book book2 = new Book();

        book1.setLanguageDescription("Russian");
        book2.setLanguageDescription("English");

        books.add(new Book());
        books.add(book1);
        books.add(book2);


        MyMatcher.ListBooks listBooks = new MyMatcher.ListBooks(books);
        assertThat(listBooks, MyMatcher.checkDescription());
    }
}
