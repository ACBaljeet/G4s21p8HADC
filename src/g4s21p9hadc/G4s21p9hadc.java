/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21p9hadc;

/**
 *
 * @author shack
 */
public class G4s21p9hadc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("numero de parametros " + args.length);
        for (int a=1; a<args.length ;a++)
            if(args.length!=3){
                System.out.println("Se deben proporcionar tres argumentos: numero uno operador numero dos");
                System.exit(0);
            }double num1 = Double.parseDouble(args[0]);
            String operador = args[1];
            double num2 = Double.parseDouble(args[2]);
            double resultado = 0;
            switch(operador){
                case "+":
                    resultado = num1 + num2;
                    System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + resultado);
                    break;               
                case "-":
                    resultado = num1 - num2;
                    System.out.println("La resta de " + num1 + " y " + num2 + " es igual a " + resultado);
                    break;               
                case "x":
                    resultado = num1 * num2;
                    System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + resultado);
                    break;
                case "/":
                    if (num2 == 0){
                        System.out.println("No se puede divivir por cero");
                    }else{
                        resultado = num1 / num2;
                        System.out.println("La division de " + num1 + " y " + num2 + " es igual a " + resultado);
                    }
                    break;
                default:
                    System.out.println("El operador " + operador + "no es valdio");                    
            }    
    }
    
}
