package br.com.senai.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Canvas;

public class ViewListarRestaurante extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public ViewListarRestaurante() {
		setType(Type.UTILITY);
		setTitle("Gerenciar Restaurante - Listagem");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Filtros");
		lblNewLabel.setBounds(10, 41, 45, 14);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(30, 65, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(70, 60, 211, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Categoria");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(291, 65, 56, 13);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(357, 60, 128, 21);
		contentPane.add(comboBox);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(495, 18, 85, 26);
		contentPane.add(btnNovo);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(495, 57, 85, 26);
		contentPane.add(btnListar);
		
		JLabel lblNewLabel_3 = new JLabel("Restaurantes Encontrado ");
		lblNewLabel_3.setBounds(30, 88, 149, 16);
		contentPane.add(lblNewLabel_3);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(452, 309, 99, 26);
		contentPane.add(btnExcluir);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(343, 309, 99, 26);
		contentPane.add(btnEditar);
		
		JLabel lblNewLabel_4 = new JLabel("Ações");
		lblNewLabel_4.setBounds(334, 283, 55, 16);
		contentPane.add(lblNewLabel_4);
	}
}
