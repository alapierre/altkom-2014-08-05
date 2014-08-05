/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

import java.sql.Time;

/**
 *
 * @author Administrator
 */
public class DeliveryMethod {
    private String deliveryType;
    private Time deliveryTime;
    private  String insuranceType;
    private double insuranceCost;
    private Time deliveryHour;

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Time getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Time deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public Time getDeliveryHour() {
        return deliveryHour;
    }

    public void setDeliveryHour(Time deliveryHour) {
        this.deliveryHour = deliveryHour;
    }
    
}
