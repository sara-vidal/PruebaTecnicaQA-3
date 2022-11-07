# Prueba técnica de QA DEV

## Introduction
### Ejercicio 3: Tratamiento de datos en APIs
En este enlace encontrarás la documentación de la API de una tienda de mascotas:
https://petstore.swagger.io/
1. Crea tu usuario mediante petición HTTP y posteriormente recupera sus datos llamando al
servicio correspondiente.
2. Recoge mediante petición HTTP, el JSON que retorna el endpoint /pet/findByStatus y lista
mediante una función los nombres de las mascotas que se hayan vendido.
- El formato de salida deberá estar formado por la tupla {id, name}.
- Puedes utilizar la estructura de datos que prefieras.
3. Crea una clase cuyo constructor requiera de la estructura de datos anterior y realiza un método
que pueda recorrerla para poder identificar cuantas mascotas se llaman igual.
- Ejemplo de salida: {“William”: 11, “ Floyd”: 2} Como output, te pediremos el código (puedes
separarlo en archivos como quieras) y los resultados de salida de los puntos anteriores.
- Recuerda que puedes utilizar el lenguaje que prefieras y cualquier mejora adicional será bien
considerada

## Prerequisites
* Java version: 16.0.2
* Apache Maven version: 3.8.6

## Setup
To run this project for the first time, execute in root directory:
```
$ mvn clean install
```
To run the tests, execute in root directory:
```
$ mvn test
```

## Output
After running the project, check the results in the karate-summary.html file that is placed in /target/karate-reports inside the project structure
* petstore/features/createNewUser.feature solves point 1
* petstore/features/getSoldPets.feature solves point 2
* petstore/features/getPetNamesCount.feature solves point 3