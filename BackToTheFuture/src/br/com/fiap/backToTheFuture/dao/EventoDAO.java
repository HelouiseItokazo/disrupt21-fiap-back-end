package br.com.fiap.backToTheFuture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.backToTheFuture.connectionFactory.ConnectionFactory;
import br.com.fiap.backToTheFuture.dao.generics.DAO;
import br.com.fiap.backToTheFuture.domain.Evento;
import br.com.fiap.backToTheFuture.exception.ConnectionException;
import br.com.fiap.backToTheFuture.exception.DatabaseAccessException;
import br.com.fiap.backToTheFuture.helper.DateHelper;

public class EventoDAO implements DAO<Evento> {

	private final Connection conn;

	public EventoDAO() throws ClassNotFoundException, ConnectionException {
		this.conn = new ConnectionFactory().getConnection();
	}

	@Override
	public List<Evento> findAll() throws DatabaseAccessException {
		
		String sql = "select * from T_EVENTO";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
		
		) {

			List<Evento> eventos = new ArrayList<Evento>();
			
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Evento evento = new Evento();

				evento.setIdEvento(rs.getLong("id_evento"));
				evento.setDataEvento(rs.getDate("dt_evento").toLocalDate());
				evento.setDescricao(rs.getString("ds_evento"));
				evento.setLocal(rs.getString("ds_local_evento"));
				evento.setViagemNoTempo(rs.getInt("fl_viagem_tempo"));

				eventos.add(evento);
			}
			
			rs.close();
			return eventos;

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DatabaseAccessException("Falha ao consultar todos os eventos.");
		}
	}

	@Override
	public Evento findById(long idPersonagem) throws DatabaseAccessException {
		
		String sql = 
				
				"select  E.ID_EVENTO, 	   " + 
				"        E.DT_EVENTO,      " + 
				"        E.DS_EVENTO,      " + 
				"        E.DS_LOCAL_EVENTO, " +
				"	     E.FL_VIAGEM_TEMPO " +
				"from T_BTTF_EVENTO E inner join T_BTTF_PERSONAGEM_EVENTO PE " + 
				"on (E.ID_EVENTO = PE.ID_EVENTO) " + 
				"inner join T_BTTF_PERSONAGEM P " + 
				"on (P.ID_PERSONAGEM = PE.ID_PERSONAGEM) " + 
				"where PE.ID_PERSONAGEM =? ";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
		
		) {

			stmt.setLong(1, idPersonagem);
			
			ResultSet rs = stmt.executeQuery();
			
			Evento evento = new Evento();

			while (rs.next()) {
				
				evento.setIdEvento(rs.getLong("id_evento"));				
				evento.setDataEvento(rs.getDate("dt_evento").toLocalDate());
				evento.setDescricao(rs.getString("ds_evento"));
				evento.setLocal(rs.getString("ds_local_evento"));
				evento.setViagemNoTempo(rs.getInt("fl_viagem_tempo"));
			}
			
			rs.close();
			return evento;

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DatabaseAccessException("Falha ao consultar todos eventos associados ao personagem.");
		}

	}
	
	public List<Evento> findAllById(long idPersonagem) throws DatabaseAccessException {
		
		String sql = 
				
				"select  E.ID_EVENTO, 	   " + 
				"        E.DT_EVENTO,      " + 
				"        E.DS_EVENTO,      " + 
				"        E.DS_LOCAL_EVENTO, " + 
				"	     E.FL_VIAGEM_TEMPO " +
				"from T_BTTF_EVENTO E inner join T_BTTF_PERSONAGEM_EVENTO PE " + 
				"on (E.ID_EVENTO = PE.ID_EVENTO) " + 
				"inner join T_BTTF_PERSONAGEM P " + 
				"on (P.ID_PERSONAGEM = PE.ID_PERSONAGEM) " + 
				"where PE.ID_PERSONAGEM =? ";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
		
		) {

			stmt.setLong(1, idPersonagem);
			
			ResultSet rs = stmt.executeQuery();
			
			List<Evento> eventos = new ArrayList<Evento>();	

			while (rs.next()) {
				
				Evento evento = new Evento();
				
				evento.setIdEvento(rs.getLong("id_evento"));				
				evento.setDataEvento(rs.getDate("dt_evento").toLocalDate());
				evento.setDescricao(rs.getString("ds_evento"));
				evento.setLocal(rs.getString("ds_local_evento"));
				evento.setViagemNoTempo(rs.getInt("fl_viagem_tempo"));
				
				eventos.add(evento);
			}
			
			rs.close();
			return eventos;

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DatabaseAccessException("Falha ao consultar todos eventos associados ao personagem.");
		}

	}
	
	public List<Evento> findAllByDateAndFlag(LocalDate startDate, LocalDate endDate, Integer viagemNoTempo, Long idPersonagem) throws DatabaseAccessException {
		 
		String sql = 
				
				"SELECT * " +
				"FROM T_BTTF_EVENTO E " +
				"INNER JOIN T_BTTF_PERSONAGEM_EVENTO PE " +
				"ON (E.ID_EVENTO = PE.ID_EVENTO) " +
				"WHERE E.DT_EVENTO BETWEEN TO_DATE ('" + DateHelper.toText(startDate) + "', 'dd/MM/yyyy')AND TO_DATE ('" + DateHelper.toText(endDate) + "', 'dd/MM/yyyy') " +
				"AND E.FL_VIAGEM_TEMPO =? " +
				"AND PE.ID_PERSONAGEM =? ORDER BY E.DT_EVENTO ASC";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
		
		) {
			
			stmt.setInt(1, viagemNoTempo);
			stmt.setLong(2, idPersonagem);
			
			ResultSet rs = stmt.executeQuery();
			
			List<Evento> eventos = new ArrayList<Evento>();			
			
			while (rs.next()) {
				
				Evento evento = new Evento();
				
				evento.setIdEvento(rs.getLong("id_evento"));				
				evento.setDataEvento(rs.getDate("dt_evento").toLocalDate());
				evento.setDescricao(rs.getString("ds_evento"));
				evento.setLocal(rs.getString("ds_local_evento"));
				evento.setViagemNoTempo(rs.getInt("fl_viagem_tempo"));
				
				eventos.add(evento);
			}
			
			rs.close();
			return eventos;
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DatabaseAccessException("Falha ao consultar todos eventos associados a data.");
		}
		
	}

}
