package view;
import javax.swing.JFrame;

/**
 * <strong>Description</strong><br>
 * Cette class genere une nouvelle fenetre avec des parametres automatique<Br>
 * Utile pour ne pas reecrire le meme code plusieurs fois<br>

 * <strong>Autres options</strong><br>
 * 
 * setLocation(int x, int y); //Location a l'ecran<br>
 * 
 * setResizable(boolean b); //Empecher redimentionnement<br>
 * 
 * setAlwaysOnTop(boolean b); //Premier plan<br>
 * 
 * setUndecorated(boolean b);<br>
 * 
 */
public class Window extends JFrame
{	
	/**
	 * Le constructeur par defaut de la classe
	 */
	public Window()
	{
		setTitle("Converter 1.0");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	/**
	 * Constructeur avec arguments
	 * @param w : largeur de fenetre
	 * @param h : hauteur de fenetre
	 * @param t : titre de la fenetre
	 */
	public Window(int w, int h, String t)
	{
		setTitle(t);
		setSize(w,h);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);;
	}
	
	
	/**
	 * Methode appele a la fin du Layout pour afficher la JFrame<br>
	 * Cette methode doit etre appelee a la fin du programme
	 */
	public void visible() 
	{
		setVisible(true);
	}
	
	
	
}