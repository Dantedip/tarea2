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
public class lineallistclass <t>{
    private nodeclass first;
    private nodeclass last;
    
    //metodos
    
    public void insertfirst(t n){
        nodeclass node = new nodeclass(n);
        if(isEmpty()){
            first = node;
            last = node;
        }else{
            node.next = first;
            first = node;
        }
    }
    private boolean isEmpty(){
        return first == null;
    }
    public void showlist(){
        if(!isEmpty()){
            nodeclass aux;
            aux = first;
            while(aux!=null){
                System.out.println(aux.data);
                aux =aux.next;
            }
            
        }else{System.out.print("tu lista esta vacia");
            
        }
    }
     public void insertLast(t n){
        nodeclass node = new nodeclass(n);
         if(isEmpty()){ 
            insertfirst(n);
        } else {  
            last.next = node;  
            last = node;   
        }
        
    }
         public void deletefirst(){
        if(!isEmpty()){ 
            first = first.next; 
        }
    }
          public void deletelast(){
        if(!isEmpty()){ 
            if (first == last){ 
                deletefirst(); 
            } else { 
                
                nodeclass current = first; 
                while(current.next != last){ 
                    current = current.next; 
                } 
                last = current; 
            }
        }
    }   
}