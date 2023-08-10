# prices-test

Local installation
--------

- Java 17
- Gradle 8+

Clone
--------

```sh
git clone git@github.com:SebastianGamboa/prices-test.git
```

Project folder
--------

```sh
cd prices-test
```

Run
--------

```sh
./gradlew bootRun
```

Endpoint
--------

### Method

This endpoint allows you to retrieve the price of a product for a brand on a specific date.

`GET` http://localhost:8080/api/price

### Parameters

- `productId` (required): The ID of the product.
- `brandId` (required): The ID of the brand.
- `date` (required): The date for which you want to retrieve the product price. It should be in the format `yyyy-MM-dd HH:mm:ss`.

### Request Example

`GET` http://localhost:8080/api/price?productId=35455&brandId=1&date=2020-06-14T10:00:00

### Response Example

```json
{
  "productId": 35455,
  "brandId": 1,
  "priceListId": 1,
  "price": 35.50,
  "date": "2020-06-14T10:00:00"
}
```
