package fridayPasswordCheck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fridayPasswordCheckTest {

    @Test

    public void shouldPasswordLengthLong() {

        //given
        var passwordLength = "PassW0rd";
        //when
        var test = fridayPasswordCheck.lengthOfPassword(passwordLength);
        //then
        Assertions.assertTrue(test, passwordLength);
    }

    @Test

    public void shouldPasswordLengthShort() {

        //given
        var passwordLength = "Pa5s";
        //when
        var test = fridayPasswordCheck.lengthOfPassword(passwordLength);
        //then
        Assertions.assertFalse(test, passwordLength);
    }

    @Test

    public void shouldContainNumber() {

        //given
        var passwordLength = "Passw0rd";
        //when
        var test = fridayPasswordCheck.numberIncluded(passwordLength);
        //then
        Assertions.assertTrue(test, passwordLength);
    }

    @Test

    public void shouldContainLetterRight() {

        //given
        var passwordLength = "PassW0rd";
        //when
        var test = fridayPasswordCheck.containsLetter(passwordLength);
        //then
        Assertions.assertTrue(test, passwordLength);
    }

    @Test

    public void shouldContainLetterEdge() {

        //given
        var passwordLength = "password";
        //when
        var test = fridayPasswordCheck.containsLetter(passwordLength);
        //then
        Assertions.assertFalse(test, passwordLength);
    }
}