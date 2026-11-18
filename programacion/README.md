# Programming (*Programación* — `programacion`)

This directory contains C/C++ coursework, console games, algorithmic exercises, inventory and student management systems, dynamic memory practices, and the final course project developed for the **Programming** (*Programación*) subject in the first-year Multiplatform Application Development (1º DAM) program.

---

## Technologies and Tools

### Programming Languages
- **C++ / C** (`.cpp` source files compiled with `g++`, primarily written in C-style procedural and structured C/C++ using `printf`/`scanf`, `struct`, pointers, C++ references `&`, and `malloc`/`realloc`/`free`)

### Libraries and Headers
- **Standard C/C++ Libraries:** `<iostream>`, `<cstdio>` / `<stdio.h>`, `<cstdlib>` / `<stdlib.h>`, `<cstring>` / `<string.h>`, `<string>`, `<cmath>` / `<math.h>`, `<ctime>` / `<time.h>`, `<stdbool.h>`, `<ctype.h>`
- **Platform / Console Extensions:** `<conio.h>` (`getch()`), `<unistd.h>` (`sleep()`), ANSI terminal color escape sequences
- **Classroom Custom Header:** `<donnie.h>` (used in `00_Examenes/Marzo/Practicas` and `00_Examenes/Marzo/Final` for string utilities such as `tominus`)

