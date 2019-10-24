package isro;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
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
import java.awt.Font;
import java.awt.Image;


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
		frame.setBackground(Color.BLACK);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 600, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("1\r\n2\r\n3\r\n4\r\n5");
		textPane.setBounds(317, 133, -108, 103);
		frame.getContentPane().add(textPane);
		String country[]={"Chandrayaan 1","Chandrayaan 2","Mangalyaan","Gaganyaan","ASTROSAT"};     
		
		JList list = new JList();
		list.setBackground(Color.BLACK);
		list.setBounds(384, 122, -38, 52);
		frame.getContentPane().add(list);
		
		JComboBox comboBoxLaunch = new JComboBox(country);
		comboBoxLaunch.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		comboBoxLaunch.setForeground(Color.BLACK);
		comboBoxLaunch.setBackground(Color.WHITE);
		comboBoxLaunch.setEditable(true);
		comboBoxLaunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBoxLaunch.setBounds(62, 55, 440, 25);
		frame.getContentPane().add(comboBoxLaunch);
		
		JButton btnLaunch = new JButton("Launch");
		btnLaunch.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
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
		btnLaunch.setBounds(145, 143, 99, 26);
		frame.getContentPane().add(btnLaunch);
		
		JLabel lblEnterMissionName = new JLabel("Enter Mission Name");
		lblEnterMissionName.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblEnterMissionName.setForeground(Color.ORANGE);
		lblEnterMissionName.setBounds(95, 39, 204, 16);
		frame.getContentPane().add(lblEnterMissionName);
		
		JButton ExitBtn = new JButton("Exit");
		ExitBtn.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		ExitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ExitBtn.setBounds(400, 143, 99, 26);
		frame.getContentPane().add(ExitBtn);
		
		JLabel bkgimg = new JLabel("New label");
		bkgimg.setBounds(0, 0, 586, 277);
		frame.getContentPane().add(bkgimg);
		Image img=new ImageIcon(this.getClass().getResource("/login.jpg")).getImage();
		bkgimg.setIcon(new ImageIcon(img));
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnBrowse = new JMenu("Launchers");
		mnBrowse.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		menuBar.add(mnBrowse);
		
		JMenuItem mntmBrowseMissions = new JMenuItem("Launchers");
		mntmBrowseMissions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Launchers l1=new Launchers();
				l1.setVisible(true);
			}
		});
		mnBrowse.add(mntmBrowseMissions);
		
		JMenu mnNewMenu = new JMenu("Spacecraft");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Spacecraft s1=new Spacecraft();
				s1.setVisible(true);
			}
		});
		mnNewMenu.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmLaunch = new JMenuItem("launch");
		mntmLaunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Spacecraft s1=new Spacecraft();
				s1.setVisible(true);
			}
		});
		mnNewMenu.add(mntmLaunch);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		mnNewMenu_1.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAbout = new JMenuItem("About ");
		mnNewMenu_1.add(mntmAbout);
	}
}
