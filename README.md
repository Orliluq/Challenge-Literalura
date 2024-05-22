# Challenge Literalura
## ¡Bienvenido(a) a Literalura!
Literalura es una aplicación que te permite gestionar tu biblioteca personal de libros.

## ¿Qué puedes hacer con Literalura?
- Buscar libros por título o autor.
- Listar libros y autores registrados.
- Buscar autores vivos en un año específico.
- Listar libros por idioma.
- Obtener el top 10 de libros más buscados.
- Generar estadísticas sobre las descargas de libros.

## ¿Cómo funciona Literalura?
Literalura utiliza una API externa para obtener información sobre libros y autores: https://gutendex.com/ 
También almacena información en una base de datos local para que puedas acceder a ella incluso sin conexión a internet.

<p align="center">
<img src="https://github.com/Orliluq/Challenge-Literalura/assets/122529721/3fee9ab7-19ad-43df-bca5-922cec6081b4/>
</p>


## ¿Cómo empezar?

### Clona el repositorio:
`git clone https://github.com/Orliluq/Challenge-Literalura.git`

### Instala las dependencias:
`cd literalura`
`mvn install`

### Ejecuta la aplicación:
`mvn spring-boot:run`
¡Empieza a disfrutar de Literalura!

## Estructura del proyecto:
- src/main/java:
  -- com.alura.literalura:
  --- model: Contiene las clases que representan los datos de libros y autores.
  --- repository: Contiene las interfaces y clases que se utilizan para acceder a la base de datos.
  --- service: Contiene las clases que implementan la lógica de negocio de la aplicación.
  --- principal: Contiene la clase principal de la aplicación.
- src/main/resources: Contiene los archivos de configuración de la aplicación.
- pom.xml: Contiene las dependencias del proyecto.

## Tecnologías utilizadas:
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
