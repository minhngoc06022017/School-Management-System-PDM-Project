/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableObject;

/**
 *
 * @author TripleB
 */
public class Staff4 {
    public String id_staff,name_staff,gender;
    public int salary;
    
    public Staff4(String id_staff,String name_staff,String gender,int salary){
        this.id_staff=id_staff;
        this.name_staff=name_staff;
        this.gender=gender;
        this.salary=salary;
    }

    public String getId_staff() {
        return id_staff;
    }

    public void setId_staff(String id_staff) {
        this.id_staff = id_staff;
    }

    public String getName_staff() {
        return name_staff;
    }

    public void setName_staff(String name_staff) {
        this.name_staff = name_staff;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
