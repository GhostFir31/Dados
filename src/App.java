import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
    App app = new App();

     app.juegoDados();

    }


public void juegoDados(){

int opcion;

Scanner leer=new Scanner(System.in);

Dado dado = new Dado(0, 0);
do{
    
System.out.println("1. Generar aleatoriamente 1 dado");

System.out.println("2. Generar aleatoriamente 5 dados");

System.out.println("3. Fin");

opcion=leer.nextInt();

switch(opcion){
case 1:
      dado.generarDado();
      System.out.println(" "+dado.toString());
      break;
case 2:
       dado.generarCincoDados();
break;
case 3:System.out.println("Salir");
        break;
default:System.out.println("Opcion no valida");
}
}while(opcion!=3);
}
}
