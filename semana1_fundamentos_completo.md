# 📚 Semana 1: Fundamentos de Programación y Herramientas de Desarrollo

## 🎯 Objetivo de la semana

Aprender los **conceptos básicos de programación**, instalar y usar las herramientas necesarias, crear tu primer programa con Java, y subir tu trabajo a **GitHub** usando **Git**. También empezarás a trabajar en un entorno llamado **DEV (desarrollo)**.

---

## 🧠 Glosario de términos (Inglés / Español)

| Inglés                     | Español                        |
|---------------------------|--------------------------------|
| Programming               | Programación                   |
| Variable                  | Variable                       |
| Data Type                 | Tipo de dato                   |
| Function / Method         | Función / Método               |
| Conditionals              | Condicionales                  |
| Loop                      | Ciclo                          |
| Print                     | Imprimir en consola            |
| Git / GitHub              | Control de versiones           |
| IDE (Integrated Dev Env)  | Entorno de desarrollo (IDE)    |
| Terminal / Console        | Terminal / Consola             |
| Commit / Push             | Confirmar cambios / Enviar     |
| Repository                | Repositorio                    |
| DEV Environment           | Entorno de desarrollo          |

---

# 🛠️ Parte 1: Instalación de herramientas

## 1. Instalar Java 21 (JDK)

**¿Qué es Java?**  
Es un lenguaje de programación que te permite crear aplicaciones. Necesitas instalar su "JDK" (Java Development Kit) para poder compilar y ejecutar programas.

**Pasos:**
1. Ve a: [https://jdk.java.net/21/](https://jdk.java.net/21/)
2. Descarga la versión para tu sistema operativo.
3. Instala normalmente.
4. Abre tu terminal o consola y escribe:
   ```bash
   java -version
   ```
   Si ves algo como `java 21`, está funcionando correctamente.

---

## 2. Instalar IntelliJ IDEA Community Edition

**¿Qué es IntelliJ IDEA?**  
Es un **IDE (Entorno de Desarrollo Integrado)**. Es donde escribirás y ejecutarás tu código Java.

**Pasos:**
1. Ve a [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
2. Descarga la versión gratuita (Community).
3. Instálala y ejecútala.

---

## 3. Instalar Git

**¿Qué es Git?**  
Es una herramienta que permite guardar versiones de tu código.

**¿Qué es GitHub?**  
Es una plataforma online para guardar tus proyectos y colaborar con otros.

**Pasos para Git:**
1. Descarga desde [https://git-scm.com/](https://git-scm.com/)
2. Instálalo.
3. Verifica que funcione:
   ```bash
   git --version
   ```

---

# 🧪 Parte 2: Fundamentos de programación con Java

## 📘 Tema: ¿Qué es programar?

**Programar** significa darle instrucciones a una computadora para que realice tareas. Usamos lenguajes como Java para escribir esas instrucciones.

---

## 📘 Tema: ¿Qué es una variable? (Variable)

**Definición:**  
Una variable es un espacio en memoria para **guardar un valor**.  
Por ejemplo: tu edad, tu nombre o un número cualquiera.

**Tipos comunes en Java:**
- `int`: números enteros (ej: 25)
- `double`: números decimales (ej: 3.14)
- `boolean`: verdadero/falso
- `String`: texto

**Ejemplo:**
```java
int edad = 25;
double altura = 1.75;
boolean activo = true;
String nombre = "Juan";
```

**Práctica sugerida:**  
Crea un programa que imprima tus datos personales.

---

## 📘 Tema: Imprimir en consola (Print)

**Uso:**
```java
System.out.println("Hola mundo!");
```

---

## 📘 Tema: Condicionales (Conditionals)

**Definición:**  
Permiten ejecutar diferentes bloques de código según una condición.

**Ejemplo:**
```java
int edad = 18;
if (edad >= 18) {
    System.out.println("Eres mayor de edad.");
} else {
    System.out.println("Eres menor de edad.");
}
```

---

## 📘 Tema: Ciclos (Loops)

### Ciclo For (Repetición con contador)
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}
```

### Ciclo While (Repetición hasta que cambie la condición)
```java
int contador = 1;
while (contador <= 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

---

## 📘 Tema: Métodos o funciones (Methods)

**Definición:**  
Son bloques de código que realizan una tarea. Se pueden llamar varias veces.

**Ejemplo:**
```java
public class Main {
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    public static void main(String[] args) {
        saludar("Lucía");
    }
}
```

---

# 🧪 Parte 3: Tu primer programa

## 📝 Paso a paso para crear tu primer archivo en IntelliJ

1. Abre IntelliJ > Nuevo Proyecto > Java.
2. Ponle nombre: `Semana1Intro`.
3. Crea un archivo nuevo: `Main.java`.
4. Escribe el siguiente código:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
    }
}
```

5. Haz clic en el botón de ▶️ (play) para ejecutar el programa.

---

# 🌐 Parte 4: Git y GitHub

## 📘 Tema: ¿Qué es un repositorio?

Es un lugar donde se guarda tu proyecto. Git lo usa para controlar versiones. GitHub lo usa para compartirlo en la nube.

---

## 📘 Tema: Crear un repositorio en GitHub

### Paso a paso:

1. Ve a [https://github.com](https://github.com) y **crea una cuenta** si no tienes una.
2. Haz clic en el botón **"New repository"**.
3. Nombre: `semana-1-intro-java`
4. Selecciona:
   - Visibilidad: **Pública**
   - Marcar “Add a README file”
5. Clic en **Create repository**.

---

## 📘 Tema: Clonar un repositorio

**¿Qué es clonar?**  
Copiar el repositorio a tu computadora.

### Comando:

```bash
git clone https://github.com/TU_USUARIO/semana-1-intro-java.git
```

---

## 📘 Tema: Subir cambios (commit & push)

**Pasos para subir tu código a GitHub:**

1. Copia tus archivos Java al repositorio clonado.
2. Abre una terminal y ejecuta:

```bash
git add .
git commit -m "Primer programa Java"
git push origin main
```

3. Verifica que aparezca en tu repositorio en GitHub.

---

# 🛠 Parte 5: Estructura del ambiente DEV

## 📘 Tema: ¿Qué es un entorno de desarrollo (DEV)?

Es un entorno donde desarrollas y pruebas tu código localmente, **antes** de enviarlo a producción.

### 🧱 Estructura básica de carpetas:
```
semana-1-intro-java/
├── dev/
│   └── notas.txt
├── src/
│   └── Main.java
├── README.md
```

---

# ✅ Ejercicios prácticos

1. Crea un programa que calcule el área de un círculo.
2. Escribe un ciclo que imprima del 1 al 100.
3. Crea un método que reciba un nombre y lo imprima saludando.
4. Sube los tres ejercicios a tu repositorio en GitHub.
5. Agrega un `README.md` explicando qué hiciste esta semana.

---

# 🧪 Proyecto de la semana

## 🎯 Objetivo:
Crear una mini aplicación de consola que:
- Pregunte el nombre del usuario.
- Pregunte su edad.
- Calcule en qué año nació.
- Imprima todo formateado.

### Ejemplo esperado:
```
Hola Ana.
Tienes 25 años.
Naciste en el año 2000.
```

Sube el proyecto completo a tu repositorio.

---

# 📦 Entregables de la semana

- Repositorio: `semana-1-intro-java` en GitHub.
- Archivos Java: `Variables.java`, `Condicionales.java`, `Ciclos.java`, `Funciones.java`.
- Archivo `README.md` explicando tus ejercicios.
- Commits claros y bien nombrados.
- Todos los ejercicios ejecutables.