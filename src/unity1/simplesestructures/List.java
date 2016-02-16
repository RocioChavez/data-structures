/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.simplesestructures;

/**
 *
 * @author AULA1
 */
public class List {
   private Node head;
   
    public List(){
         Node head=null;
    }
    
    public void add(int d){
        Node n= new Node(d);
    
    if(head==null){
        head=null;
    }   else {
        Node aux=head;
    while (aux.next!=null){
         aux = aux.next;
    }
    aux.next= n ;
            
    }
    
}
    public void print (){
        Node aux= head; 
        while (aux!=null){
            System.out.print(""+ aux.data );
            aux= aux.next;
        }
        System.out.println  ();
        
        }
    public int count (){
        Node aux= head;
        int counter =0;
        while (aux!=null){
            counter ++;
            aux=aux.next; 
        }
        return counter;
    }
    public void printFirstElement(){
        Node aux2= head;
        
    }
}
    
    

