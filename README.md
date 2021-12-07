# Microservice Product

### Endpoints:


#### Save Product


````
POST /api/product HTTP/1.1
Host: localhost:3333
Authorization: Basic base64(username:password)
Content-Type: application/json
Content-Length: 52

{
    "productName" : "test",
    "price" : 1.2
}
````



#### Get Products

````

GET /api/product HTTP/1.1
Host: localhost:3333
Authorization: Basic base64(username:password)

````

#### Delete Product

````
DELETE /api/product/0 HTTP/1.1
Host: localhost:3333

````