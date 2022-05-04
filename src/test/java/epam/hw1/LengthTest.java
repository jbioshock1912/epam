package epam.hw1;

import org.junit.Assert;
import org.junit.Test;

public class LengthTest {

    @Test
    public void testGetLengthWord_1() {
        String phrase = "Hello Word";

        Assert.assertEquals(4, Length.getLengthWord(phrase));
    }

    @Test
    public void testGetLengthWord_2() {
        String phrase = " fly me    to  the moon                                   ";

        Assert.assertEquals(4, Length.getLengthWord(phrase));
    }

    @Test
    public void testGetLengthWord_3() {
        String phrase = "luffy is still joyboy";

        Assert.assertEquals(6, Length.getLengthWord(phrase));
    }
}