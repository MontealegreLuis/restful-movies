# Movies RESTful Web Service in Spring Boot

[![codebeat badge][badge]][codebeat]

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

The `H2` console is enabled by default in the `application.properties` file.
You can check the database tables by visiting:

```
http://localhost:8080/h2-console
```

The JDBC URL is `mem:testdb`

## License

Released under [the BSD-3-Clause][license].

[license]: LICENSE
[badge]: https://codebeat.co/badges/05e1fe89-2a81-46bf-bd21-a924006ea8e5
[codebeat]: https://codebeat.co/projects/github-com-montealegreluis-restful-movies-master
