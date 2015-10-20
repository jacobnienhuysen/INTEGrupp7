/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inte.projekt;

/**
 *
 * @author Erik
 */
public class Rabatter {
    private String namn;
    private Double rabatt;
    public Rabatter(String n, int r){
        if(r > 100 || r < 0)
            throw new IllegalArgumentException("Måste vara mellan 0 och 100");
            
        namn = n;
        rabatt = (double)(100-r)/100;
    }
    public Double getRabatt(){
        return rabatt;
    }
    public String getNamn(){
        return namn;
    }
    public Double getRabatteratPris(Double pris){
        return pris*rabatt;
    }
}
