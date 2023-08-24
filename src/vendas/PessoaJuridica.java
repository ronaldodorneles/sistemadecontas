/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

import javax.swing.JOptionPane;
import meuPacote.ValidaCNPJ;

/**
 *
 * @author dead
 */
public  class PessoaJuridica extends Pessoa{
    private String cnpj;
    
    @Override
    public void cadastrarPessoa() {
        super.cadastrarPessoa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        cnpj = JOptionPane.showInputDialog("Digite o CNPJ");
        verificaCNPJ();
    }
    
    
        public void verificaCNPJ() {
        System.out.printf("\nResultado: ");
// usando os métodos isCNPJ() e imprimeCNPJ() da classe "ValidaCNPJ"
        if (ValidaCNPJ.isCNPJ(this.cnpj) != true) {
//            System.out.printf("Erro, CNPJ inválido !!!\n");
            JOptionPane.showMessageDialog(null, "CNPJ Inválido.");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado.");
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
