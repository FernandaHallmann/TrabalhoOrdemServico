/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoordemservico;

/**
 *
 * @author Ferna
 */
public class Veiculo { 
    private static String placa;
    private static String modelo;
    private static String marca;
    private static int ano;

    public static String getPlaca() {
        return placa;
    }

    public static void setPlaca(String placa) {
        Veiculo.placa = placa;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        Veiculo.modelo = modelo;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Veiculo.marca = marca;
    }

    public static int getAno() {
        return ano;
    }

    public static void setAno(int ano) {
        Veiculo.ano = ano;
    }
    
    
}
