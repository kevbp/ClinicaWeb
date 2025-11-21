package Clinica.ClinicaWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients    // Para poder llamar a los otros 15 servicios
public class ClinicaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClinicaWebApplication.class, args);
    }

}
