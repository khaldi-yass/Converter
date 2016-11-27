/**
 * @author yassir
 * 
 * MyKeyListener est la classe qui gere tous les KeyEvents;
 * 
 * Un KeyListener est ajoutee dans:
 * 
 * Card1.field1
 * Card1.field2
 * 
 * Card2.field1
 * Card2.field2
 * 
 * Card3.field1
 * Card3.field2
 * 
 */
package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import view.ApplicationLayout;
import view.MyCardLayout;
import model.Converter;


public class MyKeyListener extends KeyAdapter{

	/*
	 * DECLARATION DES CONSTANTES A UTILISER
	 */
	public static final double CELSIUS_TO_FAHRENHEIT_INDEX = 1.8;
	public static final double CELSIUS_TO_FAHRENHEIT_OPT = 32;
	public static final double CELSIUS_TO_KELVIN_INDEX = 1;
	public static final double CELSIUS_TO_KELVIN_OPT = 273.15;
	public static final double KELVIN_TO_FAHRENHEIT_INDEX = 1.8;
	public static final double KELVIN_TO_FAHRENHEIT_OPT = -459.67;
	public static final double KILO_TO_POUND_INDEX = 2.2046;
	public static final double KILO_TO_OZ_INDEX = 35.274;
	public static final double POUND_TO_OZ_INDEX = 16;
	public static final double METER_TO_FEET_INDEX = 3.2808;
	public static final double METER_TO_YARD_INDEX = 1.0936;
	public static final double YARD_TO_FEET_INDEX = 3;

	
	/**
	 * KeyReleased est utilisee pour ecouter les events
	 */
	
	@Override
	public void keyReleased(KeyEvent key) {
		
		/**
		 *  Card= card1
		 *  Sender= f1
		 *  Reciever = f2
		 */
		if((key.getSource() == ApplicationLayout.card1.f1)) 
		{
			process(ApplicationLayout.card1, ApplicationLayout.card1.f1, ApplicationLayout.card1.f2);
		}
		
		/**
		 *  Card= card1
		 *  Sender= f2
		 *  Reciever = f1
		 */
		else if((key.getSource() == ApplicationLayout.card1.f2))
		{
			process(ApplicationLayout.card1, ApplicationLayout.card1.f2, ApplicationLayout.card1.f1);
		}

		/**
		 *  Card= card2
		 *  Sender= f1
		 *  Reciever = f2
		 */
		else if((key.getSource() == ApplicationLayout.card2.f1))
		{
			process(ApplicationLayout.card2, ApplicationLayout.card2.f1, ApplicationLayout.card2.f2);
		}

		/**
		 *  Card= card2
		 *  Sender= f2
		 *  Reciever = f1
		 */
		
		else if((key.getSource() == ApplicationLayout.card2.f2))
		{
			process(ApplicationLayout.card2, ApplicationLayout.card2.f2, ApplicationLayout.card2.f1);
		}

		/**
		 *  Card= card3
		 *  Sender= f1
		 *  Reciever = f2
		 */
		else if((key.getSource() == ApplicationLayout.card3.f1))
		{
			process(ApplicationLayout.card3, ApplicationLayout.card3.f1, ApplicationLayout.card3.f2);
		}
		
		/**
		 *  Card= card3
		 *  Sender= f2
		 *  Reciever = f1
		 */
		else if((key.getSource() == ApplicationLayout.card3.f2))
		{
			process(ApplicationLayout.card3, ApplicationLayout.card3.f2, ApplicationLayout.card3.f1);
		}
	}
	
	
	
