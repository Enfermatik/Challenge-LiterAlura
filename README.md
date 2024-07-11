Readme del proyecto LiterAlura
Introducción
El proyecto LiterAlura es una aplicación de Spring Boot que gestiona información sobre autores y libros. La aplicación utiliza una base de datos PostgreSQL para almacenar los datos y ofrece una interfaz de usuario para interactuar con la información.

Estructura del proyecto
El proyecto se organiza en los siguientes paquetes:

Challenge.LiterAlura: contiene la clase principal de la aplicación, LiterAluraApplication.
Challenge.LiterAlura.dto: contiene los objetos de transferencia de datos (DTO) para autores y libros.
Challenge.LiterAlura.modelos: contiene las entidades de la base de datos para autores y libros.
Challenge.LiterAlura.repositorio: contiene las interfaces de repositorio para acceder a la base de datos.
Challenge.LiterAlura.servicios: contiene las clases de servicio que ofrecen funcionalidades para interactuar con la información.
Funcionalidades
La aplicación ofrece las siguientes funcionalidades:

Gestión de autores: crear, leer, actualizar y eliminar autores.
Gestión de libros: crear, leer, actualizar y eliminar libros.
Búsqueda de libros por título o autor.
Obtención de la lista de idiomas disponibles.
Obtención de la lista de libros por idioma.
Tecnologías utilizadas
Spring Boot: framework para desarrollar aplicaciones web.
PostgreSQL: base de datos relacional.
Hibernate: ORM (Object-Relational Mapping) para interactuar con la base de datos.
Jackson: biblioteca para serializar y deserializar objetos en formato JSON.
Configuración
La aplicación utiliza variables de entorno para configurar la conexión a la base de datos. Los valores de las variables de entorno se establecen en el archivo application.properties.

Ejecución
Para ejecutar la aplicación, es necesario tener instalado Java 11 o superior y PostgreSQL. Una vez instalados, se puede ejecutar la aplicación con el comando spring-boot:run en la carpeta raíz del proyecto.

Uso
La aplicación ofrece una interfaz de usuario para interactuar con la información. 

Contribución
Si deseas contribuir al proyecto, por favor, crea un fork del repositorio y envía un pull request con tus cambios.
