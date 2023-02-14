select * FROM `estados` where id = 25

INSERT INTO cidades (nome, area, estado_id)
values ('Campinas', 795, 25)

INSERT INTO cidades (nome, area, estado_id)
values ('Niterói', 133.9, 19)

INSERT INTO cidades (nome, area, estado_id)
values(
    'Caruaru',
    920.6,
    (SELECT id FROM `estados` WHERE sigla = 'PE')
    );
    
INSERT INTO cidades (nome, area, estado_id)
values(
    'Juazeiro do Norte',
    248.2,
    (SELECT id FROM `estados` WHERE sigla = 'CE')
    )

select * from cidades

