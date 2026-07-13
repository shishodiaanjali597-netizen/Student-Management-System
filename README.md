# Student Management System

A backend project built with Java + JDBC + MySQL to manage student records, marks, attendance, and fees.

## Features
- Add, View, Update, Delete Students
- Marks Management
- Attendance Tracking
- Fee Management
- Menu driven console application

## Tech Stack
- Java
- JDBC
- MySQL
- Spring Boot (coming soon)
- JWT Authentication (coming soon)
- AWS Deployment (coming soon)

## Database Tables
| Table | Description |
|-------|-------------|
| students | Student personal details |
| marks | Subject wise marks |
| attendance | Daily attendance |
| fees | Fee payment records |
| admin | Admin login credentials |

## Project Structure
src/
├── DatabaseConnection.java  — MySQL connection
├── Student.java             — Student model class
├── StudentDAO.java          — Student CRUD operations
├── MarksDAO.java            — Marks operations
├── AttendanceDAO.java       — Attendance operations
├── FeesDAO.java             — Fees operations
└── Main.java                — Menu driven program

## Prerequisites
- Java JDK 8+
- MySQL 8.0
- MySQL Connector JAR

## Setup
1. MySQL install karo
2. MySQL Connector JAR download karo
   https://dev.mysql.com/downloads/connector/j/
3. JAR file lib folder mein rakho
4. Database.sql run karo MySQL Workbench mein
5. DatabaseConnection.java mein password update karo

## How to Run
**Compile:**
javac -cp ".;..\lib\mysql-connector-j-9.7.0.jar" *.java
**Run:**
java -cp ".;..\lib\mysql-connector-j-9.7.0.jar" Main


## Menu Options
1. Add Student
2. View All Students
3. Update Student Email
4. Delete Student
5. Exit

## Future Enhancements
- Spring Boot upgrade
- REST APIs
- JWT Authentication
- AI Chatbot integration
- AWS Deployment

## Author
**Anjali Shishodia**
B.Tech CSD | IMS Engineering College, Ghaziabad
GitHub: github.com/shishodiaanjali597-netizen
LinkedIn: linkedin.com/in/anjali-shishodia-678b08328
