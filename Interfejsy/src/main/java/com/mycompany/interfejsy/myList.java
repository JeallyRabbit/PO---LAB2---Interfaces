/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfejsy;

/**
 *
 * @author student
 */
public class myList implements iDataStructure{

    //@Override
    private double value;
    private myList next;

    public myList(double value) {
        this.value = value;
        this.next = null;
    }
    

    
    public double getValue() {
        return value;
    }

    public myList getNext() {
        return next;
    }
    
   

    @Override
    public boolean cointains(double Searched) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double max() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        if(this.next==null)
        {
            return value;
        }
        else
        {
            if(this.value>this.next.max())
            {
                return this.value;
            }
            else
            {
                return this.next.max();
            }
        }
    }

    @Override
    public double min() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(this.next==null)
        {
            return value;
        }
        else
        {
            if(this.value<this.next.min())
            {
                return this.value;
            }
            else
            {
                return this.next.min();
            }
        }
                
    }
    

    @Override
    public void clear(double value) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.value=value;
        this.next=null;
        //this.next=null;
    }

    @Override
    public void sort() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(this.next!=null)
        {
            double maxValue=this.max();
            this.changeat(maxValue,this.value);
            this.changeat(this.value, maxValue);
            this.next.sort();
        }
        else{return;}
        
    }
     public void add(double newValue) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
        if(this.next==null)
        {
            myList new_value = new myList(newValue);
            this.next=new_value;
        }
        else
        {
            this.next.add(newValue);
            
        }
    }
     
     public void changeat(double a, double b)
     {
           if(this.value==a)
           {
               this.value=b;
           }
           else
           {
               if(this.next!=null)
               {
                   this.next.changeat(a,b);
               }
           }
     }
     
     public String toString()
     {
         if(this.next==null)
         {
             return Double.toString(value);
         }
         else
         {
             return Double.toString(value)+","+next.toString();
         }
     }
    
}
