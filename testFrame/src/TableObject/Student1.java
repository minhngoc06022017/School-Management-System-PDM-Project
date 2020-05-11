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
public class Student1 {
    public String  roll_no,section,name_student,gender,tuition_id;
    
    public Student1(String roll_no , String section ,String name_student,String gender , String tuition_id){
        this.roll_no=roll_no;
        this.section=section;
        this.name_student=name_student;
        this.gender=gender;
        this.tuition_id=tuition_id;
    }

    

    public String getTuition_id() {
        return tuition_id;
    }

    public void setTuition_id(String tuition_id) {
        this.tuition_id = tuition_id;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getName_student() {
        return name_student;
    }

    public void setName_student(String name_student) {
        this.name_student = name_student;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
