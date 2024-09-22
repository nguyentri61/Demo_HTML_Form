package org.ex.demo_html_forms_cnpm;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate date;
    private String hearFrom;
    private String confirm;
    private String contact;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        date = null;
        hearFrom = "";
        confirm = "";
        contact = "";
    }

    public User(String firstName, String lastName, String email, LocalDate date, String hearFrom, String confirm, String contact){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.date = date;
        this.hearFrom = hearFrom;
        this.confirm = confirm;
        this.contact = contact;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHearFrom() {
        return hearFrom;
    }
    public void setHearFrom(String hearFrom) {
        this.hearFrom = hearFrom;
    }

    public String getConfirm() {
        return confirm;
    }
    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
}
