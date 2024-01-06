package pl.keruzam.emaillabsmongodb.services;

import java.util.List;

import pl.keruzam.emaillabsmongodb.model.EmailData;

public interface DataService {

	public String save(EmailData emailData);

	public List<EmailData> findByName(String name);

	public void deleteAll();

	public void saveAll(List<EmailData> list);

}
