# CloudStock Inventory Management Application

CloudStock is a simple Spring Boot + Thymeleaf web application designed to demonstrate cloud deployment, CRUD operations, and MySQL integration.  
It serves as a **cloud test application** for CST-323.

---

## 📌 Features
- **Login Page** with validation
- **Dashboard Page** (landing page after login)
- **Inventory List** (view all items)
- **Add New Item** form with validation
- **Edit Item** form
- **View Item Details** page
- **Delete Item** with confirmation
- **Bootstrap-based UI with custom styles (bright color theme)**

---

## 📂 Project Structure
- **Spring Boot Backend** (Java)
- **Thymeleaf Templates** (HTML)
- **MySQL Database** for CRUD operations
- **Bootstrap 5** for UI
- **Custom CSS** for a bright, modern design

---

## 🚀 How to Run Locally
1. Clone the repository:
   ```bash
   git clone https://github.com/oluwaseunakerele/CloudStock.git
   
   ## Application .properties
spring.datasource.url=jdbc:mysql://localhost:3306/cloudstock
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

## Run the application:

mvn spring-boot:run

## Access the application in your browser
http://localhost:8080




   
