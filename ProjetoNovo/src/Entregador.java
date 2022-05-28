/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduar
 */
public class Entregador extends Funcionario {
    
    private String placaMoto;

    public Entregador(String placaMoto, int id, float salario, String nome, String Cpf) {
        super(id, salario, nome, Cpf);
        this.placaMoto = placaMoto;
    }

    public String getPlacaMoto() {
        return placaMoto;
    }

    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }  
    
    @Override
    public float getCalc(float salario, float bonus) {
        return salario + bonus;
    }

}

