CREATE DATABASE School_Management
GO
USE School_Management;

CREATE TABLE Course(
subject_code VARCHAR(30),
name_subject VARCHAR(50) NOT NULL,
credit INTEGER,
PRIMARY KEY(subject_code)
);

CREATE TABLE Classes(
subject_code VARCHAR(30),
room_number VARCHAR(10) DEFAULT 'undecided',
weekday VARCHAR(10) DEFAULT 'undecided',
time VARCHAR(10),
PRIMARY KEY(subject_code),
CONSTRAINT FK_CourseClasses 
FOREIGN KEY (subject_code) REFERENCES Course(subject_code) ON UPDATE CASCADE ON DELETE CASCADE
);


CREATE TABLE Staff(
id_staff VARCHAR(20),
name_staff VARCHAR(50),
gender VARCHAR(20),
salary INTEGER,
PRIMARY KEY(id_staff),
CONSTRAINT CHK_gender_staff CHECK(gender IN('Male','Female'))
);

CREATE TABLE Tuition(
tuition_id VARCHAR(20),
fee INTEGER NOT NULL,
paid_or_unpaid INTEGER CHECK(paid_or_unpaid IN(0,1))
PRIMARY KEY(tuition_id)
);

CREATE TABLE Student(
roll_no VARCHAR(20),
section VARCHAR(20),
name_student VARCHAR(50),
gender VARCHAR(20),
tuition_id VARCHAR(20)
PRIMARY KEY(roll_no),
CONSTRAINT CHK_gender_student CHECK(gender IN('Male','Female')),
CONSTRAINT FK_TuitionStudent
FOREIGN KEY (tuition_id) REFERENCES Tuition(tuition_id) ON UPDATE CASCADE ON DELETE SET NULL
);




