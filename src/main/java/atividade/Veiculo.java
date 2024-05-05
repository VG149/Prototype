/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;
import java.util.Objects;
/**
 *
 * @author FATEC ZONA LESTE
 */
public abstract class Veiculo {
    public int portas;
    public int rodas;
    //private int paciencia = 0;
    public String cor;
    public Veiculo(){
        
    }
    public Veiculo(Veiculo target){
       if(target != null) {
           this.portas = target.portas;
           this.rodas = target.rodas;
           this.cor = target.cor;
       } 
    }
    
    public abstract Veiculo clone();
    
    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof Veiculo)){
        return false;
    }
    
        Veiculo veiculo2 = (Veiculo) object2;
        return veiculo2.portas == portas && veiculo2.rodas == rodas && Objects.equals(veiculo2.cor, cor);
    }
    
}
