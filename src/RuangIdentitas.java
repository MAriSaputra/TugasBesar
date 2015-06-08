import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.awt.ScrollPane;
import javax.swing.JSeparator;


public class RuangIdentitas extends JFrame {
	IdentitasRuangKelas identitas = new IdentitasRuangKelas();
	private JPanel contentPane;
	private JTextField TextNamaRuang;
	private JTextField TextLokasiRuang;
	private JTextField TextFakultas;
	private JTextField TextJurusan;
	private JLabel lblNewLabel;
	private JLabel lblJurusan;
	private JButton btnSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RuangIdentitas frame = new RuangIdentitas();
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
	public RuangIdentitas() {
		setBackground(Color.BLACK);
		setForeground(Color.BLACK);
		setFont(new Font("Times New Roman", Font.BOLD, 12));
		setTitle("Identitas Ruang Kelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextNamaRuang = new JTextField();
		TextNamaRuang.setBounds(110, 11, 130, 20);
		contentPane.add(TextNamaRuang);
		TextNamaRuang.setColumns(10);
		
		TextLokasiRuang = new JTextField();
		TextLokasiRuang.setBounds(110, 42, 130, 20);
		contentPane.add(TextLokasiRuang);
		TextLokasiRuang.setColumns(10);
		
		TextFakultas = new JTextField();
		TextFakultas.setBounds(110, 73, 130, 20);
		contentPane.add(TextFakultas);
		TextFakultas.setColumns(10);
		
		TextJurusan = new JTextField();
		TextJurusan.setBounds(110, 104, 130, 20);
		contentPane.add(TextJurusan);
		TextJurusan.setColumns(10);
		
		JLabel lblNamaRuang = new JLabel("Nama Ruang");
		lblNamaRuang.setBounds(20, 14, 95, 14);
		contentPane.add(lblNamaRuang);
		
		JLabel lblLokasiRuang = new JLabel("Lokasi Ruang");
		lblLokasiRuang.setBounds(20, 45, 95, 14);
		contentPane.add(lblLokasiRuang);
		
		lblNewLabel = new JLabel("Fakultas");
		lblNewLabel.setBounds(20, 76, 69, 14);
		contentPane.add(lblNewLabel);
		
		lblJurusan = new JLabel("Jurusan");
		lblJurusan.setBounds(20, 111, 69, 14);
		contentPane.add(lblJurusan);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(206, 147, 89, 23);
		contentPane.add(btnNext);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				identitas.setNamaRuang(TextNamaRuang.getText());
				identitas.setLokasiRuang(TextLokasiRuang.getText());
				identitas.setFakultas(TextFakultas.getText());
				identitas.setJurusan(TextJurusan.getText());
				SaveLoad.simpanidentitas(identitas);
			}
		});
		btnSave.setBounds(20, 135, 69, 32);
		contentPane.add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IdentitasRuangKelas identitas= SaveLoad.bacaidentitas();
				TextNamaRuang.setText(identitas.getNamaRuang());
				TextLokasiRuang.setText(identitas.getLokasiRuang());
				TextFakultas.setText(identitas.getFakultas());
				TextJurusan.setText(identitas.getJurusan());
			}
		});
		btnLoad.setBounds(99, 135, 69, 32);
		contentPane.add(btnLoad);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new RuangKondisi().setVisible(true);
				dispose();
				
			}
		});
	}
}
