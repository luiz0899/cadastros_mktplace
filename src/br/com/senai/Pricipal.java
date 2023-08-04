package br.com.senai;

import java.sql.Time;

import br.com.senai.core.dao.ManagerDb;
import br.com.senai.core.domain.Categoria;
import br.com.senai.core.domain.Endereco;
import br.com.senai.core.domain.Horario;
import br.com.senai.core.domain.Restaurante;
import br.com.senai.core.service.CategoriaService;
import br.com.senai.core.service.HorarioService;
import br.com.senai.view.ViewMenu;

public class Pricipal {
		
		public static void main(String[] args) {
			new ViewMenu().setVisible(true);
			

/*
		CategoriaService caService = new CategoriaService( );
		
		ManagerDb.getInstance().getConexao() ;
		
		//Categoria categoria = new Categoria(15);
		
		caService.removerPor(15);
		
		System.out.println("test ok"); 
		
		HorarioService horarioService = new HorarioService();
		
		Categoria categoria = new Categoria("saxsax");
		
		Endereco endereco = new Endereco("AsSaaS","AsAS","aSas","ascad" );
		
		Time horaAbertura = Time.valueOf("09:30:00");
		Time horaFechamento = Time.valueOf("12:30:00");

		
		Restaurante restaurante = new Restaurante(5,"AsSaaS", "AsSaaS", endereco, categoria);
		
		Horario horario = new Horario(""
				+ "Terca",horaAbertura, horaFechamento, restaurante);
		
	//	horarioService.salvar(horario);
		
		horarioService.removerPor(6);
	}*/
		}

}
