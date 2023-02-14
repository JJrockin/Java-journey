CREATE TABLE IF NOT EXISTS cidades (
    id INT unsigned not null auto_increment,
    nome Varchar(255) not null,
    estado_id int unsigned not null,
    area decimal(10,2),
    primary key (id),
    foreign key (estado_id) references estados (id)
);

-- CREATE TABLE IF NOT EXISTS teste (
--     id INT unsigned not null AUTO_INCREMENT PRIMARY KEY
-- );

-- DROP TABLE IF EXISTS teste; -- DROP remove a tabela

