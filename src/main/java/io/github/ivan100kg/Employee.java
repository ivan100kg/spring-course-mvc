package io.github.ivan100kg;

//import jakarta.validation.constraints.Size;

import io.github.ivan100kg.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

//@Component
public class Employee {
    @Size(min = 2, max = 15, message = "wrong length")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 200, message = "must be greater than 199")
    @Max(value = 900, message = "must be less than 901")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private Map<String, String> carBrands;
    private String CarBrand;
    private String[] languages;
    private Map<String, String> myLanguages;

    @CheckEmail
    private String email;


    {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");
        departments.put("Cleaning", "Cleaning");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Toyota", "Toyota");
        carBrands.put("Ford", "Ford");

        myLanguages = new HashMap<>();
        myLanguages.put("EN", "English");
        myLanguages.put("FR", "France");
        myLanguages.put("DE", "German");
    }

    public Employee() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getMyLanguages() {
        return myLanguages;
    }

    public void setMyLanguages(Map<String, String> myLanguages) {
        this.myLanguages = myLanguages;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getCarBrand() {
        return CarBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
