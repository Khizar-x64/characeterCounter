package MyString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStringTest {

    private MyString myString;

    @BeforeEach
    /* BeforeEach statement is used for initializing specific things from every
     test cases .But the main point is , it's methodoly can't return any anything.*/
    public void setUp() {
        this.myString = new MyString();
    }

    @Test
    public void testAdd() {

        myString.add('A');
        myString.add('B');
        myString.add('C');

        String expected = "ABC";
        String result = myString.ConvertToString(); // Assuming you have a toString() method
        System.out.println(result);
        assertEquals(expected, result);
    }
}
