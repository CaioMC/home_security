create table individuo (
    id         UUID            NOT NULL,
    nome       varchar(256)    NOT NULL,

    CONSTRAINT individuo_key
            PRIMARY KEY (id)
);