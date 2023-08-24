/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

import javax.swing.JOptionPane;

/**
 *
 * @author dead
 */
public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    
    public void cadastrarPessoa(){
        this.setNome(JOptionPane.showInputDialog("Digite o nome"));
        this.setTelefone(JOptionPane.showInputDialog("Digite o telefone"));
        this.setEndereco(JOptionPane.showInputDialog("Digite o endereço"));
    }
    
    
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
