package com.charan;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    // write code here
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName(){
        return this.name;
    }

    public int getHitPoints(){
        return this.hitPoints;
    }

    public int getStrength(){
        return this.strength;
    }

    @Override
    public List<String> write(){
        List<String> values = new ArrayList<>();
        values.add(0,name);
        values.add(1,""+hitPoints);
        values.add(2,""+strength);
        return values;
    };

    @Override
    public void read(List<String> values){
        if(values!=null && values.size()>0){
            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
        }
    }

    @Override
    public String toString(){
        return "Player{name='"+name+"', hitPoints="+hitPoints+", strength="+strength+"}";
    }
}