package view;


import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * <strong>Description</strong><br>
 * Cette classe genere les cartes du centres qui ont tous le meme layout:<br>
 * 2 TextFields<br>
 * 2 ComboBox<br>
 * @author yassir
 *
 */

public class MyCardLayout extends JPanel{
	

	public JTextField f1;
	public JTextField f2;
	public JComboBox<String> box1;
	public JComboBox<String> box2;
	public String name;
	
	/**
	 * Constructeur de la classe
	 * @param n :Nom de la carte
	 * @param t1 :Tableau a inserer au JComboBox gauche
	 * @param t2 :Tableau a inserer au JComboBox droit
	 */
	
	public MyCardLayout(String n, String[] t1, String[] t2) {
		
		name=n;
		
		Font fieldfont= new Font("Serif", Font.BOLD, 18);
		Font boxfont= new Font("Serif", Font.BOLD, 16);
		//------------Field settings------------------
		f1= new JTextField();
		f2= new JTextField();
		box1= new JComboBox<String>(t1);
		box2= new JComboBox<String>(t2);
		
		f1.setFont(fieldfont);
		f2.setFont(fieldfont);
		box1.setFont(boxfont);
		box2.setFont(boxfont);
		box2.setSelectedIndex(1);
		box1.setPreferredSize(new Dimension(150,30));
		box2.setPreferredSize(new Dimension(150,30));
		f1.setPreferredSize(new Dimension(150,30));
		f2.setPreferredSize(new Dimension(150,30));
		
		this.add(box1);
		this.add(box2);
		this.add(f1);
		this.add(f2);
		//---------------------------------------------
	}
}
