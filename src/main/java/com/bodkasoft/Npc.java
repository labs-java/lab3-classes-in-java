package com.bodkasoft;

public class Npc {

    private String name;
    private int age;
    private Gender gender;
    private int healthPoints;
    private String description;

    public Npc() {}

    public Npc(String name, int age, Gender gender, int healthPoints, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.healthPoints = healthPoints;
        this.description = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Npc{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", healthPoints=" + healthPoints +
                ", description='" + description + '\'' +
                '}';
    }
}