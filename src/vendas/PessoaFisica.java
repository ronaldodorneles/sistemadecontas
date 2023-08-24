/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

import javax.swing.JOptionPane;
import meuPacote.ValidaCPF;

/**
 *
 * @author dead
 */
public class PessoaFisica extends Pessoa {

    private String cpf;

    @Override
    public void cadastrarPessoa() {
        super.cadastrarPessoa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        this.cpf = JOptionPane.showInputDialog("Digite o CPF.");
        verificaCPF();
    }

    // importanto a classe "ValidaCPF" do pacote "meuPacote"
            public void verificaCPF(){
                
                // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
            if (ValidaCPF.isCPF (this.cpf) == true)
//               System.out.printf("%s\n", ValidaCPF.imprimeCPF(this.cpf));
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
            else {
//                System.out.printf ("Erro, CPF invalido !!!\n");
                JOptionPane.showMessageDialog(null, "CPF informado é inválido");
            }
            }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
