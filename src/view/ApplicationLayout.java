package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import controller.MyActionListener;
import controller.MyKeyListener;
import view.Window;

/**
 * @author yassir<br>
 * 
 * <strong>Description</strong><br>
 *
 * Cette classe constitue le Layout principale du programme<br>
 * 
 * Elle regroupe tous les composants + leurs associes les Listeners<br>
 * 
 * 
 *
 */
public class ApplicationLayout {
	
	
	public static Window fen;
	public static JPanel container;
	public static JPanel fieldContainer;
	public static JPanel buttonContainer;
	public static JPanel radioContainer;
	public static CardLayout cl;
	public static MyCardLayout card1;
	public static MyCardLayout card2;
	public static MyCardLayout card3;
	public static JButton button1;
	public static JButton button2;
	public static JRadioButton r1;
	public static JRadioButton r2;
	public static JRadioButton r3;
	
	public ApplicationLayout() {
		
		//-------------- Instancier les contenaires de base-----------
		fen	= new Window();										//Voir la classe Window
		container = new JPanel();
		fieldContainer = new JPanel();
		buttonContainer = new JPanel();
		radioContainer = new JPanel();
		//------------------------------------------

		
		//--------- Radios settings---------------
		r1= new JRadioButton("Temperature",true);
		r2= new JRadioButton("Longueur");
		r3= new JRadioButton("Masse");
		r1.setFont(new Font("Serif", Font.BOLD, 15));
		r2.setFont(new Font("Serif", Font.BOLD, 15));
		r3.setFont(new Font("Serif", Font.BOLD, 15));
		ButtonGroup bg= new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		radioContainer.add(r1);
		radioContainer.add(r2);
		radioContainer.add(r3);
		radioContainer.setPreferredSize(new Dimension(fen.getY(), 40));
		//------------------------------------------
		
		
		
		//---------- Buttons settings------------------
		button1	= new JButton("Fermer");
		button2	= new JButton("A propos");
		buttonContainer.add(button1);
		buttonContainer.add(button2);
		buttonContainer.setPreferredSize(new Dimension(fen.getY(), 40));
		//----------------------------------------------
		
		
		//----------- Card container settings-----------
		String[] tempT = {"Celsius","Kelvin","Fahrenheit"};
		String[] poidT = {"Kilogramme","Livre","Oz"};
		String[] longT = {"Metre","Yard","Pieds"};
		card1= new MyCardLayout("Temperature",tempT,tempT);		//Voir la classe MyCardLayout 
		card2= new MyCardLayout("Longueur",longT,longT);		//Voir la classe MyCardLayout 
		card3= new MyCardLayout("Masse",poidT,poidT);			//Voir la classe MyCardLayout 
		cl= new CardLayout();
		fieldContainer.setLayout(cl);
		fieldContainer.add(card1, "Card1");
		fieldContainer.add(card2, "Card2");
		fieldContainer.add(card3, "Card3");
		//----------------------------------------------
				
		
		//-----------MainContainer settings----------------
		container.setLayout(new BorderLayout());
		container.add(buttonContainer,BorderLayout.SOUTH);
		container.add(radioContainer,BorderLayout.NORTH);
		container.add(fieldContainer,BorderLayout.CENTER);
		//---------------------------------------------
				
		
		//--------------JFrame settings------------------
		
		fen.getContentPane().add(container);
		fen.visible();
		//------------------------------------------------
		
		
		//----------------Ajout des Listeners----------------
		
		/*
		 *  On a besoin de 2 types de listeners:
		 *  Action listeners: pour le boutons, radios et comboBoxes
		 *  Key Listeners: pour les texts fields
		 */
		
		MyActionListener al= new MyActionListener();				//Voir la classe MyActionListener
		MyKeyListener kl= new MyKeyListener();						//Voir la classe MyKeyListener
		
		button1.addActionListener(al);
		button2.addActionListener(al);
		r1.addActionListener(al);
		r2.addActionListener(al);
		r3.addActionListener(al);
		card1.box1.addActionListener(al);
		card1.box2.addActionListener(al);
		card2.box1.addActionListener(al);
		card2.box2.addActionListener(al);
		card3.box1.addActionListener(al);
		card3.box2.addActionListener(al);
		
		card1.f1.addKeyListener(kl);
		card1.f2.addKeyListener(kl);
		card2.f1.addKeyListener(kl);
		card2.f2.addKeyListener(kl);
		card3.f1.addKeyListener(kl);
		card3.f2.addKeyListener(kl);
		//------------------------------------------------
	}
		
}
