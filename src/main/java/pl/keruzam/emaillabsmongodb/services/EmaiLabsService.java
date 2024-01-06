package pl.keruzam.emaillabsmongodb.services;

import java.util.List;

import pl.keruzam.emaillabsmongodb.model.EmailData;

public interface EmaiLabsService {

	public List<EmailData> getAllEmails();

}
