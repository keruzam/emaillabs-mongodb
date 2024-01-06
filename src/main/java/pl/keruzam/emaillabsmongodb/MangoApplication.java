package pl.keruzam.emaillabsmongodb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@SpringBootApplication
@Configuration
public class MangoApplication extends AbstractMongoClientConfiguration {

	@Value("${spring.data.mongodb.uri}")
	private String uri;

	@Value("${spring.data.mongodb.database}")
	private String db;

	@Value("${emailabs.token}")
	private String token;

	public static void main(String[] args) {
		SpringApplication.run(MangoApplication.class, args);
	}

	@Override
	protected String getDatabaseName() {
		return db;
	}

	public String getToken() {
		return token;
	}

}
