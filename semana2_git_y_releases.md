# 📚 Semana 2: Control de versiones con Git, Fundamentos de GitHub y Buenas Prácticas de Desarrollo

## 🎯 Objetivo de la semana

Esta semana aprenderás a:
- Usar **Git** para trabajar con versiones de código.
- Trabajar con **ramas (branches)**.
- Crear tu primer **Pull Request**.
- Aplicar las primeras **buenas prácticas de desarrollo profesional**.
- Usar GitHub como un desarrollador junior en un entorno real.
- Estructurar correctamente tu proyecto.
- Preparar tu primer **Release** (versión del código estable).

---

## 🧠 Glosario de términos (Inglés / Español)

| Inglés             | Español                         |
|-------------------|----------------------------------|
| Version Control    | Control de versiones             |
| Branch             | Rama                             |
| Commit             | Confirmar cambios                |
| Pull Request (PR)  | Solicitud de extracción          |
| Merge              | Unir ramas                       |
| Main / Master      | Rama principal                   |
| Feature Branch     | Rama de funcionalidad            |
| Release            | Publicación o versión estable    |
| Tag                | Etiqueta                         |
| Best Practices     | Buenas prácticas                 |
| Issue              | Tarea o problema                 |
| Fork               | Copia externa de un repositorio  |

---

# 🧰 Parte 1: Control de versiones con Git

## 📘 Tema: ¿Qué es Git?

Git es una herramienta que guarda **cada cambio en tu código**. Así puedes regresar a versiones anteriores y colaborar sin pisar el trabajo de otros.

---

## 📘 Tema: Crear un proyecto Git local

```bash
mkdir semana-2-git
cd semana-2-git
git init
```

---

## 📘 Tema: Estructura básica del repositorio

```
semana-2-git/
├── src/
├── README.md
└── .git/
```

---

## 📘 Tema: Hacer un commit

```bash
git add .
git commit -m "Primer commit: estructura inicial"
```

---

## 📘 Tema: Ver historial de commits

```bash
git log
```

---

# 🌳 Parte 2: Trabajo con ramas (Branches)

## 📘 Tema: ¿Qué es una rama (branch)?

Una **branch** permite trabajar en nuevas funcionalidades sin afectar el código principal.

## 👉 Crear una rama nueva

```bash
git checkout -b feature/saludo-personalizado
```

## 👉 Cambiar entre ramas

```bash
git checkout main
```

---

## 📘 Tema: Buenas prácticas para nombres de ramas

| Tipo de rama   | Prefijo sugerido        | Ejemplo                     |
|----------------|-------------------------|-----------------------------|
| Nueva feature  | `feature/`              | `feature/login-page`        |
| Fix/bug        | `fix/`                  | `fix/null-pointer-error`    |
| Mejora         | `enhancement/`          | `enhancement/ui-styling`    |
| Documentación  | `docs/`                 | `docs/update-readme`        |

---

## 📝 Ejercicio práctico: Rama con funcionalidad

1. Crea un programa Java que imprima un saludo personalizado.
2. Haz commit del código en una rama `feature/saludo-personalizado`.
3. Sube la rama al repositorio remoto:

```bash
git push origin feature/saludo-personalizado
```

---

# 🔁 Parte 3: Pull Requests y fusiones (merge)

## 📘 Tema: ¿Qué es un Pull Request (PR)?

Una solicitud para revisar y aprobar cambios **antes** de unirlos a la rama principal (`main`).

## 👉 Cómo hacer un PR

1. Ve a tu repositorio en GitHub.
2. Haz clic en **"Compare & pull request"** para tu rama.
3. Escribe un título y descripción.
4. Da clic en **"Create pull request"**.
5. Haz clic en **Merge pull request** después de revisarlo.

---

# 🚀 Parte 4: Releases y Versionamiento

## 📘 Tema: ¿Qué es un release?

Un **release** es una versión estable del código lista para "producción".

### 📌 Crear un release:

1. En GitHub > "Releases" > "Draft a new release"
2. Asigna un **tag**: `v1.0.0`
3. Título: `Primera versión estable`
4. Descripción: Qué contiene esta versión
5. Clic en **Publish Release**

---

## 📘 Tema: SemVer (Versionado Semántico)

| Tipo de cambio        | Ejemplo   |
|-----------------------|-----------|
| Mayor                | v2.0.0    |
| Minor (nueva feature)| v1.1.0    |
| Patch (bug fix)      | v1.0.1    |

---

# 👨‍💻 Parte 5: Buenas prácticas de desarrollo

## 📋 Lista de buenas prácticas

- Usa nombres descriptivos para ramas y commits.
- Un commit debe tener un único objetivo.
- Agrega comentarios claros en el código.
- Escribe `README.md` en todos tus proyectos.
- Nunca trabajes directamente en `main`.

---

## 📘 Tema: Branching Strategy

### Flujo recomendado (inspirado en Git Flow):

```
main
└─ develop
   ├─ feature/login
   ├─ feature/profile
   └─ fix/email-validation
```

- `main`: código de producción
- `develop`: integración de features
- `feature/*`: nuevas funcionalidades
- `fix/*`: correcciones de errores

---

# 📦 Parte 6: Estructura de proyecto Java profesional

```
mi-proyecto/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── miempresa/
│                   └── proyecto/
│                       ├── Main.java
├── .gitignore
├── README.md
└── pom.xml (si usas Maven)
```

---

# ✅ Ejercicios prácticos de la semana

1. Crear una nueva rama `feature/edad-anio-nacimiento` y desarrollar un método que calcule el año de nacimiento según la edad.
2. Hacer un commit limpio por cada funcionalidad agregada.
3. Subir la rama y hacer un Pull Request en GitHub.
4. Crear un **release** para esta versión.

---

# 🧪 Proyecto de la semana

## 🎯 Objetivo:
Ampliar el proyecto de la semana pasada con una funcionalidad nueva:

### Nueva funcionalidad:
- El usuario puede elegir si quiere ver su edad en días, meses o años.

### Requisitos:
- Rama `feature/edad-formateada`
- PR con revisión.
- Release con tag `v1.1.0`

---

# 📦 Entregables de la semana

- Repositorio con estructura limpia.
- Mínimo dos ramas trabajadas (`main` y una `feature/`)
- Pull Request aprobado y mergeado.
- Release publicado (`v1.1.0`)
- `README.md` actualizado.

---

¡Con esto estarás trabajando como un desarrollador junior real! 🚀