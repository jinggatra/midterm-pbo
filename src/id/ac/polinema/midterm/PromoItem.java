/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author J I N G G A
 */
public class PromoItem extends Item{
    private float promo;

    public PromoItem(float promo, String name, float price, int amount) {
        super(name, price, amount);
        this.promo = promo;
    }
    
    
}
