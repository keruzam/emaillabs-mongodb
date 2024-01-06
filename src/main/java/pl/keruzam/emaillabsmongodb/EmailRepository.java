package pl.keruzam.emaillabsmongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface EmailRepository extends MongoRepository<EmailData, String> {

	@Query("{name:'?0'}")
	List<EmailData> findByName(String name);

	@Override
	public long count();

}
