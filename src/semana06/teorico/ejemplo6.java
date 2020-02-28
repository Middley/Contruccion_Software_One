/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana06.teorico;

/**
 *
 * @author DEYGLIS MIDDLEY
 */

interface Ipersisten{
    public void save(Object obj);
}

class person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }        
}

class datamysql implements Ipersisten{
//    public void savePerson(person p){
//        System.out.println("La persona fue almacenada!!");
//    }
    @Override
    public void save(Object obj) {        
        if(obj instanceof person)
            System.out.println("la persona fue almacenada");     
    
    }
}

class dataoracle implements Ipersisten{
//    public void savePerson(person p){
//        System.out.println("La persona fue almacenada!!");
//    }
    @Override
    public void save(Object obj) {        
        if(obj instanceof person)
            System.out.println("la persona fue almacenada");     
    
    }
}


class servicioPerson{
    Ipersisten ipersisten;
    void setIpersisten(Ipersisten ipersisten){
        this.ipersisten = ipersisten;
    }
    public void savePerson(person p){
        ipersisten.save(p);
//        datamysql mysql = new datamysql();
//        mysql.savePerson(p);
    }
    
}


public class ejemplo6 {
    public static void main(String[] args) {
        Ipersisten conectMysql = new datamysql();
        Ipersisten conectOracle = new dataoracle();
        servicioPerson ser = new servicioPerson();
        
        ser.setIpersisten(new datamysql());
        //ser.setIpersisten((Ipersisten) new person());
        
)
    }
}
