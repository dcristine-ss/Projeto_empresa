
package model;

import javax.swing.JOptionPane;


public class Empresa {
    private String nome;
    private String endereço;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    
    public Empresa(){
        this ("","","","","","");
        
    }
public Empresa(String nome, String endereço, String cidade, String estado, String cep, String telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereço;
    }

    public void setEndereco(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
public void leitura(){
    setNome(JOptionPane.showInputDialog("Digite nome:"));
    setEndereco(JOptionPane.showInputDialog("Digite o endereco:"));
    setCidade(JOptionPane.showInputDialog("Digite a cidade:"));
    setEstado(JOptionPane.showInputDialog("Digite o estado:"));
    setCep(JOptionPane.showInputDialog("Digite o cep:"));
    setTelefone(JOptionPane.showInputDialog("Digite telefone:"));
    
    
            }
            
   public void imprimir(){
       System.out.println("nome " + getNome());
       System.out.println("endereco " + getEndereco());
       System.out.println("cidade " + getCidade());
       System.out.println("estado " + getEstado());
       System.out.println("cep " + getCep());
       System.out.println("telefone " + getTelefone());
   }
}
       

