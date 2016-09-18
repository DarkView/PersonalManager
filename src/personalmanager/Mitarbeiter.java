/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalmanager;

/**
 *
 * @authors Dunkel, DunklerHeld 
 */
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
    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    /**
     * @param salary the salary to set
     */
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
    public void setTime(double time) {
        this.time = time;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }
    
    
    
}
