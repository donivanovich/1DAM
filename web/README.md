# Markup Languages and Web Development (*Lenguajes de Marcas* — `web`)

This directory contains HTML5, CSS3, and vanilla JavaScript exercises, static website clones, interactive DOM applications, and practical examinations developed for the **Markup Languages and Information Management Systems** (*Lenguajes de Marcas y Sistemas de Gestión de Información*) subject in the first-year Multiplatform Application Development (1º DAM) program.

---

## Technologies and Tools

### Programming Languages
- **HTML5** (semantic elements, forms, tables, multimedia/image embedding, inline SVG icons)
- **CSS3** (Flexbox layouts, CSS custom properties `:root`, positioning `fixed`/`absolute`, hover transitions, custom `@font-face` typography)
- **JavaScript (ES6+)** (DOM manipulation, event listeners, form handling, dynamic table/card rendering, `localStorage` persistence)

### External Libraries and Assets (CDN / Local)
- **Bootstrap Icons CDN:** `bootstrap-icons@1.11.3` (used in `03_Google`, `12_GoogleFloat`, and `22_YTMusic`), plus inline Bootstrap SVG icons in `14_Youtube`, `15_Fifa`, `16_Twitter`, `22_YTMusic`, and `23_TikTok`
- **Font Awesome Kit:** `kit.fontawesome.com` (used in `04_GoogleSearch`)
- **Custom Fonts:** Local `PTSans-Regular.ttf` font included in `03_Google` and `12_GoogleFloat`

