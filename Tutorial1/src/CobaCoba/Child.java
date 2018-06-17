/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaCoba;

/**
 *
 * @author prata
 */
public class Child extends Parent {

    public int x = 10;

    public void info(int x) {
        System.out.println("X=" + x + " , " + super.x + " , " + this.x);
    }
}
