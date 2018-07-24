package up;

import org.junit.Test;

import static org.junit.Assert.*;

public class RpsMoveCapabilitiesTestSuite {

    @Test
    public void getCapabilitiesMap() {
        //Given
        final RpsMoveCapabilities rpsMoveCapabilities = new RpsMoveCapabilities();
        //When & Then
        assertEquals(9, rpsMoveCapabilities.getCapabilitiesMap().size());
    }
}