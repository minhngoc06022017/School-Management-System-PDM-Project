/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableObject;

import java.sql.Time;

/**
 *
 * @author TripleB
 */
public class Classes3 {
    public Class _time;
    public String subject_code,room_number,weekday;
    public Classes3(String subject_code,String room_number,String weekday,Class time){
        this.subject_code=subject_code;
        this.room_number=room_number;
        this.weekday=weekday;
        this._time=time;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
}
