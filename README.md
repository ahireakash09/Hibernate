# Hibernate CRUD Project

A simple Java project demonstrating **CRUD (Create, Read, Update, Delete)** operations using **Hibernate ORM**, **PostgreSQL**, and **Maven**.

## 🚀 Features

- Create records in PostgreSQL database
- Read/Fetch records
- Update existing records
- Delete records
- Hibernate ORM configuration
- Maven project structure

## 🛠️ Tech Stack

- Java
- Hibernate ORM
- PostgreSQL
- Maven
- IntelliJ IDEA

## 📂 Project Structure

```
HibProj
│── src
│   ├── main
│   │   ├── java/com/akash
│   │   │   ├── Alien.java
│   │   │   ├── Student.java
│   │   │   ├── Laptop.java
│   │   │   ├── StoreData.java
│   │   │   ├── FetchData.java
│   │   │   ├── UpdateData.java
│   │   │   ├── DeleteData.java
│   │   │   └── Main.java
│   │   └── resources
│   │       └── hibernate.cfg.xml
│── pom.xml
```

## ⚙️ Prerequisites

- Java JDK 23 (or compatible version)
- Maven
- PostgreSQL
- IntelliJ IDEA (recommended)

## 🗄️ Database Configuration

Update the database credentials in:

```
src/main/resources/hibernate.cfg.xml
```

Example:

```xml
<property name="hibernate.connection.url">
jdbc:postgresql://localhost:5433/your_database
</property>

<property name="hibernate.connection.username">
your_username
</property>

<property name="hibernate.connection.password">
your_password
</property>
```

## ▶️ How to Run

1. Clone the repository.

```bash
git clone https://github.com/ahireakash09/Hibernate.git
```

2. Open the project in IntelliJ IDEA.

3. Configure PostgreSQL database.

4. Install dependencies.

```bash
mvn clean install
```

5. Run any of the following classes:

- `StoreData.java` – Insert records
- `FetchData.java` – Read records
- `UpdateData.java` – Update records
- `DeleteData.java` – Delete records

## 📚 Learning Objectives

This project demonstrates:

- Hibernate SessionFactory
- Entity Mapping
- PostgreSQL Integration
- CRUD Operations
- Maven Dependency Management

## 🤝 Contributing

Contributions are welcome. Feel free to fork the repository and submit a pull request.

## 📄 License

This project is developed for learning and educational purposes.
