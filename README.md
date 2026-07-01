# Employee Management System - Spring Boot

This repository contains **two Spring Boot Employee Management System projects** developed as part of Spring Boot practice.

The projects demonstrate both **REST API development using Postman** and **Web Application development using Thymeleaf**, while using the same business logic and H2 in-memory database.

---

# Projects Included

## 1. EmployeePostman

A REST API application built using Spring Boot.

### Features

- Create Employee
- Display All Employees
- Raise Employee Salary
- Input Validation
- Global Exception Handling
- H2 Database
- Tested using Postman

### Technologies

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Postman

---

## 2. EmployeeWebApp

A web-based Employee Management System built using Spring MVC and Thymeleaf.

### Features

- Home Page
- Add Employee
- Display Employees
- Raise Salary
- Bootstrap UI
- Form Validation
- H2 Database

### Technologies

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

# Validation Rules

- **Name**
  - Only alphabets allowed
  - Maximum 2 spaces (maximum 3 words)

- **Age**
  - Between 18 and 60

- **Salary**
  - Must be greater than 0

- **Salary Increment**
  - Between 1% and 10%

---

# Database

Both projects use the **H2 In-Memory Database**.

### H2 Console

```
http://localhost:8080/h2-console
```

### JDBC URL

```
jdbc:h2:mem:employeedb
```

### Username

```
sa
```

### Password

```
Leave Blank
```

---

# Repository Structure

```
Employee-Management-System
│
├── EmployeePostman/
│   ├── src/
│   ├── pom.xml
│   └── README.md
│
├── EmployeeWebApp/
│   ├── src/
│   ├── pom.xml
│   └── README.md
│
├── .gitignore
└── README.md
```

---

# Learning Outcomes

Through these projects, I practiced:

- Spring Boot
- Spring MVC
- REST APIs
- Spring Data JPA
- Hibernate
- H2 Database
- Thymeleaf
- Bean Validation
- Exception Handling
- MVC Architecture
- Postman API Testing

---

# Future Improvements

- Update Employee Details
- Delete Employee
- Search Employee by ID
- Pagination and Sorting
- Spring Security Authentication
- MySQL Integration
- Docker Deployment

---

# Author

**Nova Gupta**

Third-Year Computer Science Student  
Learning Spring Boot, Microservices, Full Stack Development, and Cloud Computing.