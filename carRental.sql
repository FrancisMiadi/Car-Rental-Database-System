drop database carrental;
CREATE DATABASE carRental;
USE carRental;


CREATE TABLE Customers (
    Customer_ID VARCHAR(15) PRIMARY KEY,
    First_name VARCHAR(50) NOT NULL,
    Last_name VARCHAR(50) NOT NULL,
    Address VARCHAR(255) NOT NULL,
    Licenses_number VARCHAR(20) NOT NULL,
    Phone VARCHAR(10) NOT NULL
);
CREATE TABLE Employees (
    Employee_ID VARCHAR(15) PRIMARY KEY,
    First_name VARCHAR(50) NOT NULL,
    Last_name VARCHAR(50) NOT NULL,
    Phone VARCHAR(10) NOT NULL,
    Salary DECIMAL(10, 2) NOT NULL,
    Address VARCHAR(255) NOT NULL,
    Gender CHAR(1) NOT NULL,
    emp_Role VARCHAR(50) NOT NULL,
    Hire_date DATE NOT NULL,
    Status bool ,
    password VARCHAR(4)
);
CREATE TABLE Vehicles (
    Vehicle_ID INT AUTO_INCREMENT PRIMARY KEY,
    Power INT,
    Color VARCHAR(30),
    Plate_ID VARCHAR(20) NOT NULL,
    Vehicles_Status VARCHAR(20) NOT NULL DEFAULT 'Available',
    Model VARCHAR(50) NOT NULL,
    Year_of_manufacture INT NOT NULL,
    Number_of_passengers INT,
    Traffic_department_fees DECIMAL(10, 2),
    Daily_rent DECIMAL(10, 2),
    Weekly_rent DECIMAL(10, 2),
    Monthly_rent DECIMAL(10, 2),
    Insurance_payment DECIMAL(10, 2)
);
CREATE TABLE Contract (
    Contract_ID INT AUTO_INCREMENT PRIMARY KEY,
    Start_date DATE NOT NULL,
    End_date DATE NOT NULL,
    Vehicle_ID INT NOT NULL,
    Customer_ID VARCHAR(15) NOT NULL,
    Employee_ID VARCHAR(15) NOT NULL,
    Cost DECIMAL(10, 2) NOT NULL,
    Contract_Status VARCHAR(20) NOT NULL,
    contract_type VARCHAR (20) NOT NULL , 
    FOREIGN KEY (Vehicle_ID) REFERENCES Vehicles(Vehicle_ID)  ON UPDATE CASCADE,
    FOREIGN KEY (Customer_ID) REFERENCES Customers(Customer_ID)  ON UPDATE CASCADE ,
    FOREIGN KEY (Employee_ID) REFERENCES Employees(Employee_ID)  ON UPDATE CASCADE
);
CREATE TABLE Payments (
    Payment_ID INT AUTO_INCREMENT PRIMARY KEY,
    Contract_ID INT NOT NULL,
    Date DATE NOT NULL,
    Amount DECIMAL(10, 2) NOT NULL,
    Method VARCHAR(20) NOT NULL,
    FOREIGN KEY (Contract_ID) REFERENCES Contract(Contract_ID)  ON UPDATE CASCADE 
);
CREATE TABLE Maintenance (
    Receipt_ID INT AUTO_INCREMENT PRIMARY KEY,
    Vehicle_ID INT NOT NULL,
    Employee_ID VARCHAR(15) NOT NULL,
    Cost DECIMAL(10, 2) NOT NULL,
    Description TEXT NOT NULL,
    Company_Email VARCHAR(255),
    Date DATE NOT NULL,
    FOREIGN KEY (Vehicle_ID) REFERENCES Vehicles(Vehicle_ID)  ON UPDATE CASCADE,
    FOREIGN KEY (Employee_ID) REFERENCES Employees(Employee_ID)  ON UPDATE CASCADE
);
INSERT INTO Customers (Customer_ID, First_name, Last_name, Address, Licenses_number, Phone) VALUES
('123456789', 'Ahmad', 'Abu Ali', 'Jerusalem', '1123456789', '0501234567'),
('234567890', 'Yousef', 'Hussein', 'Ramallah', '0234567890', '0591234567'),
('345678901', 'Fatima', 'Khalil', 'Hebron', '1345678901', '0592234567'),
('456789012', 'Leila', 'Haddad', 'Bethlehem', '2456789012', '0593234567'),
('567890123', 'Mohammad', 'Salim', 'Jerusalem', '2567890123', '0502234567'),
('678901234', 'Omar', 'Najjar', 'Nablus', '5678901234', '0594234567'),
('789012345', 'Rania', 'Suleiman', 'Haifa', '7789012345', '0521234567'),
('890123456', 'Hassan', 'Amr', 'Bethlehem', '2890123456', '0595234567'),
('901234567', 'Aya', 'Qasim', 'Jerusalem', '7901234567', '0503234567'),
('012345678', 'Nour', 'Zaher', 'Tulkarm', '3012345678', '0596234567'),
('123450987', 'Ibrahim', 'Hamed', 'Nazareth', '4123450987', '0522234567'),
('234561098', 'Huda', 'Yasin', 'Jenin', '6234561098', '0597234567'),
('345672109', 'Bilal', 'Barakat', 'Jerusalem', '7345672109', '0504234567'),
('456783210', 'Sami', 'Nasser', 'Ramallah', '2456783210', '0598234567'),
('567894321', 'Abeer', 'Khatib', 'Jerusalem', '9567894321', '0505234567'),
('678905432', 'Firas', 'Zaid', 'Ramallah', '3678905432', '0599234567'),
('789016543', 'Hana', 'Darwish', 'Jerusalem', '7789016543', '0506234567'),
('890127654', 'Samer', 'Bashir', 'Nablus', '1890127654', '0590234567'),
('901238765', 'Mona', 'Abbas', 'Jerusalem', '0901238765', '0507234567'),
('012349876', 'Karim', 'Hassan', 'Jenin', '4012349876', '0591234568'),
('123450988', 'Nadia', 'Salman', 'Jerusalem', '4123450988', '0508234567'),
('234561099', 'Walid', 'Ghanem', 'Bethlehem', '2234561099', '0592234568'),
('345672110', 'Sara', 'Zaki', 'Jerusalem', '3345672110', '0509234567'),
('456783211', 'Adel', 'Ali', 'Haifa', '9456783211', '0523234567'),
('567894322', 'Lina', 'Odeh', 'Ramallah', '8567894322', '0593234568'),
('678905433', 'Mahmoud', 'Taha', 'Jerusalem', '1678905433', '0510234567'),
('789016544', 'Rami', 'Harb', 'Jerusalem', '2789016544', '0511234567'),
('890127655', 'Hala', 'Issa', 'Nazareth', '3890127655', '0524234567'),
('901238766', 'Zain', 'Rahman', 'Jerusalem', '6901238766', '0512234567'),
('012349877', 'Nour', 'Mansour', 'Jerusalem', '6012349877', '0513234567'),
('123450989', 'Ayman', 'Daher', 'Jerusalem', '6123450989', '0514234567'),
('234561100', 'Hussein', 'Shahin', 'Ramallah', '1234561100', '0593234569'),
('345672111', 'Maha', 'Amin', 'Jerusalem', '1345672111', '0515234567'),
('456783212', 'Fadi', 'Rashid', 'Jerusalem', '1456783212', '0516234567'),
('567894323', 'Nida', 'Jamal', 'Haifa', '1567894323', '0525234567'),
('678905434', 'Tariq', 'Naji', 'Jerusalem', '1678905434', '0517234567'),
('789016545', 'Lama', 'Sabri', 'Nablus', '1789016545', '0594234568'),
('890127656', 'Mazin', 'Habib', 'Jerusalem', '2890127656', '0518234567'),
('901238767', 'Nour', 'Yousef', 'Jerusalem', '2901238767', '0519234567'),
('012349878', 'Saleh', 'Ibrahim', 'Hebron', '3012349878', '0595234568'),
('123450990', 'Layan', 'Malik', 'Jerusalem', '5123450990', '0520234567'),
('234561101', 'Fadi', 'Sultan', 'Jerusalem', '8234561101', '0521234567'),
('345672112', 'Mariam', 'Qassem', 'Jerusalem', '1345672112', '0522234567'),
('456783213', 'Imad', 'Bakir', 'Jerusalem', '2456783213', '0523234568'),
('567894324', 'Yara', 'Rahim', 'Jerusalem', '3567894324', '0524234568'),
('678905435', 'Ali', 'Najjar', 'Jerusalem', '8678905435', '0525234568'),
('789016546', 'Salwa', 'Hatem', 'Jerusalem', '4789016546', '0526234567'),
('890127657', 'Zahra', 'Nour', 'Jerusalem', '5890127657', '0527234567'),
('901238768', 'Issa', 'Taleb', 'Jerusalem', '6901238768', '0528234567'),
('012349879', 'Rima', 'Adel', 'Jerusalem', '4012349879', '0529234567');

