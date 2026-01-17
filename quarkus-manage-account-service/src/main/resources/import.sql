INSERT INTO customer(idCustomer, name, documentNumber, email, status)
VALUES (1, 'Jakie', '71659305', 'alarconreyesj@gmail.com', 'ACTIVE');
INSERT INTO customer(idCustomer, name, documentNumber, email, status)
VALUES (2, 'Xiomara', '71659319', 'vila@gmail.com', 'ACTIVE');


INSERT INTO account (idAccount, idCustomer, accountType, accountNumber,  balance, customerId, statusAccount)
VALUES (123,1, 'CC', '3132334371', 3000.00,'56565667', 'ACTIVE');
INSERT INTO account (idAccount, idCustomer, accountType, accountNumber, balance, customerId, statusAccount)
VALUES (124,1, 'CE', '3132334372', 5000.00,'56565667', 'INACTIVE');
INSERT INTO account (idAccount, idCustomer, accountType, accountNumber, balance, customerId, statusAccount)
VALUES (125,2, 'CE', '3132334373', 5000.00,'56565667', 'INACTIVE');
