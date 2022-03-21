import org.junit.jupiter.api.*;
import egtry.html.*;
import java.io.*;

public class Grammar {
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
    public void testCase1() throws ParseException {
        String testString = "ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\"\n"  +
                            "ADD HEADING WITH TEXT \"Hello World\"\n" +
                            "ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"\n" +
                            "ADD LINK WITH TEXT \"Search\" AND WITH LINK \"http://google.com\"\n" +
                            "ADD LINK WITH TEXT \"Email\" AND WITH LINK \"http://gmail.com\" WITH COLOR \"Green\"\n" +
                            "ADD PARAGRAPH WITH FONT \"Arial\" AND TEXT \"Good bye\"";
        provideInput(testString);
        System.out.println("===> Normal Test Case");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 2")
    public void testCase2() throws ParseException {
        String testString = "ADD IMAGE \n";
        provideInput(testString);
        System.out.println("===> An image without source");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 3")
    public void testCase3() throws ParseException {
        String testString = "ADD HEADING WITH TEXT \"This is a new Application\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"\n";
        provideInput(testString);
        System.out.println("===> Check the heading with the Attributes");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 4")
    public void testCase4() throws ParseException {
        String testString = "PARAGRAPH WITH WITH FONT \"Arial\" AND COLOR \"red\"\n";
        provideInput(testString);
        System.out.println("===> Removing the add keyword");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 5")
    public void testCase5() throws ParseException {
        String testString = "ADD LINK WITH TEXT \"Google\" AND WITH LINK \"https://google.com\"\n";
        provideInput(testString);
        System.out.println("===> Checking the link");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 6")
    public void testCase6() throws ParseException {
        String testString = "ADD HEADING WITH TEXT \"Faculty of engineering\"\n" +
                "ADD PARAGRAPH WITH TEXT \"Welcome\"\n" +
                "ADD LINK WITH TEXT \"Grades\" AND WITH LINK \"http://google.com\"\n" +
                "ADD PARAGRAPH WITH TEXT \"Your Email\" AND WITH COLOR \"Red\"\n" +
                "ADD PARAGRAPH WITH TEXT \"Your Password\" AND WITH COLOR \"Red\"\n" +
                "ADD LINK WITH TEXT \"Confirm\" AND WITH LINK \" http://google.com /password\"";
        provideInput(testString);
        System.out.println("===> General Test Case");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 7")
    public void testCase7() throws ParseException {
        String testString = "ADD IMAGE WITH SOURCE \" data:image/jpeg;base64 “\n" +
                "ADD HEADING WITH TEXT \"Hello World\"\n" +
                "ADD PARAGRAPH WITH TEXT AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"";
        provideInput(testString);
        System.out.println("===> Invalid Link for the image");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 8")
    public void testCase8() throws ParseException {
        String testString = "ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\"\n"  +
                "ADD PARAGRAPH WITH TEXT \"HI THERE! Is everything ok!\"\n" +
                "ADD Link with Text \"NOPE. IT IS INVALID\"\n" +
                "ADD LINK WITH TEXT AND WITH COLOR \"Red\"\n";
        provideInput(testString);
        System.out.println("===> General Check");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 9")
    public void testCase9() throws ParseException {
        String testString = "ADD PARAGRAPH WITH TEXT \"Dear Diary\" AND WITH COLOR \"blue\" AND WITH FONT \"ALGERIAN\"\n";
        provideInput(testString);
        System.out.println("===> Paragraph with attributes");
        main.main(new String[0]);
    }

    @Test
    @DisplayName("Test 10")
    public void testCase10() throws ParseException {
        String testString = "ADD PARAGRAPH WITH TEXT \" It is really hard to accept the reality. " +
                "How much we have gone far until now. " +
                "How much work we have done to reach point and how much tears streaming down " +
                "my face on losing hopes and dreams. We must be passionate and hopeful for better " +
                "future to achieve more and more\"\n";
        provideInput(testString);
        System.out.println("===> Long Text");
        main.main(new String[0]);
    }
}
