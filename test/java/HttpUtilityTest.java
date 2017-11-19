
import org.junit.Test;

import java.net.HttpURLConnection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class HttpUtilityTest {


    @Test
    public void testHttpConnectionToExampleApi() {
        String requestUrl = "<API REQUEST URL>";
        String response = HttpUtility.makeHttpGetRequest(requestUrl);
        HttpURLConnection con;
        assertEquals(con.getResponseCode(), 200);

    }

    @Test
    public void testHttpUtilityCityIsTallinn() {
        try {
            String countryCode = HttpUtility.getCityName();
            assertTrue(countryCode.equals("Tallinn"));
        } catch (Exception e) {
            fail("Failure cause: " + e.getMessage());
        }
    }

    @Test
    public void testCountryCodeOfCurrentWeatherCountry() {
        try {
            String countryCode = HttpUtility.getCountryCode();
            assertTrue(countryCode.equals("EE"));
        } catch (Exception e) {
            fail("Failure cause: " + e.getMessage());
        }
    }

    @Test
    public void testCoordinateIsInAValidFormat() {
        try{
            String coordinates = HttpUtility.getCoordinates();
            assertTrue(coordinates.equals("59.437:24.7535"));
        } catch (Exception e) {
            fail("Failure cause: " + e.getMessage());
        }
    }
}
