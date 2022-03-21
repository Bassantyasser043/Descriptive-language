import egtry.html.Main;
import egtry.html.ParseException;
import org.junit.jupiter.api.*;
import java.io.*;

public class HTML {
    Main main;
    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;

    @BeforeEach
    void setup(){
        main = new Main();
    }
    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
    }

    @Test
    @DisplayName("Test 1")
    void test1() throws ParseException {
        String testString = "ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" AND WITH COLOR \"Green\"\n";
        provideInput(testString);
        System.out.println("===> Testing Link");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 2")
    void test2() throws ParseException {
        String testString = "ADD PARAGRAPH WITH COLOR \"RED\" AND WITH FONT \"Arial\"\n";
        provideInput(testString);
        System.out.println("===> Testing Paragraph");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 3")
    void test3() throws ParseException {
        String testString = "ADD HEADING WITH TEXT \"TIMEOUT\"\n";
        provideInput(testString);
        System.out.println("===> Testing Heading");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 4")
    void test4() throws ParseException {
        String testString = "ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\"\n";
        provideInput(testString);
        System.out.println("===> Testing Image");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 5")
    void test5() throws ParseException {
        String testString = "ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" AND WITH COLOR \"Green\"\n";
        provideInput(testString);
        System.out.println("===> General Test");
        main.main(new String[0]);
    }
}
