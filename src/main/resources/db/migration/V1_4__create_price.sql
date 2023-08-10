CREATE TABLE IF NOT EXISTS prices (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    brand_id INT NOT NULL,
    product_id INT NOT NULL,
    price_list_id INT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    currency VARCHAR(3) NOT NULL,
    priority INT,
    start_date TIMESTAMP NOT NULL,
    end_date TIMESTAMP NOT NULL,
    FOREIGN KEY (brand_id) REFERENCES brands (id),
    FOREIGN KEY (product_id) REFERENCES products (id),
    FOREIGN KEY (price_list_id) REFERENCES prices_list (id)
);