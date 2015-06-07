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
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JTextField textPassword;

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
		
		textUsername = new JTextField();
		textUsername.setBounds(106, 21, 126, 20);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setColumns(10);
		textPassword.setBounds(106, 74, 126, 20);
		contentPane.add(textPassword);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					File data = new File("LogIn.txt");
					FileReader read = new FileReader(data);
					BufferedReader reader = new BufferedReader(read);
					
					String readFile = null;
					while((readFile = reader.readLine()) != null){
						if(readFile.contains(textUsername.getText()) && readFile.contains(textPassword.getText())){
							JOptionPane.showMessageDialog(null, "Login Success", "Information",JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						else{
							JOptionPane.showMessageDialog(null, "Maaf, Anda Belum Terdaftar", "",JOptionPane.WARNING_MESSAGE);
							break;
						}
					}
					
					reader.close();
				}catch(java.io.FileNotFoundException err){
					JOptionPane.showMessageDialog(null, "Maaf, Data Anda Tidak Di Temukan, \nDiharapkan Mendaftar Terlebih Dahulu", "Kesalahan",JOptionPane.WARNING_MESSAGE);
				}catch(IOException err){
					JOptionPane.showMessageDialog(null, "Maaf, Terjadi Kesalahan", "Kesalahan",JOptionPane.WARNING_MESSAGE);
				}
				
			}
			
		});
		btnLogin.setBounds(227, 126, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Signin().setVisible(true);
				dispose();
			}
		});
		btnSignIn.setBounds(65, 126, 89, 23);
		contentPane.add(btnSignIn);
	}
}


