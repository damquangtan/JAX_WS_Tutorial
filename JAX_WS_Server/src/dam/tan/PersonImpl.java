package dam.tan;

import javax.jws.WebService;

@WebService(endpointInterface="dam.tan.PersonI")
public class PersonImpl implements PersonI{

	@Override
	public Person getPerson(Integer id) {
		return PersonUtil.getPerson(id);
	}
	
}
