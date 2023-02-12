/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnel;

/**
 *
 * @author xyh10
 */
public class Person {
    static int count = 0;
    String personID;
    String name;
    String age;

    @Override
    public String toString() {
        return  personID ;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

//    public Person(String personID, String name, String age) {
//        this.personID = personID;
//        this.name = name;
//        this.age = age;
//    }

    public Person() {
//        personID = "" + count ++;
    }
    
}
