package com.model.mail;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmailUtils {

	public static final String FROM_EMAIL = "areariservata@iisgiorgimilano.gov.it";
	
	public static String formatText(String text,String... format) {
		String res = text;
		for (int i = 0; i < format.length && i != format.length-1;i+=2) {
			System.out.println("Replacing: " + "[" + format[i] + "]");
			System.out.println("With: " + format[i+1]);
			res = res.replace("[" + format[i] + "]", format[i+1]);
		}
		return res;
	}
	
	public static String textFromHTML(String htmlFile) {
		Resource resource = new ClassPathResource("testi_email/" + htmlFile + ".htm");
		Path path = null;
		try {
			path = Paths.get(resource.getURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
		StringBuilder builder = new StringBuilder();
		Stream<String> lines = null;
		try {
			lines = Files.lines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		lines.forEach(line -> builder.append(line).append("\n"));
		return builder.toString();
	}

}
