package src.main.java.br.edu.infnet.appFlaStore;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppFlaStoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AppFlaStoreApplication.class, args);
		
		System.out.println(Arrays.toString(args));
	}

}
