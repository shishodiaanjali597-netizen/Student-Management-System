-- Database creation
-- CREATE DATABASE studentdb;
USE studentdb;

-- Students table
-- CREATE TABLE students (
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     name VARCHAR(50),
--     email VARCHAR(50),
--     phone VARCHAR(15),
--     section VARCHAR(10),
--     cgpa DECIMAL(3,1)
-- );

-- -- Marks table
-- CREATE TABLE marks (
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     student_id INT,
--     subject VARCHAR(30),
--     marks INT,
--     FOREIGN KEY (student_id) REFERENCES students(id)
-- );

-- -- Attendance table
-- CREATE TABLE attendance (
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     student_id INT,
--     date DATE,
--     status VARCHAR(10),
--     FOREIGN KEY (student_id) REFERENCES students(id)
-- );

-- -- Fees table
-- CREATE TABLE fees (
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     student_id INT,
--     amount DECIMAL(10,2),
--     paid_date DATE,
--     status VARCHAR(10),
--     FOREIGN KEY (student_id) REFERENCES students(id)
-- );

-- -- Admin table
-- CREATE TABLE admin (
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     username VARCHAR(30),
--     password VARCHAR(30)
-- );

-- Admin add karo
-- INSERT INTO admin (username, password) 
-- VALUES ('admin', 'admin123');

-- -- Students add karo
-- INSERT INTO students (name, email, phone, section, cgpa) 
-- VALUES ('Anjali', 'anjali@gmail.com', '9876543210', 'CSD', 8.5);

-- INSERT INTO students (name, email, phone, section, cgpa) 
-- VALUES ('Priya', 'priya@gmail.com', '9876543211', 'CSD', 7.8);

-- INSERT INTO students (name, email, phone, section, cgpa) 
-- VALUES ('Rahul', 'rahul@gmail.com', '9876543212', 'CSE', 8.2);

-- -- Marks add karo
-- INSERT INTO marks (student_id, subject, marks) 
-- VALUES (1, 'Java', 85);
-- INSERT INTO marks (student_id, subject, marks) 
-- VALUES (1, 'DSA', 78);
-- INSERT INTO marks (student_id, subject, marks) 
-- VALUES (2, 'Java', 90);

-- -- Attendance add karo
-- INSERT INTO attendance (student_id, date, status) 
-- VALUES (1, '2026-07-08', 'Present');
-- INSERT INTO attendance (student_id, date, status) 
-- VALUES (2, '2026-07-08', 'Absent');

-- -- Fees add karo
-- INSERT INTO fees (student_id, amount, paid_date, status) 
-- VALUES (1, 50000, '2026-07-01', 'Paid');
-- INSERT INTO fees (student_id, amount, paid_date, status) 
-- VALUES (2, 50000, NULL, 'Pending');
-- SELECT * FROM Admin  ;
-- SELECT * FROM fees;
-- SELECT * FROM attendance;
-- SELECT * FROM marks;
-- SELECT * FROM students ;
-- Saare students dekho

-- Ek student ke marks dekho
-- SELECT * FROM marks WHERE student_id = 1;

-- Average marks nikalo
 -- SELECT student_id, AVG(marks) as average 
-- FROM marks GROUP BY student_id;

-- Attendance count karo
-- SELECT student_id, COUNT(*) as total,
-- SUM(CASE WHEN status='Present' THEN  1 ELSE 0 END) as present
-- FROM attendance GROUP BY student_id;

-- Pending fees wale students
-- SELECT s.name, f.amount, f.status 
-- FROM students s 
-- JOIN fees f ON s.id = f.student_id 
-- WHERE f.status = 'Pending';