CREATE TABLE Teach(
id_staff VARCHAR(20),
subject_code VARCHAR(30) NOT NULL,
PRIMARY KEY(id_staff,subject_code),
CONSTRAINT FK_ClassesTeach
FOREIGN KEY (subject_code) REFERENCES Classes(subject_code) ON UPDATE CASCADE ON DELETE CASCADE,
CONSTRAINT FK_StaffTeach
FOREIGN KEY (id_staff) REFERENCES Staff(id_staff) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Study(
roll_no VARCHAR(20) NOT NULL,
subject_code VARCHAR(30) NOT NULL,
PRIMARY KEY(roll_no,subject_code),
CONSTRAINT FK_ClassesStudy
FOREIGN KEY (subject_code) REFERENCES Classes(subject_code) ON UPDATE CASCADE ON DELETE CASCADE,
CONSTRAINT FK_StudentStudy
FOREIGN KEY (roll_no) REFERENCES Student(roll_no) ON UPDATE CASCADE ON DELETE CASCADE
);



INSERT INTO Course VALUES('IT01IU','Principle Database Management',2);
INSERT INTO Course VALUES('IT02IU','Principle Database Management LAB',2);
INSERT INTO Course VALUES('IT03IU','Web Development',2);
INSERT INTO Course VALUES('IT04IU','Web Development LAB',2);
INSERT INTO Course VALUES('IT05UN','Skills for Communicating Information',3);
INSERT INTO Course VALUES('IT08IU','Computer Architecture',2);
INSERT INTO Course VALUES('IT09IU','Computer Architecture LAB',2);
INSERT INTO Course VALUES('IT10IU','Introduction to Artificial Intelligence',2);
INSERT INTO Course VALUES ('IT11IU','Introduction to Artificial Intelligence LAB',2);
INSERT INTO Course VALUES('PH03IU','Physics 3', 4); 
INSERT INTO Course VALUES('PH01IU','Physics 1', 2);


INSERT INTO Classes VALUES('IT01IU','A1-202','Friday','1 p.m');
INSERT INTO Classes VALUES('IT02IU','LA1-605','Monday','8 a.m');
INSERT INTO Classes VALUES('IT03IU','A1-404','Wednesday','8 a.m');
INSERT INTO Classes VALUES('IT04IU','LA1-606','Tuesday','8 a.m');
INSERT INTO Classes VALUES('IT05UN','A2-408','Tuesday','1 p.m');
INSERT INTO Classes(subject_code,time) VALUES('IT08IU','1 p.m');
INSERT INTO Classes(subject_code) VALUES('IT09IU');
INSERT INTO Classes(subject_code) VALUES('IT10IU');
INSERT INTO Classes(subject_code,weekday,time) VALUES ('IT11IU','Friday','8 a.m');
INSERT INTO Classes VALUES('PH03IU','A1-403','Tuesday', '1 p.m'); 
INSERT INTO Classes VALUES('PH01IU','A2-408','Wednesday', '1 p.m');


--->Insert Tuition
INSERT INTO Tuition VALUES('S001','32540000',1);
INSERT INTO Tuition VALUES('S002','23440000',1);
INSERT INTO Tuition VALUES('S003','20545000',0);
INSERT INTO Tuition VALUES('S004','16330000',0);
INSERT INTO Tuition VALUES('S005','30243000',1);
INSERT INTO Tuition VALUES('S006','36760000',1);
INSERT INTO Tuition VALUES('S007','10240000',0);
INSERT INTO Tuition VALUES('S008','19530000',0);
INSERT INTO Tuition VALUES('S009','13400000',1);
INSERT INTO Tuition VALUES('S010','24740000',0);

INSERT INTO Student VALUES('ITITIU13232','IT','Donald Trump','Male','S001');

INSERT INTO Study VALUES('ITITIU13232','IT05UN');
INSERT INTO Study VALUES('ITITIU13232','IT01IU');
INSERT INTO Study VALUES('ITITIU13232','IT02IU');
INSERT INTO Study VALUES('ITITIU13232','IT03IU');
INSERT INTO Study VALUES('ITITIU13232','IT04IU');
INSERT INTO Study VALUES('ITITIU13232','PH01IU');

----
INSERT INTO Student VALUES('ITITIU14785','IT','Barack Obama','Male','S002');

INSERT INTO Study VALUES('ITITIU14785','IT01IU');
INSERT INTO Study VALUES('ITITIU14785','IT01IU');
INSERT INTO Study VALUES('ITITIU14785','IT02IU');
INSERT INTO Study VALUES('ITITIU14785','IT09IU');
INSERT INTO Study VALUES('ITITIU14785','IT11IU');
INSERT INTO Study VALUES('ITITIU14785','IT08IU');

INSERT INTO Student VALUES('BABAIU15555','BA','Captain Marvel','Female','S003');

INSERT INTO Study VALUES('BABAIU15555','PH03IU');
INSERT INTO Study VALUES('BABAIU15555','IT09IU');
INSERT INTO Study VALUES('BABAIU15555','IT04IU');
INSERT INTO Study VALUES('BABAIU15555','IT08IU');

INSERT INTO Student VALUES('CECEIU16542','CE','Iron Man','Male','S004');

INSERT INTO Study VALUES('CECEIU16542','IT02IU');
INSERT INTO Study VALUES('CECEIU16542','PH03IU');
INSERT INTO Study VALUES('CECEIU16542','IT05UN');

INSERT INTO Student VALUES('IEIEIU18456','ISE','Hello Kitty','Female','S005');

INSERT INTO Study VALUES('IEIEIU18456','IT02IU');
INSERT INTO Study VALUES('IEIEIU18456','IT04IU');

INSERT INTO Student VALUES('BTBTIU17562','BT','Kim Jong Un','Male','S006');

INSERT INTO Study VALUES('BTBTIU17562','IT03IU');
INSERT INTO Study VALUES('BTBTIU17562','IT09IU');
INSERT INTO Study VALUES('BTBTIU17562','IT04IU');
INSERT INTO Study VALUES('BTBTIU17562','IT08IU');

INSERT INTO Student VALUES('BABAIU15234','BA','Jackie Chan','Male','S007');

INSERT INTO Study VALUES('BABAIU15234','PH03IU');
INSERT INTO Study VALUES('BABAIU15234','IT05UN');
INSERT INTO Study VALUES('BABAIU15234','IT02IU');
INSERT INTO Study VALUES('BABAIU15234','IT01IU');

INSERT INTO Student VALUES('CECEIU17878','CE','Lionel Messi','Male','S008');

INSERT INTO Study VALUES('CECEIU17878','IT05UN');
INSERT INTO Study VALUES('CECEIU17878','IT04IU');
INSERT INTO Study VALUES('CECEIU17878','IT11IU');

INSERT INTO Student VALUES('IEIEIU19236','ISE','Cristiano Ronaldo','Male','S009');

INSERT INTO Study VALUES('IEIEIU19236','IT09IU');
INSERT INTO Study VALUES('IEIEIU19236','PH03IU');
INSERT INTO Study VALUES('IEIEIU19236','IT11IU');
INSERT INTO Study VALUES('IEIEIU19236','IT08IU');

INSERT INTO Student VALUES('BTBTIU18649','BT','Edogawa Conan','Male','S010');

INSERT INTO Study VALUES('BTBTIU18649','IT11IU');
INSERT INTO Study VALUES('BTBTIU18649','IT04IU');
INSERT INTO Study VALUES('BTBTIU18649','IT02IU');



INSERT INTO Staff VALUES('IT1','Duyen', 'female',47000000);
INSERT INTO Staff VALUES ('IT2','Ngoc','male',55000000);
INSERT INTO Staff VALUES ('IT3','Thanh','male',60000000);
INSERT INTO Staff VALUES ('BA1','Bill Gate', 'male',45000000);
INSERT INTO Staff VALUES ('BT1','Bruce Lee', 'male',67000000);
INSERT INTO Staff VALUES ('IE1','Batman', 'male',66000000);
INSERT INTO Staff VALUES ('CE1','Narkoth', 'male',64000000);
INSERT INTO Staff VALUES ('BT2','Yena', 'female',40000000);


INSERT INTO Teach VALUES('IT1','IT01IU');
INSERT INTO Teach VALUES('IT1','IT03IU');
INSERT INTO Teach VALUES ('IT2','IT02IU');
INSERT INTO Teach VALUES ('IT2','IT09IU');
INSERT INTO Teach VALUES ('IT3','IT03IU');
INSERT INTO Teach VALUES ('IT3','IT01IU');
INSERT INTO Teach VALUES('BA1','PH03IU');
INSERT INTO Teach VALUES('BA1','IT11IU');
INSERT INTO Teach VALUES('BT1','IT09IU');
INSERT INTO Teach VALUES('BT1','IT04IU');
INSERT INTO Teach VALUES('IE1','IT11IU');
INSERT INTO Teach VALUES('IE1','IT05UN');
INSERT INTO Teach VALUES('CE1','IT04IU');
INSERT INTO Teach VALUES('CE1','IT08IU');
INSERT INTO Teach VALUES('BT2','IT05UN');
INSERT INTO Teach VALUES('BT2','PH03IU');
INSERT INTO Teach VALUES('CE1','PH01IU');


SELECT * FROM Course;
SELECT * FROM Classes;
SELECT * FROM Staff;
SELECT * FROM Teach;
SELECT * FROM Student;
SELECT * FROM Study;
SELECT * FROM Tuition;
