CREATE TABLE IF NOT EXISTS prefeitos (
    id int UNSIGNED not null AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cidade_id int unsigned,
    PRIMARY KEY (id),
    UNIQUE KEY (cidade_id),
    FOREIGN KEY (cidade_id) references cidades (id)
);