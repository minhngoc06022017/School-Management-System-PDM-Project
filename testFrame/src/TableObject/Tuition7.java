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
public class Tuition7 {
    String tuition_id;
    public int fee,paid_or_unpaid;
    public Tuition7(String tuition_id,int fee,int paid_or_unpaid){
        this.tuition_id=tuition_id;
        this.fee=fee;
        this.paid_or_unpaid=paid_or_unpaid;
    }

    public String getTuition_id() {
        return tuition_id;
    }

    public void setTuition_id(String tuition_id) {
        this.tuition_id = tuition_id;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getPaid_or_unpaid() {
        return paid_or_unpaid;
    }

    public void setPaid_or_unpaid(int paid_or_unpaid) {
        this.paid_or_unpaid = paid_or_unpaid;
    }
}
