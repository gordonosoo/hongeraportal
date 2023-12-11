package ke.co.safaricom.hongeraportal;

import ke.co.safaricom.hongeraportal.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class HongeraportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HongeraportalApplication.class, args);
	}



}
