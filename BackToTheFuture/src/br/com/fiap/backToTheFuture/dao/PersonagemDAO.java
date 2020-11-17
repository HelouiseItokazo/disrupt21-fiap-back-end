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
import br.com.fiap.backToTheFuture.domain.Personagem;
import br.com.fiap.backToTheFuture.exception.ConnectionException;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;

public class PersonagemDAO implements DAO<Personagem> {

	private final Connection conn;

	public PersonagemDAO() throws ClassNotFoundException, ConnectionException {
		this.conn = new ConnectionFactory().getConnection();
	}

	@Override
	public List<Personagem> findAll() throws DatabaseAccessException {
		
		String sql = "select * from T_BTTF_PERSONAGEM";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
						
		) {

			List<Personagem> personagens = new ArrayList<Personagem>();
			
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Personagem personagem = new Personagem();
				Artista artista = new Artista();
				
				personagem.setIdPersonagem(rs.getLong("id_personagem"));
				artista.setIdArtista(rs.getLong("id_artista"));
				personagem.setNome(rs.getString("nm_personagem"));
				personagem.setDataNascimento(rs.getDate("dt_nascimento").toLocalDate());
				personagem.setDescricao(rs.getString("ds_personagem"));

				personagens.add(personagem);
			}
			
			rs.close();
			return personagens;

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DatabaseAccessException("Falha ao consultar todos os artista.");
		}
	}

	@Override
	public Personagem findById(long idPersonagem) throws DatabaseAccessException {
		
		String sql = "select * from T_BTTF_PERSONAGEM where ID_PERSONAGEM = ?";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
		
		) {

			stmt.setLong(1, idPersonagem);
			
			ResultSet rs = stmt.executeQuery();

			Personagem personagem = new Personagem();

			while (rs.next()) {
				
				personagem.setIdPersonagem(rs.getLong("id_personagem"));
				personagem.setIdArtista(rs.getLong("id_artista"));
				personagem.setNome(rs.getString("nm_personagem"));
				personagem.setDataNascimento(rs.getDate("dt_nascimento").toLocalDate());
				personagem.setDescricao(rs.getString("ds_personagem"));
                
			}
			
			rs.close();
			return personagem;

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DatabaseAccessException("Falha ao consultar personagem.");
		}
	}
	
	public List<Personagem> findAllPersonagensById(long idArtista) throws DatabaseAccessException {
		
		String sql = "select * from T_BTTF_PERSONAGEM where ID_ARTISTA = ?";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
		
		) {

			stmt.setLong(1, idArtista);
			
			ResultSet rs = stmt.executeQuery();
			
			List<Personagem> personagens = new ArrayList<Personagem>();


			while (rs.next()) {
				
				Personagem personagem = new Personagem();
				Artista artista = new Artista();
				
				personagem.setIdPersonagem(rs.getLong("id_personagem"));
				artista.setIdArtista(rs.getLong("id_artista"));
				personagem.setNome(rs.getString("nm_personagem"));
				personagem.setDataNascimento(rs.getDate("dt_nascimento").toLocalDate());
				personagem.setDescricao(rs.getString("ds_personagem"));
				
				personagens.add(personagem);
                
			}
			
			rs.close();
			return personagens;

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DatabaseAccessException("Falha ao consultar todos os personagens associados ao artista.");
		}
	}

}
