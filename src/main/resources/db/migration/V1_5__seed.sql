INSERT INTO products (id, name) VALUES (35455, 'White Shirt');

INSERT INTO brands (id, name) VALUES (1, 'Zara');

INSERT INTO prices_list (id, name) VALUES
(1, 'P1'),
(2, 'P2'),
(3, 'P3'),
(4, 'P4');

INSERT INTO prices (
    brand_id,
    product_id,
    price_list_id,
    price,
    currency,
    priority,
    start_date,
    end_date
) VALUES (
     1,
     35455,
     1,
     35.50,
     'EUR',
     0,
     '2020-06-14 00:00:00',
     '2020-12-31 23:59:59'
 ), (
    1,
    35455,
    2,
    25.45,
    'EUR',
    1,
    '2020-06-14 15:00:00',
    '2020-06-14 18:30:00'
), (
    1,
    35455,
    3,
    30.50,
    'EUR',
    1,
    '2020-06-15 00:00:00',
    '2020-06-15 11:00:00'
), (
     1,
     35455,
     4,
     38.95,
     'EUR',
     1,
     '2020-06-15 16:00:00',
     '2020-12-31 23:59:59'
 );
