package com.joonseolee.i18n;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableConfigurationProperties({
//		EnglishMessageProperties.class,
//		KoreanMessageProperties.class
//})
@SpringBootApplication
public class I18nApplication {

	public static void main(String[] args) {
		SpringApplication.run(I18nApplication.class, args);
	}

}
