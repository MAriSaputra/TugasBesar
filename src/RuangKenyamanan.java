import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RuangKenyamanan extends JFrame {
	KenyamananRuangKelas kenyamanan = new KenyamananRuangKelas();
	private JPanel contentPane;
	private JTextField Bising;
	private JTextField Bau;
	private JTextField Bocor;
	private JTextField Rusak;
	private JTextField Aus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RuangKenyamanan frame = new RuangKenyamanan();
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
	public RuangKenyamanan() {
		setTitle("Kenyamanan Ruang Kelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKebisingan = new JLabel("Kebisingan");
		lblKebisingan.setBounds(10, 22, 70, 14);
		contentPane.add(lblKebisingan);
		
		JLabel lblBau = new JLabel("Bau");
		lblBau.setBounds(10, 52, 46, 14);
		contentPane.add(lblBau);
		
		JLabel lblKebocoran = new JLabel("Kebocoran");
		lblKebocoran.setBounds(10, 82, 70, 14);
		contentPane.add(lblKebocoran);
		
		JLabel lblKerusakan = new JLabel("Kerusakan");
		lblKerusakan.setBounds(10, 117, 70, 14);
		contentPane.add(lblKerusakan);
		
		JLabel lblKeausan = new JLabel("Keausan");
		lblKeausan.setBounds(10, 150, 70, 14);
		contentPane.add(lblKeausan);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new RuangKeamanan().setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(285, 189, 89, 23);
		contentPane.add(btnNext);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RuangKebersihan().setVisible(true);
				dispose();
			}
		});
		btnPrevious.setBounds(10, 189, 89, 23);
		contentPane.add(btnPrevious);
		
		Bising = new JTextField();
		Bising.setBounds(106, 19, 124, 20);
		contentPane.add(Bising);
		Bising.setColumns(10);
		
		Bau = new JTextField();
		Bau.setColumns(10);
		Bau.setBounds(106, 49, 124, 20);
		contentPane.add(Bau);
		
		Bocor = new JTextField();
		Bocor.setColumns(10);
		Bocor.setBounds(106, 79, 124, 20);
		contentPane.add(Bocor);
		
		Rusak = new JTextField();
		Rusak.setColumns(10);
		Rusak.setBounds(106, 114, 124, 20);
		contentPane.add(Rusak);
		
		Aus = new JTextField();
		Aus.setColumns(10);
		Aus.setBounds(106, 147, 124, 20);
		contentPane.add(Aus);
		
		JLabel lblYatidak = new JLabel("Ya/Tidak");
		lblYatidak.setBounds(253, 22, 64, 14);
		contentPane.add(lblYatidak);
		
		JLabel label = new JLabel("Ya/Tidak");
		label.setBounds(253, 52, 64, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Ya/Tidak");
		label_1.setBounds(253, 82, 64, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Ya/Tidak");
		label_2.setBounds(253, 117, 64, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Ya/Tidak");
		label_3.setBounds(253, 150, 64, 14);
		contentPane.add(label_3);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kenyamanan.setKebisingan(Bising.getText());
				kenyamanan.setBau(Bau.getText());
				kenyamanan.setKebocoran(Bocor.getText());
				kenyamanan.setKerusakan(Rusak.getText());
				kenyamanan.setKeausan(Aus.getText());
				SaveLoad.simpankenyamanan(kenyamanan);
			}
		});
		btnSave.setBounds(116, 183, 70, 34);
		contentPane.add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				KenyamananRuangKelas kenyamanan = SaveLoad.bacakenyamanan();
				Bising.setText(kenyamanan.getKebisingan());
				Bau.setText(kenyamanan.getBau());
				Bocor.setText(kenyamanan.getKebocoran());
				Rusak.setText(kenyamanan.getKerusakan());
				Aus.setText(kenyamanan.getKeausan());
				
			}
		});
		btnLoad.setBounds(210, 183, 65, 34);
		contentPane.add(btnLoad);
	}

}
