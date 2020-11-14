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
	public Evento findById(long id) throws DatabaseAccessException {
		
		String sql = 
				
				"select  E.ID_EVENTO, 	   " + 
				"        E.DT_EVENTO,      " + 
				"        E.DS_EVENTO,      " + 
				"        E.DS_LOCAL_EVENTO " + 
				"from T_BTTF_EVENTO E inner join T_BTTF_PERSONAGEM_EVENTO PE " + 
				"on (E.ID_EVENTO = PE.ID_EVENTO) " + 
				"inner join T_BTTF_PERSONAGEM P " + 
				"on (P.ID_PERSONAGEM = PE.ID_PERSONAGEM) " + 
				"where PE.ID_PERSONAGEM =? ";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
		
		) {

			stmt.setLong(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			Evento evento = new Evento();

			while (rs.next()) {
				
				evento.setIdEvento(rs.getLong("id_evento"));				
				evento.setDataEvento(rs.getDate("dt_evento").toLocalDate());
				evento.setDescricao(rs.getString("ds_evento"));
				evento.setLocal(rs.getString("ds_local_evento"));
			}
			
			rs.close();
			return evento;

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DatabaseAccessException("Falha ao consultar todos eventos associados ao personagem.");
		}

	}
	
	public List<Evento> findAllById(long id) throws DatabaseAccessException {
		
		String sql = 
				
				"select  E.ID_EVENTO, 	   " + 
				"        E.DT_EVENTO,      " + 
				"        E.DS_EVENTO,      " + 
				"        E.DS_LOCAL_EVENTO " + 
				"from T_BTTF_EVENTO E inner join T_BTTF_PERSONAGEM_EVENTO PE " + 
				"on (E.ID_EVENTO = PE.ID_EVENTO) " + 
				"inner join T_BTTF_PERSONAGEM P " + 
				"on (P.ID_PERSONAGEM = PE.ID_PERSONAGEM) " + 
				"where PE.ID_PERSONAGEM =? ";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
		
		) {

			stmt.setLong(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			List<Evento> eventos = new ArrayList<Evento>();	
			Evento evento = new Evento();

			while (rs.next()) {
				
				evento.setIdEvento(rs.getLong("id_evento"));				
				evento.setDataEvento(rs.getDate("dt_evento").toLocalDate());
				evento.setDescricao(rs.getString("ds_evento"));
				evento.setLocal(rs.getString("ds_local_evento"));
				
				eventos.add(evento);
			}
			
			rs.close();
			return eventos;

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DatabaseAccessException("Falha ao consultar todos eventos associados ao personagem.");
		}

	}
	
	public List<Evento> findAllByDateAndFlag(LocalDate startDate, LocalDate endDate, Integer viagemNoTempo) throws DatabaseAccessException {
		
		String sql = 
				
				"select * from T_BTTF_EVENTO where DT_EVENTO " +
				"between to_date('" + DateHelper.toText(startDate) + "', 'DD/MM/YYYY') " +
				"and to_date('" + DateHelper.toText(endDate) + "', 'DD/MM/YYYY') " +
				"and fl_viagem_tempo =?";
		
		try (
				conn;
				PreparedStatement stmt = this.conn.prepareStatement(sql)
		
		) {
			
			stmt.setInt(1, viagemNoTempo);
			
			ResultSet rs = stmt.executeQuery();
			
			List<Evento> eventos = new ArrayList<Evento>();			
			Evento evento = new Evento();
			
			while (rs.next()) {
				
				evento.setIdEvento(rs.getLong("id_evento"));
				evento.setDataEvento(rs.getDate("dt_evento").toLocalDate());
				evento.setDescricao(rs.getString("ds_evento"));
				evento.setLocal(rs.getString("ds_local_evento"));
				
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
