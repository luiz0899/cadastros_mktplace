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
			
		}

}
