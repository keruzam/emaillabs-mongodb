package pl.keruzam.emaillabsmongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.keruzam.emaillabsmongodb.model.EmailData;
import pl.keruzam.emaillabsmongodb.repo.EmailRepository;

@RestController
@RequestMapping("/api/email")
public class EmailController {

	@Autowired
	private EmailRepository repository;

	@GetMapping("/{id}")
	public EmailData getDataById(@PathVariable String id) {
		return repository.findById(id).orElse(null);
	}
}