INSERT INTO Employees (Employee_ID, First_name, Last_name, Phone, Salary, Address, Gender, emp_Role, Hire_date, Status,password) VALUES
('111223344', 'Ahmed', 'Al-Jabari', '0501112233', 5000.00, 'Jerusalem', 'M', 'Manager', '2022-02-15',true,'1111'),
('222334455', 'Yousef', 'Khatib', '0502223344', 4500.00, 'Jerusalem', 'M', 'Accountant', '2022-03-10',true,null),
('333333333', 'Layla', 'Hussein', '0503334455', 4000.00, 'Jerusalem', 'F', 'DB Administration', '2022-04-20',true,'3333'),
('444556677', 'Khalid', 'Abu Nasser', '0504445566', 4200.00, 'Jerusalem', 'M', 'Customer Service', '2022-05-25',true,null),
('555667788', 'Nadia', 'Said', '0505556677', 3800.00, 'Jerusalem', 'F', 'Receptionist', '2022-06-15',true,null),
('666778899', 'Omar', 'Salim', '0506667788', 4600.00, 'Jerusalem', 'M', 'Fleet Manager', '2022-07-05',true,null),
('777889900', 'Rania', 'Darwish', '0507778899', 4000.00, 'Jerusalem', 'F', 'Marketing Specialist', '2022-08-10',true,null),
('888990011', 'Ali', 'Mahmoud', '0508889900', 4100.00, 'Jerusalem', 'M', 'Technician', '2022-09-01',true,null),
('999001122', 'Mona', 'Hassan', '0509990011', 3900.00, 'Jerusalem', 'F', 'HR Specialist', '2022-10-20',true,null),
('100112233', 'Salem', 'Ali', '0501001122', 4200.00, 'Jerusalem', 'M', 'Driver', '2022-11-30',true,null),
('101223344', 'Fatima', 'Rahman', '0501012233', 3500.00, 'Jerusalem', 'F', 'Cleaner', '2023-01-14',true,null),
('112334455', 'Bilal', 'Zaher', '0501123344', 4300.00, 'Jerusalem', 'M', 'Mechanic', '2023-02-22',true,null),
('123445566', 'Huda', 'Suleiman', '0501234455', 3700.00, 'Jerusalem', 'F', 'Customer Service', '2023-03-08',true,null),
('134556677', 'Tariq', 'Jaber', '0501345566', 4500.00, 'Jerusalem', 'M', 'Accountant', '2023-04-11',true,null),
('145667788', 'Zainab', 'Yasin', '0501456677', 3400.00, 'Jerusalem', 'F', 'DB Administration', '2023-05-17',true,'2222');


