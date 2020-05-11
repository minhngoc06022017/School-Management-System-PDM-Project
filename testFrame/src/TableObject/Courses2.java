package TableObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TripleB
 */
public class Courses2 {
    public String subject_code , name_subject;
    public int credit;
    
    public Courses2(String subject_code , String name_subject, int credit){
        this.subject_code= subject_code;
        this.name_subject=name_subject;
        this.credit=credit;
                
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getName_subject() {
        return name_subject;
    }

    public void setName_subject(String name_subject) {
        this.name_subject = name_subject;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
