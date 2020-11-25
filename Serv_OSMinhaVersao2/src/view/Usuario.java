package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

public class Usuario extends JFrame {

	private JPanel contentPanel;
	private JTextField textFieldInformacoes;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario frame = new Usuario();
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
	public Usuario() {
		setTitle("Ger\u00EAnciamento de Usu\u00E1rios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 339);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio Logado");
		lblNewLabel.setBounds(6, 13, 95, 14);
		contentPanel.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(11, 51, 449, 90);
		panel.setBackground(Color.GRAY);
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPanel.add(panel);
		panel.setLayout(null);
		
		textFieldInformacoes = new JTextField();
		textFieldInformacoes.setBackground(Color.BLACK);
		textFieldInformacoes.setForeground(Color.WHITE);
		textFieldInformacoes.setBounds(10, 11, 429, 68);
		panel.add(textFieldInformacoes);
		textFieldInformacoes.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(-84, 11, 80, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Painel de Informa\u00E7\u00F5es");
		lblNewLabel_1.setBounds(190, 31, 136, 14);
		contentPanel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(11, 157, 90, 44);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPanel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(179, 154, 133, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setBounds(134, 157, 35, 14);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setBounds(131, 187, 38, 14);
		contentPanel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 185, 133, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Redefinir Senha");
		rdbtnNewRadioButton.setBounds(322, 185, 120, 20);
		contentPanel.add(rdbtnNewRadioButton);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBounds(12, 253, 89, 44);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPanel.add(btnNewButton_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nome");
		rdbtnNewRadioButton_1.setBounds(114, 210, 62, 23);
		contentPanel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Todos");
		rdbtnNewRadioButton_2.setBounds(114, 229, 62, 23);
		contentPanel.add(rdbtnNewRadioButton_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(178, 211, 134, 21);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.setBounds(11, 206, 90, 44);
		contentPanel.add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Nome");
		lblNewLabel_4.setBounds(134, 266, 35, 19);
		contentPanel.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(179, 265, 136, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Id");
		lblNewLabel_5.setBounds(320, 157, 17, 14);
		contentPanel.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(336, 155, 30, 20);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(336, 265, 30, 20);
		contentPanel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Id");
		lblNewLabel_6.setBounds(322, 268, 21, 14);
		contentPanel.add(lblNewLabel_6);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(99, 11, 361, 16);
		contentPanel.add(textPane);
	}
}
