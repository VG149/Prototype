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

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Moto extends Veiculo{
    public String marca;
    
    public Moto(){
        
    }
    
     public Moto(Moto target){
         super(target);
         if(target != null){
             this.marca = target.marca;
         }
    }
    @Override
    public Veiculo clone() {
    return new Moto(this);   
    }
    
    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Moto)|| !super.equals(object2)) return false;
        Moto veiculo2 = (Moto) object2;
        return veiculo2.marca == marca;
    }
    
}

