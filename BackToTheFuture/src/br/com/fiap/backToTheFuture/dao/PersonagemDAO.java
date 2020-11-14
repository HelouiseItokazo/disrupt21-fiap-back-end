package br.com.fiap.backToTheFuture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.backToTheFuture.connectionFactory.ConnectionFactory;
import br.com.fiap.backToTheFuture.dao.generics.DAO;
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
		
		String sql = 

				"select  A.NM_ARTISTA,    " + 
				"        P.ID_PERSONAGEM, " + 
				"        P.NM_PERSONAGEM, " + 
				"        P.DT_NASCIMENTO, " + 
				"        P.DS_PERSONAGEM  " + 
				"from T_BTTF_ARTISTA A inner join T_BTTF_PERSONAGEM P " + 
				"on (A.ID_ARTISTA = P.ID_ARTISTA)";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
						
		) {

			List<Personagem> personagens = new ArrayList<Personagem>();
			
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Personagem personagem = new Personagem();
				
				personagem.setIdPersonagem(rs.getLong("id_personagem"));				
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
	public Personagem findById(long id) throws DatabaseAccessException {
		
		String sql = 
				
				"select  A.NM_ARTISTA,    " + 
				"        P.ID_PERSONAGEM, " + 
				"        P.NM_PERSONAGEM, " + 
				"        P.DT_NASCIMENTO, " + 
				"        P.DS_PERSONAGEM  " + 
				"from T_BTTF_ARTISTA A inner join T_BTTF_PERSONAGEM P " + 
				"on (A.ID_ARTISTA = P.ID_ARTISTA) " + 
				"where P.ID_ARTISTA = ?";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
		
		) {

			stmt.setLong(1, id);
			
			ResultSet rs = stmt.executeQuery();

			Personagem personagem = new Personagem();

			while (rs.next()) {
				
				personagem.setIdPersonagem(rs.getLong("id_personagem"));	
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

}
