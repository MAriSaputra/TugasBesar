import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.FileReader;

import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField Username;
	private JPasswordField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	
	public Login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(10, 24, 96, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(10, 77, 96, 14);
		contentPane.add(lblPassword);
		
		Username = new JTextField();
		Username.setBounds(106, 21, 126, 20);
		contentPane.add(Username);
		Username.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
				if(Username.equals(Username)&&Password.equals(Password)){
					JOptionPane.showMessageDialog(null, "Anda, Berhasil Login");
					RuangIdentitas da =new RuangIdentitas();
					da.setVisible(true);
					dispose();
				}
					
				else{
					JOptionPane.showMessageDialog(null, "Maaf, Anda Gagal login");
				}
					}
				catch(Exception ed){
					JOptionPane.showMessageDialog(null, ed);
				}
				
				
			}
			
		});
		btnLogin.setBounds(227, 126, 89, 23);
		contentPane.add(btnLogin);
		
		Password = new JPasswordField();
		Password.setBounds(106, 74, 126, 20);
		contentPane.add(Password);
	}
}


