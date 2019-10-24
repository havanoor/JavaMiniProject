package isro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextArea;
import java.awt.Color;

public class Spacecraft extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Spacecraft frame = new Spacecraft();
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
	public Spacecraft() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1275, 837);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIndianSpacecraft = new JLabel("INDIAN SPACECRAFT");
		lblIndianSpacecraft.setForeground(Color.YELLOW);
		lblIndianSpacecraft.setBounds(473, 10, 332, 41);
		lblIndianSpacecraft.setFont(new Font("Segoe UI Black", Font.BOLD, 26));
		contentPane.add(lblIndianSpacecraft);
		
		JLabel Commsatellite = new JLabel("Communication Satellite");
		Commsatellite.setForeground(Color.YELLOW);
		Commsatellite.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		Commsatellite.setBounds(55, 69, 227, 33);
		contentPane.add(Commsatellite);
		
		JLabel Earthobjsatellite = new JLabel("Earth Observation Satellite\r\n");
		Earthobjsatellite.setForeground(Color.YELLOW);
		Earthobjsatellite.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		Earthobjsatellite.setBounds(494, 63, 218, 41);
		contentPane.add(Earthobjsatellite);
		
		JLabel ScientificSpacecraft = new JLabel("Scientific Spacecraft");
		ScientificSpacecraft.setForeground(Color.YELLOW);
		ScientificSpacecraft.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		ScientificSpacecraft.setBounds(937, 74, 155, 22);
		contentPane.add(ScientificSpacecraft);
		
		JLabel Navsatellite = new JLabel("Navigation Satellite");
		Navsatellite.setForeground(Color.YELLOW);
		Navsatellite.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		Navsatellite.setBounds(55, 428, 155, 33);
		contentPane.add(Navsatellite);
		
		JLabel Experisatellite = new JLabel("Experimental Satellite");
		Experisatellite.setForeground(Color.YELLOW);
		Experisatellite.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		Experisatellite.setBounds(424, 433, 184, 23);
		contentPane.add(Experisatellite);
		
		JLabel SmallSatell = new JLabel("Small Satellite");
		SmallSatell.setForeground(Color.YELLOW);
		SmallSatell.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		SmallSatell.setBounds(762, 433, 140, 23);
		contentPane.add(SmallSatell);
		
		JLabel Studentsatellite = new JLabel("Student Satellite");
		Studentsatellite.setForeground(Color.YELLOW);
		Studentsatellite.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		Studentsatellite.setBounds(1038, 433, 140, 22);
		contentPane.add(Studentsatellite);
		
		JTextArea txtrSupportsTelecommunicationTelevision_1 = new JTextArea();
		txtrSupportsTelecommunicationTelevision_1.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		txtrSupportsTelecommunicationTelevision_1.setForeground(Color.WHITE);
		txtrSupportsTelecommunicationTelevision_1.setBackground(Color.BLACK);
		txtrSupportsTelecommunicationTelevision_1.setEditable(false);
		txtrSupportsTelecommunicationTelevision_1.setLineWrap(true);
		txtrSupportsTelecommunicationTelevision_1.setText("Supports telecommunication, television broadcasting, satellite news gathering, societal applications, weather forecasting, disaster warning and Search and Rescue operation services.");
		txtrSupportsTelecommunicationTelevision_1.setBounds(55, 256, 260, 139);
		contentPane.add(txtrSupportsTelecommunicationTelevision_1);
		
		JTextArea txtrSatellitesForNavigation = new JTextArea();
		txtrSatellitesForNavigation.setBackground(Color.BLACK);
		txtrSatellitesForNavigation.setForeground(Color.WHITE);
		txtrSatellitesForNavigation.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		txtrSatellitesForNavigation.setText("Satellites for navigation services to meet the emerging demands of the Civil Aviation requirements and to meet the user requirements of the positioning, navigation and timing based on the independent satellite navigation system. ");
		txtrSatellitesForNavigation.setLineWrap(true);
		txtrSatellitesForNavigation.setBounds(41, 637, 332, 145);
		contentPane.add(txtrSatellitesForNavigation);
		
		JTextArea txtrSupportsTelecommunicationTelevision = new JTextArea();
		txtrSupportsTelecommunicationTelevision.setBackground(Color.BLACK);
		txtrSupportsTelecommunicationTelevision.setForeground(Color.WHITE);
		txtrSupportsTelecommunicationTelevision.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		txtrSupportsTelecommunicationTelevision.setLineWrap(true);
		txtrSupportsTelecommunicationTelevision.setEditable(false);
		txtrSupportsTelecommunicationTelevision.setText("The largest civilian remote sensing satellite constellation in the world - thematic series of satellites supporting multitude of applications in the areas of land and water resources; cartography; and ocean & atmosphere.");
		txtrSupportsTelecommunicationTelevision.setBounds(445, 256, 332, 135);
		contentPane.add(txtrSupportsTelecommunicationTelevision);
		
		JTextArea txtrSpacecraftForResearch = new JTextArea();
		txtrSpacecraftForResearch.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		txtrSpacecraftForResearch.setBackground(Color.BLACK);
		txtrSpacecraftForResearch.setForeground(Color.WHITE);
		txtrSpacecraftForResearch.setLineWrap(true);
		txtrSpacecraftForResearch.setText("Spacecraft for research in areas like astronomy, astrophysics, planetary and earth sciences, atmospheric sciences and theoretical physics. ");
		txtrSpacecraftForResearch.setBounds(894, 256, 289, 102);
		contentPane.add(txtrSpacecraftForResearch);
		
		JTextArea txtrAHostOf = new JTextArea();
		txtrAHostOf.setForeground(Color.WHITE);
		txtrAHostOf.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		txtrAHostOf.setBackground(Color.BLACK);
		txtrAHostOf.setText("A host of small satellites mainly for the experimental purposes. These experiments include Remote Sensing, Atmospheric Studies, Payload Development, Orbit Controls, recovery technology etc..");
		txtrAHostOf.setLineWrap(true);
		txtrAHostOf.setBounds(424, 637, 263, 163);
		contentPane.add(txtrAHostOf);
		
		JTextArea txtrSubKg = new JTextArea();
		txtrSubKg.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		txtrSubKg.setBackground(Color.BLACK);
		txtrSubKg.setForeground(Color.WHITE);
		txtrSubKg.setLineWrap(true);
		txtrSubKg.setText("Sub 500 kg class satellites - a platform for stand-alone payloads for earth imaging and science missions within a quick turn around time. ");
		txtrSubKg.setBounds(762, 637, 155, 163);
		contentPane.add(txtrSubKg);
		
		JTextArea txtrIsrosStudentSatellite = new JTextArea();
		txtrIsrosStudentSatellite.setForeground(Color.WHITE);
		txtrIsrosStudentSatellite.setBackground(Color.BLACK);
		txtrIsrosStudentSatellite.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		txtrIsrosStudentSatellite.setText("ISRO's Student Satellite programme is envisaged to encourage various Universities and Institutions for the development of Nano/Pico Satellites.\r\n");
		txtrIsrosStudentSatellite.setLineWrap(true);
		txtrIsrosStudentSatellite.setBounds(1018, 637, 198, 145);
		contentPane.add(txtrIsrosStudentSatellite);
		
		JLabel commImg = new JLabel("New label");
		commImg.setForeground(Color.WHITE);
		commImg.setBackground(Color.BLACK);
		commImg.setBounds(110, 112, 160, 134);
		contentPane.add(commImg);
		Image img1=new ImageIcon(this.getClass().getResource("/communication.PNG")).getImage();
		commImg.setIcon(new ImageIcon(img1));
		
		
		JLabel EobsImg = new JLabel("New label");
		EobsImg.setBounds(514, 110, 149, 134);
		contentPane.add(EobsImg);
		Image img2=new ImageIcon(this.getClass().getResource("/earhobs.PNG")).getImage();
		EobsImg.setIcon(new ImageIcon(img2));
		
		JLabel ScienSpaceIMG = new JLabel("New label");
		ScienSpaceIMG.setBounds(991, 112, 122, 134);
		contentPane.add(ScienSpaceIMG);
		
		Image img3=new ImageIcon(this.getClass().getResource("/scientific.PNG")).getImage();
		ScienSpaceIMG.setIcon(new ImageIcon(img1));
		
		JLabel NavSatIMG = new JLabel("New label");
		NavSatIMG.setBounds(91, 482, 191, 134);
		contentPane.add(NavSatIMG);
		
		Image img4=new ImageIcon(this.getClass().getResource("/navigation.PNG")).getImage();
		NavSatIMG.setIcon(new ImageIcon(img4));
		
		JLabel EXPsatIMG = new JLabel("New label");
		EXPsatIMG.setBounds(440, 482, 129, 149);
		contentPane.add(EXPsatIMG);
		
		Image img5=new ImageIcon(this.getClass().getResource("/experimental.PNG")).getImage();
		EXPsatIMG.setIcon(new ImageIcon(img5));
		
		JLabel smallImg = new JLabel("New label");
		smallImg.setBounds(763, 482, 139, 134);
		contentPane.add(smallImg);
		
		Image img6=new ImageIcon(this.getClass().getResource("/small.PNG")).getImage();
		smallImg.setIcon(new ImageIcon(img6));
		
		JLabel studentImg = new JLabel("New label");
		studentImg.setBounds(1075, 482, 141, 134);
		contentPane.add(studentImg);
		
		Image img7=new ImageIcon(this.getClass().getResource("/student.PNG")).getImage();
		studentImg.setIcon(new ImageIcon(img7));
		
		//Database
		//Database
		/*String query=String.format("select id,small_description,COALESCE(img1,'') as img1 from spacecraft where id='%d' ",k)  ;
		System.out.println(query);
		Connection c1=DatabaseConnect.mkconnection() ;
		Statement st=c1.createStatement();
		ResultSet rs=st.executeQuery(query);*/
	}
}
