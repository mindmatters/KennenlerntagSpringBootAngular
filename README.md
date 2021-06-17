# Kennenlerntag Template Spring Boot & Angular

Dies ist eine Grundlage für Mini-Projekte für Kennenlerntage mit Bewerbern.

Bitte den main Branch nur für Updates anfassen und am Kennenlerntag einen Branch erstellen.

## Enwicklung mit Docker

Vorraussetzungen:
* Docker

Image erstellen
```
docker image build -t kennenlerntag .
```

Container starten
```
docker image build -t kennenlerntag .
```

Folgende Endpunkte sollten erreichbar sein:
http://localhost:8080/api/v1/data/public/*
http://localhost:8080/api/v1/data/private/*

## Entwicklung ohne Docker

Vorraussetzungen:
* Java 11

Starte spring boot mit gradle
```
./gradlew bootRun
```
