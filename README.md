# 🚗 Vehicle Leasing Database Management System  

## 📌 Overview  
This **university project** focuses on designing and implementing a **database management system (DBMS)** for a **Jerusalem-based car rental company**. The goal is to transition from **manual record-keeping (notebooks, papers, and Excel sheets) to a digital database system**, improving efficiency and data management.  

## 💡 Features  
- **Customer Management:** Store customer details, including name, address, job, license number, and contact information.  
- **Employee Management:** Track employee details such as role, salary, contact info, and hire date.  
- **Contract Handling:** Manage rental contracts, including start/end dates, insurance payments, costs, and status updates.  
- **Vehicle Records:** Store vehicle details like plate number, model, rental rates, and traffic department fees.  
- **Payment Tracking:** Log payments with date, amount, and payment method.  
- **Maintenance Records:** Maintain service history, including maintenance descriptions, costs, and supervising employees.  

## 🛠️ Technologies Used  
- **Database:** MySQL  
- **Programming Language:** Java
- **GUI:** JavaFX 

## 📊 System Functionality  
1. **Customer Data Management**  
   - Unique identifier, personal details, job, and license information.  
2. **Employee Records**  
   - Unique ID, role, salary, and hire date.  
3. **Vehicle Inventory**  
   - Tracks vehicle model, rent rates (daily, weekly, monthly), year, and fees.  
4. **Rental Contracts**  
   - Managed using a **contract number** linking **employees and customers**.  
5. **Payment Processing**  
   - Logs transactions per contract.  
6. **Maintenance Tracking**  
   - Records service details, associated vehicles, and supervising employees.
     
## 📝 Database Design Rules  
- **Each vehicle** can only be leased to **one customer at a time**.  
- **A customer** can have **multiple rental contracts simultaneously**.  
- **A vehicle** can undergo **only one maintenance process at a time**.  
- **An employee** can create multiple contracts but **each contract is assigned to one employee**.  
- **Each maintenance process** is linked to **one or more vehicles** but supervised by **only one employee**.  
- **Each contract** must have **at least one payment** recorded.  

## 🏗️ Entity-Relationship Diagram (ERD)  
 *The ERD is included in the project documentation.*  

## 🤝 Project Team  
- **Francis Miadi** 
- Kareem Qutob 
- Husain Abugosh

## 🌐 Contact  
**For inquiries, reach out via:**  
- **Email:** *francismiadi0@gmail.com*  
- **GitHub:** *FrancisMiadi*  
  

