/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Carro extends Veiculo{
    public String marca;
    
    public Carro(){
        
    }
    
     public Carro(Carro target){
         super(target);
         if(target != null){
             this.marca = target.marca;
         }
    }
    @Override
    public Veiculo clone() {
    return new Carro(this);   
    }
    
    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Carro)|| !super.equals(object2)) return false;
        Carro veiculo2 = (Carro) object2;
        return veiculo2.marca == marca;
    }
    
}