### Development Tools
- **[Visual Studio Code](https://code.visualstudio.com/Download)** (with Live Server for local preview)
- **Modern Web Browsers:** Google Chrome, Mozilla Firefox, or Microsoft Edge

---

## Projects and Exercises

### `00_Examenes` — Examinations and Practice Assessments

#### `01_Examen` — Froggy Crypto Exchange Dashboard
- **Name:** `01_Examen`
- **Description:** First-term HTML/CSS practical exam building **Froggy**, a cryptocurrency exchange and trading dashboard for "Froggycoin (`FROG/USDT`)".
- **Technologies:** HTML5, CSS3 (Flexbox, CSS variables `:root`, `position: fixed`), SVG/GIF assets (`frog.svg`, `loading.gif`)
- **Key Features:** Fixed top navigation bar (`Comprar crypto`, `Mercados`, `Trading`, `Ahorrar`), left market ticker sidebar (`FROG/USDT`, `BTC/USDT`, `ETH/USDT`, `DOGE/USDT`, `SHIB/USDT`, `HTML/USDT`), central chart loading panel with project description, right buy-order form (`CANTIDAD`, `PRECIO`, `COMPRAR`), and call-to-action footer.
- **Location:** [`./00_Examenes/01_Examen`](./00_Examenes/01_Examen)

#### `02_PracticaExamen` — SpaceX Starship Super Heavy Payload Manager
- **Name:** `02_PracticaExamen`
- **Description:** Interactive web application for managing cargo payloads aboard the SpaceX Starship Super Heavy rocket, enforcing a maximum payload capacity of `150,000 kg` and calculating cost at `$250 / kg`.
- **Technologies:** HTML5, CSS3 (Flexbox, fixed bottom input bar, scrollable container), JavaScript (`DOMContentLoaded`, `createElement`, array of objects)
- **Key Features:** Renders initial payload items dynamically (`mostrarCargas()`), validates new cargo name and positive mass inputs on button click (`#añadirCarga`), checks that total accumulated mass does not exceed `CARGA_MAXIMA`, and appends new cargo cards with calculated pricing.
- **Location:** [`./00_Examenes/02_PracticaExamen`](./00_Examenes/02_PracticaExamen)

#### `03_Examen` — Student Tutoring Scheduler (`Tutorias`)
- **Name:** `03_Examen`
- **Description:** Practical JavaScript DOM exam for scheduling and managing student tutoring sessions (`Tutorias`).
- **Technologies:** HTML5 (form with `datetime-local` input, `table`), CSS3 (CSS custom properties), JavaScript (`onsubmit`, dynamic `<tr>` creation)
- **Key Features:** Captures student name and date-time from the form (`envioFormulario`), appends a new row to `#tablaAlumnos` with `"Pendiente"` status, and wires per-row `Completar` and `Eliminar` action buttons.
- **Location:** [`./00_Examenes/03_Examen`](./00_Examenes/03_Examen)

---

### `01_Clickedu` to `13_UnionWeb` — HTML5 & CSS3 Fundamentals

#### `01_Clickedu` — External Login Form Submission
- **Name:** `01_Clickedu`
- **Description:** Minimal HTML login form submitting `username` and `password` via `POST` to the school's Clickedu platform (`https://iepjoyfe.clickedu.eu/user.php?action=doLogin`).
- **Technologies:** HTML5 (`<form method="POST">`)
- **Key Features:** Demonstrates form `action`, `method`, and text/password/submit inputs.
- **Location:** [`./01_Clickedu`](./01_Clickedu)

#### `02_Cuadrado` — Flexbox Colored Squares Layout
- **Name:** `02_Cuadrado`
- **Description:** Introductory CSS Flexbox exercise arranging red, green, blue, and gray blocks centered in the viewport.
- **Technologies:** HTML5, CSS3 (Flexbox)
- **Key Features:** Uses `display: flex`, `justify-content: center`, and `align-items: center` on a `100vh` body.
- **Location:** [`./02_Cuadrado`](./02_Cuadrado)

#### `03_Google` & `12_GoogleFloat` — Google Dark-Mode Homepage Clone
- **Name:** `03_Google` and `12_GoogleFloat`
- **Description:** Dark-themed visual replica of the Spanish Google homepage (`#202124` background).
- **Technologies:** HTML5, CSS3, Bootstrap Icons CDN (`bootstrap-icons.min.css`), local `PTSans-Regular.ttf` font and Google logo PNG
- **Key Features:** Top navigation links (`Sobre Google`, `Tienda`, `Gmail`, `Imágenes`, sign-in button), centered Google logo, rounded search input with `"Buscar con Google"` and `"Voy a tener suerte"` buttons, regional language switcher (`català`, `galego`, `euskara`), and two-tier footer.
- **Location:** [`./03_Google`](./03_Google) and [`./12_GoogleFloat`](./12_GoogleFloat)

#### `04_GoogleSearch` — Animated Expanding Search Bar
- **Name:** `04_GoogleSearch`
- **Description:** Animated search input widget that expands smoothly from `60px` to `550px` width on hover and submits queries to Google Search (`https://www.google.com/search`).
- **Technologies:** HTML5, CSS3 (`transition: .5s ease-in-out`, `:hover`, `box-shadow`), Font Awesome (`fa-magnifying-glass`)
- **Key Features:** Combines a CSS hover width transition with a `GET` search form.
- **Location:** [`./04_GoogleSearch`](./04_GoogleSearch)

#### `05_Horario` — 1ºA DAM Weekly Class Schedule Table
- **Name:** `05_Horario`
- **Description:** HTML table representing the weekly class timetable (`Lunes` to `Viernes`, `8:00` to `13:30`) for 1ºA DAM (`Sistemas`, `Entornos`, `Programacion`, `Bases de datos`, `AWS`, `Lenguajes de marcas`, `ITP`).
- **Technologies:** HTML5 (`<table>`, `<tr>`, `<th>`, `<td>`, `colspan`, `rowspan`), inline CSS
- **Key Features:** Uses `colspan="5"` to span the `11:00` break (`Recreo`) across all five weekdays.
- **Location:** [`./05_Horario`](./05_Horario)

#### `06_JoyfeCopia` — Course Syllabus & Guidelines Page
- **Name:** `06_JoyfeCopia`
- **Description:** Informational HTML page displaying the school banner, the topics covered in *Lenguajes de Marcas* (`HTML`, `CSS`, `JavaScript`, `PHP`), and a bulleted list of best practices for passing the course.
- **Technologies:** HTML5 (`<img>`, `<h1>`, `<ul>`, `<li>`, inline styles)
- **Key Features:** Structured unordered lists and external image embedding.
- **Location:** [`./06_JoyfeCopia`](./06_JoyfeCopia)

#### `07_BuscadorGoogle` — Classic Table-Based Google Search Form
- **Name:** `07_BuscadorGoogle`
- **Description:** Classic HTML table-wrapped form submitting a search query (`name="q"`, `hl="es"`) via `GET` to `http://www.google.com/search`.
- **Technologies:** HTML5 (`<form>`, `<table>`, hidden and text `<input>`)
- **Key Features:** Demonstrates query parameters (`q`, `hl`, `btnG`) in a `GET` form submission.
- **Location:** [`./07_BuscadorGoogle`](./07_BuscadorGoogle)

#### `08_HolaMundo` — First HTML Typography Page
- **Name:** `08_HolaMundo`
- **Description:** Introductory HTML document practicing heading levels (`<h1>`, `<h2>`, `<h3>`, `<h6>`), paragraphs (`<p>`), line breaks (`<br>`), and horizontal rules (`<hr>`).
- **Technologies:** HTML5
- **Key Features:** Basic document anatomy and text tags.
- **Location:** [`./08_HolaMundo`](./08_HolaMundo)

#### `09_Enlaces` — Internal and External Hyperlinks
- **Name:** `09_Enlaces`
- **Description:** Two-page site (`index.html` and `contacto.html`) practicing relative links, root-relative links, and external links opening in a new tab (`target="_blank"`).
- **Technologies:** HTML5 (`<a>`)
- **Key Features:** Links between `index.html` and `contacto.html` and demonstrates `target="_blank"`.
- **Location:** [`./09_Enlaces`](./09_Enlaces)

#### `10_Estilos` — CSS Selectors, Box Model, and Color Formats
- **Name:** `10_Estilos`
- **Description:** Practice page combining inline styles and an external stylesheet (`styles.css`) to test element selectors, margins, padding, and `rgba()` transparency.
- **Technologies:** HTML5, CSS3
- **Key Features:** Styles `<p>`, `<h1>`, `<section>`, and `<span>` elements using named colors and `rgba()`.
- **Location:** [`./10_Estilos`](./10_Estilos)

#### `11_Formulario` — Comprehensive HTML5 Form Controls & Validation
- **Name:** `11_Formulario`
- **Description:** Form showcasing HTML5 input types, validation attributes, radio buttons, checkboxes, textareas, and dropdown selects.
- **Technologies:** HTML5 (`<form method="GET">`, `<input>`, `<label>`, `<textarea>`, `<select>`, `<option>`)
- **Key Features:** Uses `text` (`minlength`, `maxlength`, `autocomplete="off"`), `password`, `email`, `number` (`step="0.01"`, `min`, `max`), `datetime-local`, `checkbox`, `radio`, `reset`, and `submit` controls with `required` validation.
- **Location:** [`./11_Formulario`](./11_Formulario)

#### `13_UnionWeb` — Multi-Page HTML Website (Text Formatting, Lists & Tables)
- **Name:** `13_UnionWeb`
- **Description:** Four-page website (`index.html`, `contacto.html`, `listas.html`, `tablas.html`) consolidating HTML text formatting tags, ordered/unordered lists, and table cell spanning.
- **Technologies:** HTML5
- **Key Features:**
  - [`index.html`](./13_UnionWeb/index.html) & [`contacto.html`](./13_UnionWeb/contacto.html): Semantic text formatting (`<mark>`, `<b>`, `<i>`, `<s>`, `<em>`), hyperlinks, and image links.
  - [`listas.html`](./13_UnionWeb/listas.html): Unordered (`<ul>`) and ordered (`<ol>`) lists.
  - [`tablas.html`](./13_UnionWeb/tablas.html): Table demonstrating combined `colspan="2"` and `rowspan="2"`.
- **Location:** [`./13_UnionWeb`](./13_UnionWeb)

---

### `14_Youtube` to `17_Mundial2022` & `22_YTMusic` to `23_TikTok` — Real-World Web UI Clones

#### `14_Youtube` — YouTube Dark-Theme Home Interface Clone
- **Name:** `14_Youtube`
- **Description:** Visual replica of the YouTube desktop interface (`youtube.html`, `youtube.css`) with a fixed header, left navigation sidebar, category filter bar, and a 10-video responsive thumbnail grid.
- **Technologies:** HTML5, CSS3 (Flexbox, `position: fixed`), inline SVG icons, local thumbnail and channel avatar images (`img/`, `ico/`)
- **Key Features:** Fixed top search bar with pill-shaped inputs, collapsible-style left navigation (`Inicio`, `Shorts`, `Suscripciones`, `Historial`, `Listas de reproducción`, `Ver más tarde`, `Videos que me gustan`), category chips, and video cards with channel avatars and view counts.
- **Location:** [`./14_Youtube`](./14_Youtube)

#### `15_Fifa` — FIFA Official Portal & "The Best 2024" Clone
- **Name:** `15_Fifa`
- **Description:** Large-scale static replica (464 lines of HTML, 870 lines of CSS, and 73 local `.webp`/`.png` media assets) of the official FIFA portal (`FIFA | La casa del fútbol`).
- **Technologies:** HTML5, CSS3 (Flexbox, fixed two-tier header, horizontal card carousels, background images), inline SVG icons
- **Key Features:** Two-row fixed `#045694` FIFA navigation bar, hero banners for *The Best FIFA Football Awards 2024*, award category cards, news stories, FIFA+ video reels, world rankings tables, FIFA Store jersey showcase, Inside FIFA sections, and partner sponsor logos footer.
- **Location:** [`./15_Fifa`](./15_Fifa)

#### `16_Twitter` — X (Twitter) Web Client Clone
- **Name:** `16_Twitter`
- **Description:** Three-column dark-mode replica of the X (`Inicio / X`) web interface split across modular stylesheets (`menu.css`, `feed.css`, `tendencias.css`, `styles.css`).
- **Technologies:** HTML5, CSS3 (Flexbox, modular CSS architecture, fixed sidebar), inline SVG icons
- **Key Features:** Left navigation rail (`Inicio`, `Explorar`, `Notificaciones`, `Mensajes`, `Grok`, `Listas`, `Guardados`, `Comunidades`, `Premium`, `Perfil`, `Postear` button), center timeline (`Para ti` / `Siguiendo` tabs, post composer, and sample posts with engagement metrics), and right sidebar (search bar, Premium card, `"A quién seguir"` suggestions, and `"Qué está pasando"` trending topics).
- **Location:** [`./16_Twitter`](./16_Twitter)

#### `17_Mundial2022` — FIFA World Cup Qatar 2022 Page Clone
- **Name:** `17_Mundial2022`
- **Description:** Thematic landing page for the 2022 FIFA World Cup in Qatar (`Copa Mundial de la FIFA Catar 2022`), highlighting the Lusail Stadium Final scoreboard (Argentina vs. France) and tournament news.
- **Technologies:** HTML5, CSS3 (`cabezero.css`), `.webp` image assets
- **Key Features:** Two-tier Qatar-themed `rebeccapurple` fixed header, Final match scoreboard card (`3 (4) - (2) 3`), and featured tournament highlights.
- **Location:** [`./17_Mundial2022`](./17_Mundial2022)

#### `22_YTMusic` — YouTube Music Web Player UI Clone
- **Name:** `22_YTMusic`
- **Description:** Dark-themed UI clone of the YouTube Music desktop web player.
- **Technologies:** HTML5, CSS3 (`styles.css`), Bootstrap Icons CDN, inline SVG icons
- **Key Features:** Fixed top bar with hamburger menu, logo, search input (`Buscar canciones, álbumes, artistas o pódcast`), and user profile icons; left navigation sidebar (`Inicio`, `Explorar`, `Biblioteca`, `Nueva lista`); mood filter pills (`Relajación`, `Para sentirte bien`, `Energía`, `Entretenimiento`, `Romance`); and a `"Volver a escuchar"` album grid.
- **Location:** [`./22_YTMusic`](./22_YTMusic)

#### `23_TikTok` — TikTok Navigation Sidebar UI
- **Name:** `23_TikTok`
- **Description:** Dark-mode layout reproducing the TikTok desktop left navigation sidebar (`TikTok - Make Your Day`).
- **Technologies:** HTML5, CSS3 (`styles.css`), inline SVG search icon
- **Key Features:** Rounded dark search pill and vertical menu items (`Para ti`, `Explorar`, `Siguiendo`, `Friends`, `Cargar`, `Actividad`, `Mensajes`, `Live`, `Perfil`, `Mas`).
- **Location:** [`./23_TikTok`](./23_TikTok)

---

### `18_Calculadora` to `21_Entrega3` — Interactive JavaScript & DOM Applications

#### `18_Calculadora` — Interactive Calculator with Clickable History
- **Name:** `18_Calculadora`
- **Description:** Browser calculator supporting four arithmetic operations (`+`, `-`, `x`, `/`), clear (`CE`), and an interactive operation history panel.
- **Technologies:** HTML5, CSS3 (`styles.css`), JavaScript (`scripts.js`)
- **Key Features:** Captures button clicks via `querySelectorAll('.boton')`, evaluates expressions, appends each completed calculation (`operando1 operador operando2 = resultado`) to `.historial`, and restores any historical result to the main display when its history item is clicked.
- **Location:** [`./18_Calculadora`](./18_Calculadora)

#### `19_TablaDeMultiplicar` — Dynamic Multiplication Table Generator
- **Name:** `19_TablaDeMultiplicar`
- **Description:** Single-page JavaScript tool that generates the multiplication table (`1`–`10`) for any user-entered number.
- **Technologies:** HTML5, CSS3 (`styles.css`), JavaScript (`scripts.js`)
- **Key Features:** Reads `#num` on button click (`generarTabla()`), clears `#resultado`, and injects formatted `numero * i = ...` lines into the DOM.
- **Location:** [`./19_TablaDeMultiplicar`](./19_TablaDeMultiplicar)

#### `20_Coches` — Full-Featured Vehicle Fleet Manager with `localStorage`
- **Name:** `20_Coches`
- **Description:** Comprehensive CRUD and simulation web application managing a fleet of vehicles (`Marca`, `Modelo`, `KM`, `Consumo`, `Combustible Actual`, `Combustible Máximo`) with persistent browser storage (`localStorage`).
- **Technologies:** HTML5, CSS3 (modal overlay `.containerFormAcciones`), JavaScript (`scripts.js`, 494 lines)
- **Key Features:**
  - Initializes from `localStorage.getItem('coches')` (or default Tesla Cybertruck and Honda Civic Type R objects) and attaches object methods (`completarObjetoCoche`).
  - Supports adding new vehicles, editing existing rows in the main form, deleting vehicles, highlighting selected rows (`Seleccionar`), uppercasing text (`Formatear`), simulating trips in a modal dialog (`Mover`, validating sufficient fuel and updating mileage/fuel), and refueling (`Repostar`, validating tank capacity limits).
- **Location:** [`./20_Coches`](./20_Coches)

#### `21_Entrega3` — Dynamic Car Table (Deliverable 3)
- **Name:** `21_Entrega3`
- **Description:** Foundational version of the vehicle table manager (`coches.html`, `coches.js`).
- **Technologies:** HTML5, inline CSS, JavaScript (`coches.js`)
- **Key Features:** Intercepts form submission (`event.preventDefault()`), dynamically creates table rows (`<tr>`) for `Marca` and `Modelo`, and attaches per-row event handlers to `Seleccionar` (toggling `.seleccionado`), `Formatear` (converting brand and model cells to uppercase), and `Eliminar` (removing the row from the DOM).
- **Location:** [`./21_Entrega3`](./21_Entrega3)

---

## Additional Notes

### Execution Instructions
All projects in `web/` are static client-side applications with no external build step or package manager required:
1. Open the desired project folder in **Visual Studio Code**.
2. Launch the main `.html` file (`index.html`, `youtube.html`, or `coches.html`) directly in a browser or serve the folder via the VS Code **Live Server** extension.

> [!NOTE]
> In [`20_Coches/index.html`](./20_Coches/index.html), the `<script>` tag references `coches.js` while the script file in the directory is named [`scripts.js`](./20_Coches/scripts.js) (inherited from [`21_Entrega3/coches.js`](./21_Entrega3/coches.js)). Similarly, [`10_Estilos/index.html`](./10_Estilos/index.html) uses a root-relative `/styles.css` link, so it should be opened as the workspace root in Live Server for the stylesheet to resolve automatically.
