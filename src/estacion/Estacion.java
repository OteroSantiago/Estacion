/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacion;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Estacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int mes;
        Scanner ent = new Scanner (System.in);
	System.out.println("\n\tIntroduzca mes del año: ");
	mes=ent.nextInt();
	while(mes>=1 && mes<=12){
		switch (mes){
			case 12,1,2: System.out.println("\n\tINVIERNO");
			break;
			case 3,4,5: System.out.println("\n\tPRIMAVERA");
			break;
			case 6,7,8: System.out.println("\n\tVERANO");
			break;
			case 9,10,11: System.out.println("\n\tOTOÑO");
			break;
			default:
			break;
		}
		System.out.println("\n\tIntroduzca mes del año: ");
		mes=ent.nextInt();
    }
    
}
}
