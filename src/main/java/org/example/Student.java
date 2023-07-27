package org.example;

import java.math.BigInteger;

public class Student {
    String name;
    String mobNo;
   BigInteger rollNo;

    public Student() {

    }

    public Student(String name, String mobNo, BigInteger rollNo) {
        this.name = name;
        this.mobNo = mobNo;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mobNo='" + mobNo + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public BigInteger getRollNo() {
        return rollNo;
    }

    public void setRollNo(BigInteger rollNo) {
        this.rollNo = rollNo;
    }
}

