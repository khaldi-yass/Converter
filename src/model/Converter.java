package model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * 
 * Contient une seule methode valable dans tous les cas
 * 
 */
public class Converter {


	/**
	 * <strong>Description</strong><br>
	 * Cette méthode prend 4 arguments:<br>
	 * <strong>num:</strong> le numéro a convertir<br>
	 * <strong>index:</strong> on le multiplie toujours par le nombre<br>
	 * <strong>optional:</strong> on l'additionne toujours avec le nombre<br>
	 * <strong>num:</strong> si true : inverse le processus de conversion<br>
	 * 
	 * @param num
	 * @param index
	 * @param optional
	 * @param reverse
	 * @return String
	 */
	public static String convert(double num, double index, double optional,boolean reverse)
	{
		//Le code ci dessous concerne le formatage des valeurs retournes,le but est d'avoir des valeurs approches au 10^-3
		DecimalFormat myFormat= new DecimalFormat("#.###");		//Creation d'un objet decimalformat qui permet le formattage des valeurs decimales
		myFormat.setRoundingMode(RoundingMode.CEILING);			//mettre le rounding mode en valeur approchee par exces
		
		//----------------------------------------------------
		
		if (!reverse)
		{
			String result =myFormat.format((num*index)+optional);
			result=result.replace(',', '.');						//pour remplacer les virgules generes
			return result;
		}
		else
		{
			String result =myFormat.format((num-optional)/index);
			result=result.replace(',', '.');						//pour remplacer les virgules generes
			return result;
		}
	}
}
