
import static org.junit.jupiter.api.Assertions.assertEquals;

import Calculos.Consumo;
import org.junit.jupiter.api.Test;

public class TestesMassas {
    
       Consumo con = new Consumo(500, 4.45, 10);
    
       
    @Test
    void TestesMassas() {
        
        
       con.Calculo();
        
        assertEquals(272.5, con.getPrecoTotal());
        
    }

}
   
