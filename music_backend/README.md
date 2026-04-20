# Proyecto Backend de Música

Sistema backend para gestionar información de música, artistas, productores y discográficas.

## Características

- Entidades JPA para Persona, Músico, Productor, Discográfica y Canción
- Repositorios para acceso a datos
- DTOs para peticiones y respuestas
- Mapeos automáticos con MapStruct
- Servicios con lógica de negocio
- Manejo de excepciones personalizado
- Base de datos H2 en memoria

## Tecnologías Utilizadas

- Spring Boot 3.2.0
- JPA/Hibernate
- H2 Database
- MapStruct
- Lombok

## Cómo Ejecutar

### Opción 1: Con Maven directamente

```bash
mvn spring-boot:run
```

### Opción 2: Usar el script run.bat (Windows)

Simplemente haz doble clic en `run.bat` o ejecuta desde la terminal:

```bash
run.bat
```

El script configurará automáticamente las variables de entorno necesarias y ejecutará la aplicación.

> **Nota**: El script busca Java y Maven en las rutas configuradas del sistema. Asegúrate de tener instalados Maven y Java 17 o superior.

## Estructura del Proyecto

- `model/`: Entidades JPA
- `repository/`: Capa de acceso a datos
- `dto/`: Objetos de transferencia de datos
- `mapper/`: Conversiones automáticas
- `service/`: Lógica de negocio
- `exception/`: Excepciones personalizadas

## Ejecución

La aplicación se inicia, simula el guardado de datos a través de los servicios e imprime los DTOs resultantes en la consola.