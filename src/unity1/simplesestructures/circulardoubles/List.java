/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.simplesestructures.circulardoubles;

/**
 *
 * @author Acer
 */
public class List {
        
    Node head;
    public List(){
            head=null;
    }
    public void add(int d){
      Node n=new Node(d);
        if(head==null){
        head=n;   
       } else {
        Node aux=head.back;
       
       do{
        n.next=head;
        n.back=aux;
        head.back=n;
         aux.next=n;
        }while(aux!=head);
    }
    }
    
public void print(){
        if(head==null) return;
        Node aux=head;
        do{
            System.out.println(aux.data);
            aux=aux.next; 
        }while(aux!=head);
    }
    public void MoveLastToBeginning(){
        head=head.back;
    }
    public void MoveFirtstoEnd(){
        head=head.next;
    }
    
}
