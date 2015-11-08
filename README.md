# Kapitel 5 Übung in der Vorlesung ("Zufallswürfe")

## Übung ohne Array

* Erstellen Sie ein neues Projekt und binden Sie das jar-Archiv ```uebungstools.jar``` aus dem Ordner ```lib``` ein.
* Schreiben Sie ein Programm, welches 50 Würfe mit einem Würfel simuliert und am Ende ausgibt, welche Zahl wie oft gewürfelt wurde.

> Durch ```uebungstools.jar``` das steht Ihnen eine neue Klasse ```Zufall``` mit folgenden
Methoden zur Verfügung:
* ```int getZufallInt(int min, int max)‏```
* ```double getZufallDouble(double min, double max)‏```
* ```boolean getZufallBoolean()‏```
* ```int[] erzeugeIntArray(int groesse)‏```

## Übung mit Arrays

* Schreiben Sie das Programm der letzten Übung derartig um, dass ein ```int[]``` der Größe 6 verwendet wird, um die Häufigkeit der Wurfergebnisse zu speichern.