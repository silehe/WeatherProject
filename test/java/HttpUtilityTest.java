
import org.junit.Test;

import java.net.HttpURLConnection;

import static org.junit.Assert.assertEquals;

public class HttpUtilityTest {

    @Test
    public void testHttpConnectionToExampleApi() {
        String requestUrl = "<API REQUEST URL>";
        String response = HttpUtility.makeHttpGetRequest(requestUrl);
        HttpURLConnection con;
        assertEquals(con.getResponseCode(), 200);

    }

    @Test
    public void testTemperatureIsInAValidFormat() {

    }

    @Test
    public void testCoordinateIsInAValidFormat() {

    }

    @Test
    public void testInternetConnectionExists() {

    }

    @Test
    public void testCorrectOutputFormat() {

    }

    @Test
    public void testValidMaxAndMinTemperature() {

    }

    @Test
    public void testValidTimePeriod() {

    }

    @Test
    public void testLastUpdateLessThanThreeHoursAgo() {

    }

}
