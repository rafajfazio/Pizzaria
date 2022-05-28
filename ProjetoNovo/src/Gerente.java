/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduar
 */
public class Gerente extends Funcionario {

    private String ultimaRevisaoAlimentos;

    public Gerente(String ultimaRevisaoAlimentos, int id, float salario, String nome, String Cpf) {
        super(id, salario, nome, Cpf);
        this.ultimaRevisaoAlimentos = ultimaRevisaoAlimentos;
    }

    public String getUltimaRevisaoAlimentos() {
        return ultimaRevisaoAlimentos;
    }

    public void setUltimaRevisaoAlimentos(String ultimaRevisaoAlimentos) {
        this.ultimaRevisaoAlimentos = ultimaRevisaoAlimentos;
    }
    

    
}
