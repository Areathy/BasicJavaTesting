import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class PracticeStringTest {

    private  String environment = "prod";

    String s1;
    String s2;
    String s3;

    @BeforeEach
    void SetUp() {
        s1 = "HellO";
        s2 = " there is a quiet Mouse";
        s3 = " I am happy ";
    }

    @Test
    void Should_Pass_When_noOfVowelsA() {

        assertAll(
                () -> assertEquals(2, PracticeString.noOfVowels(s1),"Expected value is v"),
                () -> assertEquals(10, PracticeString.noOfVowels(s2),"Expected value is 10"),
                () -> assertEquals(3, PracticeString.noOfVowels(s3),"Expected value is 3")
        );
    }
    @Test
    void Should_Pass_When_noOfConsonants() {
        assumeTrue(this.environment.equals("prod"));

        assertEquals(6, PracticeString.noOfConsonants(s1),"Expected value is 3");
                assertEquals(8, PracticeString.noOfConsonants(s2),"Expected value is 8");
                assertEquals(5, PracticeString.noOfConsonants(s3),"Expected value is 5");

    }
    @Test
    void Should_Pass_When_checkingTwoReversalMethods(){
        assertEquals(PracticeString.reverseString(s2), PracticeString.reverseStringWithStack(s2));
    }
}
