# Programming (*Programación* — `programacion`)

This directory contains C/C++ coursework, console games, algorithmic exercises, inventory and student management systems, dynamic memory practices, and the final course project developed for the **Programming** (*Programación*) subject in the first-year Multiplatform Application Development (1º DAM) program.

---

## Technologies and Tools

### Programming Languages
- **C++ / C** (`.cpp` source files compiled with `g++`, primarily written in C-style procedural and structured C/C++ using `printf`/`scanf`, `struct`, pointers, C++ references `&`, and `malloc`/`realloc`/`free`)

### Libraries and Headers
- **Standard C/C++ Libraries:** `<iostream>`, `<cstdio>` / `<stdio.h>`, `<cstdlib>` / `<stdlib.h>`, `<cstring>` / `<string.h>`, `<string>`, `<cmath>` / `<math.h>`, `<ctime>` / `<time.h>`, `<stdbool.h>`, `<ctype.h>`
- **Platform / Console Extensions:** `<conio.h>` (`getch()`), `<unistd.h>` (`sleep()`), ANSI terminal color escape sequences
- **Classroom Custom Header:** `<donnie.h>` (used in `00_Examenes/04_Repaso` and `00_Examenes/05_Examen2` for string utilities such as `tominus`)

### Development Tools
- **[Orwell Dev-C++ 5.10](https://sourceforge.net/projects/orwelldevcpp/files/5.10/TDM-GCC%20x64/devcpp-5.10_setup.exe/download)**

### Build Systems and Compilers
- **TDM-GCC 4.8.1 (64-bit Release)** (`g++.exe`, `gcc.exe`, `windres.exe`)
- **Dev-C++ Project Files:** `.dev` project files, `.layout` layout files, and auto-generated `Makefile.win` scripts

---

## Projects and Exercises

### `00_Examenes` — Exam Preparation, Midterms, and Final Evaluations

#### `01_EjerciciosDeRepaso`
- **Name:** `01_EjerciciosDeRepaso`
- **Description:** Collection of 12 foundational review exercises covering string manipulation, arrays, mathematical sequences, and inventory management.
- **Technologies:** C++ (`iostream`, `stdio.h`, `stdlib.h`, `stdbool.h`, `conio.h`, `math.h`)
- **Key Features:**
  - [`CompararCadenas`](./00_Examenes/01_EjerciciosDeRepaso/CompararCadenas): Compares two strings for equality character by character without library functions.
  - [`ContarVocales`](./00_Examenes/01_EjerciciosDeRepaso/ContarVocales): Counts uppercase and lowercase vowels in a user-provided word.
  - [`FactorialDeUnNumero`](./00_Examenes/01_EjerciciosDeRepaso/FactorialDeUnNumero): Computes the factorial of an integer iteratively.
  - [`GestionDeInventario`](./00_Examenes/01_EjerciciosDeRepaso/GestionDeInventario): Parallel-array store inventory manager (up to 10 products) supporting add, list, search by name, and total inventory valuation.
  - [`InvertirCadena`](./00_Examenes/01_EjerciciosDeRepaso/InvertirCadena): Reverses an input word into a second character array.
  - [`NumeroMayorYMenor`](./00_Examenes/01_EjerciciosDeRepaso/NumeroMayorYMenor): Reads 20 integers into an array and finds the minimum and maximum values.
  - [`NumerosParesEnUnArray`](./00_Examenes/01_EjerciciosDeRepaso/NumerosParesEnUnArray): Counts how many even numbers are stored in an integer array.
  - [`NumerosPrimos`](./00_Examenes/01_EjerciciosDeRepaso/NumerosPrimos): Prints all prime numbers less than or equal to a user-specified integer.
  - [`PromedioDeCalificaciones`](./00_Examenes/01_EjerciciosDeRepaso/PromedioDeCalificaciones): Computes the average grade of 30 students and counts how many scored above average.
  - [`SerieFibonacci`](./00_Examenes/01_EjerciciosDeRepaso/SerieFibonacci): Generates and prints the first 20 numbers of the Fibonacci sequence.
  - [`Sudoku`](./00_Examenes/01_EjerciciosDeRepaso/Sudoku): Interactive 9x9 matrix entry loop for a Sudoku board.
  - [`SumarElementosDeUnArray`](./00_Examenes/01_EjerciciosDeRepaso/SumarElementosDeUnArray): Reads 10 integers and outputs their sum.
  - [`mielda`](./00_Examenes/01_EjerciciosDeRepaso/mielda): Reads two equal-length numeric strings (minimum 10 digits) and multiplies their corresponding digits position by position (`d1 * d2`).
- **Location:** [`./00_Examenes/01_EjerciciosDeRepaso`](./00_Examenes/01_EjerciciosDeRepaso)

#### `02_Examen1`
- **Name:** `02_Examen1`
- **Description:** First-term practical examination divided into 5 standalone exercises (`1` through `5`).
- **Technologies:** C++ (`stdio.h`, `stdlib.h`, `iostream`, `cmath`, `time.h`, `conio.h`)
- **Key Features:**
  - [`1`](./00_Examenes/02_Examen1/1): Counts individual occurrences of each vowel (`a`, `e`, `i`, `o`, `u`) in a word.
  - [`2`](./00_Examenes/02_Examen1/2): Reads 10 digit keypresses via `getch()` and filters prime digits.
  - [`3`](./00_Examenes/02_Examen1/3): Restaurant bill and tip percentage calculator (`0`–`100%`).
  - [`4`](./00_Examenes/02_Examen1/4): 5-option store inventory menu (add, list, search, total value, exit).
  - [`5`](./00_Examenes/02_Examen1/5): Caesar cipher encoder and decoder shifting characters by an integer key (`clave`).
- **Location:** [`./00_Examenes/02_Examen1`](./00_Examenes/02_Examen1)

#### `03_Parcial` — Spacecraft & Astronaut Crew Manager
- **Name:** `03_Parcial`
- **Description:** Midterm exam modeling spacecraft (`Naves`) and assigned astronauts (`Astronautas`, up to `maxAstronautas = 3` per ship).
- **Technologies:** C++ (`iostream`)
- **Key Features:** Registers spacecraft and crew, computes combined ship + crew weight on Earth and Mars, and sorts spacecraft by total weight.
- **Location:** [`./00_Examenes/03_Parcial`](./00_Examenes/03_Parcial)

#### `04_Repaso`
- **Name:** `04_Repaso`
- **Description:** Four timed practice problems preparing for the second-term evaluation.
- **Technologies:** C++ (`iostream`, `stdlib.h`, `ctime`, `donnie.h`)
- **Key Features:**
  - [`AdivinarLaLetra`](./00_Examenes/04_Repaso/AdivinarLaLetra): Picks a random letter from a user word (`>= 10` characters) and loops until the user guesses it.
  - [`ArraysParalelosOrdenadosPorAscii`](./00_Examenes/04_Repaso/ArraysParalelosOrdenadosPorAscii): Pairs 10 words with 10 integers and sorts them in descending order by the sum of lowercase ASCII character codes plus the associated integer.
  - [`MenuVehiculos`](./00_Examenes/04_Repaso/MenuVehiculos): Vehicle registry (`coches` struct) calculating travel time ($t = \text{km} / \text{velocidad}$) and supporting vehicle deletion.
  - [`SimuladorCombateDeMonstruos`](./00_Examenes/04_Repaso/SimuladorCombateDeMonstruos): Generates 10 monsters (`Monstruo` struct) with random stats, sorts them from weakest to strongest (`ataque + defensa`), and simulates sequential combat against the player's monster.
- **Location:** [`./00_Examenes/04_Repaso`](./00_Examenes/04_Repaso)

#### `05_Examen2` — Second-Term Comprehensive Evaluation Menu
- **Name:** `05_Examen2`
- **Description:** 10-option menu program (`Menu.dev`) covering number theory, string processing, and struct-based student management.
- **Technologies:** C++ (`iostream`, `stdlib.h`, `donnie.h`)
- **Key Features:** Implements GCD/LCM (`MCD`/`MCM`) via the Euclidean algorithm, string reversal and case formatting, vowel extraction, consonant extraction, most frequent vowel detection, largest prime digit finder, and full CRUD + grade-average sorting for `Alumnos` records (`notac`, `notaweb`, `notaentornos`).
- **Location:** [`./00_Examenes/05_Examen2`](./00_Examenes/05_Examen2)

---

### `01_PiedraPapelTijera` to `24_PokemonCMD` — Course Projects and Practical Assignments

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

#### `06_Funciones` — Modular Calculator and Case Converter
- **Name:** `06_Funciones`
- **Description:** Introduces function decomposition for arithmetic operations (`suma`, `resta`, `division`, `multiplicacion`) and ASCII case toggling (`convertirMayusMinus`).
- **Technologies:** C++ (`iostream`, `stdlib.h`, `stdio.h`)
- **Key Features:** Separates input/output wrapper procedures (`sumar`, `restar`, `dividir`, `multiplicar`) from pure calculation functions.
- **Location:** [`./06_Funciones`](./06_Funciones)

#### `07_TresEnRayaConFunciones` — Modular Tic-Tac-Toe with C++ References
- **Name:** `07_TresEnRayaConFunciones`
- **Description:** Refactored version of `04_TresEnRaya` structured into clean functions and using C++ reference parameters (`int &partidas`).
- **Technologies:** C++ (`cstdio`, `cstdlib`, `ctime`)
- **Key Features:** Encapsulates board initialization (`inicializarMapa`), rendering (`imprimirMapa`), move validation (`realizarMovimiento`), CPU move generation (`obtenerMovimientoCPU`), and win detection (`verificarGanador`).
- **Location:** [`./07_TresEnRayaConFunciones`](./07_TresEnRayaConFunciones)

#### `08_Sudoku` — 9x9 Sudoku Grid & Sum Validator
- **Name:** `08_Sudoku`
- **Description:** Interactive 9x9 Sudoku board filler that validates row and column sums once all 81 cells are populated.
- **Technologies:** C++ (`iostream`, `stdlib.h`, `stdio.h`, `string`, `stdbool.h`)
- **Key Features:** Prompts for column, row, and number (`1`–`9`) until no zero cells remain, then computes row/column sums (`contador1`, `contador2`) to verify they equal 45.
- **Location:** [`./08_Sudoku`](./08_Sudoku)

#### `09_Estructuras` — Struct-Based Store Inventory
- **Name:** `09_Estructuras`
- **Description:** Store inventory manager using a `struct producto` (`nombre`, `cantidad`, `precio`) array for up to 10 items.
- **Technologies:** C++ (`iostream`, `string.h`, `stdio.h`)
- **Key Features:** Implements `agregarProducto` (with C++ reference parameters `int &contador, bool &inventarioVacio`), `mostrarProductos`, `buscarProducto` (using `strcmp`), and `calcularTotalInventario`.
- **Location:** [`./09_Estructuras`](./09_Estructuras)

#### `10_Punteros` — Pointer Dereferencing and Address Inspection
- **Name:** `10_Punteros`
- **Description:** Short exercise demonstrating memory addresses (`&`) and pointer dereferencing (`*`).
- **Technologies:** C++ (`iostream`)
- **Key Features:** Modifies an integer variable through a pointer (`*numero1 = 6`) and prints both values and memory addresses.
- **Location:** [`./10_Punteros`](./10_Punteros)

#### `11_CalculadoraPorReferencia` — Pointer-Based Calculator
- **Name:** `11_CalculadoraPorReferencia`
- **Description:** Four-operation calculator where operands and results are read and written exclusively via pointer parameters (`int *n1, int *n2, int *n3`).
- **Technologies:** C++ (`iostream`)
- **Key Features:** Implements `sumar`, `restar`, `dividir`, and `multiplicar` mutating caller variables in `main` via pointers.
- **Location:** [`./11_CalculadoraPorReferencia`](./11_CalculadoraPorReferencia)

#### `12_MenuConReferenciaYFunciones` — String Operations via Pointers
- **Name:** `12_MenuConReferenciaYFunciones`
- **Description:** Processes an input word using functions that receive string length by pointer (`int *longitud`).
- **Technologies:** C++ (`iostream`)
- **Key Features:** Prints the reversed word (`invertirPalabra`), extracts all vowels (`imprimirVocales`), and converts the string to uppercase (`convertirMayusculas`).
- **Location:** [`./12_MenuConReferenciaYFunciones`](./12_MenuConReferenciaYFunciones)

#### `13_PasoPorReferenciaConEstructuras` — Struct Pointer Parameter Practice
- **Name:** `13_PasoPorReferenciaConEstructuras`
- **Description:** Introductory skeleton demonstrating how to pass an array of `struct alumno` and a counter by pointer to a function.
- **Technologies:** C++ (`iostream`, `stdio.h`)
- **Key Features:** Defines `struct alumno` (`id`, `nombre`) and pointer-based traversal in `nuevoAlumno`.
- **Location:** [`./13_PasoPorReferenciaConEstructuras`](./13_PasoPorReferenciaConEstructuras)

#### `14_Alumnos` — Student Registry and Grade Sorter
- **Name:** `14_Alumnos`
- **Description:** Menu-driven student management system (`struct persona` with `nombre`, `telefono`, `notaMedia` for up to 10 students).
- **Technologies:** C++ (`stdio.h`, `conio.h`, `stdlib.h`)
- **Key Features:** Supports adding students (`agregarAlumno`), listing all students (`mostrarAlumnos`), deleting a student by name with array compaction (`eliminarPorNombre`), and sorting students by average grade in descending (`mayorAmenor`) or ascending (`menorAmayor`) order.
- **Location:** [`./14_Alumnos`](./14_Alumnos)

#### `15_AlgoritmosDeOrdenacion` — Sorting Algorithms (Arrays and Structs)
- **Name:** `15_AlgoritmosDeOrdenacion`
- **Description:** Two subprojects practicing comparison-based sorting in ascending and descending order.
- **Technologies:** C++ (`iostream`, `stdlib.h`, `stdio.h`)
- **Key Features:**
  - [`1`](./15_AlgoritmosDeOrdenacion/1): Sorts a 10-element integer array in ascending order and then in descending order, printing each stage.
  - [`1ConEstructuras`](./15_AlgoritmosDeOrdenacion/1ConEstructuras): Reads 4 `persona` (`alumno`) struct records (`nombre`, `nota`) and sorts them by grade.
- **Location:** [`./15_AlgoritmosDeOrdenacion`](./15_AlgoritmosDeOrdenacion)

#### `16_GestionInventario` & `17_GestionInventarioV2` — Commercial Inventory, Sales & VAT Profitability System
- **Name:** `16_GestionInventario` and `17_GestionInventarioV2`
- **Description:** Two iterations of an enterprise inventory and sales management program (up to 100 products) incorporating Spanish VAT (*IVA*) rates and equivalence surcharge (*recargo de equivalencia*).
- **Technologies:** C++ (`iostream`)
- **Key Features:**
  - Registers products (`Producto`) with purchase price, sale price, VAT tier (`4%`, `10%`, `21%`), and corresponding equivalence surcharge (`0.5%`, `1.4%`, `5.2%`).
  - Records product sales (`Venta`), deletes products along with their associated sales, calculates total sales revenue, and ranks the top 5 most profitable products.
- **Location:** [`./16_GestionInventario`](./16_GestionInventario) and [`./17_GestionInventarioV2`](./17_GestionInventarioV2)

#### `18_Astronautas` — ESA Mars Mission Spacecraft Selector
- **Name:** `18_Astronautas`
- **Description:** Simulation tool for the European Space Agency (ESA) modeling spacecraft (`Naves`) and astronauts (`Astronautas`) to evaluate mission payload weights on Earth ($g = 9.2\text{ m/s}^2$) and Mars ($g = 3.71\text{ m/s}^2$).
- **Technologies:** C++ (`iostream`, `string.h`, `unistd.h`)
- **Key Features:** Enforces crew capacity via a single macro (`#define maxAstronautas 3`), validates astronaut age (`18`–`80`) and mass (`60.0`–`95.0` kg), computes planetary weights using pointers in all functions, and sorts spacecraft from lightest to heaviest crew.
- **Location:** [`./18_Astronautas`](./18_Astronautas)

#### `19_Olimpiadas` — Olympic Target Shooting Score Tracker
- **Name:** `19_Olimpiadas`
- **Description:** Training score manager for an Olympic target shooting team (`Tiradores` struct).
- **Technologies:** C++ (`iostream`, `string.h`)
- **Key Features:** Creates shooters (name, age, country), records individual shot scores (`0`, `1`, `2`, `3`, or `5`), sorts athletes by total score (`ordenarTotal`), and sorts athletes by the count of `Xpuntos` (`#define Xpuntos 5`) shots (`ordenarTiros`).
- **Location:** [`./19_Olimpiadas`](./19_Olimpiadas)

#### `20_FuncionesUtiles` — Utility Functions Reference List
- **Name:** `20_FuncionesUtiles`
- **Description:** Checklist template (`main.cpp`) enumerating 22 core string and math algorithms studied during the course (`strlen`, `strcmp`, `strcpy`, string reversal, case conversion, vowel/consonant extraction, primality, LCM/GCD, word extraction, Caesar cipher).
- **Technologies:** C++ (`iostream`)
- **Key Features:** Serves as an index of reusable algorithmic building blocks for exam preparation.
- **Location:** [`./20_FuncionesUtiles`](./20_FuncionesUtiles)

#### `21_MemoriaDinamica` — Dynamic Array Allocation with `malloc` and `free`
- **Name:** `21_MemoriaDinamica`
- **Description:** Demonstrates heap allocation and deallocation of a 2D character array (`char **nombre`) and an integer array (`int *notas`) for 5 students.
- **Technologies:** C++ (`iostream`, `stdlib.h`, `string.h`)
- **Key Features:** Allocates pointer arrays with `malloc`, reads full names (including spaces via `scanf(" %[^\n]", ...)`), prints the records, and releases all heap memory with `free`.
- **Location:** [`./21_MemoriaDinamica`](./21_MemoriaDinamica)

#### `22_EstructurasDinamicas` — Singly Linked List of Student Structs
- **Name:** `22_EstructurasDinamicas`
- **Description:** Builds a singly linked list of dynamically allocated `struct alumno` nodes (`nombre`, `edad`, `nota`, `struct alumno *sig`).
- **Technologies:** C++ (`stdio.h`, `stdlib.h`, `string.h`)
- **Key Features:** Allocates each node and its exact-length `nombre` string via `malloc`, appends nodes to the tail of the list (`nuevoAlumno`), and retrieves elements by 1-based index (`mostrarElemento`).
- **Location:** [`./22_EstructurasDinamicas`](./22_EstructurasDinamicas)

#### `23_AlumnosV2` — Dynamic Student Registry with `realloc`
- **Name:** `23_AlumnosV2`
- **Description:** Dynamic student management system (`Alumnos` struct with heap-allocated `char *nombre`, `notaC`, `notaJava`) that grows and shrinks its contiguous array at runtime using `realloc`.
- **Technologies:** C++ (`stdio.h`, `stdlib.h`, `string.h`)
- **Key Features:** Supports adding students (`agregar` with `malloc` + `realloc`), listing students (`mostrar`), computing class averages in C and Java (`media`), and deleting a student by name while freeing string memory and shrinking the array (`eliminar`).
- **Location:** [`./23_AlumnosV2`](./23_AlumnosV2)

#### `24_PokemonCMD` — Final Course Project: Console Pokémon RPG
- **Name:** `24_PokemonCMD`
- **Description:** 1,167-line console Pokémon RPG in C++ featuring all 151 first-generation Pokémon, dynamic 2D map exploration, wild encounters, turn-based combat, capture mechanics, a Poké Mart, a Pokémon Center, and full game-state persistence to disk.
- **Technologies:** C++ (`iostream`, `stdio.h`, `stdlib.h`, `string.h`, `time.h`, `unistd.h`, `conio.h`, `ctype.h`, ANSI color codes)
- **Key Features:**
  - **151 First-Gen Pokédex (`inicializarPokedex`):** Initializes all 151 Kanto Pokémon with primary/secondary types and randomized base stats (`lvl`, `at`, `df`, `atE`, `dfE`, `psMAX`, `vel`).
  - **Dynamic World Map (`inicializarMapa`, `imprimirMapa`, `movPersonaje`):** Allocates the 2D world grid on the heap (`malloc`) with tall grass (`accionHierba`), water (`accionAgua`), a Pokémon Center (`accionCentroPokemon`), and a Poké Mart (`accionTienda`), rendered with ANSI colors.
  - **Turn-Based Combat & Capture (`combate`, `atraparPokemonSalvaje`):** Supports battling wild Pokémon, using potions (`curarPokemon`), throwing Pokéballs to capture wild Pokémon into a 6-slot dynamic team (`Equipo` with `Pokemon *p` allocated via `malloc`), and assigning custom nicknames (`apodo`).
  - **Save/Load Persistence (`guardarPartidaCompleta`, `cargarPartidaCompleta`):** Serializes and restores the player's inventory (`dinero`, `pokeballs`, `pociones`), full 6-slot team, and complete 2D map layout to/from [`partida_completa.txt`](./24_PokemonCMD/partida_completa.txt).
  - Includes its own project documentation in [`24_PokemonCMD/README.md`](./24_PokemonCMD/README.md).
- **Location:** [`./24_PokemonCMD`](./24_PokemonCMD)

---

## Additional Notes

### Compilation and Execution
Every project folder contains a Dev-C++ `.dev` project file and `Makefile.win`. To compile a project manually using MinGW-w64 `g++`:

```bash
g++ main.cpp -o main.exe
```

> [!IMPORTANT]
> The four practice exercises in [`00_Examenes/04_Repaso`](./00_Examenes/04_Repaso) and the exam in [`00_Examenes/05_Examen2`](./00_Examenes/05_Examen2) include `<donnie.h>`, a custom classroom header file not tracked in the repository. Those five files already include precompiled `.exe` binaries in their respective folders; to recompile them from source, provide a compatible header defining `tominus()` or replace `<donnie.h>` with `<cstring>` and `<cctype>`.

> [!NOTE]
> A few in-class practice files (`10_Punteros/main.cpp`, `13_PasoPorReferenciaConEstructuras/main.cpp`, `19_Olimpiadas/main.cpp`) contain minor syntax typos from live coding sessions and are preserved unmodified as part of the academic record.
