package br.com.senai.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import java.awt.Dialog.ModalExclusionType;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMenu frame = new ViewMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewMenu() {
		setAutoRequestFocus(false);
		setBackground(UIManager.getColor("List.dropCellBackground"));
		setType(Type.UTILITY);
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Arial", Font.PLAIN, 14));
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 573, 23);
		contentPane.add(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		menuBar.add(mnCadastros);
		
		JMenuItem btnCadastro = new JMenuItem("Cadastros");
		mnCadastros.add(btnCadastro);
		
		JMenuItem btnRestaurante = new JMenuItem("Restaurantes");
		mnCadastros.add(btnRestaurante);
		
		JMenu config = new JMenu("Configuração");
		config.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(config);
		
		JMenuItem btnHorarios = new JMenuItem("Horarios");
		btnHorarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ViewCadastroHorarios view = new ViewCadastroHorarios();
				view.setVisible(true);
				
			}
		});
		config.add(btnHorarios);
		
		JMenu Sair = new JMenu("Sair");
		menuBar.add(Sair);
		
		JMenuItem btnSair = new JMenuItem("Sair");
		Sair.add(btnSair);
		
		setLocationRelativeTo(null);

	}
}
