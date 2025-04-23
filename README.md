# 🧑‍💻 Student Details API
🎓 Student Details Management API is a Spring Boot-based RESTful service that manages student and college data using MongoDB. 


## 🚀 Table of Contents

1. [Project Overview](#project-overview)
2. [Technologies Used](#technologies-used)
3. [Project Structure](#project-structure)
4. [API Endpoints](#api-endpoints)
5. [Running the Project](#running-the-project)
6. [Security Configuration](#security-configuration)
7. [Swagger Documentation](#swagger-documentation)
8. [Contributing](#contributing)
9. [License](#license)

## 📌 Project Overview

A Spring Boot-based RESTful API for managing student and college details using MongoDB. This project supports full CRUD operations, gender-based filtering, and includes Swagger integration for testing the endpoints.

--


## 🚀 Features

- 🔍 CRUD operations for **Students** and **Colleges**
- 🏫 College and Department Management
- 🎓 Gender-based filtering for students per department
- 💾 MongoDB for data persistence
- 🔒 Global Exception Handling
- 📘 Swagger UI for interactive API documentation

---

## 🛠️ Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Data MongoDB
- Spring Security (Basic setup)
- Lombok
- Maven
- Swagger 3

## explain

- **Spring Boot**: Framework to build the REST API
- **MongoDB**: NoSQL database for student and college data
- **Swagger**: For automatic API documentation and testing
- **Spring Security**: Basic security and access control
- **Lombok**: To reduce boilerplate code for entities
- **Java**: Required version 11 or higher

---

## 📥 Prerequisites

Before running the project, ensure you have:

- Java 17 or higher
- Maven
- MongoDB (Local or MongoDB Atlas)

---

## 📁 Project Structure
student-details/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/studentsdetails/studentdetails/
│       │       ├── config/
│       │       │   ├── SecurityConfig.java
│       │       │   └── SwaggerConfig.java
│       │       ├── controller/
│       │       │   ├── StudentController.java
│       │       │   └── CollageController.java
│       │       ├── dto/
│       │       │   ├── StudentResponse.java
│       │       │   ├── StudentListResponse.java
│       │       │   ├── CollageResponse.java
│       │       │   └── CollageListResponse.java
│       │       ├── entity/
│       │       │   ├── Students.java
│       │       │   └── Collage.java
│       │       ├── repository/
│       │       │   ├── StudentRepository.java
│       │       │   └── CollageRepository.java
│       │       ├── service/
│       │       │   ├── StudentService.java
│       │       │   ├── CollageService.java
│       │       │   ├── impl/ (or implementation classes if separated)
│       │       │   │   ├── StudentServiceImpl.java
│       │       │   │   └── CollageServiceImpl.java
│       │       └── StudentDetailsApplication.java
│       └── resources/
│           ├── application.properties
│           └── static/
│
├── .gitignore
├── README.md
├── pom.xml
└── mvnw / mvnw.cmd (if using Maven wrapper)



