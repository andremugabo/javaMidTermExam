CREATE DATABASE PUB_DB;

CREATE TABLE USERS(
    U_ID INT NOT NULL IDENTITY(1, 1),
    U_NAME VARCHAR(50) NOT NULL,
    U_PHONE VARCHAR(50) NOT NULL UNIQUE,
    U_EMAIL VARCHAR(50) NOT NULL UNIQUE,
    U_PASSWORD VARCHAR(50) NOT NULL,
    U_ROLE VARCHAR(50) NOT NULL,
    U_STATUS INT NOT NULL
);

CREATE TABLE P_TYPE(
    PT_ID INT NOT NULL IDENTITY(1, 1),
    PT_NAME VARCHAR(50) UNIQUE,
    PT_STATUS INT
);

CREATE TABLE P_CATEGORY(
    PC_ID INT NOT NULL IDENTITY(1, 1),
    PT_ID INT NOT NULL,
    PC_NAME VARCHAR(50) NOT NULL UNIQUE,
    PC_STATUS NOT NULL INT
);

CREATE TABLE PRODUCTS(
    P_ID INT IDENTITY(1, 1),
    P_CODE VARCHAR(20),
    PT_ID INT NOT NULL,
    PC_ID INT NOT NULL,
    P_NAME VARCHAR(50) NOT NULL,
    P_STATUS INT
);

CREATE TABLE P_PRICE(
    PP_ID INT IDENTITY(1, 1),
    P_ID INT NOT NULL,
    PP_PURCHASE INT NOT NUL,
    PP_PRICE INT NOT NULL,
    PP_DATE TIMESTAMP DEFAULT(CURRENT_TIMESTAMP()),
    PP_STATUS INT NOT NULL
);