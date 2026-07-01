# EmployeePostman

A Spring Boot REST API project for managing employees using **H2 Database**, **Spring Data JPA**, and **Hibernate**. This application allows users to create employees, display all employees, and update employee salaries through REST APIs tested with Postman.

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Postman

---

## Features

- Create Employee
- Display All Employees
- Raise Employee Salary
- Input Validation
- Global Exception Handling
- H2 Database Integration

---

## Validation Rules

### Name

- Only alphabets are allowed.
- Maximum 2 spaces (maximum 3 words).

Example:

```
Nova
Nova Gupta
```

---

### Age

- Minimum: 18
- Maximum: 60

---

### Salary

- Must be greater than 0.

---

### Salary Percentage

- Must be between 1 and 10.

---

## REST APIs

### Create Employee

```
POST /employee
```

Request Body

```json
{
  "name":"Nova Gupta",
  "age":21,
  "salary":30000,
  "designation":"Developer"
}
```

---

### Display Employees

```
GET /employee
```

---

### Raise Salary

```
PUT /employee/raise?name=Nova Gupta&percentage=5
```

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
EmployeePostman
│
├── controller
├── entity
├── repository
├── service
├── exception
├── resources
│     └── application.properties
└── EmployeePostmanApplication.java
```

---

## Learning Outcomes

- Spring Boot REST APIs
- CRUD Operations
- H2 Database
- Hibernate ORM
- Bean Validation
- Exception Handling
- Postman API Testing

---
