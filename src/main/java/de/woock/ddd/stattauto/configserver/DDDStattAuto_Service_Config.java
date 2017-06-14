package de.woock.ddd.stattauto.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DDDStattAuto_Service_Config {

	public static void main(String[] args) {
		SpringApplication.run(DDDStattAuto_Service_Config.class, args);
	}
}
