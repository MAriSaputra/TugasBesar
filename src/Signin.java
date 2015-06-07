import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Signin extends JFrame {

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
					Signin frame = new Signin();
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
	public Signin() {
		setTitle("SIGN IN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(10, 34, 89, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(10, 83, 103, 14);
		contentPane.add(lblPassword);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(247, 164, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try{
						if(textUsername.getText().equals("") && textPassword.getText().equals("")){
							JOptionPane.showMessageDialog(null, "Tidak Boleh Ada Yang Kosong", "Kesalahan",JOptionPane.WARNING_MESSAGE);
							
						}else{
							BufferedWriter writer = new BufferedWriter(new FileWriter("SignIn.txt", true));
							
							writer.write(textUsername.getText() + " " + textPassword.getText());
							writer.newLine();
							writer.close();
							
							new Login().setVisible(true);
							dispose();
							JOptionPane.showMessageDialog(null, "Anda Terdaftar", "Info", JOptionPane.INFORMATION_MESSAGE);
						}
					}catch(Exception err){
						JOptionPane.showMessageDialog(null, "Terjadi Kesalahan", "Perhatian", JOptionPane.WARNING_MESSAGE);
					}
			}
		});
		btnSignIn.setBounds(107, 164, 89, 23);
		contentPane.add(btnSignIn);
		
		textUsername = new JTextField();
		textUsername.setBounds(109, 31, 124, 20);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setBounds(107, 80, 126, 20);
		contentPane.add(textPassword);
		textPassword.setColumns(10);
	}

}
