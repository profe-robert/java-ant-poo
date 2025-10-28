DemoPOO — EA2 (Herencia, Colecciones, Polimorfismo)

Proyecto de ejemplo para la Experiencia de Aprendizaje 2 del ramo Desarrollo Orientado a Objetos.
Incluye jerarquías de clases (extends), colecciones (ArrayList) y polimorfismo / interfaces.

🧰 Requisitos

JDK 21, 24 o 25 (recomendado: 24 o 25).

Apache NetBeans 27 (Java with Ant).

Sistema operativo: Windows, macOS o Linux.

Si NetBeans no detecta tu JDK, ve a Tools → Java Platforms y agréguelo manualmente.

📦 Estructura del proyecto
```bash
DemoPOO/
├─ nbproject/              # Metadatos del proyecto (NetBeans/Ant)
├─ src/
│  └─ cl/demopoo/
│     ├─ app/              # Clase Main (menú de pruebas)
│     ├─ modelo/           # Entidades, herencia, interfaces
│     └─ servicio/         # Lógica de negocio / CRUD en memoria
├─ build/                  # Compilados (ignorado por Git)
├─ dist/                   # Artefactos .jar (ignorado por Git)
├─ build.xml               # Script Ant (NetBeans)
└─ README.md
```

▶️ Ejecutar en NetBeans (recomendado)

Abrir NetBeans → File → Open Project… → seleccionar la carpeta DemoPOO.

(Primera vez) Click derecho sobre el proyecto → Properties → Libraries y verifica que la Java Platform sea tu JDK 24/25.

Ejecutar con Run Project (F6).

Deberías ver en la consola un menú de opciones (listar/agregar/eliminar, etc.).

Si el proyecto no corre, prueba Run → Clean and Build Project (Shift+F11) y luego F6.

▶️ Ejecutar desde la terminal (opcional)

Dentro de la carpeta del proyecto:

# Compilar y construir el .jar
ant clean
ant jar

# Ejecutar (si el manifest tiene la clase Main configurada)
ant run
# o bien:
java -jar dist/DemoPOO.jar


Si tu proyecto no tiene Main en el manifest aún, ejecuta:

java -cp "build/classes" cl.demopoo.app.Main

🌎 Tildes y caracteres especiales (UTF-8)

Si ves caracteres raros en la consola:

Fuerza UTF-8 para este proyecto:
Run → Set Project Configuration → Customize → Run → VM Options
agrega:

-Dfile.encoding=UTF-8


Verifica que los archivos .java estén guardados en UTF-8 (barra inferior del editor).

🧪 ¿Qué debería poder hacer?

Herencia: clases como Electronico y Ropa que extienden Producto.

Colecciones: ArrayList<Producto> con CRUD (agregar, buscar, eliminar, listar).

Polimorfismo/Interfaces: jerarquía de Empleado + interfaz (p.ej., Bonificable) y cálculo de salarios/bonus.

Menú en consola para probar los casos.

🆘 Problemas comunes

“No se encuentra la clase Main”
→ Click derecho proyecto → Properties → Run → configura Main Class: cl.demopoo.app.Main.

“UnsupportedClassVersionError” (versión de clase muy nueva)
→ Estás compilando con un JDK y ejecutando con otro más antiguo. Asegura que JDK de compilación y ejecución sean el mismo (ver “Java Platform” del proyecto).

Errores de acentos
→ Revisa la sección de UTF-8 (arriba).
