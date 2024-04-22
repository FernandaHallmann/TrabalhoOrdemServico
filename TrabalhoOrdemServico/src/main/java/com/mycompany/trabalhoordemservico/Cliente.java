/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoordemservico;

/**
 *
 * @author Ferna
 */
public class Cliente {
    
    private static String nome;
    private static String cpf;
    private static String telefone;
    private static String endereco;
    
    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Cliente.nome = nome;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        Cliente.cpf = cpf;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        Cliente.telefone = telefone;
    }

    public static String getEndereco() {
        return endereco;
    }

    public static void setEndereco(String endereco) {
        Cliente.endereco = endereco;
    }

    
}
