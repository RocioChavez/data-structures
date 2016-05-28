/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2.TreeABC;

/**
 *
 * @author Acer
 */
public class Test {
    public static void main(String Args[]){
        Tree t=new Tree();
        t.add(23);
        t.add(2);
        t.add(6);
        t.add(0);
        t.add(5);
        t.Draw();
        t.balance();
        
    }
}
