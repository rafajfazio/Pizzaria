/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduar
 */
public abstract class Funcionario extends Pessoa{
    
    private float salario;

    public Funcionario(int id, float salario, String nome, String Cpf) {
        super(id, nome, Cpf);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float setSalario(float salario, float bonus) {
        return salario + bonus;
    }
}
