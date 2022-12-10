create table bio_entrada
(
    identificador         uuid        not null,
    individuo_id          uuid        not null,
    sensor_biometrico_id  uuid        not null,
    data_hora             TIMESTAMP    not null,
);

create table bio_saida
(
    identificador         uuid        not null,
    individuo_id          uuid        not null,
    sensor_biometrico_id  uuid        not null,
    data_hora             TIMESTAMP    not null,
);

create table comodo
(
    identificador         uuid          not null,
    nome                  varchar(255)  not null
);

create table individuo
(
    identificador         uuid          not null,
    nome                  varchar(255)  not null
);