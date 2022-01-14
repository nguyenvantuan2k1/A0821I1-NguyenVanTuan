
SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 
-- kiểm tra tốc độ
EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 

-- thêm chỉ mục
ALTER TABLE customers ADD INDEX idx_customerName(customerName);
-- kiểm tra tốc độ
EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 
-- xóa xhir mục
ALTER TABLE customers DROP INDEX idx_full_name;