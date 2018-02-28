# Movies RESTful Web Service in Spring Boot

This is an example project that illustrates creating a RESTful API in Spring Boot.

## Running this project

Create an `application.properties` file for your application

```
cp src/main/resources/example.properties src/main/resources/application.properties
```

Run the application with the command below

```
mvn spring-boot:run
```

You can try the API, via Swagger, by visiting the following URL:

```
http://localhost:8080/swagger-ui.html
```

The `H2` console is enabled in the `application.properties` file.
You can check the tables by visiting:

```
http://localhost:8080/h2-console
```

The JDBC URL is `mem:testdb`

##License

Released under [the BSD-3-Clause][license].

[license]: LICENSE
