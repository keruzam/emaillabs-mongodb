package pl.keruzam.emaillabsmongodb.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.keruzam.emaillabsmongodb.model.EmailData;
import pl.keruzam.emaillabsmongodb.repo.EmailRepository;
import pl.keruzam.emaillabsmongodb.services.DataService;

@Service
public class DataServiceImpl implements DataService {

	@Autowired
	private EmailRepository repository;

	@Override
	public String save(EmailData emailData) {
		EmailData data = repository.save(emailData);
		return data.getId();
	}

	@Override
	public List<EmailData> findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public void saveAll(List<EmailData> list) {
		repository.saveAll(list);
	}

}
