package isro;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
	

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public Main() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception{
		frame = new JFrame();
		frame.setBounds(100, 100, 569, 336);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("1\r\n2\r\n3\r\n4\r\n5");
		textPane.setBounds(317, 133, -108, 103);
		frame.getContentPane().add(textPane);
		String country[]={"Chandrayaan1","Chandrayaan2","Mangalyaan1","Gaganyaan","Mangalyaan2"};     
		
		JList list = new JList();
		list.setBackground(Color.BLACK);
		list.setBounds(384, 122, -38, 52);
		frame.getContentPane().add(list);
		
		JComboBox comboBoxLaunch = new JComboBox(country);
		comboBoxLaunch.setEditable(true);
		comboBoxLaunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBoxLaunch.setBounds(52, 70, 440, 25);
		frame.getContentPane().add(comboBoxLaunch);
		
		JButton btnLaunch = new JButton("Launch");
		btnLaunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MissionDetails m1=null;
				try {
					m1 = new MissionDetails((String) comboBoxLaunch.getSelectedItem());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				m1.setVisible(true);
			}
		});
		btnLaunch.setBounds(204, 148, 99, 26);
		frame.getContentPane().add(btnLaunch);
		
		JLabel lblEnterMissionName = new JLabel("Enter Mission Name");
		lblEnterMissionName.setBounds(52, 27, 204, 16);
		frame.getContentPane().add(lblEnterMissionName);
		
		JButton ExitBtn = new JButton("Exit");
		ExitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ExitBtn.setBounds(370, 148, 99, 26);
		frame.getContentPane().add(ExitBtn);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnBrowse = new JMenu("Browse");
		menuBar.add(mnBrowse);
		
		JMenuItem mntmBrowseMissions = new JMenuItem("Browse Missions");
		mnBrowse.add(mntmBrowseMissions);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAbout = new JMenuItem("About ");
		mnNewMenu_1.add(mntmAbout);
	}
}