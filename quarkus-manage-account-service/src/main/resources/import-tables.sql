CREATE TABLE customer (
    idCustomer BIGINT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    documentNumber VARCHAR(8) NOT NULL,
    email VARCHAR(50),
    status VARCHAR(20)
);

INSERT INTO customer(idCustomer, name, documentNumber, email, status)
VALUES (1, 'Jakie', '71659305', 'alarconreyesj@gmail.com', 'ACTIVE');
INSERT INTO customer(idCustomer, name, documentNumber, email, status)
VALUES (2, 'Xiomara', '71659319', 'vila@gmail.com', 'ACTIVE');


CREATE TABLE account (
    idAccount BIGINT PRIMARY KEY,
    idCustomer BIGINT NOT NULL,
    accountType VARCHAR(20) NOT NULL,
    accountNumber VARCHAR(20) NOT NULL UNIQUE,
    balance DOUBLE,
    customerId VARCHAR(50),
    statusAccount VARCHAR(20),
    CONSTRAINT fk_account_customer FOREIGN KEY (idCustomer)
            REFERENCES customer(idCustomer)
);

INSERT INTO account (idAccount, idCustomer, accountType, accountNumber,  balance, customerId, statusAccount)
VALUES (123,1, 'CC', '3132334371', 3000.00,'56565667', 'ACTIVE');

INSERT INTO account (idAccount, idCustomer, accountType, accountNumber, balance, customerId, statusAccount)
VALUES (124,2, 'CE', '3132334372', 5000.00,'56565667', 'INACTIVE');
