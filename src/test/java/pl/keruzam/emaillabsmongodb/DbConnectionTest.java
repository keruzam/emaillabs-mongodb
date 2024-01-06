package pl.keruzam.emaillabsmongodb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DbConnectionTest {

	@Autowired
	private DataService dataService;

	@Test
	public void testDatabaseConnection() {
		dataService.testDatabaseConnection();
	}

}
