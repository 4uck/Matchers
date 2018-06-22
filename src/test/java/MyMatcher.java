import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import java.util.ArrayList;
import java.util.List;

public class MyMatcher<T> extends BaseMatcher<T> {

    public static Matcher<ListBooks> checkDescription() {
        return new MyMatcher<ListBooks>();
    }

    @Override
    public boolean matches(Object o) {
        final ListBooks foo = (ListBooks) o;
        List<Book> books = foo.getBooks();

        for (Book b : books) {
            if (b.getLanguageDescription() != null && !b.getLanguageDescription().equals("English"))
                return false;
        }
        return true;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("[ English or null, ...]");
    }

    @Override
    public void describeMismatch(final Object item, final
    Description description) {

        ListBooks books = (ListBooks) item;
        description.appendText(books.toString());
    }




    static class ListBooks {
        private List<Book> books = new ArrayList<>();

        public ListBooks(List<Book> books) {
            this.books = books;
        }

        public List<Book> getBooks() {
            return books;
        }

        @Override
        public String toString() {

            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append("[");

            for (int i = 0; i < books.size(); i++) {
                stringBuilder.append(books.get(i).getLanguageDescription());

                if (i != books.size() - 1)
                    stringBuilder.append(", ");
            }
            stringBuilder.append("]");

            return stringBuilder.toString();
        }
    }
}
