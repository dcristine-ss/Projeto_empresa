
package model;

import javax.swing.JOptionPane;


public class Restaurante extends Empresa {
    private String tipoComida;
    private float PrecoMedio;
    
    public Restaurante(){
        this ("","","","","","","",(float)0.0);
    }
    
    public Restaurante (String nome, String endereco, String cidade, String estado, String cep,
          String telefone, String tipoComida, float PrecoMedio){
        this.tipoComida = tipoComida;
        this.PrecoMedio = PrecoMedio;
        
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public float getPrecoMedio() {
        return PrecoMedio;
    }

    public void setPrecoMedio(float PrecoMedio) {
        this.PrecoMedio = PrecoMedio;
    }
    @Override
    public void leitura (){
        super.leitura();
        setTipoComida(JOptionPane.showInputDialog("Digite o tipo de comida:"));
        setPrecoMedio(Float.parseFloat(JOptionPane.showInputDialog("Digite o estado:")));
    }
    public void imprimir(){
        super.imprimir();
        System.out.print("tipo de comida:" + getTipoComida());
        System.out.print("preco medio:" + getPrecoMedio());
        
    }
    
    
}
