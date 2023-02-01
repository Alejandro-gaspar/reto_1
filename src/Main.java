import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                String operation;
            Scanner leer=new Scanner(System.in);
            System.out.print("tipo de operacion: ");
            operation=leer.nextLine();
            int dato1 ;
            int dato2 ;
            Scanner num=new Scanner(System.in);
            System.out.print("operando 1: ");
            dato1=num.nextInt();
            Scanner nume=new Scanner(System.in);
            System.out.print("operando 2: ");
            dato2=nume.nextInt();
                switch (operation) {
                    case "suma":
                        System.out.println(dato1 + "+" + dato2 + "= " + (dato2 + dato1));
                        break;
                    case "multiplicacion":
                        System.out.println(dato1 + "*" + dato2 + "= " + (dato1 * dato2));
                        break;
                    case "divicion":
                        System.out.println(dato1 + "/" + dato2 + "= " + (dato1 / dato2));
                        break;
                    case "resta":
                        System.out.println(dato1 + "-" + dato2 + "= " + (dato1 - dato2));
                        break;
                    default:   System.out.println("Operación no soportada");
                }
        }
}