INSERT INTO Vehicles (Power, Color, Plate_ID, Model, Year_of_manufacture, Number_of_passengers, Traffic_department_fees, Daily_rent, Weekly_rent, Monthly_rent, Insurance_payment) VALUES
(85, 'Red', '123-45-678', 'Hyundai i10', 2020, 4, 420.50, 100.00, 650.00, 2300.00, 170.00),
(83, 'Blue', '234-56-789', 'Kia Picanto', 2021, 4, 415.00, 95.00, 620.00, 2200.00, 165.00),
(98, 'White', '345-67-890', 'Chevrolet Spark', 2019, 4, 410.75, 90.00, 600.00, 2100.00, 160.00),
(101, 'Black', '456-78-901', 'Fiat 500', 2021, 4, 425.00, 120.00, 700.00, 2400.00, 175.00),
(158, 'Silver', '567-89-012', 'Honda Civic', 2020, 5, 445.00, 170.00, 1100.00, 3800.00, 200.00),
(150, 'Gray', '678-90-123', 'Ford Focus', 2018, 5, 440.00, 160.00, 1000.00, 3500.00, 190.00),
(170, 'Red', '789-01-234', 'Volkswagen Golf', 2022, 5, 460.00, 180.00, 1200.00, 4000.00, 210.00),
(155, 'Blue', '890-12-345', 'Mazda 3', 2019, 5, 450.00, 165.00, 1050.00, 3600.00, 195.00),
(132, 'White', '901-23-456', 'Toyota Corolla', 2021, 5, 435.00, 150.00, 950.00, 3200.00, 180.00),
(147, 'Black', '012-34-567', 'Hyundai Elantra', 2020, 5, 440.00, 155.00, 980.00, 3300.00, 185.00),
(381, 'Green', '123-45-678', 'Toyota Land Cruiser', 2019, 7, 510.00, 300.00, 2200.00, 7500.00, 300.00),
(518, 'White', '234-56-789', 'Land Rover Range Rover', 2021, 7, 600.00, 350.00, 2600.00, 8500.00, 350.00),
(169, 'Blue', '345-67-890', 'Nissan X-Trail', 2020, 5, 460.00, 160.00, 1150.00, 3900.00, 210.00),
(176, 'Silver', '456-78-901', 'Toyota RAV4', 2018, 5, 480.00, 170.00, 1180.00, 4000.00, 220.00),
(355, 'Black', '567-89-012', 'Chevrolet Suburban', 2019, 7, 500.00, 280.00, 2100.00, 7200.00, 290.00);

