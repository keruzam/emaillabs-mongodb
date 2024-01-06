package pl.keruzam.emaillabsmongodb;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DownloadTimer {

	@Scheduled(cron = "0 0 * * * ?")
	public void download() {

//		RestTemplate restTemplate = new RestTemplate();
//		String resourceUrl = "http://external.api/data";
//		ResponseEntity<EmailData[]> response = restTemplate.getForEntity(resourceUrl, EmailData[].class);

	}

}
