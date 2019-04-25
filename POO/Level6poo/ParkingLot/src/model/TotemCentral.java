package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Facade pattern:
 * 
 *  Classe necessária porém última a ser desenvolvida. Serve para unir
 * as informações contidas na modelagem do problema. Geralmente é uma 
 * classe extensa de muitas funcionalidades, é referência para todos os
 * outros objetos (mesmo que indiretamente) que interessam para a 
 * execução da solução.
 *  Lembrando o princípio da única responsabilidade, a fachada permite
 * que os objetos modelados guardem somente suas definições padrões,
 * encapsulando a funcionalidade do programa.
 * 
 * @author LPS
 */
public class TotemCentral {
    private HashMap<String, Totem> totens;
    private HashMap<String, Car> cars;
    
    TotemCentral(){
        totens = new HashMap();
        cars = new HashMap();
        //Creating two initical totens at time 00:00
        totens.put("X Street", new Totem("X Street"));
        totens.put("Y Street", new Totem("X Street"));
    }
    
    public void newCar(String plate){
        Car c = new Car(plate);
        cars.put(plate, c);
    }
    
    public void parkCar(String plate, String street){
        Car c = cars.get(plate);
        Totem t = totens.get(street);
        c.park(t);
    }
    
    public void leavePark(String plate){
        Car c = cars.get(plate);
        c.leave();
    }
    
    public void passTime(){
        for(Totem t : totens.values())
            t.increaseTime();
    }
    
    public ArrayList<String> streets(){
        ArrayList<String> streets = new ArrayList();
        streets.addAll(totens.keySet());
        return streets;
    }
    
    public ArrayList<String> plates(){
        ArrayList<String> plates = new ArrayList();
        plates.addAll(cars.keySet());
        return plates;
    }
    
    public void saveTotens(){}
}
