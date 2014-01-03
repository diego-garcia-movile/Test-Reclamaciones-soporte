/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;

        
/**
 *
 * @author educacionit
 */
public class Teoria {

    
    public static void main(String[] args) {
//        //Calculadora
//        Scanner teclado = new Scanner(System.in);
//        
//        //Ingreso de datos
//        System.out.print("n1= ");
//        double n1 = teclado.nextDouble();
//
//        System.out.print("n2= ");
//        double n2 = teclado.nextDouble();
//
//        //Operacion aritmética
//        System.out.print("1_Suma 2_Resta 3_Producto 4_Division: ");
//        int opcion = teclado.nextInt();
//        
//        //Switch
//        switch (opcion) {
//            case 1:
//                System.out.println("n1+n2 = " + (n1 + n2));
//                break;
//            case 2:
//                System.out.println("n1-n2 = " + (n1 - n2));
//                break;
//            case 3:
//                System.out.println("n1*n2 = " + (n1 * n2));
//                break;
//            case 4:
//                System.out.println("n1/n2 = " + (n1 / n2));
//                break;
//            default:
//                System.out.println("Opcion incorrecta!! :(");
//                break;
//        }
        
        
        //break vs continue
        for (int i = 1; i < 100000; i++) {
            System.out.println("Antes: " + i);
            if (i == 2) {
                continue;
            }
            if (i == 3) {
                break;
            }
            System.out.println("Despues: " + i);
        }

        

        
        
        
        
        
        
        
        }
}

