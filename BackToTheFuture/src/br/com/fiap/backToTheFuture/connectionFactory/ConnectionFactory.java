package br.com.fiap.backToTheFuture.connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import br.com.fiap.backToTheFuture.exception.ConnectionException;
import br.com.fiap.backToTheFuture.exception.LoadFileException;
import br.com.fiap.backToTheFuture.helper.FileHelper;
import oracle.jdbc.driver.OracleDriver;

public class ConnectionFactory {
	
	public Connection getConnection() throws ClassNotFoundException, ConnectionException {
		try {
			
			Properties props = FileHelper.loadProperties();
			DriverManager.registerDriver(new OracleDriver());
			return DriverManager.getConnection(
					props.getProperty("database.url"),
					props.getProperty("database.user"),
					props.getProperty("database.password"));
		} catch (LoadFileException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException();
        } catch (SQLException e) {
            System.err.println(e.getMessage());            
            throw new ConnectionException("Não foi possível realizar a conexão com o banco de dados");
        }
	}
	
}
