# 📚 Semana 4: Testing en Java con JUnit y Code Coverage

## 🎯 Objetivos de la semana

- Comprender qué es el testing en desarrollo de software.
- Aprender a usar **JUnit 5** para pruebas unitarias.
- Escribir pruebas unitarias para métodos de servicios.
- Usar cobertura de código para evaluar la calidad del testing.
- Integrar testing a tu flujo de trabajo en IntelliJ.
- Subir tus cambios con pruebas a GitHub.

---

## 🧠 Glosario de términos (Inglés / Español)

| Inglés               | Español                         |
|----------------------|----------------------------------|
| Unit Test            | Prueba unitaria                  |
| Code Coverage        | Cobertura de código              |
| Assertion            | Aserción                         |
| Test Case            | Caso de prueba                   |
| Mock / Mocking       | Simulación de dependencias       |
| Test Suite           | Conjunto de pruebas              |
| JUnit                | Librería de pruebas para Java    |

---

# 🧪 Parte 1: ¿Qué es una prueba unitaria?

Una **prueba unitaria** verifica que una parte pequeña y específica del código (como un método) funcione correctamente.

## 📘 Ejemplo:

```java
public int sumar(int a, int b) {
    return a + b;
}
```

Una prueba unitaria verificará que `sumar(2, 3)` devuelva `5`.

---

# ⚙️ Parte 2: Agregar JUnit 5 a tu proyecto

### 👉 Paso a paso:

1. Abre tu archivo `pom.xml`.
2. Agrega la dependencia de JUnit 5:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.3</version>
    <scope>test</scope>
</dependency>
```

3. Haz `Reload Maven Project` desde IntelliJ.

---

# 🧪 Parte 3: Crear una prueba unitaria

## 📘 Clase de ejemplo

```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
}
```

## 📘 Prueba con JUnit

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }
}
```

---

# 🧪 Parte 4: Ejecutar pruebas en IntelliJ

## 👉 Paso a paso:

1. Haz clic derecho sobre la clase de test.
2. Selecciona **Run 'NombreDelTest'**.
3. Verifica que todos los tests pasen ✅

---

# 📊 Parte 5: Ver cobertura de código (Code Coverage)

## 📘 ¿Qué es?

Es el porcentaje del código que está cubierto por pruebas.

## 👉 Paso a paso en IntelliJ:

1. Haz clic derecho en el paquete o clase de prueba.
2. Selecciona **Run with Coverage**.
3. Aparecerá un resumen con porcentaje de cobertura.

---

# 🔧 Parte 6: Buenas prácticas de testing

- Cada prueba debe probar un único comportamiento.
- Usa nombres descriptivos para los métodos de prueba.
- No mezcles lógica de negocio en las pruebas.
- Cubre casos positivos y negativos.
- Usa mocks para simular dependencias externas.

---

# ✅ Ejercicios prácticos

1. Crea una clase `CalculadoraAvanzada` con métodos:
   - `multiplicar(int a, int b)`
   - `dividir(int a, int b)`
2. Escribe pruebas unitarias para cada método.
3. Crea un caso que verifique que dividir entre 0 lanza una excepción.
4. Ejecuta con cobertura y verifica que sea al menos 90%.
5. Sube tu código a una rama `feature/testing`.
6. Crea un Pull Request con tus resultados.

---

# 📦 Proyecto de la semana

## 🧪 Mini proyecto: Testing de servicios

### 🎯 Objetivo:

Escribir pruebas unitarias para un servicio llamado `PerfilService`.

### Pasos:

1. Crea una clase `Perfil` con nombre, edad y ocupación.
2. Crea `PerfilService` con un método:

```java
public class PerfilService {
    public String formatearPerfil(Perfil perfil) {
        return perfil.getNombre() + " - " + perfil.getOcupacion();
    }
}
```

3. Escribe la prueba para verificar que el método funciona.
4. Ejecuta las pruebas con cobertura.
5. Sube a GitHub y haz Pull Request.

---

# 📦 Entregables de la semana

- Proyecto con al menos 5 pruebas unitarias.
- Cobertura de código ≥ 80%.
- Rama y Pull Request con nombre `feature/testing`.
- README con instrucciones de ejecución.

---

¡Excelente trabajo! Ya sabes escribir y ejecutar pruebas como un verdadero desarrollador profesional. ✅