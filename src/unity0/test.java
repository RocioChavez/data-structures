/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity0;

/**
 *
 * @author AULA1
 */
public class test {
    public static void main (String []args){
             TestingStacks();
             TestingQueue();
    }
    public static void TestingStacks(){
           Stack s= new Stack ();
        s.add (10);
        s.add (20);
        s.add (30);
        s.print ();
        s.remove ();
        s.print ();
        for (int i = 2; i<20; i+=2){
            s.add(i);
        }
        s.print();
    }
    public static void TestingQueue(){
        System.out.println("...........testingqueue...............");
        queve q =new queve();
        for(int i=1;i<=20;i++){
            q.add(i);
            
        }
        System.out.println("INITIAÑ VALUES");
        q.print();
        int d=q.remove();
        System.out.println("el elmento removido was: "+d);
        System.out.println("valores actuales");
        q.print();
    }
     
}
