create table sensor_biometrico (
    id           UUID            NOT NULL,
    codigo       varchar(256)    NOT NULL,
    status       varchar(256)    NOT NULL,
    comodo_id    UUID            NOT NULL,

    CONSTRAINT sensor_biometrico_key
            PRIMARY KEY (id)
);