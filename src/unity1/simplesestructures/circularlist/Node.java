/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.simplesestructures.circularlist;

/**
 *
 * @author Acer
 */
public class Node {
    public int data;
    public Node next;
    
    public Node(int d){
        data=d; 
        next=this;
    }
  
}