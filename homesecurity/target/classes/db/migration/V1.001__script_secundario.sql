create table bio_entrada (

    id                    UUID          NOT NULL,
    individuo_id          UUID          NOT NULL,
    sensor_biometrico_id  UUID          NOT NULL,
    data_hora             TIMESTAMP     NOT NULL DEFAULT NOW(),

    CONSTRAINT bio_entrada_key
            PRIMARY KEY (id),

    CONSTRAINT bio_entrada_individuo_fk
    		FOREIGN KEY (individuo_id) REFERENCES individuo(id)
);

create table bio_saida (

        id                    UUID          NOT NULL,
        individuo_id          UUID          NOT NULL,
        sensor_biometrico_id  UUID          NOT NULL,
        data_hora             TIMESTAMP     NOT NULL DEFAULT NOW(),

        CONSTRAINT bio_saida_key
                PRIMARY KEY (id),

        CONSTRAINT bio_saida_individuo_fk
        		FOREIGN KEY (individuo_id) REFERENCES individuo(id)
);