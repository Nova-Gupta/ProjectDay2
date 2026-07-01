# EmployeeWebApp

A Spring Boot web application developed using **Spring MVC**, **Thymeleaf**, **Spring Data JPA**, and **H2 Database**. This project provides a simple Employee Management System with a web interface.

---

## Technologies Used

- Java 21
- Spring Boot
- Spring MVC
- Thymeleaf
- Spring Data JPA
- Hibernate
- H2 Database
- Bootstrap 5
- Maven

---

## Features

- Home Page
- Add Employee
- Display Employee List
- Raise Employee Salary
- Form Validation
- Bootstrap User Interface
- H2 Database Integration

---

## Application Pages

### Home

- Add Employee
- Display Employees
- Raise Salary

---

### Add Employee

Fields

- Name
- Age
- Salary
- Designation

---

### Display Employees

Displays all employee details in a Bootstrap table.

---

### Raise Salary

Input

- Employee Name
- Percentage (1-10)

Updates employee salary automatically.

---

## Validation Rules

### Name

- Only alphabets
- Maximum 2 spaces

### Age

18–60

### Salary

Greater than 0

### Percentage

1–10

---

## H2 Database

Console URL

```
http://localhost:8080/h2-console
```

JDBC URL

```
jdbc:h2:mem:employeedb
```

Username

```
sa
```

Password

```
Leave Blank
```

---

## Project Structure

```
EmployeeWebApp
│
├── controller
├── entity
├── repository
├── service
├── exception
├── templates
│     ├── home.html
│     ├── addEmployee.html
│     ├── displayEmployees.html
│     ├── raiseSalary.html
│     └── success.html
│
├── resources
│     └── application.properties
│
└── EmployeeWebAppApplication.java
```

---

## Learning Outcomes

- Spring MVC
- Thymeleaf
- Bootstrap
- CRUD Operations
- H2 Database
- Form Validation
- MVC Architecture

---

## Author

**Nova Gupta**