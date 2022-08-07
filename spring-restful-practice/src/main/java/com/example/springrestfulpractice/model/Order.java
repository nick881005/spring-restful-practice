package com.example.springrestfulpractice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
public class Order {
    private int seq;
    private int totalPrice;
    private String waiter;
    private List<com.example.springrestfulpractice.model.Meal> mealList;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public List<com.example.springrestfulpractice.model.Meal> getMealList() {
        return mealList;
    }

    public void setMealList(List<com.example.springrestfulpractice.model.Meal> mealList) {
        this.mealList = mealList;
    }
}