package APIConnection;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.log4j.Logger;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import interfaces.log.LogWeb;
import okhttp3.Request;
import paginas.PageAmazon;
import utils.RegrasUtils;

public class APIExchangeConnection {
//	Logger logger = LogWeb.getLogger(APIExchangeConnection.class);
//	// Setting URL
//	String url_str ="http://api.exchangeratesapi.io/v1/convert?access_key=1046569ff7463244cec3583a5f2fd944&from=USD&to=EUR& amount = 25";
//
//	// Making Request
//	URL url = new URL(url_str);
//	HttpURLConnection request = (HttpURLConnection) url.openConnection();
//	request.connect();
//
//	// Convert to JSON
//	JsonParser jp = new JsonParser();
//	JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
//	JsonObject jsonobj = root.getAsJsonObject();

	// Accessing object
//	String req_result = jsonobj.get("result").getAsString();
}
