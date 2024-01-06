package pl.keruzam.emaillabsmongodb.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import pl.keruzam.emaillabsmongodb.model.EmailData;
import pl.keruzam.emaillabsmongodb.services.EmaiLabsService;

@Service
public class EmaiLabsServiceImpl implements EmaiLabsService {

	@Override
	public List<EmailData> getAllEmails() {
		RestTemplate restTemplate = new RestTemplate();
		String resourceUrl = "http://external.api/data";
		ResponseEntity<EmailData[]> response = restTemplate.getForEntity(resourceUrl, EmailData[].class);
		return Arrays.asList(response.getBody());
	}

}
