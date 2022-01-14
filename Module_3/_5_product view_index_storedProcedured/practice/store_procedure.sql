-- tạo procedure

DELIMITER //

CREATE PROCEDURE findAllCustomers()

BEGIN

  SELECT * FROM customers;

END //

DELIMITER ;

-- gọi 
call findAllCustomers();


-- xóa 

DELIMITER //
DROP PROCEDURE IF EXISTS `findAllCustomers`//

-- tạo lại procedure
CREATE PROCEDURE findAllCustomers()

BEGIN

SELECT * FROM customers where customerNumber = 175;

END //
-- gọi 
call findAllCustomers();