	/**
	 * <strong>Description</strong><br>
	 * Cette fonction est utilisee pour verifier si un String est un nombre numerique reel ou pas.
	 * @param str : le text a verifier
	 * @return
	 */
	public static boolean isDouble(String str)  
	{  
	  try  
	  {  
	    Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	/**
	 * <strong>Description</strong><br>
	 * 
	 * Cette fonction initialise les indexes utilises dans la classe {@link Converter.convert} selon le panel actuel (Temperature,Longueur,Masse)<br>
	 * Tous les cas y sont etudiés afin d'envoyer les constantes correctes a la classe Converter.
	 * @param card :Objet de type MyCardLayout
	 * @param sender :Objet de type JTextField envoie le text
	 * @param reciever :Objet de type JTextField recoie le text
	 */
	private void process(MyCardLayout card, JTextField sender, JTextField reciever)
	{
		
		double ind0_1=0;
		double ind0_2=0;
		double ind1_2=0;
		double opt0_1=0;
		double opt0_2=0;
		double opt1_2=0;
		
		if(card.name.equals("Temperature"))
		{
			//les constantes de la card1
			ind0_1=CELSIUS_TO_KELVIN_INDEX; //1.8
			opt0_1=CELSIUS_TO_KELVIN_OPT;	//32
			ind0_2=CELSIUS_TO_FAHRENHEIT_INDEX;		//1
			opt0_2=CELSIUS_TO_FAHRENHEIT_OPT;		//273.15
			ind1_2=KELVIN_TO_FAHRENHEIT_INDEX;	//1.8
			opt1_2=KELVIN_TO_FAHRENHEIT_OPT;	//32
		}
		else if(card.name.equals("Longueur"))
		{
			//les constantes de la card2
			ind0_1=METER_TO_YARD_INDEX;
			ind0_2=METER_TO_FEET_INDEX;
			ind1_2=YARD_TO_FEET_INDEX;
		}
		else if(card.name.equals("Masse"))
		{
			//les constantes de la card3
			ind0_1=KILO_TO_POUND_INDEX;
			ind0_2=KILO_TO_OZ_INDEX;
			ind1_2=POUND_TO_OZ_INDEX;		
		}
		
		String result;

		JComboBox<String> lBox= card.box1;			//On recupere le box 1
		JComboBox<String> rBox= card.box2;			//On recupere le box 2
		

		if(isDouble(sender.getText()))									//Si le sender contient un double numerique
		{
			double number= Double.parseDouble(sender.getText());		//on recupere le text du sender avec ParseDouble()
			
			if (lBox.getSelectedIndex() == rBox.getSelectedIndex())			//Si les 2 Comboboxes on la meme valeur
			{
				reciever.setText( sender.getText());						//Donc il y a rien a convertir
			}
			
			else 															//Sinon
			{
					
				switch (lBox.getSelectedIndex()) 
				{															//tester l'index du left box
				
				case 0:
						switch (rBox.getSelectedIndex()) 
						{													//tester l'index du right box
						case 1:
							if(sender == card.f1)
							{
								result = Converter.convert(number,ind0_1,opt0_1,false);
								reciever.setText(result);
							}
							else if(sender == card.f2)
							{
								result = Converter.convert(number,ind0_1,opt0_1,true);
								reciever.setText(result);
							}
							
							break;		//case 1 break	
						
						case 2:
							if(sender == card.f1)
							{
								result = Converter.convert(number,ind0_2,opt0_2,false);
								reciever.setText(result);
							}
							else if(sender == card.f2)
							{
								result = Converter.convert(number,ind0_2,opt0_2,true);
								reciever.setText(result);
							}
							
							break;		//case 2 break
							
						default:
							break;
						}
						
						break;			//case 0 break
						
				case 1:
					
					switch (rBox.getSelectedIndex()) 
					{															//tester l'index du right box
					case 0:
						if(sender == card.f1)
						{
							result = Converter.convert(number,ind0_1,opt0_1,true);
							reciever.setText(result);
						}
						else if(sender == card.f2)
						{
							result = Converter.convert(number,ind0_1,opt0_1,false);
							reciever.setText(result);
						}
						
						break;			//case 0 break
					
					case 2:
						if(sender == card.f1)
						{
							result = Converter.convert(number,ind1_2,opt1_2,false);
							reciever.setText(result);
						}
						else if(sender == card.f2)
						{
							result = Converter.convert(number,ind1_2,opt1_2,true);
							reciever.setText(result);
						}
						
						break;			//case 2 break
						
					default:
						break;
					}
					
					break;				//case 1 break
					
				case 2:
					switch (rBox.getSelectedIndex()) 
					{															//tester l'index du right box
					case 0:
						if(sender == card.f1)
						{
							result = Converter.convert(number,ind0_2,opt0_2,true);
							reciever.setText(result);
						}
						else if(sender == card.f2)
						{
							result = Converter.convert(number,ind0_2,opt0_2,false);
							reciever.setText(result);
						}
						break;		//case 0 break
					
					case 1:
						if(sender == card.f1)
						{
							result = Converter.convert(number,ind1_2,opt1_2,true);
							reciever.setText(result);
						}
						else if(sender == card.f2)
						{
							result = Converter.convert(number,ind1_2,opt1_2,false);
							reciever.setText(result);
						}
						
						break;		//case 1 break
						
					default:
						break;
					}
					
					break; 			//case 2 break

				default:
					break;
				} 								//fin du switch du left box	
				
			}									//fin sinon
		}										
		else									// sinon (le text dans le field 1 n'est pas un double numerique)	
		{
			sender.setText("");
			reciever.setText(""); 				//On force les fields a se vider
		}
	}
}
