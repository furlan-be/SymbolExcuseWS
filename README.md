# Projet Java avec Spring Boot et MongoDB

Java 17, Spring Boot, MongoDB

## Démo en ligne

Vous pouvez tester l'application en ligne à l'adresse suivante (GCP App Engine) :

[https://rbxhome.nw.r.appspot.com/excuses](https://rbxhome.nw.r.appspot.com/excuses)

## Démarrage

```bash
mvn clean install
mvn spring-boot:run
```

## Routes

Pour obtenir la liste des excuses, vous pouvez utiliser la route suivante :
- GET excuses : [http://localhost:8080/excuses](http://localhost:8080/excuses)
- POST excuses : [http://localhost:8080/excuses](http://localhost:8080/excuses)

Avec un body de type JSON :
```json
{
  "httpCode": 988,
  "tag": "CUSTOM_TAG",
  "message": "Custom message"
}
```


