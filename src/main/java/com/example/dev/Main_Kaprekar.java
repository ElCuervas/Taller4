/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package com.example.dev;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8


import java.io.CharArrayReader;
import java.util.Arrays;

public class Main_Kaprekar {

public static void main(String[] args){
    int res = kaprekarOp(3524);
    System.out.println(res);
}

/*este metodo pasa las primeras 4 pruebas
  Su implementacion fue hecha en la rama ftr_Operation1
*/
public static int kaprekarOp(int number){

    int[] digitos = new int[4];

    //convierte el entero a arreglo
    int i = digitos.length - 1;
    while (number > 0) {
        digitos[i] = number%10;
        number = number / 10;
        i--;
    }

    //ordena de mayor a menor los numeros del arreglo
    for (int l = 0; l < digitos.length-1; l++) {
        for (int j = l+1; j < digitos.length ; j++) {
            if (digitos[j]>digitos[l]){
                int aux = digitos[j];
                digitos[j] = digitos[l];
                digitos[l] = aux;
            }
        }
    }

    //guarda los dos numeros en orden inverso
    int mayor = digitos[0]*1000 + digitos[1]*100 + digitos[2]*10 + digitos[3];
    int menor =  digitos[3]*1000 + digitos[2]*100 + digitos[1]*10 + digitos[0];

    return mayor-menor;
}

}
