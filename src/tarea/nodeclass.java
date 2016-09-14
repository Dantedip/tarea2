/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;
/**
 *
 * @author Dante dip
 */
public class nodeclass <t>{
    t data;
    nodeclass next;
    
    public nodeclass(t data){
        this.data = data;
        this.next = null;
    }
}
