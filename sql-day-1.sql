-- create a product table having fields like prod_id, prod_name, prod_desc, price
create table product
(	prod_id integer unique not null,
	prod_name varchar(10),
	prod_desc text,
	price numeric(5,2)
);
-- insert some rows
insert into product(prod_id, prod_name, prod_desc, price) values
(
	1,'A','abc',10.00
),
(
	2,'B','def',20.00
),
(
	3,'C','ghi',30.00
),
(
	4,'D','jkl',40.00
),
(
	5,'E','mno',50.00
);

--add another column 'prod_category' in product table
alter table product
add column prod_category varchar(10);

--update prod_category for existing rows
update product
set prod_category = 'firstThree' where prod_id in(1,2,3);

update product
set prod_category = 'secondTwo' where prod_id in(4,5);

-- waq to fetch count of products in each category
select prod_category, count(*)
from product
group by prod_category;

-- display only those categories with more than 2 product
select prod_category, count(*)
from product
group by prod_category 
having count(*)>1;

-- sort based on count in ascending order
select prod_category, count(*) as count_product
from product
group by prod_category 
having count(*)>1
order by count_product asc;

-- waq to fetch product having second highest price
select prod_name, price 
from product 
where price = (
	select max(price) 
	from product 
	where price < (
			select max(price)
			from product)
	);


-- update the price of all the firstThree items so that the new price is 10% less than the original price
update product
set price = price-price*0.10 
where prod_category = 'firstThree';

-- delete the products whose price is less than the average price of all the products
delete from product where price > 
(select avg(price) from product);

-- delete product category wise whose price is less than the average price of all the products
--9 and 40 should get deleted

delete from product where prod_name in(
select p1.prod_name from product p1
where price <
(select avg(price)
from product p2
where p1.prod_category=p2.prod_category));

-- create an orders table having fields as ord_id, ord_type and prod_id as foreign key 
-- Also ensure that whenever data changes in the parent table, it should get reflected in the child table
create table orders
(
ord_id serial primary key,
ord_type varchar(20),
ord_date date,
prod_id integer,
foreign key (prod_id) references product(prod_id)
on delete cascade
on update cascade
);

-- add 5 rows in the orders table
insert into orders
(ord_type, ord_date, prod_id)
values
('newOrder','2026-02-17',1),
('newOrder', '2026-02-17',1)
('repeatOrder','2026-03-17',2),
('newOrder','2026-04-17',3),
('repeatOrder','2026-05-17',4),
('newOrder','2026-06-17',5);


-- fetch the product which has most number of orders
select *
from product
where prod_id =(select prod_id
					from orders
					group by prod_id
					order by count(*) desc
					limit 1
					)


--delete a product from product table and make sure thr order entry is also deleting
delete from product
where prod_id = 5;


select * from product;

select * from orders;