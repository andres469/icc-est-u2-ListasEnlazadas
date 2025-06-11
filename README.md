# Gestor de Contactos

## Descripción

Este proyecto en Java implementa un sistema de gestión de contactos utilizando listas enlazadas personalizadas y el patrón Modelo-Vista-Controlador (MVC). El programa permite agregar, buscar, eliminar y listar contactos desde una interfaz de consola.

Este proyecto corresponde a una actividad de repaso de la Unidad 1: **Métodos de búsqueda y estructuras de datos lineales (listas enlazadas)**.

## Estructura del Proyecto

El proyecto está dividido en tres paquetes principales:

- **Models**: Contiene las clases `Contact`, `Node` y `LinkedList`, las cuales modelan los datos y estructuras utilizadas.
- **Controller**: Incluye las clases `ContactManager` y `MenuController`, encargadas de la lógica de negocio y la gestión del flujo de la aplicación.
- **View**: Contiene `ConsoleView`, que representa una interfaz alternativa (no utilizada en `Main`) basada en consola.

## Funcionalidades

- **Agregar Contacto**: Permite ingresar un nuevo contacto con nombre y teléfono.
- **Buscar Contacto**: Busca un contacto por nombre (no distingue mayúsculas/minúsculas).
- **Eliminar Contacto**: Elimina el primer contacto encontrado con el nombre proporcionado.
- **Listar Contactos**: Muestra todos los contactos almacenados en la lista enlazada.

## Requisitos

- Java Development Kit (JDK), versión 8 o superior.

## Configuración del Entorno

Asegúrate de tener Java instalado en tu sistema. Puedes comprobarlo ejecutando:

```bash
java -version
```

Deberías obtener una salida similar a:

```
java version "1.8.0_281"
Java(TM) SE Runtime Environment (build 1.8.0_281-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.281-b09, mixed mode)
```

## Compilación y Ejecución

1. Clona este repositorio o descarga los archivos fuente.
2. Navega al directorio raíz del proyecto.
3. Compila el proyecto con el siguiente comando (ajusta las rutas según tu sistema operativo si es necesario):

```bash
javac -d . Models/*.java Controller/*.java View/*.java Main.java
```

4. Ejecuta el programa principal:

```bash
java Main
```

## Contribuir

Si deseas contribuir a este proyecto:

- Crea un fork del repositorio.
- Realiza tus cambios en una rama separada.
- Abre un pull request con una descripción clara de las mejoras o correcciones realizadas.
- También puedes abrir un issue para sugerencias o reportar errores.

## Autor

[Andres Tenesaca, Daniel Uyaguari] - Desarrollo inicial
