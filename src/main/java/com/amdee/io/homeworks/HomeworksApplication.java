package com.amdee.io.homeworks;

import com.amdee.io.homeworks.homework1.CakeBaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworksApplication implements CommandLineRunner {

	private final CakeBaker cakeBaker;

	public HomeworksApplication(CakeBaker cakeBaker) {
		this.cakeBaker = cakeBaker;
	}

	public static void main(String[] args) {
		SpringApplication.run(HomeworksApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
      cakeBaker.bakeCake();
	}
}
