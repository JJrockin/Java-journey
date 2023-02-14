ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

insert INTO empresas (nome, cnpj)
values 
    ('Bradesco', 83321166000137),
    ('Vale', 58216219000102),
    ('Cielo', 70242378000187);

desc empresas -- descreve como a tabela foi construida

select * from empresas;
select * from cidades;

INSERT INTO empresas_unidades
    (empresa_id, cidade_id, sede)
values
    (1, 1, 1),
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1);