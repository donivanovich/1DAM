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
- **MySQL** (connected on `localhost:3306` to schemas `sakila` and `shawarmas` in `21_ConexionDB`)

### Development Tools
- **[Eclipse IDE 2024-09 (4.33.0)](https://www.eclipse.org/downloads/packages/release/2024-09)** with the **Eclipse WindowBuilder** plugin for visual Swing form design

---

## Projects and Exercises

### `00_Examen` — Exam Preparation, Midterms, and Final Evaluations

#### `Diciembre/Practicas`
- **Name:** `Diciembre/Practicas`
- **Description:** Eight sets of first-term exam review and practice models (`Modelo`, `ModeloA`, `ModeloB`, `ModeloC`, `ExamenEntornosDesarrollo`, `ExamenEntornosDesarrolloModeloA`, `ExamenEntornosDesarrolloModeloB`, `ExamenEntornosDesarrolloModeloC`) practicing conditionals, discounts, number properties, ASCII art loops, string manipulation, and mini-games.
- **Technologies:** Java (`java.util.Scanner`, `java.util.Random`)
- **Key Features:**
  - `Modelo` & `ExamenEntornosDesarrollo`: Time-of-day greeting (`Ejer1`/`Ej1`), tiered hard-drive purchase discount (`Ejer2`/`Ej2`), cross-class even-number check with [`Par.java`](./00_Examen/Diciembre/Practicas/ExamenEntornosDesarrollo/Par.java) (`Ejer3`/`Ej3`), ASCII square/diamond/tree patterns (`Ejer4`/`Ej4`), and string reversal replacing spaces with `@` (`Ejer5`/`Ej5`).
  - `ModeloA` & `ExamenEntornosDesarrolloModeloA`: Season date lookup, oil-paint promotional pricing with Prime discount, 3-digit "magic number" check, ASCII triangles and Omnitrix pattern, substring after first character match without `indexOf`, and *Quiniela* (`1`/`X`/`2`) betting game ([`Juego.java`](./00_Examen/Diciembre/Practicas/ExamenEntornosDesarrolloModeloA/Juego.java)).
  - `ModeloB`, `ModeloC`, `ExamenEntornosDesarrolloModeloB` & `ExamenEntornosDesarrolloModeloC`: Zodiac sign date lookup, 3-digit "bestial number" check (divisible by 6), cumulative Prime discount calculator, hollow square and pyramid ASCII patterns, substring before first character match, and roulette number game (`0`–`36`, [`Ruleta.java`](./00_Examen/Diciembre/Practicas/ExamenEntornosDesarrolloModeloB/Ruleta.java)).
- **Location:** [`./00_Examen/Diciembre/Practicas`](./00_Examen/Diciembre/Practicas)

#### `Diciembre/Final`
- **Name:** `Diciembre/Final`
- **Description:** First-term practical examination covering conditionals, loops, strings, methods, and object-oriented modeling.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:**
  - `Ejercicio1`–`Ejercicio5`: Zodiac date lookup, cumulative discount calculator, 9x9 patterned ASCII grid, character-delimited string prefix printer, and divisibility check by 5 and 7 (`esMult7y5`).
  - [`Boxeador.java`](./00_Examen/Diciembre/Final/Boxeador.java) & [`Ejercicio6.java`](./00_Examen/Diciembre/Final/Ejercicio6.java): `Boxeador` class modeling a boxer with `vida`, `nombre`, and randomized combat state (`pelear()`), paired with a `Combate` class skeleton.
- **Location:** [`./00_Examen/Diciembre/Final`](./00_Examen/Diciembre/Final)

#### `Marzo/Parcial` & `Marzo/Final`
- **Name:** `Marzo/Parcial` and `Marzo/Final`
- **Description:** Second-term midterm (`Marzo/Parcial`, package `examen`) and final exam (`Marzo/Final`, package `Examen`) focusing on 1D/2D arrays and Java Swing GUI development.
- **Technologies:** Java, Java Swing (`JFrame`, `JPanel`, `JLabel`, `JTextField`, `JButton`), `java.util.Scanner`
- **Key Features:**
  - `Ejercicio1.java`: Generates a 7-element random integer array and swaps the minimum into the penultimate index and the maximum into the last index.
  - `Ejercicio2.java`: Populates a 4x4 matrix with random numbers (1–10) and counts occurrences and `(row, col)` coordinates of a user-specified value.
  - `Ejercicio3.java`: Populates a 5x5 matrix with consecutive integers (1–25) and zeroes out both the main and secondary diagonals.
  - `Ejercicio4.java`: Interactive 4x4 gravity-drop board where alternating `X` and `O` tokens drop to the lowest available cell in a chosen column.
  - `Ejercicio5.java`: Swing ATM window (`CAJERO`) allowing deposits and withdrawals while dynamically updating the total balance and text color (green when `>= 1000`, red otherwise).
- **Location:** [`./00_Examen/Marzo/Parcial`](./00_Examen/Marzo/Parcial) and [`./00_Examen/Marzo/Final`](./00_Examen/Marzo/Final)

---

### `01_HolaMundo` to `05_Funciones` — Java Fundamentals and Control Structures

#### `01_HolaMundo` — Project Template
- **Name:** `01_HolaMundo`
- **Description:** Initial Java class skeleton ([`HolaMundo.java`](./01_HolaMundo/HolaMundo.java)) with `main` entry point.
- **Technologies:** Java
- **Key Features:** Basic class and `main` method structure.
- **Location:** [`./01_HolaMundo`](./01_HolaMundo)

#### `02_TiposDeDatos` — Variables and Arithmetic Operations
- **Name:** `02_TiposDeDatos`
- **Description:** Console exercises introducing variables, keyboard input, and floating-point arithmetic.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:**
  - [`NumerosEnteros.java`](./02_TiposDeDatos/NumerosEnteros.java): Reads two numbers and computes their sum, difference, product, and quotient.
  - [`Variables.java`](./02_TiposDeDatos/Variables.java): Reads a user's name and prints a personalized greeting.
- **Location:** [`./02_TiposDeDatos`](./02_TiposDeDatos)

#### `03_Fundamentos` — Conditionals and Loops (`Condicionales` & `Bucles`)
- **Name:** `03_Fundamentos`
- **Description:** Structured collection of control-flow exercises divided into `Condicionales` (`If`, `IfCompuesto`, `IfAnidado`, `Switch`) and `Bucles` (`While`, `WhileDo`, `For`, `ForDoble`).
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:**
  - [`Condicionales/If/CondicionalSimple.java`](./03_Fundamentos/Condicionales/If/CondicionalSimple.java): Reads a user's age and prints whether they are of legal age (`>= 18`).
  - [`Condicionales/IfCompuesto/CondicionalCompuesto.java`](./03_Fundamentos/Condicionales/IfCompuesto/CondicionalCompuesto.java): Calculates the average of three integer grades and classifies the result as fail (`<= 4`), pass (`5`–`9`), or honors (`10`).
  - [`Condicionales/IfAnidado/`](./03_Fundamentos/Condicionales/IfAnidado): Determines whether a positive integer has 1, 2, or 3 digits (`CondicionalAnidadoEjer1.java`) and assigns an applicant test score proficiency tier (`CondicionalAnidadoEjer2.java`).
  - [`Condicionales/Switch/CondicionalSwitch.java`](./03_Fundamentos/Condicionales/Switch/CondicionalSwitch.java): Maps month numbers (`1`–`12`) to their Spanish month name and corresponding season.
  - [`Bucles/While/`](./03_Fundamentos/Bucles/While): Multiplication table (`1`–`10`) generator (`BucleWhileEjer1.java`) and 10-number sum and average calculator (`BucleWhileEjer2.java`).
  - [`Bucles/WhileDo/`](./03_Fundamentos/Bucles/WhileDo): Accumulates input integers until sentinel value `9999` is entered (`BucleDoWhileEjer1.java`) and provides a piece-weight loop skeleton (`BucleDoWhileEjer2.java`).
  - [`Bucles/For/`](./03_Fundamentos/Bucles/For): Multiplication table (`0`–`10`, `BucleForEjer1.java`), efficient primality check up to `i * i <= numero` (`BucleForEjer2.java`), odd numbers between arbitrary bounds (`BucleForEjer3.java`), and solid asterisk square rendering (`BucleForEjer4.java`).
  - [`Bucles/ForDoble/`](./03_Fundamentos/Bucles/ForDoble): Five nested-loop ASCII geometry exercises rendering a solid square (`DobleBucleForEjer1`), hollow square (`DobleBucleForEjer2`), right triangle (`DobleBucleForEjer3`), centered pyramid (`DobleBucleForEjer4`), and full diamond (`DobleBucleForEjer5`).
- **Location:** [`./03_Fundamentos`](./03_Fundamentos)

#### `04_CadenaDeCaracteres` — Character Strings (`String` & `StringBuilder`)
- **Name:** `04_CadenaDeCaracteres`
- **Description:** Eight exercises exploring Java `String` and `StringBuilder` methods.
- **Technologies:** Java (`java.util.Scanner`, `String`, `StringBuilder`, `Character`)
- **Key Features:**
  - `CadenasDeCaracteresEjer1`–`Ejer4`: Case-insensitive `"Fin"` loop (`equalsIgnoreCase`), substring search (`indexOf`), character-by-character palindrome comparison, and replacing `'a'`/`'A'` with `'@'`.
  - `CadenasDeCaracteresEjer5`–`Ejer8`: Capitalizing the first letter after a period using `StringBuilder`, separating vowels before consonants while stripping spaces, an interactive 5-option string analysis menu (first half, last char, reverse, hyphen-join, vowel count), and word splitting across lines via `split(" ")`.
- **Location:** [`./04_CadenaDeCaracteres`](./04_CadenaDeCaracteres)

#### `05_Funciones` — Functions and Static Methods
- **Name:** `05_Funciones`
- **Description:** Modularizing logic into reusable static methods.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:**
  - [`FuncionesEjer1.java`](./05_Funciones/FuncionesEjer1.java): Four-operation calculator (`suma`, `resta`, `multi`, `division`) with division-by-zero protection.
  - [`FuncionesEjer2.java`](./05_Funciones/FuncionesEjer2.java): Dispatches a user phrase to standard output (`System.out`) or error output (`System.err`).
  - [`FuncionesEjer3.java`](./05_Funciones/FuncionesEjer3.java): `mayor_num(int, int)` returning the larger integer or `0` if equal.
  - [`FuncionesEjer4.java`](./05_Funciones/FuncionesEjer4.java): Spanish NIF format and modulo-23 control letter validation (`esFormatoValido`, `esNifValido`).
  - [`FuncionesEjer5.java`](./05_Funciones/FuncionesEjer5.java): `imprimirCabecera(String)` framing a text banner in asterisks.
- **Location:** [`./05_Funciones`](./05_Funciones)

---

### `06_Ahorcado` to `17_Juegos` — Console Games, Type Conversions, and Object-Oriented Programming

#### `06_Ahorcado` — Console Hangman
- **Name:** `06_Ahorcado`
- **Description:** Word-guessing game with a 5-life counter and random word selection from a predefined array.
- **Technologies:** Java (`java.util.Scanner`, `Math.random`)
- **Key Features:** Tracks guessed letters, prevents duplicate guesses, reveals matching positions in a `char[]` mask, and detects win/loss conditions.
- **Location:** [`./06_Ahorcado`](./06_Ahorcado)

#### `07_CambioDeVariables` — Type Casting and Parsing
- **Name:** `07_CambioDeVariables`
- **Description:** Demonstrates explicit and implicit type conversions in Java.
- **Technologies:** Java (`String.valueOf`, `Integer.parseInt`, `Float.parseFloat`)
- **Key Features:** Converts values between `int`, `float`, `double`, `char`, and `String`.
- **Location:** [`./07_CambioDeVariables`](./07_CambioDeVariables)

#### `08_Clases` — Encapsulation and Constructor Overloading (`SeatLeon`)
- **Name:** `08_Clases`
- **Description:** Object-oriented model of a car ([`SeatLeon.java`](./08_Clases/SeatLeon.java)) demonstrating encapsulation, constructors, validation, and `toString()`.
- **Technologies:** Java (OOP)
- **Key Features:** Overloaded constructors (full, without extras, default), getters/setters with case normalization, private helper `validarPuertas(int)` restricting doors to 3 or 5, and `@Override toString()`.
- **Location:** [`./08_Clases`](./08_Clases)

#### `09_NIF` — Spanish NIF Validator
- **Name:** `09_NIF`
- **Description:** Standalone console validator for 9-character Spanish NIF identification numbers.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:** Extracts the 8-digit numeric prefix and trailing letter via `substring()`, computes `numeros % 23`, and verifies the check character against the official 23-letter table.
- **Location:** [`./09_NIF`](./09_NIF)

#### `10_Ruleta` — Casino Roulette Betting Simulator
- **Name:** `10_Ruleta`
- **Description:** Interactive console roulette game converting euros to chips (`1€ = 10 chips`).
- **Technologies:** Java (`java.util.Scanner`, `java.util.Random`)
- **Key Features:** Supports bets on numbers `0`–`36`, classifies pockets into green (`0`, 35x payout), red (odd, 2x payout), and black (even, 2x payout), and loops until the player cashes out or runs out of funds.
- **Location:** [`./10_Ruleta`](./10_Ruleta)

#### `11_Clases` — Multi-Class OOP Exercises (`Alumnos`, `Formas`, `Mensajes`)
- **Name:** `11_Clases`
- **Description:** Three multi-class OOP exercises practicing private attributes, validation helpers, static comparison methods, and Swing dialogs.
- **Technologies:** Java (`java.util.Scanner`, `javax.swing.JOptionPane`)
- **Key Features:**
  - [`Alumnos`](./11_Clases/Alumnos): `Alumno` class storing student name, age, and legal-age status (`isLegalAge`), plus `Alumno.comparateAges(student1, student2)` to compare two students.
  - [`Formas`](./11_Clases/Formas): `Triangulo` class that validates positive side lengths (`esLadoValido`) and automatically recomputes whether the triangle is `"Equilatero"`, `"Isosceles"`, or `"Escaleno"` (`calcularTipo`) whenever sides are set.
  - [`Mensajes`](./11_Clases/Mensajes): `Mensajes` class providing `mensaje()` (standard output), `mensaje_rojo()` (error stream), and `mensaje_info()` (`JOptionPane.showMessageDialog`), invoked from `Ejer1`.
- **Location:** [`./11_Clases`](./11_Clases)

#### `12_Dados` — Object-Oriented Dice Game
- **Name:** `12_Dados`
- **Description:** Multi-class dice game modeling two 6-sided dice (`Dado` and `Juego`).
- **Technologies:** Java (`Math.random`)
- **Key Features:** `Dado` rolls a random value (`1`–`6`) in its constructor; `Juego` instantiates two dice and declares a win if their sum exceeds `8`.
- **Location:** [`./12_Dados`](./12_Dados)

#### `13_Cadenas` — String & Loop Review
- **Name:** `13_Cadenas`
- **Description:** Review exercises on string vowel capitalization/replacement ([`Ej2.java`](./13_Cadenas/Ej2.java)) and hollow ASCII triangle rendering ([`Javijesji.java`](./13_Cadenas/Javijesji.java)).
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:** Vowel detection with `contains()`, `toUpperCase()`, `replace('a', '@')`, and nested loop conditions.
- **Location:** [`./13_Cadenas`](./13_Cadenas)

#### `14_Pruebas` — Array and 5x5 Matrix Operations Menu
- **Name:** `14_Pruebas`
- **Description:** Comprehensive review class ([`Repaso.java`](./14_Pruebas/Repaso.java)) implementing 1D array sorting and an interactive 6-option menu for 5x5 matrix calculations.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:** Array initialization, hyphenated printing, moving the maximum element to index 0, descending sort, manual 5x5 matrix entry, row sum, column sum, main diagonal sum, inverse diagonal sum, and overall matrix average.
- **Location:** [`./14_Pruebas`](./14_Pruebas)

#### `16_ColaboracionClases` — Object Composition (`Club` & `Socio`)
- **Name:** `16_ColaboracionClases`
- **Description:** Demonstrates object collaboration and composition between a `Club` class and three `Socio` instances.
- **Technologies:** Java (`java.util.Scanner`)
- **Key Features:** Each `Socio` prompts for member name and seniority (`antiguedad`) upon construction; `Club.MasAntiguo()` identifies and prints the member with the longest tenure.
- **Location:** [`./16_ColaboracionClases`](./16_ColaboracionClases)

#### `17_Juegos` — Classic Console Games Suite
- **Name:** `17_Juegos`
- **Description:** Three standalone console games implemented in Java: Hangman, Battleship, and Tic-Tac-Toe.
- **Technologies:** Java (`java.util.Scanner`, `java.util.Random`)
- **Key Features:**
  - [`Ahorcado.java`](./17_Juegos/Ahorcado.java): Two-player Hangman where one player enters the secret word and the other guesses letters against a masked `char[]`.
  - [`Barcos.java`](./17_Juegos/Barcos.java): Single-player 10x10 Battleship placing 3 boats of length 1, 2 boats of length 2, and 1 boat of length 3 randomly without overlap, giving the player 10 lives and a radar grid.
  - [`TresEnRaya.java`](./17_Juegos/TresEnRaya.java): Two-player 3x3 Tic-Tac-Toe mapping numpad positions (`1`–`9`) to board coordinates and checking all 8 winning lines.
- **Location:** [`./17_Juegos`](./17_Juegos)

---

### `18_Arrays` — 1D Arrays, Parallel Arrays, and 2D Matrices

- **Name:** `18_Arrays`
- **Description:** Collection of 12 Java programs organized into 5 subpackages (`ArrayAleatorio`, `Arrays`, `ArraysParalelos`, `HundirLaFlota`, `Matrices`) covering sorting, statistical calculations, parallel array synchronization, and grid games.
- **Technologies:** Java (`java.util.Scanner`, `Math.random`, `String.compareTo`)
- **Key Features:**
  - [`ArrayAleatorio/ArrayAleatorio.java`](./18_Arrays/ArrayAleatorio/ArrayAleatorio.java): Populates a 10-element array with random integers (1–100) and sorts it in descending order using bubble sort.
  - [`Arrays/`](./18_Arrays/Arrays): Random-length array generation (1–50 elements with values 101–200 in `ArrayTamañoAleatorio.java` and `TamanoAleatorio.java`), alphabetical country sorting with `compareTo` (`OrdenarPaises.java`), non-repeating 6-number lottery generator 1–49 (`Primitiva.java`), height average and above/below count (`PromedioAlturas.java`), morning/afternoon shift payroll averages (`Sueldos.java`), and element-wise 4-element vector addition (`SumaVectores.java`).
  - [`ArraysParalelos/`](./18_Arrays/ArraysParalelos): Synchronized bubble sort of student names and grades by either name or grade (`AlumnosNotas.java`), and alphabetical sorting of countries paired with population counts (`PaisesHabitantes.java`).
  - [`HundirLaFlota/HundirLaFlota.java`](./18_Arrays/HundirLaFlota/HundirLaFlota.java): 1D 10-cell Battleship mini-game with 2 lives.
  - [`Matrices/RellenarConX.java`](./18_Arrays/Matrices/RellenarConX.java): Fills a 3x3 matrix with `'x'` and places a single `'o'` at a random coordinate.
- **Location:** [`./18_Arrays`](./18_Arrays)

---

### `15_BuilderWindow`, `19_InterfazGrafica`, `20_Banco` — Java Swing Desktop GUIs

#### `15_BuilderWindow` & `19_InterfazGrafica` — Swing Forms and Interactive Windows
- **Name:** `15_BuilderWindow` and `19_InterfazGrafica`
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
- **Location:** [`./15_BuilderWindow`](./15_BuilderWindow) and [`./19_InterfazGrafica`](./19_InterfazGrafica)

#### `20_Banco` — Multi-Window Banking GUI Application
- **Name:** `20_Banco`
- **Description:** Four-window Swing banking application with authentication, a menu-driven main window, and deposit/withdrawal screens.
- **Technologies:** Java Swing (`JFrame`, `JMenuBar`, `JMenu`, `JMenuItem`, `JPasswordField`, `JComboBox`, `JTextField`, `JLabel`, `JButton`, `JOptionPane`)
- **Key Features:**
  - [`Login.java`](./20_Banco/Login.java): Authenticates user credentials (`JTextField` and `JPasswordField`) and launches `Principal` upon success.
  - [`Principal.java`](./20_Banco/Principal.java): Main application frame with a `JMenuBar` (`Inicio` -> `Retirar`, `Ingresar`) opening the transaction windows.
  - [`Ingresar.java`](./20_Banco/Ingresar.java) & [`Retirar.java`](./20_Banco/Retirar.java): Account operation windows supporting `"Corriente"` (150€ per-transaction limit) and `"Credito"` (300€ per-transaction limit) accounts with `JOptionPane` error alerts when limits are exceeded.
- **Location:** [`./20_Banco`](./20_Banco)

---

### `21_ConexionDB` — MySQL Database Connectivity (JDBC)

- **Name:** `21_ConexionDB`
- **Description:** Demonstrates connecting Java applications to a MySQL database using the MySQL Connector/J JDBC driver (`com.mysql.cj.jdbc.Driver`).
- **Technologies:** Java JDBC (`java.sql.*`), MySQL (`sakila` and `shawarmas` databases), `javax.swing.JOptionPane`
- **Key Features:**
  - [`Conexion.java`](./21_ConexionDB/Conexion.java): Reusable connection helper class configuring driver, host (`localhost:3306`), database (`shawarmas`), and `conectarMySQL()` with `JOptionPane` error reporting.
  - [`ConexionMySQL.java`](./21_ConexionDB/ConexionMySQL.java) & [`Query1.java`](./21_ConexionDB/Query1.java): Connects to `jdbc:mysql://127.0.0.1:3306/sakila`, executes `SELECT title, description FROM film`, and iterates over the `ResultSet` (plus commented reference examples for `PreparedStatement` `UPDATE` and `CallableStatement` stored procedure calls).
- **Location:** [`./21_ConexionDB`](./21_ConexionDB)

---

## Additional Notes

### Setup and Execution
1. Open **Eclipse IDE** (or any Java IDE supporting JDK 17+) and import the desired folder or source files into a Java project.
2. Note that files in `01_HolaMundo`–`10_Ruleta` and `20_Banco` use the default package, whereas `00_Examen`, `11_Clases`–`19_InterfazGrafica`, and `21_ConexionDB` declare named packages (such as `package Formularios;`, `package InterfazGrafica;`, `package Database;`, etc.). Ensure the source directory structure in your IDE matches the declared `package` statement when compiling.

> [!IMPORTANT]
> To run the classes in [`21_ConexionDB`](./21_ConexionDB), add the **MySQL Connector/J** JAR (`mysql-connector-j`) to your project's classpath and ensure a local MySQL instance is running on port `3306` with the `sakila` / `shawarmas` schemas available.

> [!WARNING]
> The GUI classes `MegaVentana.java`, `MegaVentanaV2.java`, `TresEnRaya.java`, and `Veterinaria.java` in [`15_BuilderWindow`](./15_BuilderWindow) and [`19_InterfazGrafica`](./19_InterfazGrafica) reference image assets using hardcoded absolute paths from a classroom Google Drive mount (`G:\Mi unidad\Entornos\assets\...`). Update those paths to local image files if you wish to display the button icons at runtime.
