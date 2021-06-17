# Kennenlerntag Template Spring Boot & Angular

Dies ist eine Grundlage für Mini-Projekte für Kennenlerntage mit Bewerbern.

Bitte den main Branch nur für Updates anfassen und am Kennenlerntag einen Branch erstellen.

## Entwicklungsumgebung

Folgende Endpunkte sollten erreichbar sein:
http://localhost:8080/api/v1/data/public/*
http://localhost:8080/api/v1/data/private/*

### Enwicklung mit Docker Compose

Vorraussetzungen:
* Docker
* Docker Compose

```
docker compose up
```

### Enwicklung mit Docker

Vorraussetzungen:
* Docker

Image erstellen (im Ordner kennenlerntag-spring-boot)
```
docker image build -t kennenlerntag .
```

Container starten
```
docker image build -t kennenlerntag .
```

### Entwicklung ohne Docker

Vorraussetzungen:
* Java 11

Starte spring boot mit gradle (im Ordner kennenlerntag-spring-boot)
```
./gradlew bootRun
```