INSERT INTO Maintenance (Vehicle_ID, Employee_ID, Cost, Description, Company_Email, Date) VALUES
(3, '111223344', 350.00, 'Oil change and tire rotation', 'service@autocarepro.com', '2023-03-15'),
(5, '222334455', 500.00, 'Brake replacement', 'maintenance@carfixit.com', '2023-04-10'),
(8, '333333333', 1200.00, 'Engine repair', 'repairs@mechmaster.com', '2023-05-05'),
(11, '444556677', 150.00, 'Battery replacement', 'support@fixmyride.com', '2023-06-20'),
(2, '555667788', 800.00, 'Transmission repair', 'service@quickfixauto.com', '2023-07-18'),
(14, '666778899', 200.00, 'Air filter and spark plugs', 'maintenance@speedyrepair.com', '2023-08-12'),
(7, '777889900', 600.00, 'Suspension repair', 'repairs@autotech.com', '2023-09-25'),
(10, '888990011', 100.00, 'Headlight replacement', 'support@vehiclecare.com', '2023-10-03'),
(1, '999001122', 400.00, 'AC system repair', 'service@fixmycar.com', '2023-11-10'),
(12, '100112233', 250.00, 'Exhaust system repair', 'maintenance@autorepairhub.com', '2023-12-01'),
(4, '101223344', 550.00, 'Fuel system cleaning', 'repairs@carcare.com', '2023-01-15'),
(15, '112334455', 300.00, 'Brake fluid change', 'support@autofixit.com', '2023-02-20'),
(6, '123445566', 450.00, 'Wheel alignment', 'service@mechrepair.com', '2023-03-05'),
(9, '134556677', 700.00, 'Cooling system repair', 'maintenance@carserv.com', '2023-04-10'),
(13, '145667788', 650.00, 'Timing belt replacement', 'repairs@autoclinic.com', '2023-05-15'),
(5, '111223344', 370.00, 'Spark plug replacement', 'service@vehiclerepair.com', '2023-06-20'),
(8, '222334455', 300.00, 'Brake pad replacement', 'maintenance@carfixpro.com', '2023-07-25'),
(10, '333333333', 900.00, 'Transmission flush', 'repairs@mechfix.com', '2023-08-15'),
(1, '444556677', 450.00, 'Radiator replacement', 'support@carcarepro.com', '2023-09-10'),
(11, '555667788', 400.00, 'Clutch replacement', 'service@autoexpert.com', '2023-10-05');

