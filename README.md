# DevOps-Based Blog Platform

**OOSE Mini Project**  
A simple yet complete **Object-Oriented Blog System** built with Spring Boot, demonstrating strong OOP principles and DevOps readiness.

---

## 📋 Project Title
**DevOps-Based Blog Platform with CI/CD Pipeline**

---

## 🎯 Objective
To develop a functional blog platform using **Object-Oriented Design Principles** and prepare it for **DevOps practices** (Docker + CI/CD).

---

## 🛠️ Technologies Used

- **Language**: Java 21
- **Framework**: Spring Boot 3.5
- **Database**: H2 (In-memory)
- **ORM**: Spring Data JPA
- **Frontend**: Thymeleaf
- **Build Tool**: Maven
- **DevOps Tools**: Docker, GitHub Actions (Ready)

---

## ✨ Features

- Clean and responsive blog homepage
- View individual blog posts
- Sample data seeding
- Object-Relational Mapping with JPA
- H2 Database Console for testing
- Fully responsive UI

---

## 🏛️ Object-Oriented Design Highlights

- **Inheritance**: `BaseEntity` (common fields for all entities)
- **Encapsulation**: Lombok `@Data` and proper entity design
- **Composition**: `BlogPost` contains list of `Comment`
- **Abstraction**: Service Layer + Repository Layer
- **Separation of Concerns**: Controller → Service → Repository Pattern

---

## 🚀 How to Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/shanjai-rathinam/OOSE-Mini-Project.git
   cd OOSE-Mini-Project
   ```

2. Open the project in Cursor / IntelliJ IDEA / VS Code

3. Run the main class: `BlogApplication.java`

4. Open your browser and navigate to:
   **http://localhost:8080**

---

## 🛠️ Additional Tools

- **H2 Database Console**: `http://localhost:8080/h2-console`
  - JDBC URL: `jdbc:h2:mem:testdb`
  - Username: `sa`
  - Password: (leave empty)

---

## 📌 Future Enhancements (DevOps Part)

- Docker containerization
- GitHub Actions CI/CD pipeline (Build → Test → Docker Push)
- User authentication & CRUD operations for posts
- Bootstrap 5 UI enhancement

---

## 👨‍💻 Author

**Shanjai Rathinam**  
Object-Oriented Software Engineering Mini Project

---

**Made with ❤️ using Spring Boot & Object-Oriented Principles**
