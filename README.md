# PersonApi
This is a simple RESTful API that would allows a front end app to create, update, delete, and retrieve a contact

## Starting application
Clone down this application

```
git clone https://github.com/dpmpv92/personAPI.git 
```

You can start it very simply by using the gradle wrapper

For windows 
```
gradlew.bat bootRun
```
For linux/mac
```
./gradlew bootRun
```
## API


POST http://localhost:8080/persons to create a person


```json
{
    "name": "Essie Vaill",
    "company": "Litronic Industries",
    "favorite": false,
    "smallImageURL": "https://s3.amazonaws.com/technical-challenge/images/image1_small.jpeg",
    "largeImageURL": "https://s3.amazonaws.com/technical-challenge/images/image1_large.jpeg",
    "email": "essie@vaill.com",
    "website": "http://www.solstice-mobile.com",
    "birthdate": "1382659557",
    "phone": {
        "work": "602-252-4827",
        "home": "602-252-4009",
        "mobile": "650-252-4010"
    },
    "address": {
        "street": "28 W 27th St",
        "city": "New York",
        "state": "NY",
        "country": "US",
        "zip": "10001",
        "latitude": 40.74478,
        "longitude": -73.989872
    }
}
```

GET http://localhost:8080/persons/{id} to get a person

DELETE http://localhost:8080/persons/{id} to delete a person

PATCH http://localhost:8080/persons/{id} to update a field on a person

```json
{
    "name": "new name"
}
```

PUT http://localhost:8080/persons/{id} to update the whole record

```json
{
    "name": "new Name",
    "company": "new company",
    "favorite": false,
    "smallImageURL": "https://s3.amazonaws.com/technical-challenge/images/image1_small.jpeg",
    "largeImageURL": "https://s3.amazonaws.com/technical-challenge/images/image1_large.jpeg",
    "email": "new@vemail.com",
    "website": "http://www.new-website.com",
    "birthdate": "1382659557",
    "phone": {
        "work": "602-252-4827",
        "home": "602-252-4009",
        "mobile": "650-252-4010"
    },
    "address": {
        "street": "new street",
        "city": "new city",
        "state": "NY",
        "country": "US",
        "zip": "10001",
        "latitude": 40.74478,
        "longitude": -73.989872
    }
}
```

Note:

"favorite" is a boolean

"latitude" and "longitude" are signed floating point numbers

"birthdate" is returned in Unix time format but will accept Unix time and ISO 8601 format

the "phone" object has the following phone available type: "work", "home", "mobile", "other", "fax", "bussines"


