package br.com.javaoo.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;



    public void setName(String nome){
        this.name = nome;
    }
    public String getNAME(){
       return name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
}
