package de.mindmatters.kennenlerntag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class KennenlerntagApplication {
	@RequestMapping("/")
	public String home() {
		return "Start";
	}

	public static void main(String[] args) {
		SpringApplication.run(KennenlerntagApplication.class, args);
	}

}
