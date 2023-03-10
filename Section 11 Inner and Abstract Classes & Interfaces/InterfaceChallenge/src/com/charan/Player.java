package com.charan;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    // write code here
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write(){
        List<String> values = new ArrayList<>();
        values.add(0,name);
        values.add(1,""+hitPoints);
        values.add(2,""+strength);
        values.add(3,weapon);
        return values;
    };

    @Override
    public void read(List<String> values){
        if(values!=null && values.size()>0){
            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
            this.weapon = values.get(3);
        }
    }

    @Override
    public String toString(){
        return "Player{name='"+name+"', hitPoints="+hitPoints+", strength="+strength+", weapon='"+weapon+"'}";
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getWeapon() { return weapon; }
    public void setWeapon(String weapon) { this.weapon = weapon; }

    public int getHitPoints() { return hitPoints; }
    public void setHitPoints(int hitPoints) { this.hitPoints = hitPoints; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }
}