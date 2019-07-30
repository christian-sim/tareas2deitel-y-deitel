/*//////////////////////////////////////////////////////////////////
*NOMBRE:CHRISTIAN SIMBAÑA
*CARRERA:ANALISIS DE SISTEMAS 
*ASIGNATURA:PROGRAMACION VISUAL II
*NOM.PROFESOR:FERNANDO SOLIS
*TEMA:suma de datos flotantes
*FECHA:28/7/2019
7.16 Escriba una aplicación que utilice una instrucción for mejorada
para sumar los valores double que se pasan mediante los argumentos 
de linea de comandos. [Sugerencia: Use el método static parseDouble 
de la clase Double para convertir un String en un valor double).
Solución:
 *///////////////////////////////////////////////////////////////
package pkg7.pkg16;

import java.util.Scanner;

public class Aplicativo {
    
    
public static void main(String args []){
Scanner lee = new Scanner (System.in);
int numero;
double Arreglo[];

System.out.println("ingrese el tamano del arreglo ");
numero = lee.nextInt();
Arreglo = new double [numero];    

for(int i = 0 ; i < Arreglo.length ; i++){
    System.out.println("Ingrese valores foltantes al arreglo   " +(i+1));
    Arreglo[i] = lee.nextDouble();
}
Ingresos sum = new Ingresos();
 
   double res = sum.Sumar(Arreglo);
  System.out.println("\n La suma total es : " +res);
}}
