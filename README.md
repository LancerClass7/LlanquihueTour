Desarrollo Orientado a Objetos I – Llanquihue Tour
Sistema de gestión de personas para agencia de turismo Llanquihue Tour desarrollado en Java.

Autor del proyecto

- Nombre completo: Claudio Jorge Muñoz Olivares
- Sección: 2026_204_OL_PRY2202_24684767_PCT
- Carrera: Ingeniería en Informática
- Sede: Sede online

---

Descripción general del sistema

Este proyecto corresponde a una actividad de la asignatura Desarrollo Orientado a Objetos I. Consiste en el desarrollo de un prototipo de sistema orientado a objetos en Java para la agencia de turismo Llanquihue Tour, ubicada en la comuna de Llanquihue, Región de Los Lagos.

El objetivo del sistema es representar y organizar la información de las personas relacionadas con la agencia, permitiendo diferenciar sus roles y mantener estructurados sus datos personales, información de contacto y direcciones.

Para su desarrollo se aplican principios fundamentales de la programación orientada a objetos, tales como encapsulamiento, herencia, composición y reutilización de código.

El prototipo contempla la creación de personas y empleados, utilizando clases relacionadas que permiten establecer una estructura modular y reutilizable para futuras funcionalidades del sistema.

---

Estructura general del proyecto

El proyecto se organiza mediante dos paquetes principales:

📁 src/
├── app/
│   └── Semana3POO.java   # Clase principal con el método main
│
└── model/
    ├── Persona.java      # Clase base que representa a una persona
    ├── Empleado.java     # Clase que hereda de Persona
    └── Direccion.java    # Clase que representa una dirección


Descripción de las clases

- **Persona:** contiene los atributos RUT, nombre, correo, teléfono y dirección. Implementa encapsulamiento mediante atributos privados y métodos getters y setters.
- **Empleado:** hereda de Persona mediante `extends` e incorpora los atributos cargo y área. Reutiliza el constructor y el método `toString()` de la clase padre mediante `super`.
- **Direccion:** contiene los atributos calle, número, comuna y región. Se utiliza mediante composición dentro de la clase Persona.
- **Semana3POO:** contiene el método principal `main()`, donde se crean tres instancias de objetos y se muestra su información mediante `System.out.println()`.

---

Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

   git clone https://github.com/usuario/LlanquihueTour.git

2. Abre el proyecto en NetBeans.

3. Verifica que los paquetes `app` y `model` estén correctamente organizados.

4. Abre el archivo `Semana3POO.java`, ubicado en el paquete `app`.

5. Ejecuta el proyecto mediante la opción **Run Project (F6)**.

6. Revisa la consola para visualizar los registros de las personas y empleados creados.

Requisitos

- Tener instalado Java JDK.
- Contar con un entorno de desarrollo compatible, como NetBeans.
- Disponer de los archivos fuente del proyecto.

---

Repositorio GitHub: [Pega aquí el enlace al repositorio]

Fecha de entrega: [07/11/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I
