<center>
    <h1>Movie-Review Application System</h1>
</center>
<h2>Overview</h2>
<p>
  A Movie Review System built using Spring Boot, Spring MVC, Spring Data JPA, MySQL and JUnit. This application allows users to register, browse movies, leave reviews, and view reviews left by others. It uses RESTful APIs to manage movies, users, and reviews.
</p>
<h2>Technologies Used</h2>
<ul>
  <li>Java 17</li>
  <li>Spring Boot</li>
  <li>Spring MVC</li>
  <li>Spring Data JPA</li>
  <li>MySQL (Database)</li>
  <li>Maven (Build tool)</li>
  <li>Postman (for API testing)</li>
</ul>
<h2>Installation and Setup</h2>
<h3>Clone the repository</h3>

```
git clone https://github.com/GouthamKumar025/Movie-Review-Application-System.git
cd Movie-Review-Application-System
```
<p>Update application properties: In src/main/resources/application.properties, configure your MySQL database settings:<p>

<h3>Properties</h3>

```
spring.datasource.url=jdbc:mysql://localhost:3306/moviereviewdb
spring.datasource.username=<your-database-username>
spring.datasource.password=<your-database-password>

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

<h3>Build the project:</h3>

```
mvn clean install
```
<h3>Run the application:</h3>

```
mvn spring-boot:run
```
<h2>Project Creation</h2>

Spring Initializr 🌏 - https://start.spring.io/

<li>Lombok - A prominent Java library for annotations(@) and reduces boilerplate code<li>

<li>MySQL Driver - A library that allows Java applications to connect and communicate with a MySQL database. In Java, this driver is typically provided by a JAR file called mysql-connector-java, which implements the JDBC (Java Database Connectivity) API to establish connections, execute SQL queries, and retrieve results from the MySQL database.</li>

<li>Spring Data JPA - It helps in managing Relational databases and allows to access and persist data between Java Classes and Relational database</li>

<li>Spring Web - Useful library for building RESTful applications and Spring MVC</li>

On creating the package and extracting, the java folder looks like this

```java
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
  
@SpringBootApplication  
public class SpringbootpracticeApplication {  
  public static void main(String[] args) {  
    SpringApplication.run(SpringbootpracticeApplication.class, args);  
  }  
}
```




