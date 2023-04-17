import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;

public class Dado {

private int cantidadCaras;

private int caraPresente;

public Dado(int cantidadCaras,int caraPresente){

    this.cantidadCaras=cantidadCaras;

    this.caraPresente=caraPresente;

}

public Dado generarDado(){

 Random numeroRandom = new Random();

 HashMap <Integer,Integer> cantidadCarasDado = new HashMap<>();

 cantidadCarasDado.put(1,6);
 cantidadCarasDado.put(2,12);    

 cantidadCaras=cantidadCarasDado.get(numeroRandom.nextInt(2)+1);

 caraPresente=numeroRandom.nextInt(cantidadCaras)+1;

 return new Dado(cantidadCaras,caraPresente);
 
}

public void generarCincoDados(){

Dado dado = new Dado(0, 0);

ArrayList <Dado> llavero = new ArrayList<>();
for(int i=0;i<5;i++){
dado= dado.generarDado();

llavero.add(dado);

System.out.println(" "+dado.toString());

}

}

public int getcantidadCaras(){

return cantidadCaras;

}

public int getcaraPresente(){

    return caraPresente;

}

public String toString(){

return "Dado No.Caras "+getcantidadCaras()+" Cara mostrada "+getcaraPresente();

}
    
}
