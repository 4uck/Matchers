import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MathTest {

//    class Foo{
//
//        private int i;
//
//        public int getNumber(){
//            return this.i;
//        }
//
//        public Foo(int i) {
//            this.i = i;
//        }
//    }
//
//
//    private Matcher<Foo> hasNumber(final int i) {
//        return new BaseMatcher<Foo>() {
//
//            public boolean matches(final Object item) {
//                final Foo foo = (Foo) item;
//                return i == foo.getNumber();
//            }
//
//            public void describeTo(final Description description) {
////                description.appendText("getNumber should return ").appendValue(i);
//
//                description.appendValue(i);
//            }
//
//            @Override
//            public void describeMismatch(final Object item, final
//            Description description) {
////                description.appendText("was").appendValue(((Foo) item).getNumber());
//                description.appendValue(((Foo) item).getNumber());
//            }
//        };
//    }
//
//    @Test
//    public void test(){
//        final Foo testee = new Foo(41);
//        assertThat(testee, hasNumber(42));
//    }
//
//    @Test
//    public void test1(){
//        int i = 1;
//        assertThat(1, is(1));
//    }
}
