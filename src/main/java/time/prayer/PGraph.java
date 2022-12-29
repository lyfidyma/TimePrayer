package time.prayer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PGraph extends JFrame implements IGraph{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PGraph() throws Exception {
		JFrame jFrm1 =  new JFrame("Horaires de prières");
		//jFrm1.setTitle();
		jFrm1.setSize(250, 250);
		jFrm1.setLayout(null);
		jFrm1.setLocationRelativeTo(null);
		jFrm1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jFrm1.setResizable(false);

		Timeclass monheure = new Timeclass();	

		JLabel jLab1 = new JLabel("Date civile : "+monheure.getGrDate());
		jLab1.setBounds(35, 5, 200, 20);
		JLabel jLab2 = new JLabel("Date hégire : "+monheure.getHijradate().substring(19));
		jLab2.setBounds(55, 25, 200, 20);

		Horaire hr = new Horaire();

		JLabel jLab3 = new JLabel("Fajr         : "+hr.getFajrhour());
		jLab3.setBounds(5, 45, 200, 20);
		JLabel jLab4 = new JLabel("Soubh    : "+hr.getSoubhhour());
		jLab4.setBounds(5, 65, 200, 20);
		JLabel jLab5 = new JLabel("Dhouhr  : "+hr.dhouhrhour);
		jLab5.setBounds(5, 85, 200, 20);
		JLabel jLab6 = new JLabel("Asr         : "+hr.getAsrhour());
		jLab6.setBounds(5, 105, 200, 20);
		JLabel jLab7 = new JLabel("Maghrib : "+hr.maghribhour);
		jLab7.setBounds(5, 125, 200, 20);
		JLabel jLab8 = new JLabel("Icha        : "+hr.ichahour);
		jLab8.setBounds(5, 145, 200, 20);

		//Container c = jFrm1.getContentPane();
		//	Icon icon = new ImageIcon("C:Users/dell/Desktop/m.gif");

		JLabel jLab9 = new JLabel();
		jLab9.setIcon(new ImageIcon("mosque.jpg"));
		//Dimension size = jLab9.getPreferredSize();
		jLab9.setBounds(2, 2, 240, 240);

		//c.add(jLab9);
		jFrm1.add(jLab1);
		jFrm1.add(jLab2);
		jFrm1.add(jLab3);
		jFrm1.add(jLab4);
		jFrm1.add(jLab5);
		jFrm1.add(jLab6);
		jFrm1.add(jLab7);
		jFrm1.add(jLab8);
		jFrm1.add(jLab9);
		jFrm1.setVisible(true);

	}

	//@Override
	public void PGraphic() {
		// TODO Auto-generated method stub
		//System.out.println("ok");
	}


}
