package up;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RpsRandomTestSuite {

    @Test
    public void getRandomInt() {
        //Given
        final RpsRandom rpsRandom = mock(RpsRandom.class);
        final int testInt = 1;
        //When
        when(rpsRandom.getRandomInt()).thenReturn(1);
        //Then
        assertEquals(testInt, rpsRandom.getRandomInt());
    }
}