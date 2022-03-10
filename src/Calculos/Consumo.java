package Calculos;


public class Consumo {
    
    private int Distancia;
    private double precoGasolina;
    private double ConsumoCarroKm;
    private double CombustivelNecessario;
    private double valorTotal;

    public Consumo(int Distancia, double precoGasolina, double ConsumoCarroKm) {
        this.Distancia = Distancia;
        this.precoGasolina = precoGasolina;
        this.ConsumoCarroKm = ConsumoCarroKm;
       
    }
    
    public double Calculo(){
        
        this.CombustivelNecessario = Distancia/ConsumoCarroKm;
        
        valorTotal = CombustivelNecessario * precoGasolina;
        
        return valorTotal;
    }
    
    
    
    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    public double getPrecoGasolina() {
        return precoGasolina;
    }

    public void setPrecoGasolina(double precoGasolina) {
        this.precoGasolina = precoGasolina;
    }

    public double getConsumoCarro() {
        return ConsumoCarroKm;
    }

    public void setConsumoCarro(double ConsumoCarro) {
        this.ConsumoCarroKm = ConsumoCarro;
    }

    public double getPrecoTotal() {
        return valorTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.valorTotal = precoTotal;
    }

    public double getConsumoCarroKm() {
        return ConsumoCarroKm;
    }

    public void setConsumoCarroKm(double ConsumoCarroKm) {
        this.ConsumoCarroKm = ConsumoCarroKm;
    }

    public double getCombustivelNecessario() {
        return CombustivelNecessario;
    }

    public void setCombustivelNecessario(double CombustivelNecessario) {
        this.CombustivelNecessario = CombustivelNecessario;
    }
    
    
    
}
