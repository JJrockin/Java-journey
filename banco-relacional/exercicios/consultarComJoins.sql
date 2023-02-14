select * from prefeitos;
select * from cidades;

select * from cidades c inner join prefeitos p on c.id = p.cidade_id;
select * from cidades c left join prefeitos p on c.id = p.cidade_id;
select * from cidades c right outer join prefeitos p on c.id = p.cidade_id;

-- select * from cidades c full join prefeitos p on c.id = p.cidade_id;

select * from cidades c left join prefeitos p on c.id = p.cidade_id
UNION
select * from cidades c right outer join prefeitos p on c.id = p.cidade_id;