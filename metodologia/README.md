# Programming Methodology (*Metodología de la Programación* — `metodologia`)

This directory contains C programs, algorithmic exercises, console games, grid simulations, and fundamental data structure implementations developed for the **Programming Methodology** (*Metodología de la Programación*) subject in the first-year Multiplatform Application Development (1º DAM) program.

---

## Technologies and Tools

### Programming Languages
- **C** (Standard C compiled with 64-bit MinGW-w64 GCC)

### Libraries and Headers
- **C Standard Library:** `<stdio.h>`, `<stdlib.h>`, `<string.h>`, `<stdbool.h>`, `<time.h>`, `<math.h>`
- **Platform / Console Extensions:** `<conio.h>` (`getch()`, `kbhit()`), `<unistd.h>` (`sleep()`), and ANSI escape codes for terminal colors

### Development Tools
- **[Orwell Dev-C++ 5.10](https://sourceforge.net/projects/orwelldevcpp/files/5.10/TDM-GCC%20x64/devcpp-5.10_setup.exe/download)**

### Compilers
- **TDM-GCC 4.8.1 (64-bit Release)** (`gcc.exe`)

---

## Projects and Exercises

### `00_Examenes` — Examinations and Practice Sets

#### `Diciembre/Practicas`
- **Name:** `Diciembre/Practicas`
- **Description:** Pre-exam C program ([`main.c`](./00_Examenes/Diciembre/Practicas/main.c)) that reverses each individual word in a sentence while preserving the original word order (e.g., `"Hola mundo desde C"` -> `"aloH odnum edsed C"`).
- **Technologies:** C (`stdio.h`, `stdlib.h`, `string.h`)
- **Key Features:** Modularized into `leerCadena` (using `fgets`), `invertirPalabras` (scanning word boundaries and reversing character slices in place), and `imprimirCadena`.
- **Location:** [`./00_Examenes/Diciembre/Practicas`](./00_Examenes/Diciembre/Practicas)

#### `Diciembre/Final`
- **Name:** `Diciembre/Final`
- **Description:** First-term written/pseudocode examination file ([`main.c`](./00_Examenes/Diciembre/Final/main.c)) using Spanish algorithmic pseudocode macros (`INICIAR`, `CADENA`, `ENTERO`, `IMPRIMIR`, `LEER`, `DESDE`, `SI`/`SINO`, `ALEATORIO`).
- **Technologies:** C-style Spanish pseudocode
- **Key Features:** Framing a user's name in `#` characters, checking 10 input digits for 0–9 uniqueness, and applying random arithmetic operations (`1`–`4`) to two numbers.
- **Location:** [`./00_Examenes/Diciembre/Final`](./00_Examenes/Diciembre/Final)

#### `Marzo/Practicas`
- **Name:** `Marzo/Practicas`
- **Description:** Eight practice projects preparing for the second-term midterm and final exams, covering modular functions, pointers, arrays, and 2D character maps.
- **Technologies:** C (`stdio.h`, `stdlib.h`, `stdbool.h`, `string.h`, `math.h`, `conio.h`)
- **Key Features:**
  - [`IMC`](./00_Examenes/Marzo/Practicas/IMC): Calculates Body Mass Index (`peso / (altura * altura)`) in `calcularIMC()`.
  - [`PintarPorPantallaNombre`](./00_Examenes/Marzo/Practicas/PintarPorPantallaNombre): Reads a name (`pedirNombre`) and prints a formatted compliment (`imprimirExpresion`).
  - [`PiramideDeAsteriscos`](./00_Examenes/Marzo/Practicas/PiramideDeAsteriscos): Encapsulates centered asterisk pyramid rendering in `imprimirPiramide(int altura)`.
  - [`StrlenCasero`](./00_Examenes/Marzo/Practicas/StrlenCasero): Custom string length implementation (`calcLongitud`) iterating until `'\0'`.
  - [`TripleDeUnNumero`](./00_Examenes/Marzo/Practicas/TripleDeUnNumero): Splits input acquisition (`AdquirirNumero`) and tripling (`Triplicar`).
  - [`VocalBoolean`](./00_Examenes/Marzo/Practicas/VocalBoolean): Returns `bool` (`true`/`false`) indicating whether a character is a vowel (`comprobar`).
  - [`EjerciciosParcial`](./00_Examenes/Marzo/Practicas/EjerciciosParcial): Multi-exercise menu program implementing 10 utility functions (`darMensaje`, `mediaNumeros`, `mediaArray`, `ultimoCaracter`, `imprimirTablero`, `esDivisible`, `esPrimo`, `menorNumero`, `esPalindromo`, `sustituirLetra`).
  - [`EjerciciosExamen`](./00_Examenes/Marzo/Practicas/EjerciciosExamen): Exam review suite practicing case-toggling (`alternarLetras`), fixed and parameterized substring search (`taco`, `detectarPalabra`), alternating array addition/subtraction (`alternarOperadores`), and centering a `'#'` marker on odd-dimensioned grids (`mapaCaracteres`).
- **Location:** [`./00_Examenes/Marzo/Practicas`](./00_Examenes/Marzo/Practicas)

#### `Marzo/Parcial` — Cinema Seat Reservation System
- **Name:** `Marzo/Parcial`
- **Description:** Second-term midterm exam ([`main.c`](./00_Examenes/Marzo/Parcial/main.c)) modeling a 5-auditorium cinema management system using nested `struct` types and pointer parameters.
- **Technologies:** C (`stdio.h`, `stdlib.h`, `stdbool.h`, `string.h`)
- **Key Features:** Defines `Butaca` (120 seats per auditorium), `Sala`, and `Pelicula` structs; implements seat booking (`ReservarButaca`), reservation cancellation (`CancelarReserva`), movie-to-room assignment (`AsignarPelicula`), and auditorium reset (`LiberarSala`).
- **Location:** [`./00_Examenes/Marzo/Parcial`](./00_Examenes/Marzo/Parcial)

#### `Marzo/Final` — Dungeon & Room Generator
- **Name:** `Marzo/Final`
- **Description:** Second-term final practical exam ([`main.c`](./00_Examenes/Marzo/Final/main.c)) modeling dungeons (`Mazmorra`) and 5x5 rooms (`Habitacion`) with doors (`'P'`) and monsters (`'M'`).
- **Technologies:** C (`stdio.h`, `stdlib.h`, `stdbool.h`, `time.h`)
- **Key Features:** Implements `AltaMazmorra`, `AltaHabitacion` (generating random 5x5 floor plans), `TienePuertas` (verifying door presence), and `CrearMonstruo` (spawning a monster on an empty tile).
- **Location:** [`./00_Examenes/Marzo/Final`](./00_Examenes/Marzo/Final)

---

### `01_MayusculasYMinisculas` to `16_Pilas` — Course Projects and Data Structures

#### `01_MayusculasYMinisculas` — Case Converter and Basic Calculator
- **Name:** `01_MayusculasYMinisculas`
- **Description:** Interactive `do-while` and `switch` console menu offering ASCII case conversion (`+32` / `-32`) and four-operation integer arithmetic.
- **Technologies:** C (`stdio.h`, `stdlib.h`)
- **Key Features:** 7-option menu converting uppercase to lowercase, lowercase to uppercase, and performing addition, subtraction, division, and multiplication.
- **Location:** [`./01_MayusculasYMinisculas`](./01_MayusculasYMinisculas)

#### `02_MenuAscii` — 13-Shape ASCII Geometry Generator
- **Name:** `02_MenuAscii`
- **Description:** Menu-driven program rendering 13 geometric figures and art patterns in the terminal using nested loops.
- **Technologies:** C (`stdio.h`, `stdlib.h`)
- **Key Features:** Generates solid and hollow squares, half-triangles in multiple orientations, full pyramids, solid and hollow diamonds, a circle with crosshairs, and an ASCII pumpkin.
- **Location:** [`./02_MenuAscii`](./02_MenuAscii)

#### `03_Robot` — Grid Robot Navigation Game (`v1` & `v2`)
- **Name:** `03_Robot`
- **Description:** Console game where a robot (`[R]`) navigates a 2D circular world managing fuel (`gasolina`), collecting fuel canisters (`[B]`), and avoiding proximity mines (`[M]`), across two progressive iterations.
- **Technologies:** C (`stdio.h`, `stdlib.h`, `stdbool.h`, `string.h`, `conio.h`, `time.h`)
- **Key Features:**
  - [`v1/main.c`](./03_Robot/v1/main.c): Fixed 10x10 circular world supporting `W`/`A`/`S`/`D` movement with wrap-around boundaries, a 4-tile dash mechanic (`E`) consuming 20 fuel units, random canister respawns refilling fuel to 100, and mine hazards.
  - [`v2/main.c`](./03_Robot/v2/main.c): Enhanced dynamic-memory version using `Robot`, `Bidon`, and `Mina` structs, modular functions, a heap-allocated `filas x columnas` 2D board (`char **mapa` via `malloc`), directional dash (`H`), and 8-neighbor proximity mine explosions.
- **Location:** [`./03_Robot`](./03_Robot)

#### `04_HundirFlota` — Two-Player Battleship (`Hundir la Flota`)
- **Name:** `04_HundirFlota`
- **Description:** Turn-based two-player Battleship game on 10x10 grids (`mapaJ1`, `mapaJ2`, `radarJ1`, `radarJ2`).
- **Technologies:** C (`stdio.h`, `stdlib.h`, `time.h`, `stdbool.h`)
- **Key Features:** Automatically places each player's fleet (1 ship of size 4, 2 of size 3, 3 of size 2, and 1 of size 1) with random orientations and collision checks; players alternate firing at alphanumeric coordinates until one reaches 17 hits.
- **Location:** [`./04_HundirFlota`](./04_HundirFlota)

#### `05_Wordle` — Console Wordle Clone
- **Name:** `05_Wordle`
- **Description:** Five-letter word guessing game with 6 attempts (`vidas`).
- **Technologies:** C (`stdio.h`, `stdlib.h`, `stdbool.h`)
- **Key Features:** Evaluates each 5-letter guess and outputs `'x'` for exact position matches and `'o'` for valid letters in the wrong position.
- **Location:** [`./05_Wordle`](./05_Wordle)

#### `06_VelocidadEspacioTiempo` — Kinematics Calculator
- **Name:** `06_VelocidadEspacioTiempo`
- **Description:** Physics calculator solving for velocity ($v = d/t$), distance ($d = v \cdot t$), or time ($t = d/v$) and tracking running averages across calculations.
- **Technologies:** C (`stdio.h`)
- **Key Features:** Validates positive time and velocity inputs and maintains cumulative sums and means (`mediaEspacio`, `mediaTiempo`, `mediaVelocidad`).
- **Location:** [`./06_VelocidadEspacioTiempo`](./06_VelocidadEspacioTiempo)

#### `07_Conecta4` — Two-Player Connect Four (`Conecta 4`)
- **Name:** `07_Conecta4`
- **Description:** Two-player Connect Four game on a 6x7 board (`tablero[6][7]`).
- **Technologies:** C (`stdio.h`, `stdlib.h`, `stdbool.h`)
- **Key Features:** Gravity-based token placement (`'X'` and `'O'`) in columns `0`–`6` and win detection across horizontal, vertical, and both diagonal directions.
- **Location:** [`./07_Conecta4`](./07_Conecta4)

#### `08_Tragaperras` — 3-Reel Slot Machine Simulator
- **Name:** `08_Tragaperras`
- **Description:** Casino slot machine simulation starting with a 100€ balance.
- **Technologies:** C (`stdio.h`, `stdlib.h`, `time.h`)
- **Key Features:** Generates three random reels (`'P'`, `'C'`, `'L'`, `'7'`), awards +5€ on a three-of-a-kind match or deducts 2€ otherwise, and tracks total wins and losses until cash-out or bankruptcy.
- **Location:** [`./08_Tragaperras`](./08_Tragaperras)

#### `09_Punteros` — Pointer Value Swap
- **Name:** `09_Punteros`
- **Description:** Introductory demonstration of pass-by-reference using C pointers.
- **Technologies:** C (`stdio.h`, `stdlib.h`)
- **Key Features:** Implements `void intercambiar(int *a, int *b)` to swap two integer variables via dereferencing.
- **Location:** [`./09_Punteros`](./09_Punteros)

#### `10_Dinos` — Turn-Based Dinosaur Combat Game
- **Name:** `10_Dinos`
- **Description:** Two-player turn-based dinosaur battle simulator using `Dinos` and `Habilidad` structs.
- **Technologies:** C (`stdio.h`, `stdlib.h`, `string.h`, `stdbool.h`, `time.h`)
- **Key Features:** Determines turn priority each round via randomized agility (`agilidad`), supports attack, flee (`huida`), skill, and stat-inspection (`Libra`) actions, and passes state across functions via struct pointers.
- **Location:** [`./10_Dinos`](./10_Dinos)

#### `11_GestorDeCitasMedicas` — Medical Appointment Management System
- **Name:** `11_GestorDeCitasMedicas`
- **Description:** Clinic management console application handling patients (`Paciente`) and medical appointments (`Cita`).
- **Technologies:** C (`stdio.h`, `stdlib.h`, `string.h`, `stdbool.h`)
- **Key Features:** 7-option menu supporting patient registration (`altaPaciente`), appointment scheduling (`altaCita`) with date validation, appointment modification (`modificarCita`), cancellation (`borrarCita`), and listing (`mostrarPacientes`, `mostrarCitas`).
- **Location:** [`./11_GestorDeCitasMedicas`](./11_GestorDeCitasMedicas)

#### `12_Laberintos` — Maze Generator, Editor, File Manager, and Solver
- **Name:** `12_Laberintos`
- **Description:** Feature-rich 10x10 maze tool capable of generating, editing, saving/loading from text files, and automatically solving mazes.
- **Technologies:** C (`stdio.h`, `stdlib.h`, `stdbool.h`, `time.h`, `conio.h`, `unistd.h`, ANSI color codes)
- **Key Features:**
  - Models mazes with `Laberinto`, `Coordenada`, and dynamic `Ruta` structs, supporting walls (`'#'`), corridors (`' '`), entrance (`'E'`), and exit (`'S'`), plus an optional wrap-around circular world mode (`mundoCircular`).
  - Persists and loads maze layouts using [`laberinto.txt`](./12_Laberintos/laberinto.txt).
  - Colorized terminal rendering using ANSI escape sequences.
- **Location:** [`./12_Laberintos`](./12_Laberintos)

#### `13_Bosque` — Forest Ecosystem & Fire Propagation Simulator
- **Name:** `13_Bosque`
- **Description:** Real-time cellular automaton simulating tree growth, lightning/fire ignition, burning, and ash regeneration on a configurable 2D grid.
- **Technologies:** C (`stdio.h`, `stdlib.h`, `stdbool.h`, `string.h`, `time.h`, `conio.h`, ANSI color codes)
- **Key Features:**
  - Continuous non-blocking simulation loop (`while (!kbhit())`) updating cell states (`PintarMapa`, `NuevoMapa`, `ExtenderFuego`).
  - Automatic save and resume system reading and writing simulation parameters and grid state to [`autoguardado.txt`](./13_Bosque/autoguardado.txt) and [`simulacion.txt`](./13_Bosque/simulacion.txt).
- **Location:** [`./13_Bosque`](./13_Bosque)

#### `14_Colas` — Circular Queue Data Structure (`Cola`)
- **Name:** `14_Colas`
- **Description:** Array-backed circular queue implementation (`MAX 100`) and structural queue manipulation algorithms.
- **Technologies:** C (`stdio.h`, `stdlib.h`)
- **Key Features:** Implements `inicializarCola`, `colaVacia`, `enqueue`, `dequeue`, moving the last element to the front (`adelantarUltimoAlPrimero`), moving the front element to the back (`retrasarPrimeroAlUltimo`), extracting the rear half into a new queue (`extraerMitadTrasera`), and interleaving two queues (`intercalarColas`).
- **Location:** [`./14_Colas`](./14_Colas)

#### `15_Listas` — Singly Linked List Data Structure (`Nodo`)
- **Name:** `15_Listas`
- **Description:** Dynamic singly linked list implementation using heap-allocated nodes (`malloc`/`free`).
- **Technologies:** C (`stdio.h`, `stdlib.h`)
- **Key Features:** Implements node insertion at head (`AnadirNodo`) and at position $n$ (`insertarNodoEn`), node deletion at position $n$ (`eliminarElementoOrden`), search (`tieneDato`), element sum (`sumaLista`), removing the first or second half of the list, swapping first/last or arbitrary nodes, concatenating two lists, removing even numbers, and reversing the linked list.
- **Location:** [`./15_Listas`](./15_Listas)

#### `16_Pilas` — Stack Data Structure (`Pila`)
- **Name:** `16_Pilas`
- **Description:** LIFO stack implementation (`MAX 100`) with custom stack manipulation operations.
- **Technologies:** C (`stdio.h`, `stdlib.h`)
- **Key Features:** Implements `push`, `pop`, `inicializarPila`, stack reversal (`invertirOrden`), bottom-element extraction (`extraerUltimo`), interleaving two stacks (`mezclarPilas`), swapping top and bottom elements (`cambiarPrimeroPorUltimo`), and conditional push only when the new value equals the sum of existing elements (`introducirSoloSuma`).
- **Location:** [`./16_Pilas`](./16_Pilas)

---

## Additional Notes

### Compilation and Execution
To compile any project from the command line using MinGW-w64 GCC:

```bash
gcc main.c -o main.exe
```

> [!IMPORTANT]
> Several projects (`03_Robot`, `04_HundirFlota`, `05_Wordle`, `07_Conecta4`, `10_Dinos`, `11_GestorDeCitasMedicas`, `12_Laberintos`, `13_Bosque`) invoke Windows console commands (`system("cls")`, `system("pause")`) or `<conio.h>` functions (`getch()`, `kbhit()`). They are designed to be compiled and run on Windows (e.g., via Dev-C++ or MinGW-w64).

> [!NOTE]
> [`00_Examenes/Diciembre/Final/main.c`](./00_Examenes/Diciembre/Final/main.c) is a written exam submission using classroom Spanish pseudocode syntax (`INICIAR`, `DESDE`, `SI`, `IMPRIMIR`) rather than compilable C code.
