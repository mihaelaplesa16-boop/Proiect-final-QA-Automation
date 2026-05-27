# Final QA Automation Project

## Descriere generala

Acest proiect reprezinta un framework de automatizare QA realizat in Java, avand ca scop testarea automata a unei aplicatii web atat din punct de vedere UI, cat si API.

Pentru partea de UI automation am utilizat Selenium WebDriver impreuna cu TestNG, iar pentru partea de API testing am folosit RestAssured. Proiectul a fost organizat folosind Page Object Model (POM), pentru o separare mai clara intre logica paginilor si logica testelor.

Aplicatia folosita pentru testarea UI a fost platforma Practice Software Testing, iar pentru API testing a fost utilizata platforma JSONPlaceholder.

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
- WebDriverManager
- Extent Reports

---

# Structura proiectului

Proiectul este organizat pe mai multe pachete pentru o structura mai clara si mai usor de intretinut.

```text
src
│
├── main
│   ├── java
│   │   ├── config
│   │   │   └── TestConfig.java
│   │   │
│   │   ├── pages
│   │   │   ├── HomePage.java
│   │   │   └── LoginPage.java
│   │   │
│   │   └── utils
│   │       └── DriverFactory.java
│   │
│   └── resources
│       └── config.properties
│
└── test
    └── java
        ├── api
        │   └── ApiTest.java
        │
        ├── base
        │   └── BaseTest.java
        │
        ├── reports
        │   └── ExtentReportManager.java
        │
        └── tests
            ├── HomePageTest.java
            └── LoginTest.java
```

---

# Explicarea structurii proiectului

## pages
Acest pachet contine clasele Page Object. Aici sunt definite elementele si actiunile disponibile in paginile aplicatiei.

Clase utilizate:
- HomePage
- LoginPage

---

## tests
Acest pachet contine testele automate pentru partea de UI.

Clase utilizate:
- HomePageTest
- LoginTest

---

## api
Acest pachet contine testele automate pentru API testing realizate cu RestAssured.

Clasa utilizata:
- ApiTest

---

## base
Contine clasa BaseTest, folosita pentru initializarea browserului si configurarea generala a testelor.

---

## utils
Contine DriverFactory, clasa responsabila pentru crearea si gestionarea browserului utilizat in teste.

---

## config
Contine configuratiile proiectului si citirea valorilor din fisierul config.properties.

---

## reports
Contine configurarea Extent Reports pentru generarea rapoartelor HTML dupa executia testelor.

---

# Teste UI implementate

In cadrul proiectului au fost realizate urmatoarele teste automate pentru interfata aplicatiei:

1. Verificarea titlului paginii principale;
2. Cautarea unui produs;
3. Sortarea produselor;
4. Verificarea unui produs inexistent;
5. Deschiderea paginii unui produs;
6. Testarea unui login invalid si verificarea mesajului de eroare.

---

# Teste API implementate

Pentru partea de API testing au fost implementate urmatoarele request-uri:

1. GET request – pentru obtinerea unor date;
2. POST request – pentru trimiterea si crearea unor date noi;
3. DELETE request – pentru stergerea unor date.

In cadrul acestor teste au fost verificate:
- codurile de status HTTP;
- raspunsurile serverului;
- functionarea endpoint-urilor API.

---

# DriverFactory

Pentru o organizare mai buna a proiectului a fost implementata clasa DriverFactory, responsabila pentru:
- initializarea browserului;
- configurarea WebDriver-ului;
- gestionarea browserului utilizat in teste.

---

# Configurarea proiectului

Configuratiile principale ale proiectului sunt pastrate in fisierul:

```text
config.properties
```

Aici sunt definite:
- browserul utilizat;
- URL-ul aplicatiei testate.

Aceste configuratii sunt citite automat prin clasa TestConfig.

---

# Raport de executie

Pentru generarea rapoartelor HTML a fost utilizata libraria Extent Reports.

Dupa rularea testelor prin fisierul:

```text
testng.xml
```

este generat automat raportul:

```text
target/ExtentReport.html
```

Raportul contine:
- testele executate;
- testele trecute;
- eventualele erori;
- timpul de executie.

---

# Rularea proiectului

Pentru rularea tuturor testelor:
1. Se deschide fisierul `testng.xml`;
2. Se selecteaza optiunea:
   `Run 'testng.xml'`.

Vor fi executate automat:
- toate testele UI;
- toate testele API.

---

# Concluzii

Prin realizarea acestui proiect am aplicat concepte importante de QA Automation precum:
- UI testing;
- API testing;
- Selenium WebDriver;
- RestAssured;
- Page Object Model;
- TestNG;
- DriverFactory;
- configurarea externa a proiectului;
- generarea rapoartelor HTML.

Proiectul demonstreaza implementarea unui framework complet de automatizare pentru testarea unei aplicatii web moderne.