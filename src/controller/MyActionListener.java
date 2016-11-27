package controller;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import view.ApplicationLayout;


/**
 * @author yassir<br>
 * 
 *<strong>Description</strong><br>
 * 
 * MyActionListener est la classe qui gere tous les ActionEvents<br>
 * 
 *
 */

public class MyActionListener implements ActionListener
{

	
	/**
	 * ActionPerformed est surchargee.
	 * Elle effectue differentes Actions selon le type de retour de getsource().
	 */
	
	@Override
	public void actionPerformed(ActionEvent action) {
		
		if(action.getSource() == ApplicationLayout.button1) System.exit(0);
		
		else if(action.getSource() == ApplicationLayout.button2) JOptionPane.showMessageDialog(ApplicationLayout.fen, "Converter v1.0. Author Yassir Khaldi","About",JOptionPane.INFORMATION_MESSAGE);
		
		else if(action.getSource() == ApplicationLayout.r1)ApplicationLayout.cl.show(ApplicationLayout.fieldContainer, "Card1");
		
		else if(action.getSource() == ApplicationLayout.r2)ApplicationLayout.cl.show(ApplicationLayout.fieldContainer, "Card2");
		
		else if(action.getSource() == ApplicationLayout.r3)ApplicationLayout.cl.show(ApplicationLayout.fieldContainer, "Card3");
		
		
		//SI L'UTILISATEUR CHANGE LE BOX D'UN COTE ON REECRIT LE TEXT DU FIELD DE L'AUTRE COTE
		else if(action.getSource() == ApplicationLayout.card1.box1)			
		{
			
			ApplicationLayout.card1.f2.setText(ApplicationLayout.card1.f2.getText());
			
			//le code ci dessous sert a simuler un keyreleased pour activer le keylistener de field
			ApplicationLayout.card1.f2.requestFocusInWindow();
			try { 
			    Robot robot = new Robot(); 

			    robot.keyRelease(KeyEvent.VK_ENTER); 
			} catch (AWTException e) { 
			e.printStackTrace(); 
			} 
			
		}
		else if(action.getSource() == ApplicationLayout.card1.box2)			
		{

			ApplicationLayout.card1.f1.setText(ApplicationLayout.card1.f1.getText());
			
			//le code ci dessous sert a simuler un keyreleased pour activer le keylistener de field
			ApplicationLayout.card1.f1.requestFocusInWindow();
			try { 
			    Robot robot = new Robot(); 

			    robot.keyRelease(KeyEvent.VK_ENTER); 
			} catch (AWTException e) { 
			e.printStackTrace(); 
			} 
		}
		else if(action.getSource() == ApplicationLayout.card2.box1)			
		{

			ApplicationLayout.card2.f2.setText(ApplicationLayout.card2.f2.getText());
			
			//le code ci dessous sert a simuler un keyreleased pour activer le keylistener de field
			ApplicationLayout.card2.f2.requestFocusInWindow();
			try { 
			    Robot robot = new Robot(); 

			    robot.keyRelease(KeyEvent.VK_ENTER); 
			} catch (AWTException e) { 
			e.printStackTrace(); 
			} 
		}
		else if(action.getSource() == ApplicationLayout.card2.box2)			
		{

			ApplicationLayout.card2.f1.setText(ApplicationLayout.card2.f1.getText());
			
			//le code ci dessous sert a simuler un keyreleased pour activer le keylistener de field
			ApplicationLayout.card2.f1.requestFocusInWindow();
			try { 
			    Robot robot = new Robot(); 

			    robot.keyRelease(KeyEvent.VK_ENTER); 
			} catch (AWTException e) { 
			e.printStackTrace(); 
			} 
		}
		else if(action.getSource() == ApplicationLayout.card3.box1)			
		{

			ApplicationLayout.card3.f2.setText(ApplicationLayout.card3.f2.getText());
			
			//le code ci dessous sert a simuler un keyreleased pour activer le keylistener de field
			ApplicationLayout.card3.f2.requestFocusInWindow();
			try { 
			    Robot robot = new Robot(); 

			    robot.keyRelease(KeyEvent.VK_ENTER); 
			} catch (AWTException e) { 
			e.printStackTrace(); 
			} 
		}
		else if(action.getSource() == ApplicationLayout.card3.box2)			
		{

			ApplicationLayout.card3.f1.setText(ApplicationLayout.card3.f1.getText());
			
			//le code ci dessous sert a simuler un keyreleased pour activer le keylistener de field
			ApplicationLayout.card3.f1.requestFocusInWindow();
			try { 
			    Robot robot = new Robot(); 

			    robot.keyRelease(KeyEvent.VK_ENTER); 
			} catch (AWTException e) { 
			e.printStackTrace(); 
			} 
		}
	}
	
	
}
