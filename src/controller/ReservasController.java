package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import modelo.Reserva;

public class ReservasController {
	private ReservaDAO reservaDAO;
	
	public ReservasController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.reservaDAO = new ReservaDAO(connection);
	}

	public void salvar( Reserva reserva ) {
		this.reservaDAO.salvar(reserva);
	}
	
	public List<Reserva>buscar() {
		return this.reservaDAO.buscar();
	}
	
	public List<Reserva> buscarId(String id) {
		return this.reservaDAO.buscarId(id);
	}
	
	public void atualizar(Date dataEntrada, Date dataSaida, String Valor, String formaPagamento, Integer id) {
		this.reservaDAO.atualizar(dataEntrada, dataSaida, Valor, formaPagamento, id);
	}
	
	public void deletar(Integer id) {
		this.reservaDAO.deletar(id);
	}
}
