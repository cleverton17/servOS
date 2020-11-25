package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;

public class Funcionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario frame = new Funcionario();
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
	public Funcionario() {
		setTitle("Ger\u00EAnciamento de Funcion\u00E1rios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio Logado");
		lblNewLabel.setBounds(10, 16, 89, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(103, 11, 414, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAdicionar = new JButton("");
		btnAdicionar.setIcon(new ImageIcon("C:\\Users\\Cleverton\\Downloads\\Serv_OSMinhaVersao2-20201125T141631Z-001\\Serv_OSMinhaVersao2\\image\\Add.png"));
		
		
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdicionar.setBounds(10, 182, 37, 51);
		contentPane.add(btnAdicionar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(143, 185, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(100, 188, 24, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setBounds(100, 222, 37, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(143, 216, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CPF");
		lblNewLabel_3.setBounds(239, 188, 24, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(276, 184, 110, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("RG");
		lblNewLabel_4.setBounds(396, 188, 24, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(431, 184, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("E-mail");
		lblNewLabel_5.setBounds(237, 222, 37, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(276, 219, 242, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Cleverton\\Downloads\\Serv_OSMinhaVersao2-20201125T141631Z-001\\Serv_OSMinhaVersao2\\image\\botao-editar.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(57, 182, 37, 51);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 60, 504, 111);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		table.setBounds(13, 11, 481, 87);
		panel.add(table);
		
		JLabel lblNewLabel_6 = new JLabel("Funcionarios Cadastrados");
		lblNewLabel_6.setBounds(202, 35, 157, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Cleverton\\Downloads\\Serv_OSMinhaVersao2-20201125T141631Z-001\\Serv_OSMinhaVersao2\\image\\excluir.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(10, 239, 86, 33);
		contentPane.add(btnNewButton_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(144, 249, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Nome");
		lblNewLabel_7.setBounds(98, 253, 36, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Id");
		lblNewLabel_8.setBounds(238, 255, 24, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(276, 250, 44, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
	}
}