INSERT INTO Contract (Start_date, End_date, Vehicle_ID, Customer_ID, Employee_ID, Cost, Contract_Status, Contract_type) VALUES
('2023-01-01', '2023-01-10', 1, '123456789', '111223344', 1000.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 650.00
('2023-01-15', '2023-01-22', 2, '234567890', '222334455', 665.00, 'Expired', 'Weekly'), -- 7 days, weekly rent = 620.00
('2023-01-23', '2023-01-30', 3, '345678901', '333333333', 800.00, 'Expired', 'Weekly'), -- 7 days, weekly rent = 600.00
('2023-02-01', '2023-02-03', 4, '456789012', '444556677', 240.00, 'Expired', 'Daily'), -- 3 days, daily rent = 80.00
('2023-02-05', '2023-02-07', 5, '567890123', '555667788', 510.00, 'Expired', 'Daily'), -- 3 days, daily rent = 170.00
('2023-02-10', '2023-02-20', 6, '678901234', '666778899', 1050.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1050.00
('2023-03-01', '2023-03-07', 7, '789012345', '777889900', 900.00, 'Expired', 'Weekly'), -- 7 days, weekly rent = 900.00
('2023-03-10', '2023-03-12', 8, '890123456', '888990011', 240.00, 'Expired', 'Daily'), -- 3 days, daily rent = 80.00
('2023-03-15', '2023-03-25', 9, '901234567', '999001122', 1050.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1050.00
('2023-04-01', '2023-04-30', 10, '012345678', '100112233', 3000.00, 'Expired', 'Monthly'), -- 30 days, monthly rent = 3000.00
('2023-04-05', '2023-04-10', 11, '123450987', '101223344', 600.00, 'Expired', 'Daily'), -- 6 days, daily rent = 100.00
('2023-04-15', '2023-04-25', 12, '234561098', '112334455', 1350.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1350.00
('2023-05-01', '2023-05-10', 13, '345672109', '123445566', 1450.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1450.00
('2023-05-11', '2023-05-20', 14, '456783210', '134556677', 1550.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1550.00
('2023-05-21', '2023-05-30', 15, '567894321', '145667788', 1650.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1650.00
('2023-06-01', '2023-06-10', 1, '678905432', '111223344', 1750.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1750.00
('2023-06-11', '2023-06-20', 2, '789016543', '222334455', 1900.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1900.00
('2024-01-01', '2024-01-31', 3, '345678901', '333333333', 3000.00, 'Expired', 'Monthly'), -- 31 days, monthly rent = 3000.00
('2024-01-05', '2024-01-10', 4, '456789012', '444556677', 500.00, 'Expired', 'Daily'), -- 6 days, daily rent = 100.00
('2024-01-11', '2024-01-21', 5, '567890123', '555667788', 1050.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1050.00
('2024-02-01', '2024-02-28', 6, '678901234', '666778899', 3000.00, 'Expired', 'Monthly'), -- 28 days, monthly rent = 3000.00
('2024-02-05', '2024-02-10', 7, '789012345', '777889900', 450.00, 'Expired', 'Daily'), -- 6 days, daily rent = 75.00
('2024-02-15', '2024-02-25', 8, '890123456', '888990011', 950.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 950.00
('2024-03-01', '2024-03-31', 9, '901234567', '999001122', 3100.00, 'Expired', 'Monthly'), -- 31 days, monthly rent = 3100.00
('2024-03-05', '2024-03-12', 10, '012345678', '100112233', 800.00, 'Expired', 'Daily'), -- 8 days, daily rent = 100.00
('2024-03-15', '2024-03-25', 11, '123450987', '101223344', 1250.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1250.00
('2024-04-01', '2024-04-30', 12, '234561098', '112334455', 3200.00, 'Expired', 'Monthly'), -- 30 days, monthly rent = 3200.00
('2024-04-05', '2024-04-15', 13, '345672109', '123445566', 1450.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1450.00
('2024-04-20', '2024-04-30', 14, '456783210', '134556677', 1550.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1550.00
('2024-05-01', '2024-05-10', 15, '567894321', '145667788', 1650.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1650.00
('2024-05-15', '2024-05-25', 1, '678905432', '111223344', 1000.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1000.00
('2024-05-20', '2024-06-10', 2, '789016543', '222334455', 1800.00, 'Expired', 'Weekly'), -- 21 days, weekly rent = 1800.00
('2024-05-25', '2024-06-15', 3, '345678901', '333333333', 2700.00, 'Expired', 'Monthly'),
('2024-01-01', '2024-01-31', 3, '345678901', '333333333', 3000.00, 'Expired', 'Monthly'), -- 31 days, monthly rent = 3000.00
('2024-01-05', '2024-01-10', 4, '456789012', '444556677', 600.00, 'Expired', 'Daily'), -- 6 days, daily rent = 100.00
('2024-01-11', '2024-01-21', 5, '567890123', '555667788', 1700.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1700.00
('2024-02-01', '2024-02-28', 6, '678901234', '666778899', 3600.00, 'Expired', 'Monthly'), -- 28 days, monthly rent = 3600.00
('2024-02-05', '2024-02-10', 7, '789012345', '777889900', 450.00, 'Expired', 'Daily'), -- 6 days, daily rent = 75.00
('2024-02-15', '2024-02-25', 8, '890123456', '888990011', 900.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 900.00
('2024-03-01', '2024-03-31', 9, '901234567', '999001122', 3100.00, 'Expired', 'Monthly'), -- 31 days, monthly rent = 3100.00
('2024-03-05', '2024-03-12', 10, '012345678', '100112233', 800.00, 'Expired', 'Daily'), -- 8 days, daily rent = 100.00
('2024-03-15', '2024-03-25', 11, '123450987', '101223344', 1250.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1250.00
('2024-04-01', '2024-04-30', 12, '234561098', '112334455', 3200.00, 'Expired', 'Monthly'), -- 30 days, monthly rent = 3200.00
('2024-04-05', '2024-04-15', 13, '345672109', '123445566', 1450.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1450.00
('2024-04-20', '2024-04-30', 14, '456783210', '134556677', 1550.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1550.00
('2024-05-01', '2024-05-10', 15, '567894321', '145667788', 1650.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1650.00
('2024-05-15', '2024-05-25', 1, '678905432', '111223344', 1000.00, 'Expired', 'Weekly'), -- 10 days, weekly rent = 1000.00
('2024-05-20', '2024-06-10', 2, '789016543', '222334455', 1800.00, 'Expired', 'Weekly'), -- 21 days, weekly rent = 1800.00
('2024-05-25', '2024-06-15', 3, '345678901', '333333333', 2700.00, 'Expired', 'Monthly'), -- 21 days, monthly rent = 2700.00
('2024-05-01', '2024-05-07', 4, '456789012', '444556677', 700.00, 'Expired', 'Daily'), -- 7 days, daily rent = 100.00
('2024-05-10', '2024-05-17', 5, '567890123', '555667788', 1190.00, 'Expired', 'Daily'), -- 7 days, daily rent = 170.00
('2024-05-15', '2024-05-22', 6, '678901234', '666778899', 1650.00, 'Expired', 'Weekly'), -- 7 days, weekly rent = 1650.00
('2024-06-01', '2024-06-15', 7, '789012345', '777889900', 900.00, 'Pending', 'Weekly'),
('2024-06-01', '2024-06-10', 1, '123456789', '111223344', 1000.00, 'Active', 'Daily'), -- 10 days, daily rent = 100.00
('2024-06-05', '2024-06-15', 2, '234567890', '222334455', 950.00, 'Active', 'Weekly'), -- 10 days, weekly rent = 950.00
('2024-06-08', '2024-06-18', 3, '345678901', '333333333', 1200.00, 'Active', 'Weekly'), -- 10 days, weekly rent = 1200.00
('2024-06-12', '2024-06-21', 4, '456789012', '444556677', 900.00, 'Active', 'Daily'); -- 10 days, daily rent = 90.00
INSERT INTO Payments (Contract_ID, Date, Amount, Method) VALUES
(1, '2022-12-31', 1000.00, 'Bank Checks'),
(2, '2023-01-14', 665.00, 'Visa'),
(3, '2023-01-22', 800.00, 'Cash'),
(4, '2023-01-31', 240.00, 'Visa'),
(5, '2023-02-04', 510.00, 'Bank Checks'),
(6, '2023-02-09', 1050.00, 'Cash'),
(7, '2023-02-28', 900.00, 'Visa'),
(8, '2023-03-09', 240.00, 'Bank Checks'),
(9, '2023-03-14', 1050.00, 'Visa'),
(10, '2023-03-31', 3000.00, 'Cash'),
(11, '2023-04-04', 600.00, 'Visa'),
(12, '2023-04-14', 1350.00, 'Bank Checks'),
(13, '2023-04-30', 1450.00, 'Cash'),
(14, '2023-05-10', 1550.00, 'Visa'),
(15, '2023-05-20', 1650.00, 'Bank Checks'),
(16, '2023-05-31', 1750.00, 'Cash'),
(17, '2023-06-10', 1900.00, 'Visa'),
(18, '2023-12-31', 3000.00, 'Cash'),
(19, '2024-01-04', 500.00, 'Bank Checks'),
(20, '2024-01-10', 1050.00, 'Visa'),
(21, '2024-01-31', 3000.00, 'Cash'),
(22, '2024-02-04', 450.00, 'Visa'),
(23, '2024-02-14', 950.00, 'Bank Checks'),
(24, '2024-02-29', 3100.00, 'Cash'),
(25, '2024-03-04', 800.00, 'Visa'),
(26, '2024-03-14', 1250.00, 'Bank Checks'),
(27, '2024-03-31', 3200.00, 'Cash'),
(28, '2024-04-04', 1450.00, 'Visa'),
(29, '2024-04-19', 1550.00, 'Bank Checks'),
(30, '2024-04-30', 1650.00, 'Cash'),
(31, '2024-05-14', 1000.00, 'Visa'),
(32, '2024-05-19', 1800.00, 'Bank Checks'),
(33, '2024-05-24', 2700.00, 'Cash'),
(34, '2024-05-31', 3000.00, 'Visa'),
(35, '2024-06-04', 600.00, 'Bank Checks'),
(36, '2024-06-07', 1700.00, 'Cash'),
(37, '2024-06-11', 3600.00, 'Visa'),
(38, '2024-06-01', 450.00, 'Cash'),
(39, '2024-06-05', 900.00, 'Visa'),
(40, '2024-06-08', 3100.00, 'Bank Checks'),
(41, '2024-06-12', 800.00, 'Cash'),
(42, '2024-06-11', 1250.00, 'Visa'),
(43, '2024-06-14', 3200.00, 'Bank Checks'),
(44, '2024-06-20', 1450.00, 'Cash'),
(45, '2024-06-25', 1550.00, 'Visa'),
(46, '2024-06-28', 1650.00, 'Bank Checks'),
(47, '2024-06-30', 1000.00, 'Cash'),
(48, '2024-06-29', 1800.00, 'Visa'),
(49, '2024-06-24', 2700.00, 'Bank Checks'),
(50, '2024-06-21', 700.00, 'Cash'),
(51, '2024-06-18', 1190.00, 'Visa'),
(52, '2024-06-15', 1650.00, 'Bank Checks'),
(53, '2024-06-12', 900.00, 'Cash'),
(54, '2024-06-10', 1000.00, 'Visa'),
(55, '2024-06-08', 950.00, 'Bank Checks'),
(56, '2024-06-05', 1200.00, 'Cash'),
(57, '2024-06-04', 900.00, 'Visa');


-- sum in each year
select YEAR(p.Date) as Payment_year , SUM(p.Amount) as Total
from Payments p
group by Payment_year;

-- max
select p.Payment_ID, p.Amount
from Payments p 
where p.Amount = (select max(p1.Amount) from Payments P1);

-- min 
select p.Payment_ID, p.Amount
from Payments p 
where p.Amount = (select min(p1.Amount) from Payments P1);

-- avg 
select YEAR(p.Date) as P_year , ROUND(AVG(p.Amount),2) as Average 
from Payments p
group by P_year;


-- method frequency

select count(p.method) as method_frequency , p.method
from Payments p
group by p.method;

select password from Employees where Employee_ID=333333333;
