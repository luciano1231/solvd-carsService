INSERT INTO mydb.brands VALUES (9, "Toyota", 7);
INSERT INTO mydb.models VALUES (12, "Corolla");
INSERT INTO mydb.customers VALUES (default,"Facunda", "facundah@gmail.com",225518,19981002);
INSERT INTO mydb.cities VALUES (11, "Toronto");
INSERT INTO mydb.countries VALUES (11, "Argentina",5);
INSERT INTO mydb.request VALUES (default, 20200511,4,3,3,4,150,3);

UPDATE mydb.request
SET total = 250
WHERE date_payment = 20200418;

UPDATE mydb.customers
SET name = 'Luciana'
WHERE name = "Luciano";

DELETE FROM mydb.cities 
WHERE name = "Corrientes";

DELETE FROM mydb.brands 
WHERE description = "Toyota";

DELETE FROM mydb.models
WHERE description = "Laguna";

SELECT *
FROM mydb.coverages;

SELECT *, count(amount)
FROM mydb.coverages cv
HAVING cv.amount < 200
ORDER BY details;

SELECT *, avg(amount)
FROM mydb.coverages cv
HAVING COUNT(*) > 2 
ORDER BY details;



SELECT *
FROM mydb.brands 
ORDER BY description;

SELECT *, count(*)
FROM mydb.products
HAVING (details) = "good"
ORDER BY (id) DESC;

SELECT co.name "Country",c.name "City"
FROM mydb.cities c
JOIN mydb.countries co
ON c.id = co.cities_id
HAVING (c.name) = "tokelau";

SHOW VARIABLES WHERE VARIABLE_NAME in("hostname", "port");

SELECT * 
from mydb.customers cu
INNER JOIN mydb.phones ph ON cu.id = ph.customers_id
INNER JOIN mydb.request rq ON cu.id = rq.customers_id
INNER JOIN mydb.employees em ON em.id = rq.employees_id
INNER JOIN mydb.offices off ON em.id = rq.id
INNER JOIN mydb.payments pay ON pay.id = rq.payments_id
INNER JOIN mydb.products pro ON pro.id = rq.products_id
INNER JOIN mydb.coverages cvr ON cvr.id = pro.coverages_id
INNER JOIN mydb.houses ho ON ho.id = pro.houses_id
ORDER BY  cu.name;






