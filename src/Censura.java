/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis
 */
public enum Censura {
    
    
    Mayores12("Mayores de 12"), 
    Mayores15("Mayores de 15"), 
    Mayores18("Mayores de 18"), 
    TodoPublico("Todo Publico");
    private final String censura;
    Censura(String censura){
        this.censura=censura;
    }

    public String getCensura() {
        return censura;
    }
    
    
}
