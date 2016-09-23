
package com.ahmshere.entity;
import org.hibernate.annotations.GenericGenerator;

import java.util.*;

import javax.persistence.*;


@Entity
@Table(name = "instructor")
public class Instructor {
    @Id
    @GeneratedValue(generator = "increment")
            @GenericGenerator(name = "increment", strategy = "increment")
    int id;
    /*@ElementCollection    //(fetch = FetchType.EAGER)
    Set<String> phone;*/

    /*@OneToMany(mappedBy="instruct",fetch = FetchType.EAGER,orphanRemoval=true)
    List<Schedule> schedItems;
    String drivingSchool;
    @ElementCollection
    List<String> workingDays;
    @ElementCollection
    List<String> workingHours;*/
    @Column(name = "name", nullable = false, length = 30)
    String name;
    String email;
    String pricePerHour;
    String url;
    String avatar;
    String sex;
    @Embedded
    Address address;
    String typeVehicle;
    String transmission;

    public Instructor(String name, String email, String pricePerHour, String url, Address address, String typeVehicle, String transmission) {
        this.name = name;
        this.email = email;
        this.pricePerHour = pricePerHour;
        this.url = url;


        this.address = address;
        this.typeVehicle = typeVehicle;
        this.transmission = transmission;
    }

    public Instructor(String name, String email, Set<String> phone, String sex, Address address, String typeVehicle,
                      String transmission) {
        super();
        this.name = name;
        this.email = email;
       // this.phone = phone;
        this.sex = sex;
        this.address = address;
        this.typeVehicle = typeVehicle;
        this.transmission = transmission;
    }
    public Instructor() {

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
 /*   public Set<String> getPhone() {
        return phone;
    }
    public void setPhone(Set<String> phone) {
        this.phone = phone;
    }*/
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getTypeVehicle() {
        return typeVehicle;
    }
    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public String getSex() {
        return sex;
    }
 /*   public void setSchedule(List<Schedule> schedItems) {
        this.schedItems = schedItems;
    }
    public List<Schedule> getSchedule() {
        return schedItems;
    }
    public String getDrivingSchool() {
        return drivingSchool;
    }
    public void setDrivingSchool(String drivingSchool) {
        this.drivingSchool = drivingSchool;
    }
    public List<String> getWorkingDays() {
        return workingDays;
    }
    public void setWorkingDays(List<String> workingDays) {
        this.workingDays = workingDays;
    }
    public List<String> getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(List<String> workingHours) {
        this.workingHours = workingHours;
    }*/
    public String getPricePerHour() {
        return pricePerHour;
    }
    public void setPricePerHour(String pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Instructor [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + "phone" + ", sex=" + sex
                + ", address=" + address + ", typeVehicle=" + typeVehicle + ", transmission=" + transmission + "]";
    }


}


