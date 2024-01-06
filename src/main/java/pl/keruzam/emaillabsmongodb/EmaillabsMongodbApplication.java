package pl.keruzam.emaillabsmongodb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@SpringBootApplication
@Configuration
public class EmaillabsMongodbApplication extends AbstractMongoClientConfiguration {

	@Value("${spring.data.mongodb.uri}")
	private String uri;

	@Value("${spring.data.mongodb.database}")
	private String db;

	public static void main(String[] args) {
		SpringApplication.run(EmaillabsMongodbApplication.class, args);
	}

	@Override
	protected String getDatabaseName() {
		return db;
	}

}
