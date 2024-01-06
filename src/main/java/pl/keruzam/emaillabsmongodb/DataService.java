package pl.keruzam.emaillabsmongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

	@Autowired
	private EmailRepository repository;

	public void testDatabaseConnection() {
		repository.save(new EmailData(null, "test bazy 123"));
		System.out.println("FIND ALL DATA:");
		repository.findByName("test bazy 123").forEach(System.out::println);
		long count = repository.count();
		System.out.println(count);
		// repository.deleteAll();
	}

}
