package calculadora.de.combustivel;

import Calculos.Consumo;

public class Principal {

    public static void main(String[] args) {
        
        Consumo con = new Consumo(500, 4.45, 10);
        con.Calculo();

        System.out.println("Valor total a ser gasto: R$" + con.getPrecoTotal());
        

    }
    
}
