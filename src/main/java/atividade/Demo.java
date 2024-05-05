/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

/**
 *
 * @author FATEC ZONA LESTE
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        List<Veiculo> veiculosCopy = new ArrayList<>();

        Moto moto = new Moto();
        moto.portas = 0;
        moto.rodas = 2;
        moto.marca = "BMW";
        moto.cor = "Preta";
        veiculos.add(moto);

        Moto anotherMoto = (Moto) moto.clone();
        veiculos.add(anotherMoto);

        Carro carro = new Carro();
        carro.portas = 4;
        carro.rodas = 4;
        carro.cor = "azul";
        veiculos.add(carro);

        cloneAndCompare(veiculos, veiculosCopy);
    }

    private static void cloneAndCompare(List<Veiculo> veiculos, List<Veiculo> veiculosCopy) {
        for (Veiculo veiculo : veiculos) {
             veiculosCopy.add(veiculo.clone());
        }

        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i) != veiculosCopy.get(i)) {
                System.out.println(i + ": Diferentes");
                if (veiculos.get(i).equals(veiculosCopy.get(i))) {
                    System.out.println(i + ": São iguais");
                } else {
                    System.out.println(i + ": Mas não sao identicos");
                }
            } else {
                System.out.println(i + ": Sao identicos");
            }
        }
    }
}
