package pl.keruzam.emaillabsmongodb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pl.keruzam.emaillabsmongodb.services.DataService;
import pl.keruzam.emaillabsmongodb.services.EmaiLabsService;

@SpringBootTest
public class DbConnectionTest {

	@Autowired
	private DataService dataService;
	@Autowired
	private EmaiLabsService emaiLabsService;
	@Autowired
	MangoApplication mangoApplication;

	@Test
	public void testDatabaseConnection() {
		System.out.println("token test:" + mangoApplication.getToken());
		System.out.println("FIND ALL DATA:");
		dataService.findByName("test bazy 123").forEach(System.out::println);
//		long count = repository.count();
//		System.out.println("COUNT:" + count);
	}

}
