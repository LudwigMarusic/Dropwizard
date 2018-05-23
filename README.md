# Dropwizard - Hibernate - Gradle

Proyecto de ejemplo usando [Dropwizard 7.1](http://dropwizard.io/) con [Hibernate](http://hibernate.org/) y 
[Gradle 4.7](http://www.gradle.org/)

Hibernate es bastante fácil de usar y no requiere mucho código adicional en comparación con JDBI, sobretodo porque no nos perminte hacer un DAO sin colocar ningun SQLm haciendo el dao agnostico a la DB
La gestión de sesiones y transacciones se maneja mediante la anotación UnitOfWork, ya que creará automáticamente una sesión y una transacción y una reversión si se produce una excepción en el método del recurso. 

También utiliza Flyway este puede ser expandido para crear un proceso de migración de base de datos con todas las funciones utilizando cualquier base de datos compatible con JBDC a la que pueda conectarse.

## MySQL DB

Restaurar la base de datos ejemplo que se encuentra en el directorio db


## Run

```
gradle clean oneJar
java -jar build/libs/Dropwizard-standalone.jar server config.yml
```

## Test

```
gradle test --info
```