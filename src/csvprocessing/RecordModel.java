/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvprocessing;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Digital-Mind
 */
public class RecordModel {
    private String name;
    private int age;
    private String sex;
    private String state;
    private ArrayList<String> STATES = new ArrayList<>(Arrays.asList("IMO","LAGOS","KADUNA", "ABUJA"));
    private ArrayList<String> GENDER = new ArrayList<>(Arrays.asList("M","F"));

    public RecordModel(){
        
    
    }
    public RecordModel(String [] record ){
        setName(record[0]);
        setAge(record[1]);
        setSex(record[2]);
        setState(record[3]);
    
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = Integer.parseInt(age);
    }

    public String getGender() {
        return sex;
    }

    private void setSex(String sex) {
        this.sex = sex.toUpperCase();
    }

    public String getState() {
        return state;
    }

    private void setState(String state) {
        
        this.state = state.toUpperCase();
    }
    
    public Boolean isValid(){
        return (name != null && age>0 && STATES.contains(state) && GENDER.contains(sex));
    }
    
}
