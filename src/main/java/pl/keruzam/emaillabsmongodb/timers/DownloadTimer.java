package pl.keruzam.emaillabsmongodb.timers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import pl.keruzam.emaillabsmongodb.model.EmailData;
import pl.keruzam.emaillabsmongodb.services.DataService;
import pl.keruzam.emaillabsmongodb.services.EmaiLabsService;

@Service
public class DownloadTimer {

	@Autowired
	DataService dataService;
	@Autowired
	EmaiLabsService emaiLabsService;

	@Scheduled(cron = "0 0 * * * ?")
	public void download() {
		List<EmailData> list = emaiLabsService.getAllEmails();
		dataService.saveAll(list);
	}

}
