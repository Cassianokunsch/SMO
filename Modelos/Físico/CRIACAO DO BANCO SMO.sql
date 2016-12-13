CREATE TABLE pessoa
(
    idpessoa INTEGER PRIMARY KEY NOT NULL,
    bairro VARCHAR(150),
    cep VARCHAR(9),
    cidade VARCHAR(50),
    cpf VARCHAR(14),
    endereco VARCHAR(150),
    nascimento DATE,
    nome VARCHAR(150),
    rg VARCHAR(9),
    uf VARCHAR(2),
    d_e_l_e_t_e CHAR
);
CREATE TABLE receptor
(
    email VARCHAR(10),
    telefone VARCHAR(15),
    tipo_sanguineo VARCHAR(3),
    usuario VARCHAR(100),
    idpessoa INTEGER PRIMARY KEY NOT NULL,
    CONSTRAINT fk_j5eo6d0kycg5hfdbf5f2f9jyi FOREIGN KEY (idpessoa) REFERENCES pessoa (idpessoa)
);


CREATE TABLE transplante
(
    idtransplante INTEGER PRIMARY KEY NOT NULL,
    data_transplante DATE,
    usuario VARCHAR(100),
    idpessoa INTEGER NOT NULL,
    CONSTRAINT fk_binpc8t6x9k1vjawtepxrb9k FOREIGN KEY (idpessoa) REFERENCES receptor (idpessoa)
);

CREATE TABLE aparelho
(
    idaparelho INTEGER PRIMARY KEY NOT NULL,
    modelo VARCHAR(30),
    serie VARCHAR(10),
    validade DATE
);
CREATE TABLE caixa
(
    idcaixa INTEGER PRIMARY KEY NOT NULL,
    capacidade INTEGER,
    identificacao VARCHAR(30),
    validade DATE
);
CREATE TABLE doador
(
    hora_obito TIME,
    responsavel VARCHAR(100),
    tipo_sanguineo VARCHAR(3),
    usuario VARCHAR(100),
    idpessoa INTEGER PRIMARY KEY NOT NULL,
    CONSTRAINT fk_di2i4rkp5cgvshwax6nwkbgo5 FOREIGN KEY (idpessoa) REFERENCES pessoa (idpessoa)
);
CREATE TABLE localizacao
(
    idlocalizacao INTEGER PRIMARY KEY NOT NULL,
    hora_loc TIME,
    latitude VARCHAR(10),
    longitude VARCHAR(10)
);
CREATE TABLE motorista
(
    cnh VARCHAR(13),
    email VARCHAR(100),
    telefone VARCHAR(15),
    validade_cnh DATE,
    idpessoa INTEGER PRIMARY KEY NOT NULL,
    CONSTRAINT fk_s8figob80wec1xkv17nqac0pp FOREIGN KEY (idpessoa) REFERENCES pessoa (idpessoa)
);
CREATE TABLE orgao
(
    idorgao INTEGER PRIMARY KEY NOT NULL,
    doador VARCHAR(255),
    hora_captacao TIME,
    orgao VARCHAR(15),
    tempo_vida TIME,
    usuario VARCHAR(100),
    idpessoa INTEGER NOT NULL,
    CONSTRAINT fk_s8ns4us2mi5k35yifvk5ajo0l FOREIGN KEY (idpessoa) REFERENCES transplante (idtransplante)
);

CREATE TABLE responsavel
(
    email VARCHAR(100),
    telefone VARCHAR(15),
    usuario VARCHAR(100),
    idpessoa INTEGER PRIMARY KEY NOT NULL,
    CONSTRAINT fk_1l0o2uagai4kutfybod2txfhd FOREIGN KEY (idpessoa) REFERENCES pessoa (idpessoa)
);
CREATE TABLE temperatura
(
    idtemperatura INTEGER PRIMARY KEY NOT NULL,
    hora_temp TIME,
    termometro_externo VARCHAR(8),
    termometro_interno VARCHAR(8)
);

CREATE TABLE transporte
(
    idtransporte INTEGER PRIMARY KEY NOT NULL,
    data DATE,
    destino VARCHAR(150),
    hora_saida TIME,
    latitude_final VARCHAR(10),
    latitude_inicial VARCHAR(10),
    longitude_final VARCHAR(10),
    longitude_inicial VARCHAR(10),
    motorista VARCHAR(100),
    origem VARCHAR(150),
    temp_final VARCHAR(5),
    temp_inicial VARCHAR(5),
    idaparelho INTEGER NOT NULL,
    idcaixa INTEGER NOT NULL,
    idlocalizacao INTEGER NOT NULL,
    idorgao INTEGER NOT NULL,
    idtemperatura INTEGER NOT NULL,
    CONSTRAINT fk_74s56yntdd8etg2j72tlalh8d FOREIGN KEY (idaparelho) REFERENCES aparelho (idaparelho),
    CONSTRAINT fk_kwgihsc8js5afw0ud807xv3j3 FOREIGN KEY (idcaixa) REFERENCES caixa (idcaixa),
    CONSTRAINT fk_dehc76tjefbk04myj5kvj4phb FOREIGN KEY (idlocalizacao) REFERENCES localizacao (idlocalizacao),
    CONSTRAINT fk_gyp3xsbi4a8nk9uvyscaukrsy FOREIGN KEY (idorgao) REFERENCES orgao (idorgao),
    CONSTRAINT fk_gq6pl5946bkuq9rjjivakocvg FOREIGN KEY (idtemperatura) REFERENCES temperatura (idtemperatura)
);
CREATE TABLE usuario
(
    email VARCHAR(100),
    login VARCHAR(10),
    senha VARCHAR(10),
    telefone VARCHAR(15),
    idpessoa INTEGER PRIMARY KEY NOT NULL,
    CONSTRAINT fk_1w569t26ol7flnlluhngbtjwd FOREIGN KEY (idpessoa) REFERENCES pessoa (idpessoa)
);
