# Dropwizard - Hibernate - Gradle

Proyecto de ejemplo usando [Dropwizard 7.1](http://dropwizard.io/) con [Hibernate](http://hibernate.org/) y 
[Gradle 4.7](http://www.gradle.org/)

Hibernate es bastante f�cil de usar y no requiere mucho c�digo adicional en comparaci�n con JDBI, sobretodo porque no nos perminte hacer un DAO sin colocar ningun SQLm haciendo el dao agnostico a la DB
La gesti�n de sesiones y transacciones se maneja mediante la anotaci�n UnitOfWork, ya que crear� autom�ticamente una sesi�n y una transacci�n y una reversi�n si se produce una excepci�n en el m�todo del recurso. 

Tambi�n utiliza Flyway este puede ser expandido para crear un proceso de migraci�n de base de datos con todas las funciones utilizando cualquier base de datos compatible con JBDC a la que pueda conectarse.

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