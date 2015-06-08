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


public class RuangLingkungan extends JFrame {
	LingkunganRuangKelas lingkungan = new LingkunganRuangKelas();
	private JPanel contentPane;
	private JTextField Lantai;
	private JTextField Dinding;
	private JTextField Atap;
	private JTextField Pintu;
	private JTextField Jendela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RuangLingkungan frame = new RuangLingkungan();
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
	public RuangLingkungan() {
		setTitle("Lingkungan Ruangan Kelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKondisiLantai = new JLabel("Kondisi Lantai");
		lblKondisiLantai.setBounds(10, 11, 83, 14);
		contentPane.add(lblKondisiLantai);
		
		JLabel lblKondisiDinding = new JLabel("Kondisi Dinding");
		lblKondisiDinding.setBounds(10, 36, 102, 14);
		contentPane.add(lblKondisiDinding);
		
		JLabel lblKondisiAtap = new JLabel("Kondisi Atap");
		lblKondisiAtap.setBounds(10, 61, 102, 14);
		contentPane.add(lblKondisiAtap);
		
		JLabel lblKondisiPintu = new JLabel("Kondisi Pintu");
		lblKondisiPintu.setBounds(10, 86, 102, 14);
		contentPane.add(lblKondisiPintu);
		
		JLabel lblKondisiJendela = new JLabel("Kondisi Jendela");
		lblKondisiJendela.setBounds(10, 111, 102, 14);
		contentPane.add(lblKondisiJendela);
		
		Lantai = new JTextField();
		Lantai.setBounds(122, 8, 86, 20);
		contentPane.add(Lantai);
		Lantai.setColumns(10);
		
		Dinding = new JTextField();
		Dinding.setBounds(122, 33, 86, 20);
		contentPane.add(Dinding);
		Dinding.setColumns(10);
		
		Atap = new JTextField();
		Atap.setBounds(122, 58, 86, 20);
		contentPane.add(Atap);
		Atap.setColumns(10);
		
		Pintu = new JTextField();
		Pintu.setBounds(122, 83, 86, 20);
		contentPane.add(Pintu);
		Pintu.setColumns(10);
		
		Jendela = new JTextField();
		Jendela.setBounds(122, 108, 86, 20);
		contentPane.add(Jendela);
		Jendela.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new RuangKebersihan().setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(240, 148, 89, 23);
		contentPane.add(btnNext);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new RuangSarana().setVisible(true);
				dispose();
			}
		});
		btnPrevious.setBounds(10, 148, 89, 23);
		contentPane.add(btnPrevious);
		
		JLabel lblBersihkotor = new JLabel("Bersih/Kotor");
		lblBersihkotor.setBounds(223, 11, 89, 14);
		contentPane.add(lblBersihkotor);
		
		JLabel label = new JLabel("Bersih/Kotor");
		label.setBounds(223, 36, 89, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Bersih/Kotor");
		label_1.setBounds(223, 61, 89, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Bersih/Kotor");
		label_2.setBounds(223, 86, 89, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Bersih/Kotor");
		label_3.setBounds(223, 111, 89, 14);
		contentPane.add(label_3);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lingkungan.setKondisiLantai(Lantai.getText());
				lingkungan.setKondisiDinding(Dinding.getText());
				lingkungan.setKondisiAtap(Atap.getText());
				lingkungan.setKondisiJendela(Jendela.getText());
				lingkungan.setKondisiPintu(Pintu.getText());
			}
		});
		btnSave.setBounds(118, 144, 102, 41);
		contentPane.add(btnSave);
	}

}
