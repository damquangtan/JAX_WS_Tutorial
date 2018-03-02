package dam.tan.test;

import dam.tan.client.PersonI;
import dam.tan.client.PersonImplService;

public class TestSoap {
	public static void main(String[] args) {
		PersonImplService personImplService = new PersonImplService();
		PersonI personI = personImplService.getPersonImplPort();
		
		System.out.println(personI.getPerson(1).getName());
		System.out.println(personI.getPerson(2).getName());
		System.out.println(personI.getPerson(3).getName());
		System.out.println(personI.getPerson(4).getName());
		System.out.println(personI.getPerson(5).getName());
	}
}
