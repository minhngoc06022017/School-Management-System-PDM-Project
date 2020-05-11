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
public class Teach5 {
    String id_staff,subject_code;
    
    public Teach5(String id_staff, String subject_code){
        this.id_staff=id_staff;
        this.subject_code=subject_code;
    }

    public String getId_staff() {
        return id_staff;
    }

    public void setId_staff(String id_staff) {
        this.id_staff = id_staff;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }
}
