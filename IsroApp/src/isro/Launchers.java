package isro;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class Launchers extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launchers frame = new Launchers();
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
	public Launchers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1351, 794);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel homeimg = new JLabel("New label");
		homeimg.setBackground(Color.BLACK);
		homeimg.setBounds(10, 50, 503, 335);
		contentPane.add(homeimg);
		Image img5=new ImageIcon(this.getClass().getResource("/launcher_1.jpg")).getImage();
		homeimg.setIcon(new ImageIcon(img5));
		
		JLabel lblLaunchers = new JLabel("Launchers");
		lblLaunchers.setForeground(Color.YELLOW);
		lblLaunchers.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblLaunchers.setBounds(540, 10, 279, 42);
		contentPane.add(lblLaunchers);
		
		JTextArea txtrLaunchersOrLaunch = new JTextArea();
		txtrLaunchersOrLaunch.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		txtrLaunchersOrLaunch.setForeground(Color.WHITE);
		txtrLaunchersOrLaunch.setBackground(Color.BLACK);
		txtrLaunchersOrLaunch.setEditable(false);
		txtrLaunchersOrLaunch.setLineWrap(true);
		txtrLaunchersOrLaunch.setText("Launchers or Launch Vehicles are used to carry spacecraft to space. India has two operational launchers: Polar Satellite Launch Vehicle (PSLV) and Geosynchronous Satellite Launch Vehicle (GSLV). GSLV with indigenous Cryogenic Upper Stage has enabled the launching up to 2 tonne class of communication satellites. The next variant of GSLV is GSLV Mk III, with indigenous high thrust cryogenic engine and stage, having the capability of launching 4 tonne class of communication satellites.\r\n\r\nIn order to achieve high accuracy in placing satellites into their orbits, a combination of accuracy, efficiency, power and immaculate planning are required. ISRO's Launch Vehicle Programme spans numerous centres and employs over 5,000 people. Vikram Sarabhai Space Centre, located in Thiruvananthapuram, is responsible for the design and development of launch vehicles. Liquid Propulsion Systems Centre and ISRO Propulsion Complex, located at Valiamala and Mahendragiri respectively, develop the liquid and cryogenic stages for these launch vehicles. Satish Dhawan Space Centre, SHAR, is the space port of India and is responsible for integration of launchers. It houses two operational launch pads from where all GSLV and PSLV flights take place.\r\n");
		txtrLaunchersOrLaunch.setBounds(523, 50, 793, 294);
		contentPane.add(txtrLaunchersOrLaunch);
		
		JLabel lblPslv = new JLabel("PSLV");
		lblPslv.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblPslv.setBounds(40, 436, 46, 13);
		contentPane.add(lblPslv);
		
		JLabel lblGslv = new JLabel("GSLV");
		lblGslv.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblGslv.setBounds(627, 436, 46, 13);
		contentPane.add(lblGslv);
		
		JLabel lblNewLabel = new JLabel("Sounding Rockets");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(1071, 428, 146, 28);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrPolarSatelliteLaunch = new JTextArea();
		txtrPolarSatelliteLaunch.setLineWrap(true);
		txtrPolarSatelliteLaunch.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		txtrPolarSatelliteLaunch.setForeground(Color.WHITE);
		txtrPolarSatelliteLaunch.setBackground(Color.BLACK);
		txtrPolarSatelliteLaunch.setText("Polar Satellite Launch Vehicle was developed to launch Low Earth \r\nOrbit satellites into Polar and Sun Synchronous Orbits\r\n. It has since proved its versatility by launching Geosynchronous, Lunar and Interplanetary spacecraft successfully.");
		txtrPolarSatelliteLaunch.setBounds(0, 459, 245, 176);
		contentPane.add(txtrPolarSatelliteLaunch);
		
		JLabel pslvimg = new JLabel("");
		pslvimg.setBounds(254, 459, 200, 200);
		contentPane.add(pslvimg);
		Image img56=new ImageIcon(this.getClass().getResource("/PSLV.jpg")).getImage();
		pslvimg.setIcon(new ImageIcon(img56));
		
		JLabel gslvimg = new JLabel("");
		gslvimg.setBounds(719, 459, 200, 200);
		contentPane.add(gslvimg);
		Image img75=new ImageIcon(this.getClass().getResource("/GSLV.jpg")).getImage();
		gslvimg.setIcon(new ImageIcon(img75));
		
		JTextArea txtrGeosynchronousSatelliteLaunch = new JTextArea();
		txtrGeosynchronousSatelliteLaunch.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		txtrGeosynchronousSatelliteLaunch.setForeground(Color.WHITE);
		txtrGeosynchronousSatelliteLaunch.setBackground(Color.BLACK);
		txtrGeosynchronousSatelliteLaunch.setText("Geosynchronous Satellite Launch Vehicle was developed to launch the heavier INSAT class of Geosynchronous satellites into orbit. In its third and final stage, GSLV uses the indigenously developed Cryogenic Upper Stage.\r\n");
		txtrGeosynchronousSatelliteLaunch.setLineWrap(true);
		txtrGeosynchronousSatelliteLaunch.setBounds(464, 459, 245, 226);
		contentPane.add(txtrGeosynchronousSatelliteLaunch);
		
		JTextArea txtrIsroLaunchesSmaller = new JTextArea();
		txtrIsroLaunchesSmaller.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		txtrIsroLaunchesSmaller.setForeground(Color.WHITE);
		txtrIsroLaunchesSmaller.setBackground(Color.BLACK);
		txtrIsroLaunchesSmaller.setLineWrap(true);
		txtrIsroLaunchesSmaller.setText("ISRO launches smaller rockets from the Rohini series on suborbital and atmospheric flights for aeronomy and meteorological studies. ATV, ISRO's heaviest sounding rocket, can be used for microgravity experiments and for precursor experiments to characterise new technologies.");
		txtrIsroLaunchesSmaller.setBounds(953, 459, 183, 252);
		contentPane.add(txtrIsroLaunchesSmaller);
		
		JLabel srimg = new JLabel("");
		srimg.setBounds(1137, 459, 200, 200);
		contentPane.add(srimg);
		Image img85=new ImageIcon(this.getClass().getResource("/SR.jpg")).getImage();
		srimg.setIcon(new ImageIcon(img85));
	}
}