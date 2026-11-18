# Databases (*Bases de Datos* — `bbdd`)

This directory contains coursework, database schemas, query exercises, and examination scripts for the **Databases** (*Bases de Datos*) module of the first-year Multiplatform Application Development (1º DAM) curriculum. It covers relational database creation (DDL), data manipulation (DML), single-row functions, single-table and multi-table queries (`INNER JOIN`, `LEFT JOIN`, `RIGHT JOIN`), aggregate functions and grouping (`GROUP BY`, `HAVING`), views, and stored procedures in MySQL.

---

## Technologies and Tools

### Programming Languages
- **SQL** (MySQL dialect, using features such as `AUTO_INCREMENT`, `ENUM`, `YEAR`, `DELIMITER`, and MySQL date/string functions)

### Databases
- **MySQL 8.0+**
- **External Sample & Classroom Schemas Referenced:** `sakila`, `world`, and `shawarmas`
- **Self-Contained Schemas Created in Scripts:** `ifkamhar`, `bloquitocraft`, `arqueologia`, `biblioteca`, `jardineria`, `pokemondb`, `universidad`, `taller`, and `zapatillas`

### Development Tools
- **[MySQL Workbench 8.0.41 CE (64-bit)](https://dev.mysql.com/downloads/workbench/)**

---

## Projects and Exercises

### `00_Examenes` — Examinations and Assessments

#### `Diciembre/Parcial`
- **Name:** `Diciembre/Parcial`
- **Description:** First-term midterm practical examination centered on a sci-fi prison management database (`ifkamhar`). Includes schema creation, data population, and complex multi-table analytical queries.
- **Technologies:** MySQL (DDL, DML, `JOIN` / `LEFT JOIN`, `GROUP BY`, `HAVING`, `AVG`, `COUNT`)
- **Key Features:**
  - [`database.sql`](./00_Examenes/Diciembre/Parcial/database.sql): Creates the `ifkamhar` database with 15 relational tables (`habilidad`, `tarea`, `cargopenal`, `moduloprision`, `inventario`, `funcionario`, `prisionero`, `celda`, and 7 associative N:M tables).
  - [`seed.sql`](./00_Examenes/Diciembre/Parcial/seed.sql): Populates the `ifkamhar` schema with prison modules, cells, 100 staff members, 100 prisoners, penal charges, skills, inventory items, and task assignments.
  - [`queries.sql`](./00_Examenes/Diciembre/Parcial/queries.sql): Queries active staff counts per task, rank `'S'` officers with specific martial arts skills and empty inventories, and rank `'A'` officers assigned to sphere `IF0` filtered by average task load.
- **Location:** [`./00_Examenes/Diciembre/Parcial`](./00_Examenes/Diciembre/Parcial)

#### `Marzo/Final`
- **Name:** `Marzo/Final`
- **Description:** Second-term final database examination featuring a voxel sandbox game database (`bloquitocraft`) and multi-table analytical queries.
- **Technologies:** MySQL (DDL, DML, `JOIN`, `GROUP BY`, `HAVING`, `SUM`, `COUNT`)
- **Key Features:**
  - [`database.sql`](./00_Examenes/Marzo/Final/database.sql): Creates and populates the `bloquitocraft` database with tables `tipo`, `bioma`, `escenario`, `construccion`, `bloquito` (with 3D coordinates `pos_x`, `pos_y`, `pos_z`), and `escenario_bioma`.
  - [`queries.sql`](./00_Examenes/Marzo/Final/queries.sql): Analytical queries retrieving scenarios with their biomes ordered by date, the most frequent block type in the `'Monte nevado'` biome, block counts per construction, and total weight of `'Supervivencia'` mode scenarios exceeding 3,500 kg.
- **Location:** [`./00_Examenes/Marzo/Final`](./00_Examenes/Marzo/Final)

---

### `01_SQL` — SQL Fundamentals, DDL, DML, and Single-Row Functions

- **Name:** `01_SQL`
- **Description:** Introductory SQL scripts practicing database creation, table deletion, `INSERT`/`UPDATE`/`DELETE` statements, `WHERE` filtering, and string manipulation functions.
- **Technologies:** MySQL (`arqueologia`, `shawarmas`, `sakila`, and `world` schemas)
- **Key Features:**
  - [`database_creation_and_manipulation.sql`](./01_SQL/database_creation_and_manipulation.sql): Creates the `arqueologia` database (`arqueologos`, `objetos`, `excavaciones`, `areas`, `arqueologos_objetos`) and inserts sample records.
  - [`drop_tables.sql`](./01_SQL/drop_tables.sql): Drops all tables from the `shawarmas` database in foreign-key dependency order.
  - [`dml_operations.sql`](./01_SQL/dml_operations.sql): Practices `SELECT`, `INSERT`, `UPDATE`, and `DELETE ... WHERE` over the `world` (`countrylanguage`) and `sakila` (`actor`) databases.
  - [`string_functions.sql`](./01_SQL/string_functions.sql): Demonstrates single-row string functions (`UPPER`, `LOWER`, `CONCAT`, `SUBSTR`, `LENGTH`, `INSTR`, `LPAD`, `RPAD`, `REPLACE`, `TRIM`) on `sakila.film` and literal strings.
  - [`conditional_queries.sql`](./01_SQL/conditional_queries.sql): Filtering queries on `arqueologia` (`areas`, `arqueologos`, `excavaciones`).
  - [`string_functions_and_conditions.sql`](./01_SQL/string_functions_and_conditions.sql): Query on `world.country` combining arithmetic operations, `CONCAT`, `LPAD`, `RPAD`, and `LENGTH`.
  - [`string_functions_practice.sql`](./01_SQL/string_functions_practice.sql): Five multi-exercise practice sets on `sakila` (`actor`, `film`, `rental`) and `world` (`country`, `city`) using string functions, date comparisons, and pattern matching.
  - [`basic_select_queries.sql`](./01_SQL/basic_select_queries.sql): Basic `SELECT ... FROM ... WHERE` queries on `sakila.actor` and `sakila.film` using `LIKE`, `AND`, and `OR`.
- **Location:** [`./01_SQL`](./01_SQL)

---

### `02_Biblioteca` — Library Database Schema

- **Name:** `02_Biblioteca`
- **Description:** Relational schema design for a library lending system managing books, authors, members, physical copies, and loans.
- **Technologies:** MySQL (DDL, Primary/Foreign Keys, `AUTO_INCREMENT`)
- **Key Features:**
  - [`database.sql`](./02_Biblioteca/database.sql): Creates the `biblioteca` database with tables `libros`, `autor`, `socios`, `ejemplar`, `libros_autor`, and `ejemplar_socios`, plus initial test `INSERT` statements.
- **Location:** [`./02_Biblioteca`](./02_Biblioteca)

---

### `03_Jardineria` — Gardening Store Database and Queries

- **Name:** `03_Jardineria`
- **Description:** Full schema, dataset, single-table queries, and multi-table join queries for a gardening retail company (`jardineria`).
- **Technologies:** MySQL (DDL, DML, `JOIN`, `LEFT JOIN`, date functions `YEAR` and `DATE_FORMAT`)
- **Key Features:**
  - [`database.sql`](./03_Jardineria/database.sql): Creates and populates the `jardineria` database (`gama_producto`, `oficina`, `producto`, `empleado`, `cliente`, `pago`, `pedido`, `detalle_pedido`).
  - [`queries.sql`](./03_Jardineria/queries.sql): Single-table queries filtering offices, employees by manager/role, Spanish customers, order statuses, and 2008 orders using `YEAR()`, `DATE_FORMAT()`, and `LIKE`.
  - [`joins.sql`](./03_Jardineria/joins.sql): Multi-table inner and outer join queries linking customers, sales representatives, offices, payments, orders, and product ranges.
- **Location:** [`./03_Jardineria`](./03_Jardineria)

---

### `04_Pokemon` — Pokémon Database and Analytical Queries

- **Name:** `04_Pokemon`
- **Description:** Comprehensive first-generation Pokémon database schema (`pokemondb`) and analytical SQL exercises.
- **Technologies:** MySQL (DDL, DML, `JOIN`, `GROUP BY`, `AVG`, `SUM`, `COUNT`, `ORDER BY`, `LIMIT`)
- **Key Features:**
  - [`database.sql`](./04_Pokemon/database.sql): Large script (5,690 lines) creating and populating `pokemondb` with tables for Pokémon species (`pokemon`), base stats (`estadisticas_base`), types (`tipo`, `pokemon_tipo`, `tipo_ataque`), moves and secondary effects (`movimiento`, `efecto_secundario`, `movimiento_efecto_secundario`), learning methods (`forma_aprendizaje`, `nivel_aprendizaje`, `mt`, `mo`, `pokemon_movimiento_forma`), and evolutions (`evoluciona_de`, `forma_evolucion`, `nivel_evolucion`, `piedra`, `tipo_piedra`, `tipo_evolucion`).
  - [`queries.sql`](./04_Pokemon/queries.sql): Queries counting Pokémon per type, average weight and height, move filtering, and ranking Pokémon by total base stats (`ps + ataque + defensa + especial + velocidad`).
- **Location:** [`./04_Pokemon`](./04_Pokemon)

---

### `05_Universidad` — University Management Database and Queries

- **Name:** `05_Universidad`
- **Description:** Academic management database (`universidad`) accompanied by three structured query sets covering single-table queries, inner/outer joins, aggregations, and subqueries.
- **Technologies:** MySQL (DDL, DML, `JOIN`, `LEFT JOIN`, `GROUP BY`, `HAVING`, `COUNT`, `SUM`)
- **Key Features:**
  - [`database.sql`](./05_Universidad/database.sql): Creates and populates `universidad` (`departamento`, `grado`, `curso_escolar`, `persona`, `profesor`, `asignatura`, `alumno_se_matricula_asignatura`).
  - [`queries.sql`](./05_Universidad/queries.sql): Single-table queries filtering students and professors by birth year, missing phone numbers, NIF patterns, and course semester.
  - [`joins.sql`](./05_Universidad/joins.sql): Inner and outer (`LEFT JOIN`) multi-table queries across degrees, subjects, professors, departments, and enrollments.
  - [`subqueries.sql`](./05_Universidad/subqueries.sql): Aggregate queries (`COUNT`, `SUM`, `GROUP BY`, `HAVING`) calculating students per academic year, professors per department, subjects and credits per degree, and unlinked entities.
- **Location:** [`./05_Universidad`](./05_Universidad)

---

### `06_Taller` — Auto Repair Shop Database and Queries

- **Name:** `06_Taller`
- **Description:** Database schema and query exercises for an automotive repair workshop (`taller`).
- **Technologies:** MySQL (DDL, DML, `JOIN`, `LEFT JOIN`, `RIGHT JOIN`, `GROUP BY`, `SUM`, `COUNT`)
- **Key Features:**
  - [`database.sql`](./06_Taller/database.sql): Defines and populates the `taller` schema (`clientes`, `servicios`, `empleados`, `repuestos`, `vehiculos`, `reparaciones`, `reparacion_repues` / `reparacion_repuestos`, `facturas`), containing two comparative schema versions written during class.
  - [`queries.sql`](./06_Taller/queries.sql): Join and aggregation queries retrieving repair details, customer spending totals, and repair counts per employee.
- **Location:** [`./06_Taller`](./06_Taller)

---

### `07_TiendaDeZapatillas` — Sneaker Store Database and Queries

- **Name:** `07_TiendaDeZapatillas`
- **Description:** E-commerce database (`zapatillas`) modeling a sneaker store with suppliers, categories, inventory, customer reviews, and orders.
- **Technologies:** MySQL (DDL, DML, `JOIN`, `LEFT JOIN`, `GROUP BY`, `HAVING`, `SUM`, `AVG`, `MAX`, `MIN`, `COUNT`)
- **Key Features:**
  - [`database.sql`](./07_TiendaDeZapatillas/database.sql): Creates and populates `zapatillas` (`proveedores`, `categorias`, `clientes`, `productos`, `inventario`, `resennas`, `pedidos`, `detalles_pedido`).
  - [`queries.sql`](./07_TiendaDeZapatillas/queries.sql): 20+ query exercises covering product listings by category, customer order totals, price extremes and averages, review ratings, and stock thresholds.
- **Location:** [`./07_TiendaDeZapatillas`](./07_TiendaDeZapatillas)

---

### `08_Vistas` — Views and Stored Procedures

- **Name:** `08_Vistas`
- **Description:** Scripts demonstrating the creation and invocation of SQL views and stored procedures over the `sakila` and `shawarmas` databases.
- **Technologies:** MySQL (`CREATE VIEW`, `CREATE PROCEDURE`, `DELIMITER`, `CALL`, session variables `@var`)
- **Key Features:**
  - [`views.sql`](./08_Vistas/views.sql): Creates views `catalogo` (available products with color, size, category, and total units sold) and `albaran` (order delivery notes with customer details and order totals) on the `shawarmas` schema.
  - [`stored_procedures_basic.sql`](./08_Vistas/stored_procedures_basic.sql): Defines stored procedures `NombresQueEmpiezanPor` and `AltaCliente` (with `OUT` status code validation) on `sakila`.
  - [`stored_procedures_management.sql`](./08_Vistas/stored_procedures_management.sql): Defines stored procedures `altatienda`, `cambiarsinopsis`, `grabardevolucion`, and `trasladarinventario` on `sakila`.
  - [`procedure_calls.sql`](./08_Vistas/procedure_calls.sql): Example `CALL` statements invoking `NombresQueEmpiezanPor`, `AltaCliente`, and `AltaTienda`.
- **Location:** [`./08_Vistas`](./08_Vistas)

---

## Additional Notes

### Execution Instructions
1. Open **MySQL Workbench** (or the `mysql` CLI client) connected to a running MySQL 8.0+ server.
2. For self-contained modules (`00_Examenes/Diciembre/Parcial`, `00_Examenes/Marzo/Final`, `02_Biblioteca`, `03_Jardineria`, `04_Pokemon`, `05_Universidad`, `06_Taller`, `07_TiendaDeZapatillas`), run the `database.sql` (and `seed.sql` where applicable) script first to create and populate the schema before running the corresponding `queries.sql`, `joins.sql`, or `subqueries.sql` scripts.

> [!IMPORTANT]
> Several scripts in [`01_SQL`](./01_SQL) and [`08_Vistas`](./08_Vistas) execute `USE sakila;`, `USE world;`, or `USE shawarmas;`. Make sure the standard MySQL sample databases (`sakila` and `world`) are installed on your MySQL instance before running those scripts.

> [!NOTE]
> Some practice files (such as [`04_Pokemon/queries.sql`](./04_Pokemon/queries.sql), [`06_Taller/queries.sql`](./06_Taller/queries.sql), and [`02_Biblioteca/database.sql`](./02_Biblioteca/database.sql)) contain unfinished query prompts or unquoted string literals from in-class exercises and should be reviewed prior to batch execution.
