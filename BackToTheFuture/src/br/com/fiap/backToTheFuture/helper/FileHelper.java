package br.com.fiap.backToTheFuture.helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import br.com.fiap.backToTheFuture.exception.LoadFileException;

public class FileHelper {

	public static Properties loadProperties() throws LoadFileException {
		try (InputStream is = FileHelper.class.getClassLoader().getResourceAsStream("application.properties")) {

			Properties props = new Properties();
			props.load(is);

			return props;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			throw new LoadFileException("Não foi possível carregar o arquivo application.properties");
		}
	}
}
