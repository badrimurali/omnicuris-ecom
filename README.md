# omnicuris-ecom
Sample E-Commerce backend assignment


# Intructions to run server.
**1. Replace username and password in application.yml with your mysql username and password.**

**2. Run resources/static/ecom.sql to create sample database and tables.**

**3. Install gradle dependencies**

**4. Run OmniecomApplication file.**

**5. Server will start to run with a message OmniecomApplication started**


# ORDERS API

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