import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class RuangKeamanan extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RuangKeamanan frame = new RuangKeamanan();
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
	public RuangKeamanan() {
		setTitle("Keamanan Ruang Kelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKekokohan = new JLabel("Kekokohan");
		lblKekokohan.setBounds(10, 24, 78, 14);
		contentPane.add(lblKekokohan);
		
		JLabel lblKunciPintu = new JLabel("Kunci Pintu");
		lblKunciPintu.setBounds(10, 61, 78, 14);
		contentPane.add(lblKunciPintu);
		
		JLabel lblKunciJendela = new JLabel("Kunci Jendela");
		lblKunciJendela.setBounds(10, 94, 89, 14);
		contentPane.add(lblKunciJendela);
		
		JLabel lblBahaya = new JLabel("Bahaya");
		lblBahaya.setBounds(10, 129, 46, 14);
		contentPane.add(lblBahaya);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new RuangKenyamanan().setVisible(true);
				dispose();
			}
		});
		btnPrevious.setBounds(10, 168, 89, 23);
		contentPane.add(btnPrevious);
		
		JButton btnNext = new JButton("Finish");
		btnNext.setBounds(280, 168, 89, 23);
		contentPane.add(btnNext);
		
		textField = new JTextField();
		textField.setBounds(108, 21, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(108, 58, 128, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 91, 128, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(108, 126, 128, 20);
		contentPane.add(textField_3);
		
		JLabel lblKokohtidakKokoh = new JLabel("Kokoh/Tidak Kokoh");
		lblKokohtidakKokoh.setBounds(250, 24, 133, 14);
		contentPane.add(lblKokohtidakKokoh);
		
		JLabel lblAdatidakAda = new JLabel("Ada/Tidak Ada");
		lblAdatidakAda.setBounds(246, 61, 97, 14);
		contentPane.add(lblAdatidakAda);
		
		JLabel label = new JLabel("Ada/Tidak Ada");
		label.setBounds(246, 94, 97, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Ada/Tidak Ada");
		label_1.setBounds(246, 129, 97, 14);
		contentPane.add(label_1);
	}

}
