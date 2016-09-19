/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalmanager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @authors Dunkel, DunklerHeld
 */
@XmlRootElement(name="MITARBEITER")
@XmlAccessorType(XmlAccessType.FIELD)
public class Mitarbeiter {
    
    private String name;
    private int personalNumber;
    private double salary;
    private double time;
    
    Mitarbeiter(String name, int personalNumber, double salary) {
        this.name = name;
        this.personalNumber = personalNumber;
        this.salary = salary;
        this.time = 0;
    }

    public double calcSalary(){
        double calculatedSalary;
        calculatedSalary = this.getSalary() * this.getTime();
        
        return calculatedSalary;
    }
    
    public void changeSalary(double toChange) {
        this.setSalary(this.getSalary() + toChange);
    }
    
    public void addTime(double time) {
        this.setTime(this.getTime() + time);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    @XmlElement(name="MITARBEITER_NAME")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the personalNumber
     */
    public int getPersonalNumber() {
        return personalNumber;
    }

    /**
     * @param personalNumber the personalNumber to set
     */
    @XmlElement(name="MITARBEITER_ID")
    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    /**
     * @param salary the salary to set
     */
    @XmlElement(name="MITARBEITER_GEHALT")
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the time
     */
    public double getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    @XmlElement(name="MITARBEITER_ZEIT")
    public void setTime(double time) {
        this.time = time;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }
    
    Boolean childrenAllowed;
    
    @XmlAttribute(name="children_allowed")
    public void setChildrenAllowed(Boolean childrenAllowed){
        
        this.childrenAllowed = childrenAllowed;
        
    }
    
}
