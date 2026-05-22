# Final QA Project

## Descriere generala

Acest proiect reprezinta un proiect de automatizare QA realizat in Java, avand ca scop testarea automata a unei aplicatii web atat din punct de vedere UI (User Interface), cat si API.

Proiectul a fost realizat folosind Selenium WebDriver pentru automatizarea interfetei grafice si RestAssured pentru partea de API testing. Organizarea proiectului a fost facuta utilizand modelul Page Object Model (POM), impreuna cu framework-ul TestNG si sistemul de build Maven.

Pentru partea de UI testing a fost folosita platforma Practice Software Testing, iar pentru API testing a fost utilizat serviciul JSONPlaceholder.

---

# Tehnologii utilizate

In cadrul proiectului au fost utilizate urmatoarele tehnologii si librarii:

- Java
- Selenium WebDriver
- TestNG
- RestAssured
- Maven
- IntelliJ IDEA
- ChromeDriver

---

# Structura proiectului

Proiectul este organizat pe mai multe pachete pentru a separa logica aplicatiei si pentru a respecta structura specifica Page Object Model.

## Pachetul `pages`

Acest pachet contine clasele Page Object care definesc elementele si actiunile disponibile in paginile aplicatiei.

Clase utilizate:
- `HomePage`
- `LoginPage`

---

## Pachetul `tests`

Acest pachet contine clasele de test pentru partea de UI automation.

Clase utilizate:
- `HomePageTest`
- `LoginTest`

---

## Pachetul `api`

Acest pachet contine testele automate pentru endpoint-urile API.

Clasa utilizata:
- `ApiTest`

---

## Pachetul `base`

Acest pachet contine clasa de baza folosita pentru initializarea browserului si configurarea Selenium WebDriver.

Clasa utilizata:
- `BaseTest`

---

# Teste UI implementate

In cadrul proiectului au fost realizate urmatoarele teste automate pentru interfata aplicatiei:

1. Verificarea titlului paginii principale.
2. Cautarea unui produs folosind bara de search.
3. Sortarea produselor dupa anumite criterii.
4. Verificarea comportamentului aplicatiei pentru un produs inexistent.
5. Deschiderea paginii de detalii a unui produs.
6. Testarea unui login invalid si verificarea mesajului de eroare.

---

# Teste API implementate

Pentru partea de API testing au fost implementate urmatoarele teste:

1. GET request pentru obtinerea utilizatorilor.
2. POST request pentru crearea unei postari.
3. DELETE request pentru stergerea unei postari.

In cadrul acestor teste au fost verificate:
- status code-urile raspunsurilor;
- transmiterea request-urilor;
- functionarea endpoint-urilor API.

---

# Rularea proiectului

Pentru rularea tuturor testelor:
1. Se deschide fisierul `testng.xml`
2. Se selecteaza optiunea:
   `Run 'testng.xml'`

In urma executiei vor fi rulate automat:
- toate testele UI;
- toate testele API.

---

# Rezultate obtinute

Toate testele implementate au fost executate cu succes, proiectul returnand:
- 9 teste executate;
- 0 erori;
- 0 teste esuate.

---

# Concluzii

Prin realizarea acestui proiect au fost aplicate concepte fundamentale de QA Automation, precum:
- automatizarea testelor UI;
- testarea API;
- utilizarea Selenium WebDriver;
- utilizarea RestAssured;
- organizarea proiectului folosind Page Object Model;
- utilizarea framework-ului TestNG;
- rularea centralizata a testelor prin fisierul `testng.xml`.

Proiectul demonstreaza implementarea unui flux complet de automatizare pentru testarea unei aplicatii web moderne.