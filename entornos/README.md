# Development Environments (*Entornos de Desarrollo* — `entornos`)

This directory contains Java applications, object-oriented programming exercises, graphical user interface (GUI) forms, database connectivity demos, and exam solutions developed for the **Development Environments** (*Entornos de Desarrollo*) subject in the first-year Multiplatform Application Development (1º DAM) program.

---

## Technologies and Tools

### Programming Languages
- **Java** (tested with **Java JDK 17+**)

### Frameworks and Libraries
- **Java Standard Library:** `java.util.Scanner`, `java.util.Random`, `java.util.HashMap`, `java.util.Map`
- **Java Swing & AWT (Desktop GUI):** `javax.swing.*` (`JFrame`, `JPanel`, `JLabel`, `JTextField`, `JPasswordField`, `JButton`, `JCheckBox`, `JComboBox`, `JMenuBar`, `JMenu`, `JMenuItem`, `JOptionPane`, `ImageIcon`, `GroupLayout`), `java.awt.*` (`EventQueue`, `Font`, `Color`, `Image`, `BorderLayout`, `ActionListener`, `KeyAdapter`)
- **JDBC (Database Connectivity):** `java.sql.*` (`Connection`, `DriverManager`, `Statement`, `PreparedStatement`, `CallableStatement`, `ResultSet`, `SQLException`) and **MySQL Connector/J** (`com.mysql.cj.jdbc.Driver`)

### Databases
- **MySQL** (connected on `localhost:3306` to schemas `sakila` and `shawarmas` in `30_ConexionDB`)

