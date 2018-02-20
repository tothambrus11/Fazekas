# 1. Feladat OOP

Egy robot controller működését fogjuk egyszerűen modellezni, ahol a controlleren található gombok állapotát fogjuk vizsgálni. Az osztályok leírása az alábbi:

## Button class:

### Tagváltozók:
```Java
private String ID
```

Privát láthatóság, megadja a controlleren található gomb azonostóját

```Java
private boolean pressed
```
Privát láthatóság, megadja, hogy az adott gomb megvan-e nyomva. True, ha meg van nyomva, false, ha nincs.

### Konstruktor:
```Java
public Button(String ID, boolean pressed) 
```
Beállítja az ID-t és a pressed tagváltozók értékeit a paraméterül kapott értékekre. 

### Műveletek:

```Java
public String getID()
```
Visszatér az adott gomb ID-jával. 


```Java
public void setState(boolean pressed)
```
Beállítja az adott gomb állapotát a paraméterül kapott értékre. 


```Java
public boolean getState()
```
Visszatér az adott gomb pressed értékével. 


## Controller class: 

### Tagváltozók:

```Java
private ArrayList<Button> buttons
```
Privát láthatóság, tárolja a Button objektumokat egy ArrayList-ben.

### Konstruktor:
```Java
public Controller()
```
Példányosítja a buttons ArrayList-et. 

### Műveletek:
```Java
public void addButton(Button b)
```
Hozzáadja a paraméterül kapott Button objektumot az ArrayList-hez.

```Java
public void pressAll()
```

Az összes gomb állapotát beállítja megnyomottra.

```Java
public void releaseAll()
```
Az összes gomb állapotát beállítja elengedett állapotúra. 

```Java
public int getNumOfPressedBtns()
```
Visszatér a lenyomott gombok számával.

## Main class:

A main függvényben az alábbi műveletek végezzük el:
```Java
Controller ctrl = new Controller();
```
Példányosítsunk egy Controller-t, amihez majd a gombokat adjuk hozzá.

Adjunk hozzá 4 gombot a Controller-hez:

ID: "A" Pressed: true

ID: "B" Pressed: false

ID: "X" Pressed: false

ID: "Y" Pressed: true

Írjuk ki a nyomva tartott gombok számát. (Elvárt kimenet: 2)
Pl. Így:
```Java
System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
```

Hívjuk meg a Controller objektumon a pressAll() metódust. 

Írjuk ki most a nyomva tartott gombok számát. (Elvárt kimenet: 4)

Hívjuk meg a Controller objektumon a releaseAll() metódust. 

Írjuk ki most a nyomva tartott gombok számát. (Elvárt kimenet: 0)

 # 2. feladat Egyszerű algoritmizálós feladat
 
## Iker-majdnem-prímek

Egy természetes számot "majdnem prímnek" nevezünk, ha felírható két (nem feltétlenül különbözõ) prímszám szorzataként. Ha két szomszédos természetes szám is "majdnem prím", akkor nevezzük ezeket "iker-majdnem-prímeknek". Ilyen például a 9 és a 10, hiszen 9=3×3, illetve 10=2×5, azaz mindketten "majdnem prímek", és szomszédosak. A feladat olyan program írása, mely egy megadott határig elõállítja az összes "iker-majdnem-prím" párokat.

Ha a fenti feladatot nehéznek találjuk, akkor választhatjuk ezt a feladatot is (kevesebb pontért):  

Kérj be a felhasználótól egy n számot. Írd ki az összes olyan (i;j) párt, amelyre 1<i<j≤n, és igaz az, hogy i+j prím. Pl. n=6 esetén 2+3=5, 3+4=7 stb.

# 3. feladat Feltöltés github repository-ba

Készíts egy új repostiroty-t GitHub-on JavaTest néven. Ide töltsd fel a megoldásaidat. A két feladat lehetőleg két külön mappába kerüljön. Ezután a repository linkjét küldd el a bacsi.sandor93[kukac]gmail.com e-mail címre. 

