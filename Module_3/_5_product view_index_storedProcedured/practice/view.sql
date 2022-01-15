-- tạo view
CREATE VIEW customer_views AS
SELECT cID, cName, cAge
FROM  customer;

-- sửa view
CREATE OR REPLACE VIEW customer_views AS
SELECT cID, cName
FROM customer
WHERE cAge = 20;

-- xóa view
DROP VIEW customer_views;