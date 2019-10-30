package isro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1219, 699);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setForeground(Color.YELLOW);
		lblAbout.setBounds(519, 56, 79, 40);
		lblAbout.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		contentPane.add(lblAbout);
		
		JTextArea txtrThisProjectIs = new JTextArea();
		txtrThisProjectIs.setEditable(false);
		txtrThisProjectIs.setBackground(Color.BLACK);
		txtrThisProjectIs.setForeground(Color.WHITE);
		txtrThisProjectIs.setBounds(20, 109, 1175, 127);
		txtrThisProjectIs.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		txtrThisProjectIs.setLineWrap(true);
		txtrThisProjectIs.setText("This project is an attempt to educate aspiring rocket scientists and space researchers upon the latest news regarding ISRO. ISRO undergoes a number of rocket launches employing the use of several different rockets each having their specific range, payload capacity, target destination, etc. This program compiles a list of these launches and displays it to the user. This leads to hands on access to valuable data.");
		contentPane.add(txtrThisProjectIs);
		
		JTextArea txtrHrishikeshAvanoorHimanshu = new JTextArea();
		txtrHrishikeshAvanoorHimanshu.setBackground(Color.BLACK);
		txtrHrishikeshAvanoorHimanshu.setForeground(Color.WHITE);
		txtrHrishikeshAvanoorHimanshu.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		txtrHrishikeshAvanoorHimanshu.setText("Hrishikesh Avanoor-9076083004\r\nHimanshu Sanklecha-9423602381\r\nIshaan Khetan-8879864733\r\nHruturaj Babar-7506301492");
		txtrHrishikeshAvanoorHimanshu.setBounds(941, 556, 254, 96);
		contentPane.add(txtrHrishikeshAvanoorHimanshu);
		
		JLabel lblAboutIsro = new JLabel("About ISRO");
		lblAboutIsro.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		lblAboutIsro.setForeground(Color.YELLOW);
		lblAboutIsro.setBackground(Color.BLACK);
		lblAboutIsro.setBounds(10, 232, 167, 40);
		contentPane.add(lblAboutIsro);
		
		JTextArea txtrIndiaDecidedTo = new JTextArea();
		txtrIndiaDecidedTo.setEditable(false);
		txtrIndiaDecidedTo.setLineWrap(true);
		txtrIndiaDecidedTo.setText("India decided to go to space when Indian National Committee for Space Research (INCOSPAR) was set up by the Government of India in 1962. With the visionary Dr Vikram Sarabhai at its helm, INCOSPAR set up the Thumba Equatorial Rocket Launching Station (TERLS) in Thiruvananthapuram for upper atmospheric research.\r\n\r\nIndian Space Research Organisation, formed in 1969, superseded the erstwhile INCOSPAR. Vikram Sarabhai, having identified the role and importance of space technology in a Nation's development, provided ISRO the necessary direction to function as an agent of development. ISRO then embarked on its mission to provide the Nation space based services and to develop the technologies to achieve the same independently.\r\n\r\n");
		txtrIndiaDecidedTo.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		txtrIndiaDecidedTo.setForeground(Color.WHITE);
		txtrIndiaDecidedTo.setBackground(Color.BLACK);
		txtrIndiaDecidedTo.setBounds(10, 281, 1208, 265);
		contentPane.add(txtrIndiaDecidedTo);
	}
}
