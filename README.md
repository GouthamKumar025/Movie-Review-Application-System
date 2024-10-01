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
  <i>MySQL (Database)</i>
  <li>Maven (Build-tool)</li>
  <li>Postman (for API testing)</li>
</ul>
<h2>Installation and Setup</h2>
<h3>Clone the repository</h3>

```bash
git clone https://github.com/GouthamKumar025/Movie-Review-Application-System.git
cd Movie-Review-Application-System
```
<p>Update application properties: In src/main/resources/application.properties, configure your MySQL database settings:<p>

<h3>properties</h3>

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/moviereviewdb
spring.datasource.username=<your-database-username>
spring.datasource.password=<your-database-password>

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

<h3>Build the project:</h3>

bash
```
mvn clean install
```
<h3>Run the application:</h3>

bash
```
mvn spring-boot:run
```


