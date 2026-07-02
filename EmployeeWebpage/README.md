# EmployeeWebApp

A Spring Boot web application developed using **Spring MVC**, **Thymeleaf**, **Spring Data JPA**, **Hibernate**, and **H2 Database**.

The application provides a complete Employee Management System with automatic salary assignment, salary increment, validation, and a responsive Bootstrap interface.

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
- Display Employees
- Raise Employee Salary
- Automatic Salary Assignment
- Exit Application
- Bootstrap User Interface
- Form Validation
- H2 Database Integration

---

## Salary Structure

| Designation | Salary |
|-------------|--------|
| Programmer | ₹25,000 |
| Manager | ₹30,000 |
| Tester | ₹20,000 |

The salary is automatically assigned according to the selected designation.

---

## Application Pages

### Home

- Add Employee
- Display Employees
- Raise Salary
- Exit

---

### Add Employee

Fields

- Name
- Age
- Designation

> Salary is assigned automatically and is not entered by the user.

---

### Display Employees

Displays

- ID
- Name
- Age
- Designation
- Salary

---

### Raise Salary

Input

- Employee Name
- Percentage (1–10)

Updates the selected employee's salary.

---

## Validation Rules

### Name

- Only alphabets
- Maximum 2 spaces

### Age

18–60

### Salary Increment

1–10%

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
- CRUD Operations
- Spring Data JPA
- Hibernate
- H2 Database
- Bootstrap
- Bean Validation
- MVC Architecture

---

## Author

**Nova Gupta**