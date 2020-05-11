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
public class Study6 {
    String roll_no,subject_code;
    public Study6(String roll_no , String subject_code){
        this.roll_no=roll_no;
        this.subject_code=subject_code;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }
}
