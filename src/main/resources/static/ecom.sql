
drop table if exists productCategories;
create table productCategories(category_id int, categoryName varchar(255));
insert into productCategories(category_id, categoryName) values(1, 'electronics');
insert into productCategories(category_id, categoryName) values(2, 'mens fashion');
insert into productCategories(category_id, categoryName) values(3, 'womens fashion');
insert into productCategories(category_id, categoryName) values(4, 'baby products');


drop table if exists products;
create table products(id int, name varchar(255), price int(10), stock int, merchant varchar(255), address_line varchar(255), address_pincode int(6), category_id int);
insert into products(id, name, price, stock, merchant, address_line, address_pincode, category_id) values(1, 'dell laptop', 50000, 4, "first merchant", "q", 560001, 1);
insert into products(id, name, price, stock, merchant, address_line, address_pincode, category_id) values(2, 'one plus 6t', 37000, 6, "first merchant", "q", 560001, 1);
insert into products(id, name, price, stock, merchant, address_line, address_pincode, category_id) values(3, 'google pixel 3', 60000, 8, "third merchant", "w", 560003, 1);
insert into products(id, name, price, stock, merchant, address_line, address_pincode, category_id) values(4, 'apple macbook', 100000, 3,"second merchant", "e", 560002, 1);
insert into products(id, name, price, stock, merchant, address_line, address_pincode, category_id) values(5, 'mens trousers', 1500, 20, "second merchant", "e", 560002, 2);
insert into products(id, name, price, stock, merchant, address_line, address_pincode, category_id) values(6, 'mens t-shirts', 500, 25,  "third merchant", "w", 560003, 2);
insert into products(id, name, price, stock, merchant, address_line, address_pincode, category_id) values(7, 'womens jumpsuits', 750, 15, "first merchant", "q", 560001, 3);
insert into products(id, name, price, stock, merchant, address_line, address_pincode, category_id) values(8, 'womens leggings', 500, 10, "second merchant", "e", 560002, 3);
insert into products(id, name, price, stock, merchant, address_line, address_pincode, category_id) values(9, 'baby napkins', 500, 40,  "first merchant", "q", 560001, 4);
insert into products(id, name, price, stock, merchant, address_line, address_pincode, category_id) values(10, 'cradle', 5000, 4, "third merchant", "w", 560003, 4);	



drop table if exists customers;
create table customers(id int, name varchar(255), email varchar(255));
insert into customers(id, name, email) values(1, 'james bond', 'james.bond@mi6.com');
insert into customers(id, name, email) values(2, 'json bourne', 'json.bourne@bourne.com');
insert into customers(id, name, email) values(3, 'ethan hunt', 'ethan.hunt@mi.com');

drop table if exists orders;
create table orders(id int , customer_id int, product_id int, price int, quantity int, tracking_number int, created_date bigint, shipping_address_line varchar(255), shipping_address_pincode int, order_status varchar(255), delivery_date bigint, latest_status_update_date bigint);


drop table if exists admin;
create table admin(id int, name varchar(255));
insert into admin(id, name) values(484, "Thanos");