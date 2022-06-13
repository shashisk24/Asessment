import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Marvel {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		var URL="http://www.mocky.io/v2/5ecfd5dc3200006200e3d64b" ;
		var request = HttpRequest.newBuilder().GET().uri(URI.create(URL)).build();
		var client = HttpClient.newBuilder().build();
		
		var response = client.send(request,HttpResponse.BodyHandlers.ofString());
		
		System.out.println(response.body());
		
		
}
}
