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
	KeamananRuangKelas keamanan = new KeamananRuangKelas();
	private JPanel contentPane;
	private JTextField Kokoh;
	private JTextField KunciPintu;
	private JTextField KunciJendela;
	private JTextField Bahaya;

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
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				keamanan.setKekokohan(Kokoh.getText());
				keamanan.setKunciPintu(KunciPintu.getText());
				keamanan.setKunciJendela(KunciJendela.getText());
				keamanan.setBahaya(Bahaya.getText());
			}
		});
		btnFinish.setBounds(280, 168, 89, 23);
		contentPane.add(btnFinish);
		
		Kokoh = new JTextField();
		Kokoh.setBounds(108, 21, 128, 20);
		contentPane.add(Kokoh);
		Kokoh.setColumns(10);
		
		KunciPintu = new JTextField();
		KunciPintu.setColumns(10);
		KunciPintu.setBounds(108, 58, 128, 20);
		contentPane.add(KunciPintu);
		
		KunciJendela = new JTextField();
		KunciJendela.setColumns(10);
		KunciJendela.setBounds(108, 91, 128, 20);
		contentPane.add(KunciJendela);
		
		Bahaya = new JTextField();
		Bahaya.setColumns(10);
		Bahaya.setBounds(108, 126, 128, 20);
		contentPane.add(Bahaya);
		
		JLabel lblKokohtidakKokoh = new JLabel("Kokoh/Tidak Kokoh");
		lblKokohtidakKokoh.setBounds(246, 24, 133, 14);
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
