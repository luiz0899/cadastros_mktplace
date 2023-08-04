package br.com.senai.view.componentes.table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.senai.core.domain.Horario;

public class TableModelHorarios extends AbstractTableModel {
	
private static final long serialVersionUID = 1L;
	
	private List<Horario> horarios;
	
	public TableModelHorarios( List<Horario> horarios) {
		this.horarios = horarios;
	}
	
	public Horario getPor(int rowIndex) {
		return horarios.get(rowIndex);
	}
	

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 0) {
			return "Dia da Semana";
		}else if (columnIndex == 1) {
			return "Abertura";
		}else if (columnIndex == 2) {
			return "Fechamento";
		}
		throw new IllegalArgumentException("Indice inválido");
	}
	
	@Override
	public int getRowCount() {
		return horarios.size();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Horario Restaurante = horarios.get(rowIndex);
		if (columnIndex == 0) {
			return Restaurante.getDiaDaSemana() ;
		}else if (columnIndex == 1) {
			return Restaurante.getHoraAbertura();
		}else if (columnIndex == 2) {
			return Restaurante.getHoraFechamento();
		}
		throw new IllegalArgumentException("Indice inválido");
	}
	public void removerPorId(int rowIndex) {
		this.horarios.remove(rowIndex);
	}
	
	public boolean Vazio() {
		return horarios.isEmpty();
	}


	
	

}
