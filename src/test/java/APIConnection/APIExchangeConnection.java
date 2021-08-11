package APIConnection;

import org.apache.log4j.Logger;

import interfaces.log.LogWeb;
import io.restassured.response.Response;

public class APIExchangeConnection {
	Logger logger = LogWeb.getLogger(APIExchangeConnection.class);
//	Setting URL
	private static final String USER_ID = "1046569ff7463244cec3583a5f2fd944";
	private static final String USERNAME = "TOOLSQA-Test";
	private static final String PASSWORD = "Test@@123";
	private static final String BASE_URL = "http://api.exchangeratesapi.io/v1/";

	private static String token;
	private static Response response;
	private static String jsonString;
	private static String bookId;
	
	

}