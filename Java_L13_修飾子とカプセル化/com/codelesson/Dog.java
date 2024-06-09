package com.codelesson;
public class Dog {
    private String name; // 犬の名前
    private int age; // 犬の年齢

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        // 年齢は0以上でないといけないので、チェックします
        if (newAge < 0) { 
            age = 0;
        } else {
            age = newAge;
        }
    }
}