### Development Tools
- **[Orwell Dev-C++ 5.10](https://sourceforge.net/projects/orwelldevcpp/files/5.10/TDM-GCC%20x64/devcpp-5.10_setup.exe/download)**

### Compilers
- **TDM-GCC 4.8.1 (64-bit Release)** (`g++.exe`, `gcc.exe`)

---

## Projects and Exercises

### `00_Examenes` — Exam Preparation, Midterms, and Final Evaluations

#### `Diciembre/Practicas`
- **Name:** `Diciembre/Practicas`
- **Description:** Collection of 13 foundational review exercises covering string manipulation, arrays, mathematical sequences, and inventory management.
- **Technologies:** C++ (`iostream`, `stdio.h`, `stdlib.h`, `stdbool.h`, `conio.h`, `math.h`)
- **Key Features:**
  - [`CompararCadenas`](./00_Examenes/Diciembre/Practicas/CompararCadenas): Compares two strings for equality character by character without library functions.
  - [`ContarVocales`](./00_Examenes/Diciembre/Practicas/ContarVocales): Counts uppercase and lowercase vowels in a user-provided word.
  - [`FactorialDeUnNumero`](./00_Examenes/Diciembre/Practicas/FactorialDeUnNumero): Computes the factorial of an integer iteratively.
  - [`GestionDeInventario`](./00_Examenes/Diciembre/Practicas/GestionDeInventario): Parallel-array store inventory manager (up to 10 products) supporting add, list, search by name, and total inventory valuation.
  - [`InvertirCadena`](./00_Examenes/Diciembre/Practicas/InvertirCadena): Reverses an input word into a second character array.
  - [`MultiplicacionDeCadenasNumericas`](./00_Examenes/Diciembre/Practicas/MultiplicacionDeCadenasNumericas): Reads two equal-length numeric strings (minimum 10 digits) and multiplies their corresponding digits position by position (`d1 * d2`).
  - [`NumeroMayorYMenor`](./00_Examenes/Diciembre/Practicas/NumeroMayorYMenor): Reads 20 integers into an array and finds the minimum and maximum values.
  - [`NumerosParesEnUnArray`](./00_Examenes/Diciembre/Practicas/NumerosParesEnUnArray): Counts how many even numbers are stored in an integer array.
  - [`NumerosPrimos`](./00_Examenes/Diciembre/Practicas/NumerosPrimos): Prints all prime numbers less than or equal to a user-specified integer.
  - [`PromedioDeCalificaciones`](./00_Examenes/Diciembre/Practicas/PromedioDeCalificaciones): Computes the average grade of 30 students and counts how many scored above average.
  - [`SerieFibonacci`](./00_Examenes/Diciembre/Practicas/SerieFibonacci): Generates and prints the first 20 numbers of the Fibonacci sequence.
  - [`Sudoku`](./00_Examenes/Diciembre/Practicas/Sudoku): Interactive 9x9 matrix entry loop for a Sudoku board.
  - [`SumarElementosDeUnArray`](./00_Examenes/Diciembre/Practicas/SumarElementosDeUnArray): Reads 10 integers and outputs their sum.
- **Location:** [`./00_Examenes/Diciembre/Practicas`](./00_Examenes/Diciembre/Practicas)

#### `Diciembre/Ejercicio1` to `Diciembre/Ejercicio5`
- **Name:** `Diciembre/Ejercicio1`–`Ejercicio5`
- **Description:** First-term practical examination divided into 5 standalone exercises (`Ejercicio1` through `Ejercicio5`).
- **Technologies:** C++ (`stdio.h`, `stdlib.h`, `iostream`, `cmath`, `time.h`, `conio.h`)
- **Key Features:**
  - [`Ejercicio1`](./00_Examenes/Diciembre/Ejercicio1): Counts individual occurrences of each vowel (`a`, `e`, `i`, `o`, `u`) in a word.
  - [`Ejercicio2`](./00_Examenes/Diciembre/Ejercicio2): Reads 10 digit keypresses via `getch()` and filters prime digits.
  - [`Ejercicio3`](./00_Examenes/Diciembre/Ejercicio3): Restaurant bill and tip percentage calculator (`0`–`100%`).
  - [`Ejercicio4`](./00_Examenes/Diciembre/Ejercicio4): 5-option store inventory menu (add, list, search, total value, exit).
  - [`Ejercicio5`](./00_Examenes/Diciembre/Ejercicio5): Caesar cipher encoder and decoder shifting characters by an integer key (`clave`).
- **Location:** [`./00_Examenes/Diciembre`](./00_Examenes/Diciembre)

#### `Marzo/Practicas`
- **Name:** `Marzo/Practicas`
- **Description:** Four timed practice problems preparing for the second-term evaluation.
- **Technologies:** C++ (`iostream`, `stdlib.h`, `ctime`, `donnie.h`)
- **Key Features:**
  - [`AdivinarLaLetra`](./00_Examenes/Marzo/Practicas/AdivinarLaLetra): Picks a random letter from a user word (`>= 10` characters) and loops until the user guesses it.
  - [`ArraysParalelosOrdenadosPorAscii`](./00_Examenes/Marzo/Practicas/ArraysParalelosOrdenadosPorAscii): Pairs 10 words with 10 integers and sorts them in descending order by the sum of lowercase ASCII character codes plus the associated integer.
  - [`MenuVehiculos`](./00_Examenes/Marzo/Practicas/MenuVehiculos): Vehicle registry (`coches` struct) calculating travel time ($t = \text{km} / \text{velocidad}$) and supporting vehicle deletion.
  - [`SimuladorCombateDeMonstruos`](./00_Examenes/Marzo/Practicas/SimuladorCombateDeMonstruos): Generates 10 monsters (`Monstruo` struct) with random stats, sorts them from weakest to strongest (`ataque + defensa`), and simulates sequential combat against the player's monster.
- **Location:** [`./00_Examenes/Marzo/Practicas`](./00_Examenes/Marzo/Practicas)

#### `Marzo/Parcial` — Spacecraft & Astronaut Crew Manager
- **Name:** `Marzo/Parcial`
- **Description:** Second-term midterm exam ([`main.cpp`](./00_Examenes/Marzo/Parcial/main.cpp)) modeling spacecraft (`Naves`) and assigned astronauts (`Astronautas`, up to `maxAstronautas = 3` per ship).
- **Technologies:** C++ (`iostream`)
- **Key Features:** Registers spacecraft and crew, computes combined ship + crew weight on Earth and Mars, and sorts spacecraft by total weight.
- **Location:** [`./00_Examenes/Marzo/Parcial`](./00_Examenes/Marzo/Parcial)

#### `Marzo/Final` — Second-Term Comprehensive Evaluation Menu
- **Name:** `Marzo/Final`
- **Description:** 10-option final exam menu program ([`main.cpp`](./00_Examenes/Marzo/Final/main.cpp)) covering number theory, string processing, and struct-based student management.
- **Technologies:** C++ (`iostream`, `stdlib.h`, `donnie.h`)
- **Key Features:** Implements GCD/LCM (`MCD`/`MCM`) via the Euclidean algorithm, string reversal and case formatting, vowel extraction, consonant extraction, most frequent vowel detection, largest prime digit finder, and full CRUD + grade-average sorting for `Alumnos` records (`notac`, `notaweb`, `notaentornos`).
- **Location:** [`./00_Examenes/Marzo/Final`](./00_Examenes/Marzo/Final)

---

### `01_PiedraPapelTijera` to `19_PokemonCMD` — Course Projects and Practical Assignments

#### `01_PiedraPapelTijera` — Rock, Paper, Scissors
- **Name:** `01_PiedraPapelTijera`
- **Description:** Console Rock-Paper-Scissors game against the CPU where both player and machine start each match with 3 lives.
- **Technologies:** C++ (`iostream`, `cstdlib`, `ctime`)
- **Key Features:** Interactive menu tracking total rounds played (`contador`) and life deduction per round.
- **Location:** [`./01_PiedraPapelTijera`](./01_PiedraPapelTijera)

#### `02_Strings` — C-String Fundamentals
- **Name:** `02_Strings`
- **Description:** Demonstrates `char[]` buffer sizing (`sizeof`) versus string length (`strlen`), null termination (`'\0'`), and character ASCII shifting.
- **Technologies:** C++ (`stdlib.h`, `string.h`)
- **Key Features:** Compares `sizeof(palabra)` and `strlen(palabra)` and iterates over characters with `while` and `for`.
- **Location:** [`./02_Strings`](./02_Strings)

#### `03_Ahorcado` — Hangman with ASCII Gallows & Match Statistics
- **Name:** `03_Ahorcado`
- **Description:** Complete console Hangman game with 6 lives, progressive ASCII gallows art, and session statistics.
- **Technologies:** C++ (`iostream`, `stdio.h`, `string.h`, `conio.h`)
- **Key Features:** 5-option menu tracking games played, games won, and games lost; renders 6 stages of ASCII gallows as lives decrease.
- **Location:** [`./03_Ahorcado`](./03_Ahorcado)

#### `04_TresEnRaya` — Tic-Tac-Toe (vs. CPU and 2-Player)
- **Name:** `04_TresEnRaya`
- **Description:** Console 3x3 Tic-Tac-Toe game supporting both single-player (vs. random CPU) and two-player local modes.
- **Technologies:** C++ (`iostream`, `math.h`, `stdlib.h`, `string`, `ctime`)
- **Key Features:** Maps keypad numbers `1`–`9` to the 3x3 board, checks win conditions, and tracks total matches played.
- **Location:** [`./04_TresEnRaya`](./04_TresEnRaya)

#### `05_Tablero` — 10x10 Board Cursor Navigation
- **Name:** `05_Tablero`
- **Description:** Renders a framed 10x10 grid with a movable `'*'` cursor controlled via `W`, `A`, `S`, `D` keys.
- **Technologies:** C++ (`stdio.h`, `stdlib.h`)
- **Key Features:** Enforces board boundary limits (`0`–`9`) on every move and refreshes the console view until `'e'` is pressed.
- **Location:** [`./05_Tablero`](./05_Tablero)

#### `06_Funciones` — Modular Functions, Reference Utilities & Tic-Tac-Toe (`Funciones`, `FuncionesUtiles`, `TresEnRaya`)
- **Name:** `06_Funciones`
- **Description:** Three subprojects introducing function decomposition, C++ reference parameters, and an index of utility algorithms.
- **Technologies:** C++ (`iostream`, `cstdio`, `cstdlib`, `ctime`)
- **Key Features:**
  - [`Funciones/main.cpp`](./06_Funciones/Funciones/main.cpp): Modular calculator (`suma`, `resta`, `division`, `multiplicacion`) and ASCII case converter (`convertirMayusMinus`) separating I/O wrapper procedures from pure calculation functions.
  - [`FuncionesUtiles/main.cpp`](./06_Funciones/FuncionesUtiles/main.cpp): Checklist template enumerating 22 core string and math algorithms studied during the course (`strlen`, `strcmp`, `strcpy`, string reversal, case conversion, vowel/consonant extraction, primality, LCM/GCD, word extraction, Caesar cipher).
  - [`TresEnRaya/main.cpp`](./06_Funciones/TresEnRaya/main.cpp): Refactored modular version of `04_TresEnRaya` structured into clean functions (`inicializarMapa`, `imprimirMapa`, `realizarMovimiento`, `obtenerMovimientoCPU`, `verificarGanador`) and using C++ reference parameters (`int &partidas`).
- **Location:** [`./06_Funciones`](./06_Funciones)

#### `07_Sudoku` — 9x9 Sudoku Grid & Sum Validator
- **Name:** `07_Sudoku`
- **Description:** Interactive 9x9 Sudoku board filler that validates row and column sums once all 81 cells are populated.
- **Technologies:** C++ (`iostream`, `stdlib.h`, `stdio.h`, `string`, `stdbool.h`)
- **Key Features:** Prompts for column, row, and number (`1`–`9`) until no zero cells remain, then computes row/column sums (`contador1`, `contador2`) to verify they equal 45.
- **Location:** [`./07_Sudoku`](./07_Sudoku)

#### `08_Estructuras` — Struct-Based Store Inventory
- **Name:** `08_Estructuras`
- **Description:** Store inventory manager using a `struct producto` (`nombre`, `cantidad`, `precio`) array for up to 10 items.
- **Technologies:** C++ (`iostream`, `string.h`, `stdio.h`)
- **Key Features:** Implements `agregarProducto` (with C++ reference parameters `int &contador, bool &inventarioVacio`), `mostrarProductos`, `buscarProducto` (using `strcmp`), and `calcularTotalInventario`.
- **Location:** [`./08_Estructuras`](./08_Estructuras)

#### `09_Punteros` — Pointer Dereferencing and Address Inspection
- **Name:** `09_Punteros`
- **Description:** Short exercise demonstrating memory addresses (`&`) and pointer dereferencing (`*`).
- **Technologies:** C++ (`iostream`)
- **Key Features:** Modifies an integer variable through a pointer (`*numero1 = 6`) and prints both values and memory addresses.
- **Location:** [`./09_Punteros`](./09_Punteros)

#### `10_CalculadoraPorReferencia` — Pointer-Based Calculator
- **Name:** `10_CalculadoraPorReferencia`
- **Description:** Four-operation calculator where operands and results are read and written exclusively via pointer parameters (`int *n1, int *n2, int *n3`).
- **Technologies:** C++ (`iostream`)
- **Key Features:** Implements `sumar`, `restar`, `dividir`, and `multiplicar` mutating caller variables in `main` via pointers.
- **Location:** [`./10_CalculadoraPorReferencia`](./10_CalculadoraPorReferencia)

#### `11_MenuConReferenciaYFunciones` — String Operations via Pointers
- **Name:** `11_MenuConReferenciaYFunciones`
- **Description:** Processes an input word using functions that receive string length by pointer (`int *longitud`).
- **Technologies:** C++ (`iostream`)
- **Key Features:** Prints the reversed word (`invertirPalabra`), extracts all vowels (`imprimirVocales`), and converts the string to uppercase (`convertirMayusculas`).
- **Location:** [`./11_MenuConReferenciaYFunciones`](./11_MenuConReferenciaYFunciones)

#### `12_PasoPorReferenciaConEstructuras` — Struct Pointer Parameter Practice
- **Name:** `12_PasoPorReferenciaConEstructuras`
- **Description:** Introductory skeleton demonstrating how to pass an array of `struct alumno` and a counter by pointer to a function.
- **Technologies:** C++ (`iostream`, `stdio.h`)
- **Key Features:** Defines `struct alumno` (`id`, `nombre`) and pointer-based traversal in `nuevoAlumno`.
- **Location:** [`./12_PasoPorReferenciaConEstructuras`](./12_PasoPorReferenciaConEstructuras)

#### `13_Alumnos` — Student Registry and Grade Sorter (`v1` & `v2`)
- **Name:** `13_Alumnos`
- **Description:** Two versions of a menu-driven student management system progressing from fixed-size struct arrays (`v1`) to dynamic heap allocation with `malloc` and `realloc` (`v2`).
- **Technologies:** C++ (`stdio.h`, `conio.h`, `stdlib.h`, `string.h`)
- **Key Features:**
  - [`v1/main.cpp`](./13_Alumnos/v1/main.cpp): Fixed-array student registry (`struct persona` with `nombre`, `telefono`, `notaMedia` for up to 10 students) supporting adding (`agregarAlumno`), listing (`mostrarAlumnos`), deleting by name with array compaction (`eliminarPorNombre`), and sorting by average grade (`mayorAmenor`, `menorAmayor`).
  - [`v2/main.cpp`](./13_Alumnos/v2/main.cpp): Dynamic student registry (`Alumnos` struct with heap-allocated `char *nombre`, `notaC`, `notaJava`) that grows and shrinks its contiguous array at runtime using `realloc`, computes class averages (`media`), and frees string memory on deletion (`eliminar`).
- **Location:** [`./13_Alumnos`](./13_Alumnos)

#### `14_AlgoritmosDeOrdenacion` — Sorting Algorithms (`Array` & `Estructuras`)
- **Name:** `14_AlgoritmosDeOrdenacion`
- **Description:** Two subprojects practicing comparison-based sorting in ascending and descending order.
- **Technologies:** C++ (`iostream`, `stdlib.h`, `stdio.h`)
- **Key Features:**
  - [`Array/main.cpp`](./14_AlgoritmosDeOrdenacion/Array/main.cpp): Sorts a 10-element integer array in ascending order and then in descending order, printing each stage.
  - [`Estructuras/main.cpp`](./14_AlgoritmosDeOrdenacion/Estructuras/main.cpp): Reads 4 `persona` (`alumno`) struct records (`nombre`, `nota`) and sorts them by grade.
- **Location:** [`./14_AlgoritmosDeOrdenacion`](./14_AlgoritmosDeOrdenacion)

#### `15_GestionInventario` — Commercial Inventory, Sales & VAT Profitability System (`v1` & `v2`)
- **Name:** `15_GestionInventario`
- **Description:** Two iterations ([`v1/main.cpp`](./15_GestionInventario/v1/main.cpp) and [`v2/main.cpp`](./15_GestionInventario/v2/main.cpp)) of an enterprise inventory and sales management program (up to 100 products) incorporating Spanish VAT (*IVA*) rates and equivalence surcharge (*recargo de equivalencia*).
- **Technologies:** C++ (`iostream`)
- **Key Features:**
  - Registers products (`Producto`) with purchase price, sale price, VAT tier (`4%`, `10%`, `21%`), and corresponding equivalence surcharge (`0.5%`, `1.4%`, `5.2%`).
  - Records product sales (`Venta`), deletes products along with their associated sales, calculates total sales revenue, and ranks the top 5 most profitable products.
- **Location:** [`./15_GestionInventario`](./15_GestionInventario)

#### `16_Astronautas` — ESA Mars Mission Spacecraft Selector
- **Name:** `16_Astronautas`
- **Description:** Simulation tool for the European Space Agency (ESA) modeling spacecraft (`Naves`) and astronauts (`Astronautas`) to evaluate mission payload weights on Earth ($g = 9.2\text{ m/s}^2$) and Mars ($g = 3.71\text{ m/s}^2$).
- **Technologies:** C++ (`iostream`, `string.h`, `unistd.h`)
- **Key Features:** Enforces crew capacity via a single macro (`#define maxAstronautas 3`), validates astronaut age (`18`–`80`) and mass (`60.0`–`95.0` kg), computes planetary weights using pointers in all functions, and sorts spacecraft from lightest to heaviest crew.
- **Location:** [`./16_Astronautas`](./16_Astronautas)

#### `17_Olimpiadas` — Olympic Target Shooting Score Tracker
- **Name:** `17_Olimpiadas`
- **Description:** Training score manager for an Olympic target shooting team (`Tiradores` struct).
- **Technologies:** C++ (`iostream`, `string.h`)
- **Key Features:** Creates shooters (name, age, country), records individual shot scores (`0`, `1`, `2`, `3`, or `5`), sorts athletes by total score (`ordenarTotal`), and sorts athletes by the count of `Xpuntos` (`#define Xpuntos 5`) shots (`ordenarTiros`).
- **Location:** [`./17_Olimpiadas`](./17_Olimpiadas)

#### `18_MemoriaDinamica` — Dynamic Memory Allocation & Singly Linked Lists (`Memoria` & `Estructuras`)
- **Name:** `18_MemoriaDinamica`
- **Description:** Two subprojects practicing heap allocation (`malloc`/`free`) with dynamic arrays and self-referential linked list nodes.
- **Technologies:** C++ (`iostream`, `stdio.h`, `stdlib.h`, `string.h`)
- **Key Features:**
  - [`Memoria/main.cpp`](./18_MemoriaDinamica/Memoria/main.cpp): Demonstrates heap allocation and deallocation of a 2D character array (`char **nombre`) and an integer array (`int *notas`) for 5 students, reading full names with spaces and releasing all heap blocks with `free`.
  - [`Estructuras/main.cpp`](./18_MemoriaDinamica/Estructuras/main.cpp): Builds a singly linked list of dynamically allocated `struct alumno` nodes (`nombre`, `edad`, `nota`, `struct alumno *sig`), appending nodes to the tail (`nuevoAlumno`) and retrieving elements by 1-based index (`mostrarElemento`).
- **Location:** [`./18_MemoriaDinamica`](./18_MemoriaDinamica)

#### `19_PokemonCMD` — Final Course Project: Console Pokémon RPG
- **Name:** `19_PokemonCMD`
- **Description:** 1,167-line console Pokémon RPG in C++ featuring all 151 first-generation Pokémon, dynamic 2D map exploration, wild encounters, turn-based combat, capture mechanics, a Poké Mart, a Pokémon Center, and full game-state persistence to disk.
- **Technologies:** C++ (`iostream`, `stdio.h`, `stdlib.h`, `string.h`, `time.h`, `unistd.h`, `conio.h`, `ctype.h`, ANSI color codes)
- **Key Features:**
  - **151 First-Gen Pokédex (`inicializarPokedex`):** Initializes all 151 Kanto Pokémon with primary/secondary types and randomized base stats (`lvl`, `at`, `df`, `atE`, `dfE`, `psMAX`, `vel`).
  - **Dynamic World Map (`inicializarMapa`, `imprimirMapa`, `movPersonaje`):** Allocates the 2D world grid on the heap (`malloc`) with tall grass (`accionHierba`), water (`accionAgua`), a Pokémon Center (`accionCentroPokemon`), and a Poké Mart (`accionTienda`), rendered with ANSI colors.
  - **Turn-Based Combat & Capture (`combate`, `atraparPokemonSalvaje`):** Supports battling wild Pokémon, using potions (`curarPokemon`), throwing Pokéballs to capture wild Pokémon into a 6-slot dynamic team (`Equipo` with `Pokemon *p` allocated via `malloc`), and assigning custom nicknames (`apodo`).
  - **Save/Load Persistence (`guardarPartidaCompleta`, `cargarPartidaCompleta`):** Serializes and restores the player's inventory (`dinero`, `pokeballs`, `pociones`), full 6-slot team, and complete 2D map layout to/from [`partida_completa.txt`](./19_PokemonCMD/partida_completa.txt).
  - Includes its own project documentation in [`19_PokemonCMD/README.md`](./19_PokemonCMD/README.md).
- **Location:** [`./19_PokemonCMD`](./19_PokemonCMD)

---

## Additional Notes

### Compilation and Execution
To compile any project manually using MinGW-w64 `g++`:

```bash
g++ main.cpp -o main.exe
```

> [!IMPORTANT]
> The four practice exercises in [`00_Examenes/Marzo/Practicas`](./00_Examenes/Marzo/Practicas) and the exam in [`00_Examenes/Marzo/Final`](./00_Examenes/Marzo/Final) include `<donnie.h>`, a custom classroom header file not tracked in the repository. To compile them from source, provide a compatible header defining `tominus()` or replace `<donnie.h>` with `<cstring>` and `<cctype>`.

> [!NOTE]
> A few in-class practice files ([`09_Punteros/main.cpp`](./09_Punteros/main.cpp), [`12_PasoPorReferenciaConEstructuras/main.cpp`](./12_PasoPorReferenciaConEstructuras/main.cpp), [`17_Olimpiadas/main.cpp`](./17_Olimpiadas/main.cpp)) contain minor syntax typos from live coding sessions and are preserved unmodified as part of the academic record.