### Development Tools
- **[Eclipse IDE 2024-09 (4.33.0)](https://www.eclipse.org/downloads/packages/release/2024-09)** with the **Eclipse WindowBuilder** plugin for visual Swing form design

---

## Projects and Exercises

### `00_Examen` — Exam Preparation, Midterms, and Final Evaluations

#### `00_Repaso`
- **Name:** `00_Repaso`
- **Description:** Four sets of exam review exercises (`Modelo`, `ModeloA`, `ModeloB`, `ModeloC`) practicing conditionals, discounts, number properties, ASCII art loops, string manipulation, and mini-games.
- **Technologies:** Java (`java.util.Scanner`, `java.util.Random`)
- **Key Features:**
  - `Modelo`: Time-of-day greeting (`Ejer1`), tiered hard-drive purchase discount (`Ejer2`), cross-class even-number check with `Par.esPar()` (`Ejer3`, `Par`), ASCII square/diamond/tree patterns (`Ejer4`), and string reversal replacing spaces with `@` (`Ejer5`).
  - `ModeloA`: Season date lookup (`Ejer1`), oil-paint promotional pricing with Prime discount (`Ejer2`), 3-digit "magic number" check (`Ejer3`), ASCII triangles and Omnitrix pattern (`Ejer4`), substring after first character match without `indexOf` (`Ejer5`), and *Quiniela* (`1`/`X`/`2`) betting game (`Ejer6`).
  - `ModeloB` & `ModeloC`: Zodiac sign date lookup (`Ejer1`), 3-digit "bestial number" check (divisible by 6), cumulative Prime discount calculator, hollow square and pyramid ASCII patterns (`Ejer4`), substring before first character match (`Ejer5`), and roulette number game (`0`–`36`).
- **Location:** [`./00_Examen/00_Repaso`](./00_Examen/00_Repaso)

#### `01_PracticaExamen`
- **Name:** `01_PracticaExamen`
- **Description:** Complete practice exam implementations corresponding to the four review models (`ExamenEntornosDesarrollo`, `ExamenEntornosDesarrolloModeloA`, `ExamenEntornosDesarrolloModeloB`, `ExamenEntornosDesarrolloModeloC`).
- **Technologies:** Java (`java.util.Scanner`, `java.util.Random`)
- **Key Features:**
  - Dedicated OOP game classes [`Juego.java`](./00_Examen/01_PracticaExamen/ExamenEntornosDesarrolloModeloA/Juego.java) (*Quiniela* `1`/`X`/`2`), [`Ruleta.java`](./00_Examen/01_PracticaExamen/ExamenEntornosDesarrolloModeloB/Ruleta.java), and [`Par.java`](./00_Examen/01_PracticaExamen/ExamenEntornosDesarrollo/Par.java) alongside refined solutions to the 5-exercise exam templates.
- **Location:** [`./00_Examen/01_PracticaExamen`](./00_Examen/01_PracticaExamen)

#### `02_Examen`
- **Name:** `02_Examen`
- **Description:** First-term practical examination covering conditionals, loops, strings, methods, and object-oriented modeling.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:**
  - `Ejercicio1`–`Ejercicio5`: Zodiac date lookup, cumulative discount calculator, 9x9 patterned ASCII grid, character-delimited string prefix printer, and divisibility check by 5 and 7 (`esMult7y5`).
  - [`Boxeador.java`](./00_Examen/02_Examen/Boxeador.java) & [`Ejercicio6.java`](./00_Examen/02_Examen/Ejercicio6.java): `Boxeador` class modeling a boxer with `vida`, `nombre`, and randomized combat state (`pelear()`), paired with a `Combate` class skeleton.
- **Location:** [`./00_Examen/02_Examen`](./00_Examen/02_Examen)

#### `03_Parcial` & `04_Examen`
- **Name:** `03_Parcial` and `04_Examen`
- **Description:** Second-term midterm (`03_Parcial`, package `examen`) and final exam (`04_Examen`, package `Examen`) focusing on 1D/2D arrays and Java Swing GUI development.
- **Technologies:** Java, Java Swing (`JFrame`, `JPanel`, `JLabel`, `JTextField`, `JButton`), `java.util.Scanner`
- **Key Features:**
  - `Ejercicio1.java`: Generates a 7-element random integer array and swaps the minimum into the penultimate index and the maximum into the last index.
  - `Ejercicio2.java`: Populates a 4x4 matrix with random numbers (1–10) and counts occurrences and `(row, col)` coordinates of a user-specified value.
  - `Ejercicio3.java`: Populates a 5x5 matrix with consecutive integers (1–25) and zeroes out both the main and secondary diagonals.
  - `Ejercicio4.java`: Interactive 4x4 gravity-drop board where alternating `X` and `O` tokens drop to the lowest available cell in a chosen column.
  - `Ejercicio5.java`: Swing ATM window (`CAJERO`) allowing deposits and withdrawals while dynamically updating the total balance and text color (green when `>= 1000`, red otherwise).
- **Location:** [`./00_Examen/03_Parcial`](./00_Examen/03_Parcial) and [`./00_Examen/04_Examen`](./00_Examen/04_Examen)

---

### `01_PRJ` to `12_PRJ` — Java Fundamentals and Control Structures

#### `01_PRJ` — Project Template
- **Name:** `01_PRJ`
- **Description:** Initial Java class skeleton (`HolaMundo.java`) with `main` entry point.
- **Technologies:** Java
- **Key Features:** Basic class and `main` method structure.
- **Location:** [`./01_PRJ`](./01_PRJ)

#### `02_PRJ` — Variables and Arithmetic Operations
- **Name:** `02_PRJ`
- **Description:** Console exercises introducing variables, keyboard input, and floating-point arithmetic.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:**
  - [`NumerosEnteros.java`](./02_PRJ/NumerosEnteros.java): Reads two numbers and computes their sum, difference, product, and quotient.
  - [`Variables.java`](./02_PRJ/Variables.java): Reads a user's name and prints a personalized greeting.
- **Location:** [`./02_PRJ`](./02_PRJ)

#### `03_PRJ` — Simple Conditionals
- **Name:** `03_PRJ`
- **Description:** Basic `if-else` conditional exercise.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:** [`CondicionalSimple.java`](./03_PRJ/CondicionalSimple.java) reads a user's age and prints whether they are of legal age (`>= 18`).
- **Location:** [`./03_PRJ`](./03_PRJ)

#### `04_PRJ` — Compound Conditionals
- **Name:** `04_PRJ`
- **Description:** Student grade average evaluator using compound conditions.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:** [`CondicionalCompuesto.java`](./04_PRJ/CondicionalCompuesto.java) calculates the average of three integer grades and classifies the result as fail (`<= 4`), pass (`5`–`9`), or honors (`10`).
- **Location:** [`./04_PRJ`](./04_PRJ)

#### `05_PRJ` — Nested Conditionals
- **Name:** `05_PRJ`
- **Description:** Exercises practicing nested `if-else` decision trees.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:**
  - [`CondicionalAnidadoEjer1.java`](./05_PRJ/CondicionalAnidadoEjer1.java): Determines whether a positive integer has 1, 2, or 3 digits, or reports an error if `>= 1000`.
  - [`CondicionalAnidadoEjer2.java`](./05_PRJ/CondicionalAnidadoEjer2.java): Computes an applicant's test score percentage and assigns a proficiency tier (`>= 90%`, `>= 75%`, `>= 50%`, `< 50%`).
- **Location:** [`./05_PRJ`](./05_PRJ)

#### `06_PRJ` — Switch Statements
- **Name:** `06_PRJ`
- **Description:** Month and season lookup using a `switch` statement.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:** [`CondicionalSwitch.java`](./06_PRJ/CondicionalSwitch.java) maps month numbers (`1`–`12`) to their Spanish month name and corresponding season.
- **Location:** [`./06_PRJ`](./06_PRJ)

#### `07_PRJ` — `while` Loops
- **Name:** `07_PRJ`
- **Description:** Iterative exercises using `while` loops.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:**
  - [`BucleWhileEjer1.java`](./07_PRJ/BucleWhileEjer1.java): Generates the multiplication table (`1`–`10`) for an input integer.
  - [`BucleWhileEjer2.java`](./07_PRJ/BucleWhileEjer2.java): Reads 10 numbers and computes their total sum and average.
- **Location:** [`./07_PRJ`](./07_PRJ)

#### `08_PRJ` — `do-while` Loops
- **Name:** `08_PRJ`
- **Description:** Sentinel-controlled loop exercises using `do-while`.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:**
  - [`BucleDoWhileEjer1.java`](./08_PRJ/BucleDoWhileEjer1.java): Accumulates input integers until sentinel value `9999` is entered and classifies the resulting sum as positive, negative, or zero.
  - [`BucleDoWhileEjer2.java`](./08_PRJ/BucleDoWhileEjer2.java): Loop skeleton reading piece weights in kilograms.
- **Location:** [`./08_PRJ`](./08_PRJ)

#### `09_PRJ` — `for` Loops
- **Name:** `09_PRJ`
- **Description:** Exercises using standard `for` loops for arithmetic, primality testing, and ASCII rendering.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:**
  - [`BucleForEjer1.java`](./09_PRJ/BucleForEjer1.java): Multiplication table (`0`–`10`).
  - [`BucleForEjer2.java`](./09_PRJ/BucleForEjer2.java): Efficient primality check testing divisors up to `i * i <= numero`.
  - [`BucleForEjer3.java`](./09_PRJ/BucleForEjer3.java): Prints all odd numbers between two user-provided bounds regardless of input order.
  - [`BucleForEjer4.java`](./09_PRJ/BucleForEjer4.java): Prints a solid asterisk square of user-defined size.
- **Location:** [`./09_PRJ`](./09_PRJ)

#### `10_PRJ` — Nested `for` Loops (ASCII Geometry)
- **Name:** `10_PRJ`
- **Description:** Five exercises rendering geometric shapes in the console using nested `for` loops.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:** Renders a solid square (`DobleBucleForEjer1`), hollow square (`DobleBucleForEjer2`), right triangle (`DobleBucleForEjer3`), centered pyramid (`DobleBucleForEjer4`), and full diamond (`DobleBucleForEjer5`).
- **Location:** [`./10_PRJ`](./10_PRJ)

#### `11_PRJ` — Character Strings (`String` & `StringBuilder`)
- **Name:** `11_PRJ`
- **Description:** Eight exercises exploring Java `String` and `StringBuilder` methods.
- **Technologies:** Java (`java.util.Scanner`, `String`, `StringBuilder`, `Character`)
- **Key Features:**
  - `CadenasDeCaracteresEjer1`–`Ejer4`: Case-insensitive `"Fin"` loop (`equalsIgnoreCase`), substring search (`indexOf`), character-by-character palindrome comparison, and replacing `'a'`/`'A'` with `'@'`.
  - `CadenasDeCaracteresEjer5`–`Ejer8`: Capitalizing the first letter after a period using `StringBuilder`, separating vowels before consonants while stripping spaces, an interactive 5-option string analysis menu (first half, last char, reverse, hyphen-join, vowel count), and word splitting across lines via `split(" ")`.
- **Location:** [`./11_PRJ`](./11_PRJ)

#### `12_PRJ` — Functions and Static Methods
- **Name:** `12_PRJ`
- **Description:** Modularizing logic into reusable static methods.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:**
  - [`FuncionesEjer1.java`](./12_PRJ/FuncionesEjer1.java): Four-operation calculator (`suma`, `resta`, `multi`, `division`) with division-by-zero protection.
  - [`FuncionesEjer2.java`](./12_PRJ/FuncionesEjer2.java): Dispatches a user phrase to standard output (`System.out`) or error output (`System.err`).
  - [`FuncionesEjer3.java`](./12_PRJ/FuncionesEjer3.java): `mayor_num(int, int)` returning the larger integer or `0` if equal.
  - [`FuncionesEjer4.java`](./12_PRJ/FuncionesEjer4.java): Spanish NIF format and modulo-23 control letter validation (`esFormatoValido`, `esNifValido`).
  - [`FuncionesEjer5.java`](./12_PRJ/FuncionesEjer5.java): `imprimirCabecera(String)` framing a text banner in asterisks.
- **Location:** [`./12_PRJ`](./12_PRJ)

---

### `13_Ahorcado` to `26_Juegos` — Console Games, Type Conversions, and Object-Oriented Programming

#### `13_Ahorcado` — Console Hangman
- **Name:** `13_Ahorcado`
- **Description:** Word-guessing game with a 5-life counter and random word selection from a predefined array.
- **Technologies:** Java (`java.util.Scanner`, `Math.random`)
- **Key Features:** Tracks guessed letters, prevents duplicate guesses, reveals matching positions in a `char[]` mask, and detects win/loss conditions.
- **Location:** [`./13_Ahorcado`](./13_Ahorcado)

#### `14_CambioDeVariables` — Type Casting and Parsing
- **Name:** `14_CambioDeVariables`
- **Description:** Demonstrates explicit and implicit type conversions in Java.
- **Technologies:** Java (`String.valueOf`, `Integer.parseInt`, `Float.parseFloat`)
- **Key Features:** Converts values between `int`, `float`, `double`, `char`, and `String`.
- **Location:** [`./14_CambioDeVariables`](./14_CambioDeVariables)

#### `15_Clases` — Encapsulation and Constructor Overloading (`SeatLeon`)
- **Name:** `15_Clases`
- **Description:** Object-oriented model of a car (`SeatLeon`) demonstrating encapsulation, constructors, validation, and `toString()`.
- **Technologies:** Java (OOP)
- **Key Features:** Overloaded constructors (full, without extras, default), getters/setters with case normalization, private helper `validarPuertas(int)` restricting doors to 3 or 5, and `@Override toString()`.
- **Location:** [`./15_Clases`](./15_Clases)

#### `16_NIF` — Spanish NIF Validator
- **Name:** `16_NIF`
- **Description:** Standalone console validator for 9-character Spanish NIF identification numbers.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:** Extracts the 8-digit numeric prefix and trailing letter via `substring()`, computes `numeros % 23`, and verifies the check character against the official 23-letter table.
- **Location:** [`./16_NIF`](./16_NIF)

#### `17_Ruleta` — Casino Roulette Betting Simulator
- **Name:** `17_Ruleta`
- **Description:** Interactive console roulette game converting euros to chips (`1€ = 10 chips`).
- **Technologies:** Java (`java.util.Scanner`, `java.util.Random`)
- **Key Features:** Supports bets on numbers `0`–`36`, classifies pockets into green (`0`, 35x payout), red (odd, 2x payout), and black (even, 2x payout), and loops until the player cashes out or runs out of funds.
- **Location:** [`./17_Ruleta`](./17_Ruleta)

#### `18_PRJ` — Object-Oriented Exercises (`Triangulo` & `Alumno`)
- **Name:** `18_PRJ`
- **Description:** Two multi-class OOP exercises practicing private attributes, validation helpers, and static comparison methods.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:**
  - [`Ejer1`](./18_PRJ/Ejer1): `Triangulo` class that validates positive side lengths (`esLadoValido`) and automatically recomputes whether the triangle is `"Equilatero"`, `"Isosceles"`, or `"Escaleno"` (`calcularTipo`) whenever sides are set.
  - [`Ejer2`](./18_PRJ/Ejer2): `Alumno` class storing student name, age, and legal-age status (`isLegalAge`), plus `Alumno.comparateAges(student1, student2)` to compare two students.
- **Location:** [`./18_PRJ`](./18_PRJ)

#### `19_ClasesPaco` & `21_Paco` — Cross-Class Messaging and Swing Dialogs
- **Name:** `19_ClasesPaco` and `21_Paco`
- **Description:** Exercises demonstrating method calls across classes/packages and displaying modal dialogs with `JOptionPane`.
- **Technologies:** Java, Java Swing (`javax.swing.JOptionPane`)
- **Key Features:** `Mensajes` class providing `mensaje()` (standard output), `mensaje_rojo()` (error stream), and `mensaje_info()` (`JOptionPane.showMessageDialog`), invoked from `Ejer1`.
- **Location:** [`./19_ClasesPaco`](./19_ClasesPaco) and [`./21_Paco`](./21_Paco)

#### `20_Dados` — Object-Oriented Dice Game
- **Name:** `20_Dados`
- **Description:** Multi-class dice game modeling two 6-sided dice (`Dado` and `Juego`).
- **Technologies:** Java (`Math.random`)
- **Key Features:** `Dado` rolls a random value (`1`–`6`) in its constructor; `Juego` instantiates two dice and declares a win if their sum exceeds `8`.
- **Location:** [`./20_Dados`](./20_Dados)

#### `22_Rep02Cadenas` — String & Loop Review
- **Name:** `22_Rep02Cadenas`
- **Description:** Review exercises on string vowel capitalization/replacement (`Ej2.java`) and hollow ASCII triangle rendering (`Javijesji.java`).
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:** Vowel detection with `contains()`, `toUpperCase()`, `replace('a', '@')`, and nested loop conditions.
- **Location:** [`./22_Rep02Cadenas`](./22_Rep02Cadenas)

#### `23_Pruebas` — Array and 5x5 Matrix Operations Menu
- **Name:** `23_Pruebas`
- **Description:** Comprehensive review class (`Repaso.java`) implementing 1D array sorting and an interactive 6-option menu for 5x5 matrix calculations.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:** Array initialization, hyphenated printing, moving the maximum element to index 0, descending sort, manual 5x5 matrix entry, row sum, column sum, main diagonal sum, inverse diagonal sum, and overall matrix average.
- **Location:** [`./23_Pruebas`](./23_Pruebas)

#### `25_ColaboracionClases` — Object Composition (`Club` & `Socio`)
- **Name:** `25_ColaboracionClases`
- **Description:** Demonstrates object collaboration and composition between a `Club` class and three `Socio` instances.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:** Each `Socio` prompts for member name and seniority (`antiguedad`) upon construction; `Club.MasAntiguo()` identifies and prints the member with the longest tenure.
- **Location:** [`./25_ColaboracionClases`](./25_ColaboracionClases)

#### `26_Juegos` — Classic Console Games Suite
- **Name:** `26_Juegos`
- **Description:** Three standalone console games implemented in Java: Hangman, Battleship, and Tic-Tac-Toe.
- **Technologies:** Java (`java.util.Scanner`, `java.util.Random`)
- **Key Features:**
  - [`Ahorcado.java`](./26_Juegos/Ahorcado.java): Two-player Hangman where one player enters the secret word and the other guesses letters against a masked `char[]`.
  - [`Barcos.java`](./26_Juegos/Barcos.java): Single-player 10x10 Battleship placing 3 boats of length 1, 2 boats of length 2, and 1 boat of length 3 randomly without overlap, giving the player 10 lives and a radar grid.
  - [`TresEnRaya.java`](./26_Juegos/TresEnRaya.java): Two-player 3x3 Tic-Tac-Toe mapping numpad positions (`1`–`9`) to board coordinates and checking all 8 winning lines.
- **Location:** [`./26_Juegos`](./26_Juegos)

---

### `27_Arrays` — 1D Arrays, Parallel Arrays, and 2D Matrices

- **Name:** `27_Arrays`
- **Description:** Collection of 12 Java programs organized into 5 subpackages (`ArrayAleatorio`, `Arrays`, `ArraysParalelos`, `HundirLaFlota`, `Matrices`) covering sorting, statistical calculations, parallel array synchronization, and grid games.
- **Technologies:** Java (`java.util.Scanner`, `Math.random`, `String.compareTo`)
- **Key Features:**
  - [`ArrayAleatorio/ArrayAleatorio.java`](./27_Arrays/ArrayAleatorio/ArrayAleatorio.java): Populates a 10-element array with random integers (1–100) and sorts it in descending order using bubble sort.
  - [`Arrays/`](./27_Arrays/Arrays): Random-length array generation (1–50 elements with values 101–200 in `ArrayTamañoAleatorio.java` and `TamanoAleatorio.java`), alphabetical country sorting with `compareTo` (`OrdenarPaises.java`), non-repeating 6-number lottery generator 1–49 (`Primitiva.java`), height average and above/below count (`PromedioAlturas.java`), morning/afternoon shift payroll averages (`Sueldos.java`), and element-wise 4-element vector addition (`SumaVectores.java`).
  - [`ArraysParalelos/`](./27_Arrays/ArraysParalelos): Synchronized bubble sort of student names and grades by either name or grade (`AlumnosNotas.java`), and alphabetical sorting of countries paired with population counts (`PaisesHabitantes.java`).
  - [`HundirLaFlota/HundirLaFlota.java`](./27_Arrays/HundirLaFlota/HundirLaFlota.java): 1D 10-cell Battleship mini-game with 2 lives.
  - [`Matrices/RellenarConX.java`](./27_Arrays/Matrices/RellenarConX.java): Fills a 3x3 matrix with `'x'` and places a single `'o'` at a random coordinate.
- **Location:** [`./27_Arrays`](./27_Arrays)

---

### `24_BuilderWindow`, `28_InterfazGrafica`, `29_Banco` — Java Swing Desktop GUIs

#### `24_BuilderWindow` & `28_InterfazGrafica` — Swing Forms and Interactive Windows
- **Name:** `24_BuilderWindow` and `28_InterfazGrafica`
- **Description:** Desktop GUI applications built with Java Swing and Eclipse WindowBuilder, demonstrating event listeners, form validation, dynamic combo boxes, and graphical games.
- **Technologies:** Java Swing (`JFrame`, `JPanel`, `JLabel`, `JTextField`, `JButton`, `JCheckBox`, `JComboBox`, `JOptionPane`, `ImageIcon`, `GroupLayout`), AWT (`EventQueue`, `Color`, `Font`, `Image`, `ActionListener`, `KeyAdapter`)
- **Key Features:**
  - `Calculadora.java`: 3-input form computing sum, subtraction, multiplication, division, maximum, minimum, and combined total.
  - `MegaVentana.java` & `MegaVentanaV2.java`: Multi-control showcase featuring label text replacement, text transfer between fields (`->`), dynamic window resizing via checkboxes (`800x800`, `1200x700`, `1200x800`), a city selector (`JComboBox`) updating an image button (`ImageIcon`), and a numeric-only text field using a `KeyAdapter`.
  - `NombreYApellidos.java`: Concatenates first and last name fields into a combined output field.
  - `Numeros.java` & `Ventana.java`: Compares three integer inputs (`N1`, `N2`, `N3`) to display the largest value or trigger a `JOptionPane` alert.
  - `Sueldos.java` & `Formulario5.java`: Employee salary and commission calculator that highlights the total salary field in green if `> 1500` or red if `<= 1500`.
  - `TresEnRaya.java`: Graphical 3x3 Tic-Tac-Toe game using 9 `JButton` components with `ImageIcon` markers and win-condition dialogs.
  - `Veterinaria.java`: Veterinary clinic registration form with dependent `JComboBox` dropdowns (`Map<String, String[]>` mapping `Perro`, `Gato`, `Huron`, `Conejo` to their respective breeds), pet photo preview, and summary dialog.
- **Location:** [`./24_BuilderWindow`](./24_BuilderWindow) and [`./28_InterfazGrafica`](./28_InterfazGrafica)

#### `29_Banco` — Multi-Window Banking GUI Application
- **Name:** `29_Banco`
- **Description:** Four-window Swing banking application with authentication, a menu-driven main window, and deposit/withdrawal screens.
- **Technologies:** Java Swing (`JFrame`, `JMenuBar`, `JMenu`, `JMenuItem`, `JPasswordField`, `JComboBox`, `JTextField`, `JLabel`, `JButton`, `JOptionPane`)
- **Key Features:**
  - [`Login.java`](./29_Banco/Login.java): Authenticates user credentials (`JTextField` and `JPasswordField`) and launches `Principal` upon success.
  - [`Principal.java`](./29_Banco/Principal.java): Main application frame with a `JMenuBar` (`Inicio` -> `Retirar`, `Ingresar`) opening the transaction windows.
  - [`Ingresar.java`](./29_Banco/Ingresar.java) & [`Retirar.java`](./29_Banco/Retirar.java): Account operation windows supporting `"Corriente"` (150€ per-transaction limit) and `"Credito"` (300€ per-transaction limit) accounts with `JOptionPane` error alerts when limits are exceeded.
- **Location:** [`./29_Banco`](./29_Banco)

---

### `30_ConexionDB` — MySQL Database Connectivity (JDBC)

- **Name:** `30_ConexionDB`
- **Description:** Demonstrates connecting Java applications to a MySQL database using the MySQL Connector/J JDBC driver (`com.mysql.cj.jdbc.Driver`).
- **Technologies:** Java JDBC (`java.sql.*`), MySQL (`sakila` and `shawarmas` databases), `javax.swing.JOptionPane`
- **Key Features:**
  - [`Conexion.java`](./30_ConexionDB/Conexion.java): Reusable connection helper class configuring driver, host (`localhost:3306`), database (`shawarmas`), and `conectarMySQL()` with `JOptionPane` error reporting.
  - [`ConexionMySQL.java`](./30_ConexionDB/ConexionMySQL.java) & [`Query1.java`](./30_ConexionDB/Query1.java): Connects to `jdbc:mysql://127.0.0.1:3306/sakila`, executes `SELECT title, description FROM film`, and iterates over the `ResultSet` (plus commented reference examples for `PreparedStatement` `UPDATE` and `CallableStatement` stored procedure calls).
- **Location:** [`./30_ConexionDB`](./30_ConexionDB)

---

## Additional Notes

### Setup and Execution
1. Open **Eclipse IDE** (or any Java IDE supporting JDK 17+) and import the desired folder or source files into a Java project.
2. Note that files in `01_PRJ`–`17_Ruleta` and `29_Banco` use the default package, whereas `00_Examen`, `18_PRJ`–`28_InterfazGrafica`, and `30_ConexionDB` declare named packages (such as `package Formularios;`, `package InterfazGrafica;`, `package Database;`, etc.). Ensure the source directory structure in your IDE matches the declared `package` statement when compiling.

> [!IMPORTANT]
> To run the classes in [`30_ConexionDB`](./30_ConexionDB), add the **MySQL Connector/J** JAR (`mysql-connector-j`) to your project's classpath and ensure a local MySQL instance is running on port `3306` with the `sakila` / `shawarmas` schemas available.

> [!WARNING]
> The GUI classes `MegaVentana.java`, `MegaVentanaV2.java`, `TresEnRaya.java`, and `Veterinaria.java` in [`24_BuilderWindow`](./24_BuilderWindow) and [`28_InterfazGrafica`](./28_InterfazGrafica) reference image assets using hardcoded absolute paths from a classroom Google Drive mount (`G:\Mi unidad\Entornos\assets\...`). Update those paths to local image files if you wish to display the button icons at runtime.
