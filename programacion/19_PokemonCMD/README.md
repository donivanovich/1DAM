# 🎮 Proyecto Final de Curso – Pokémon CMD en C++ (`19_PokemonCMD`)

Este directorio contiene el código fuente de **Pokémon CMD**, un juego RPG de consola desarrollado en **C++** como proyecto final de la asignatura de **Programación** (1º DAM).  
El objetivo principal es **aprender y poner en práctica conceptos de programación estructurada y memoria dinámica**, no crear un producto comercial.

---

## 📁 Estructura del Proyecto

- [`main.cpp`](./main.cpp): Código fuente principal del juego (Pokédex de 151 Pokémon de Kanto, generación y exploración de mapa 2D en memoria dinámica, combates por turnos, captura, Tienda, Centro Pokémon y persistencia en disco).
- [`partida_completa.txt`](./partida_completa.txt): Archivo de guardado donde se serializan el inventario, el equipo Pokémon y el estado completo del mapa.

---

## 🚀 Características
- Desarrollado íntegramente en **C++**.  
- Implementación de conceptos de:
  - Manejo de memoria dinámica (`malloc`, `free`).  
  - Uso de estructuras de datos (`struct`) y punteros.  
  - Lectura y escritura de ficheros para guardado y carga de partida.  
- Juego de consola con exploración en cuadrícula 2D renderizada con colores ANSI y mecánicas clásicas de combate y captura.  

---

## 📚 Propósito
Este proyecto fue creado **únicamente con fines educativos**.  
No tiene relación oficial con ninguna compañía, franquicia ni marca registrada.  
**No se distribuye con fines de lucro.**

---

## ⚖️ Aviso Legal
- **No se pretende infringir derechos de autor ni de propiedad intelectual.**

---

## 🛠️ Compilación y Ejecución
1. Situarse en el directorio del proyecto:
   ```bash
   cd programacion/19_PokemonCMD
   ```
2. Compilar con `g++` (MinGW-w64 en Windows):
   ```bash
   g++ main.cpp -o pokemon.exe
   ```
3. Ejecutar el binario generado:
   ```bash
   ./pokemon.exe
   ```
