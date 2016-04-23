/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.simplesestructures.grapher;

/**
 *
 * @author Acer
 */
public class Cordinate {
   protected int x,y;
    protected Cordinate next,back; 
    
    public Cordinate(int x,int y){
        
        this.x=x;
        this.y=y;
        
    } 
}
