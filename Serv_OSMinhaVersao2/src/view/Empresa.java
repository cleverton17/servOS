package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Empresa extends JFrame {

	private JPanel contentPaneInformacoes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empresa frame = new Empresa();
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
	public Empresa() {
		setTitle("Dados da Empresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 331);
		contentPaneInformacoes = new JPanel();
		contentPaneInformacoes.setBackground(Color.LIGHT_GRAY);
		contentPaneInformacoes.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPaneInformacoes);
		contentPaneInformacoes.setLayout(null);
		
		JPanel panelInformacoes = new JPanel();
		panelInformacoes.setBounds(9, 26, 473, 205);
		panelInformacoes.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPaneInformacoes.add(panelInformacoes);
		panelInformacoes.setLayout(null);
		
		JLabel lblNomeEmpresa = new JLabel("Nome:");
		lblNomeEmpresa.setBounds(4, 11, 39, 24);
		panelInformacoes.add(lblNomeEmpresa);
		
		JLabel lblCnpj = new JLabel("Cnpj:");
		lblCnpj.setBounds(4, 46, 31, 23);
		panelInformacoes.add(lblCnpj);
		
		JLabel lblFoneEmpresa = new JLabel("Fone:");
		lblFoneEmpresa.setBounds(4, 80, 31, 23);
		panelInformacoes.add(lblFoneEmpresa);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(4, 114, 39, 23);
		panelInformacoes.add(lblEmail);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(4, 148, 60, 23);
		panelInformacoes.add(lblEndereco);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(69, 11, 393, 24);
		panelInformacoes.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(69, 46, 394, 23);
		panelInformacoes.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(69, 80, 394, 23);
		panelInformacoes.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(69, 114, 394, 23);
		panelInformacoes.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_5.setBounds(70, 145, 394, 23);
		panelInformacoes.add(panel_5);
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setBounds(4, 182, 31, 23);
		panelInformacoes.add(lblCep);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6.setBounds(71, 174, 394, 23);
		panelInformacoes.add(panel_6);
		
		JLabel lblNewLabel = new JLabel("Dados Cadastrados");
		lblNewLabel.setBounds(211, 6, 117, 14);
		contentPaneInformacoes.add(lblNewLabel);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(263, 236, 217, 23);
		btnSair.setToolTipText("Voltar ao Menu Principal");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPaneInformacoes.add(btnSair);
		
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.setBounds(9, 236, 217, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPaneInformacoes.add(btnNewButton);
		
		JButton btnSalvar = new JButton("");
		// new ImageImageIcon = imageIcon Icon();
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\Cleverton\\Downloads\\Serv_OSMinhaVersao2-20201125T141631Z-001\\Serv_OSMinhaVersao2\\image\\disquete.png"));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSalvar.setBounds(233, 236, 23, 25);
		contentPaneInformacoes.add(btnSalvar);
	}
}
