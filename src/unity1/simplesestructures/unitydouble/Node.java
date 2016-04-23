/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.simplesestructures.unitydouble;

/**
 *
 * @author Acer
 */
public class Node {
    Node back;
    Node next;
    int  data;
    public Node(int d){
        data=d;
        next=null;
        back=null;
    } 
}
