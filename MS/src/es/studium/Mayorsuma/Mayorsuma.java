package es.studium.Mayorsuma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mayorsuma
{
	
//he modificado este archivo de Óscar Esteban Morillo
	
	public static void main(String[] args)throws NumberFormatException, IOException
	{
		int numero1, numero2, numero3, suma;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame el número 1");
		numero1=Integer.parseInt(lectura.readLine());
		System.out.println("Dame el número 2");
		numero2=Integer.parseInt(lectura.readLine());
		suma=numero1+numero2;
		do
		{
			//hola buenas tardes
			System.out.println("Dame el número 3:");
			numero3=Integer.parseInt(lectura.readLine());
		if(suma>=numero3)
		{
				suma=numero2+numero3;
				numero2=numero3;
		}
		}
		//Archivo modificado por Rafael Molino :)
		while(suma>=numero3);
	}
}
