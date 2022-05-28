/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduar
 */
public abstract class Pessoa {
    
    private int id;
    private String nome;
    private String Cpf;

    public Pessoa(int id , String nome, String Cpf) {
        this.id = id;
        this.nome = nome;
        this.Cpf = Cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    
    public int getIdentificao(String nome) {
        return id;
    }
    
    public float getCalc(float salario, float bonus) {
        return salario / bonus;
    }
}