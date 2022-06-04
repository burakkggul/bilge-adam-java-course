create database stock;

create table stock(
                      id int8,
                      name varchar(255),
                      quantity int4,
                      bought_price float,
                      sell_price float,
                      stock_code int8,
                      barcode int8,
                      unit_id int8
);

create table unit(
                     id int8,
                     name varchar(255)
);