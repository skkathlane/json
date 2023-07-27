package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello world!");
        Student student = new Student("sanoj", "8305870527", BigInteger.valueOf(12));
        Student student1=new Student("ravin","7354263606",BigInteger.valueOf(16));
        Student student2=new Student("khage","9827259176",BigInteger.valueOf(13));
        List<Student> list =new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        ObjectMapper objectMapper = new ObjectMapper();

        //json object to json string

       try {
           objectMapper.writeValue(new File("target/student.json"), list); // it will convert list of object into json string file
           String s=objectMapper.writeValueAsString(list);
           System.out.println(s);
       }
        catch(Exception e){
            throw new RuntimeException();
        }

//       json String to json object

        ObjectMapper objectMapper1 = new ObjectMapper();
       String s="[{\"name\":\"sanoj\",\"mobNo\":\"8305870527\",\"rollNo\":12},{\"name\":\"ravin\",\"mobNo\":\"7354263606\",\"rollNo\":16},{\"name\":\"khage\",\"mobNo\":\"9827259176\",\"rollNo\":13}]";
       List<Student>list2=objectMapper1.readValue(s, new TypeReference<List<Student>>(){});// it will convert json string to json object
       for(Student e:list2){
           System.out.println(e.toString());
       }
    }
}