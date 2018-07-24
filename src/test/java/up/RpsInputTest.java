package up;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RpsInputTest {

    @Test
    public void getNextLine() {
        //Given
        final RpsInput rpsInput = mock(RpsInput.class);
        final String testResult = "My sentence XYZ 123";
        //When
        when(rpsInput.getNextLine()).thenReturn("My sentence XYZ 123");
        //Then
        assertEquals(testResult, rpsInput.getNextLine());
    }
}