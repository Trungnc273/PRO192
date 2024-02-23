/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

/**
 *
 * @author TRUNG
 */
public class Complex 
{
	private double re, im;	 
	public String toString() { 
		return "(" + re + " + " + im + "i)"; 
	} 
	Complex(Complex c) { 
		re = c.re; 
		im = c.im; 
	} 
}
