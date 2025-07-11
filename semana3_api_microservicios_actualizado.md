# 📚 Semana 3: Introducción a APIs, Microservicios y Postman

## 🎯 Objetivo de la semana

- Comprender el concepto de **API (Application Programming Interface)**.
- Crear tu primera **API REST** con Java y Spring Boot.
- Entender la estructura básica de un **microservicio**.
- Usar **Postman** para probar endpoints.
- Practicar con solicitudes GET y POST.
- Enviar datos en formato **JSON**.

---

## 🧠 Glosario de términos (Inglés / Español)

| Inglés        | Español                         |
|---------------|----------------------------------|
| API           | Interfaz de programación de aplicaciones |
| Endpoint      | Punto de acceso o ruta en una API |
| REST          | Transferencia de Estado Representacional |
| HTTP Method   | Método HTTP (GET, POST, PUT...)  |
| Request       | Petición                          |
| Response      | Respuesta                         |
| Status Code   | Código de estado HTTP             |
| JSON          | Formato de datos ligero           |
| Microservice  | Microservicio                     |

---

# ☁️ Parte 1: ¿Qué es una API?

## 📘 Definición:

Una **API** permite a dos sistemas comunicarse. En este caso, crearemos una API REST que responde a solicitudes HTTP.

**Ejemplo:**  
Un frontend solicita datos al backend con una API:

```
GET /api/usuarios/1  → devuelve información del usuario con ID 1
```

---

# ⚙️ Parte 2: Crear un proyecto Spring Boot

## 📘 ¿Qué es Spring Boot?

Es un framework que facilita la creación de APIs y microservicios en Java.

## 👉 Paso a paso:

1. Ve a [https://start.spring.io](https://start.spring.io)
2. Configura:
   - Language: Java
   - Spring Boot: 3.2.0 o superior
   - Project: Maven
   - Dependencies:
     - Spring Web
3. Click en "Generate"
4. Descomprime el archivo y ábrelo con **IntelliJ IDEA**.

---

# 🧪 Parte 3: Crear tu primer controlador (Controller)

## 📘 ¿Qué es un Controller?

Es una clase que define los **endpoints** de la API.

### Código de ejemplo: `HelloController.java`

```java
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "¡Hola desde tu primera API!";
    }
}
```

## 👉 Pasos:

1. Crear un paquete `controller`.
2. Crear la clase `HelloController`.
3. Anotar con `@RestController` y `@RequestMapping`.

---

# 🧪 Parte 4: Probar tu API con Postman

## 📘 ¿Qué es Postman?

Es una herramienta gráfica para probar tus endpoints de forma visual.

## 👉 Paso a paso:

1. Asegúrate de que tu servidor Spring Boot esté corriendo.
   - Ejecuta tu clase principal (con `@SpringBootApplication`) desde IntelliJ.
   - Espera a ver este mensaje en la consola:

     ```
     Tomcat started on port(s): 8080 (http)
     Started Application in X.XXX seconds
     ```

2. Verifica que tu API esté activa abriendo en tu navegador:
   ```
   http://localhost:8080/api/hello
   ```
   Deberías ver:
   ```
   ¡Hola desde tu primera API!
   ```

3. Descarga Postman desde: [https://www.postman.com/downloads/](https://www.postman.com/downloads/)
4. Abre Postman.
5. Realiza una solicitud `GET` a:
   ```
   http://localhost:8080/api/hello
   ```

6. Deberías ver en la respuesta:
   ```
   ¡Hola desde tu primera API!
   ```

---

# 🔧 Parte 5: Enviar y recibir datos (JSON)

## 📘 Crear un modelo

```java
public class Usuario {
    private String nombre;
    private int edad;

    // Getters y Setters
}
```

## 📘 Crear un POST endpoint

```java
@PostMapping("/usuarios")
public String crearUsuario(@RequestBody Usuario usuario) {
    return "Usuario recibido: " + usuario.getNombre();
}
```

## 👉 Enviar JSON desde Postman:

- Método: `POST`
- URL: `http://localhost:8080/api/usuarios`
- Body > raw > JSON:

```json
{
  "nombre": "Lucía",
  "edad": 30
}
```

---

# 🧱 Parte 6: ¿Qué es un microservicio?

Un **microservicio** es una aplicación pequeña e independiente que hace una sola cosa. Las APIs REST se usan para comunicar varios microservicios.

## 📘 Características:

- Autónomos
- Desplegables por separado
- Escalables individualmente

## 👉 Tu primer microservicio

Tu aplicación Spring Boot ya es un **microservicio** básico.

---

# 📦 Parte 7: Estructura del proyecto con API

```
mi-api/
├── src/
│   └── main/
│       ├── java/
│       │   └── com.miempresa.api/
│       │       ├── controller/
│       │       │   └── HelloController.java
│       │       └── model/
│       │           └── Usuario.java
│       └── resources/
│           └── application.properties
├── pom.xml
```

---

# ✅ Ejercicios prácticos

1. Crea una API con un endpoint `/api/saludo` que reciba un nombre por parámetro (`?nombre=Ana`) y devuelva un saludo.
2. Crea un modelo `Producto` con nombre y precio.
3. Crea un endpoint `POST /api/productos` que reciba un `Producto` en JSON.
4. Prueba los endpoints en Postman.
5. Subir el código a GitHub en una rama `feature/api-basica`.

---

# 🧪 Proyecto de la semana

## 🎯 Objetivo:

Construir una API llamada `MiniPerfil` que:

- Exponga 2 endpoints:
  - `GET /api/perfil`: devuelve tu nombre, edad, ocupación.
  - `POST /api/perfil`: recibe y guarda esos datos (sin base de datos, solo en memoria).

### Ejemplo de JSON esperado:

```json
{
  "nombre": "Carlos",
  "edad": 28,
  "ocupacion": "Desarrollador"
}
```

---

# 📦 Entregables de la semana

- Proyecto Spring Boot con al menos 2 endpoints.
- Probado con Postman.
- Subido a GitHub en una rama.
- Pull Request creado con descripción del trabajo.
- README con instrucciones para correr la API localmente.

---

¡Felicidades! Ahora puedes crear APIs funcionales como un desarrollador backend junior. 🚀