SELECT *
FROM estados

SELECT sigla,
    nome as 'Nome dos Estados'
FROM estados
WHERE regiao = 'Nordeste'

SELECT 
    nome,
    regiao,
    populacao
FROM estados
WHERE populacao >= 10
ORDER BY populacao desc