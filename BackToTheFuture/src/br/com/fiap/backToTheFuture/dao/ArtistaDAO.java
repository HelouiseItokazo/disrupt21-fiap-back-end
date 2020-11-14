package br.com.fiap.backToTheFuture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.backToTheFuture.connectionFactory.ConnectionFactory;
import br.com.fiap.backToTheFuture.dao.generics.DAO;
import br.com.fiap.backToTheFuture.domain.Artista;
import br.com.fiap.backToTheFuture.exception.ConnectionException;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;

public class ArtistaDAO implements DAO<Artista> {

	private final Connection conn;

	public ArtistaDAO() throws ClassNotFoundException, ConnectionException {
		this.conn = new ConnectionFactory().getConnection();
	}

	@Override
	public List<Artista> findAll() throws DatabaseAccessException {

		String sql = "select * from T_BTTF_ARTISTA";

		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)

		) {

			List<Artista> elenco = new ArrayList<Artista>();
			
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Artista artista = new Artista();

				artista.setIdArtista(rs.getLong("id_artista"));
				artista.setNome(rs.getString("nm_artista"));
				artista.setDataNascimento(rs.getDate("dt_nascimento").toLocalDate());

				elenco.add(artista);
			}
			
			rs.close();
			return elenco;

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DatabaseAccessException("Falha ao consultar todos os artista.");
		}
	}

	@Override
	public Artista findById(long id) throws DatabaseAccessException {
		
		String sql = "select * from T_BTTF_ARTISTA where id_artista=?";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
				
		) {

			stmt.setLong(1, id);
			
			ResultSet rs = stmt.executeQuery();

			Artista artista = new Artista();

			while (rs.next()) {
				
				artista.setIdArtista(rs.getLong("id_artista"));
				artista.setNome(rs.getString("nm_artista"));
				artista.setDataNascimento(rs.getDate("dt_nascimento").toLocalDate());
			}
			
			rs.close();
			return artista;

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DatabaseAccessException("Falha ao consultar o artista.");
		}
	}

}
