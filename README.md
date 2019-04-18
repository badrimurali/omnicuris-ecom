# omnicuris-ecom
Sample E-Commerce backend assignment


# Intructions to run server.
**1. Replace username and password in application.yml with your mysql username and password.**

**2. Run resources/static/ecom.sql to create sample database and tables.**

**3. Install gradle dependencies**

**4. Run OmniecomApplication file.**

**5. Server will start to run with a message OmniecomApplication started**


# ORDERS API:

**1. Place Order**

url = http://localhost:8080/order
method = POST
request body = {
                	"customerId":1,
                	"productId":2,
                	"quantity": 2,
                	"shippingAddressLine": "xyz",
                	"shippingAddressPincode": 560001
                }




**2. Cancel Order**

url = http://localhost:8080/order/{orderId}
method = DELETE


**3. All Accepted, dispatched, delivered orders of customer**

url = http://localhost:8080/order/all/{customerId}
method = GET

**4. Mark Delivery**

url = http://localhost:8080/order/markDelivery/{orderId}
method = GET



# CUSTOMER API:


**1. Save or Edit Customer**

url = http://localhost:8080/customer/saveOrEdit
method = POST
request body = {
                	"name": "bruce wayne",
                	"email": "brucewayne@wayneenterprises.com"
                }


# Products API:


**1. Save or Edit Product**
url = http://localhost:8080/product/saveOrEdit
method = POST
request body = {
               	"name":"lenovo laptop",
               	"price":65000,
               	"stock": 12,
               	"merchant":"fourth merchant",
               	"addressLine":"r",
               	"addressPincode":560004,
               	"categoryId": 1
               }


**2. Get Product**
url = http://localhost:8080/product/{productId}
method = GET


**3. Get All Products**
url = http://localhost:8080/product/all
method = GET


**Delete Product**
url = http://localhost:8080/product/{productId}
method = DELETE


