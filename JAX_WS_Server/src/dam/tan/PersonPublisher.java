package dam.tan;

import javax.xml.ws.Endpoint;

public class PersonPublisher {
	public static void main(String[] args) {
		Endpoint ep = Endpoint.create(new PersonImpl());
		ep.publish("http://127.0.0.1:8000/personService");
	}
}
