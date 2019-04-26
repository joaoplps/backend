package model;

import java.util.ArrayList;
import java.util.HashMap;
import persistency.PersistencyLayer;

/**
 * Facade pattern:
 * 
 *  Classe necessária porém última a ser desenvolvida. Serve para unir
 * as informações contidas na modelagem do problema com o usuário. 
 * Geralmente é uma classe extensa de muitas funcionalidades, é referência
 * para todos os outros objetos (mesmo que indiretamente) que interessam
 * para a execução da solução.
 *  Lembrando o princípio da única responsabilidade, a fachada permite
 * que os objetos modelados guardem somente suas definições padrões,
 * encapsulando a funcionalidade do programa.
 * 
 * @author LPS
 */
public class TotemCentral {
    /**
     * HashMap:
     *  A duplicação do nome da rua (também em cada totem, além do hashmap)
     * permite poupar processamento (em loopings e meios de acesso) utilizando
     * um pouco mais de armazenamento.
     *  Outro problema resolvido é a duplicação de ruas em totens. Porém não
     * é possivel haver mais de um totem por rua no escopo deste programa.
    */
    private HashMap<String, Totem> totens;
    private HashMap<String, Car> cars;
    
    TotemCentral(){
        totens = new HashMap();
        cars = new HashMap();
        //Creating two initical totens at time 00:00
        totens.put("X Street", new Totem("X Street"));
        totens.put("Y Street", new Totem("X Street"));
        
        for (Totem t : PersistencyLayer.totem.totens)
            totens.put(t.street, t);
    }
    
    public void newCar(String plate){
        Car c = new Car(plate);
        cars.put(plate, c);
    }
    
    public void parkCar(String plate, String street){
        if(!cars.containsKey(plate) && !totens.containsKey(street))
            return;
        //Exste um carro com determinada placa e uma rua com determinado nome
        Car c = cars.get(plate);
        Totem t = totens.get(street);
        c.park(t);
    }
    
    public void leavePark(String plate){
        if(!cars.containsKey(plate))
            return;
        Car c = cars.get(plate);
        c.leave();
    }
    
    public void passTime(){
        for(Totem t : totens.values())
            t.increaseTime();
    }
    
    public ArrayList<String> streets(){
        //Keyset é o índice String correspondente à rua no mapeamento de totens
        return new ArrayList(totens.keySet());
    }
    
    public ArrayList<String> plates(){
        return new ArrayList(cars.keySet());
    }
    
    //Salva no db - populating Registry Table
    public void saveTotens(){
        for(Totem t : totens.values())
            PersistencyLayer.registry.saveRegs(t);
    }
}
