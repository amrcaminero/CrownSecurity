package com.fnsystems.crownsecurity.mvc.recruitment;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.fnsystems.crownsecurity.persistence.recruitement.ApplicationEntity;


@Controller
public class RecruitmentController {

	@GetMapping("/application")
	public String initForm(ModelMap model) {
		// Empty entity
		model.addAttribute("application", new ApplicationEntity());

		// View's name
		return "recruitment";
	}

	@PostMapping(value = "/application")
	public String submit(@ModelAttribute ApplicationEntity application, ModelMap model, @RequestParam("file") MultipartFile file) throws IOException {

		// Add the image to the event
		application.setResumePath(file.getOriginalFilename());
		
		// Store the event
//		application = eventService.save(application);
		
		// Store the file
//		storageService.store(file, String.valueOf(application.getId()));
		
		model.addAttribute("message", "Your application have been sent successfully.");
		
		// View's name
		return "about";
	}
}
