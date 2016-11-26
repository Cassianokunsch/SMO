UPDATE pessoa
  SET pessoa.nome = 'Cassiano'
WHERE pessoa.idpessoa = 2;

UPDATE motorista
SET motorista.email = 'cassiano@emil.com'
WHERE motorista.idpessoa = 1;

UPDATE aparelho
SET aparelho.modelo = '4353453'
WHERE aparelho.idaparelho = 4;

UPDATE caixa
SET caixa.identificacao = 'Caixa 03'
WHERE caixa.idcaixa = 5;

UPDATE receptor
SET receptor.telefone = '(34)44444444'
WHERE receptor.idpessoa = 4;

UPDATE orgao
SET orgao.orgao = 'Cornea'
WHERE orgao.idorgao = 4
