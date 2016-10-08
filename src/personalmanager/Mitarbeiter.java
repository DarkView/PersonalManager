/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalmanager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @version 1.0.4
 * @author Dunkel, DunklerHeld
 */
@XmlRootElement(name="MITARBEITER")
@XmlType(propOrder={"mname", "mpersonalNumber", "msalary", "mtime"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Mitarbeiter {
    
    private String mname;
    private int mpersonalNumber;
    private double msalary;
    private double mtime;
    
    public Mitarbeiter(String name, int personalNumber, double salary) {
        this.mname = name;
        this.mpersonalNumber = personalNumber;
        this.msalary = salary;
        this.mtime = 0;
    }    
    
    Mitarbeiter(){
        
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
        return mname;
    }

    /**
     * @param name the name to set
     */
    //@XmlElement(name="MITARBEITER_NAME")
    public void setName(String name) {
        this.mname = name;
    }

    /**
     * @return the personalNumber
     */
    public int getPersonalNumber() {
        return mpersonalNumber;
    }

    /**
     * @param personalNumber the personalNumber to set
     */
    //@XmlElement(name="MITARBEITER_ID")
    public void setPersonalNumber(int personalNumber) {
        this.mpersonalNumber = personalNumber;
    }

    /**
     * @param salary the salary to set
     */
    //@XmlElement(name="MITARBEITER_GEHALT")
    public void setSalary(double salary) {
        this.msalary = salary;
    }

    /**
     * @return the time
     */
    public double getTime() {
        return mtime;
    }

    /**
     * @param time the time to set
     */
    //@XmlElement(name="MITARBEITER_ZEIT")
    public void setTime(double time) {
        this.mtime = time;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return msalary;
    }
}
