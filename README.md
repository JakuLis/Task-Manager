📝 Task Manager

Task Manager to aplikacja konsolowa napisana w Javie, służąca do zarządzania zadaniami. Umożliwia użytkownikowi dodawanie, usuwanie, aktualizowanie oraz przeglądanie listy zadań. Projekt został zaprojektowany z wykorzystaniem podstawowych zasad programowania obiektowego (OOP).

📋 Funkcjonalności

Dodawanie zadania: Tworzenie nowego zadania, które zawiera nazwę, opis, status i datę.

Usuwanie zadania: Możliwość usunięcia istniejącego zadania z listy po jego numerze ID.

Aktualizacja zadania: Edycja istniejących informacji o zadaniu, takich jak nazwa oraz opis.

Wyświetlanie listy zadań: Przegląd wszystkich zadań w czytelnej formie konsolowej.

📦 Wykorzystywane technologie

Java: Implementacja projektu.

Zasady OOP: W projekcie zaimplementowano wszystkie kluczowe filary programowania obiektowego.

Abstrakcja: Zadania są reprezentowane jako obiekty klasy Task.

Dziedziczenie: Możliwość rozszerzenia w przyszłości (np. inne typy zadań).

Polimorfizm: Możliwość różnej implementacji w ramach systemu zadań.

Enkapsulacja: Użycie prywatnych pól i metod dostępnych przez gettery i settery.

⚙️ Jak uruchomić projekt?

Skonfiguruj środowisko

Zainstaluj JDK (Java Development Kit) w wersji 8 lub nowszej.
Upewnij się, że masz zainstalowaną Javę na swoim komputerze i skonfigurowaną zmienną środowiskową JAVA_HOME.

Uruchom projekt
Skopiuj kod projektu na swój komputer.
Otwórz projekt w IntelliJ IDEA lub innym środowisku wspierającym Javę.
Uruchom klasę Main.java, aby rozpocząć korzystanie z aplikacji.

🧩 Struktura projektu

Task: Klasa reprezentująca pojedyncze zadanie. 

TaskManager: Klasa odpowiedzialna za zarządzanie listą zadań. Obsługuje operacje CRUD (Create, Read, Update, Delete).

Main: Punkt wejścia do aplikacji. Obsługuje interakcję użytkownika przez konsolę i wywołuje odpowiednie metody klasy TaskManager.

📚 Przykład działania

Dodanie i wyświetlenie dwóch aktywnosci:

![image](https://github.com/user-attachments/assets/543b52e4-f526-41ef-8426-b17522226140)
![image](https://github.com/user-attachments/assets/47cd1016-ef99-4bd6-9064-322834638bbe)

Edycja zadania:

![image](https://github.com/user-attachments/assets/06b4e392-1720-4d5f-adf4-f2b5cee11fc2)

Usunięcie aktywności i zamknięcie programu:

![image](https://github.com/user-attachments/assets/b0e08f77-5e58-4032-9d67-6c0678548cd0)

🚀 Pomysły na dalszy rozwój

Dodanie opcji zapisu i odczytu zadań do/z pliku tekstowego.

Rozszerzenie statusów o bardziej szczegółowe etapy (np. BLOCKED) czy statusy.

Wprowadzenie daty wykonania zadania i przypomnienia o zbliżającym się terminie.
