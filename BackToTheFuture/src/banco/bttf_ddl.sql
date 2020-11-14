-- Gerado por Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   em:        2020-11-13 02:49:27 BRST
--   site:      Oracle Database 12cR2
--   tipo:      Oracle Database 12cR2


/*
-- DROP TABLE t_bttf_artista CASCADE CONSTRAINTS;

-- DROP TABLE t_bttf_evento CASCADE CONSTRAINTS;

-- DROP TABLE t_bttf_personagem CASCADE CONSTRAINTS;

-- DROP TABLE t_bttf_personagem_evento CASCADE CONSTRAINTS;
*/

CREATE TABLE t_bttf_artista (
    id_artista     NUMBER(10) NOT NULL,
    nm_artista     VARCHAR2(80) NOT NULL,
    dt_nascimento  DATE NOT NULL
);

CREATE TABLE t_bttf_evento (
    id_evento        NUMBER(10) NOT NULL,
    dt_evento        DATE NOT NULL,
    ds_evento        VARCHAR2(2000) NOT NULL,
    ds_local_evento  VARCHAR2(500) NOT NULL,
    fl_viagem_tempo  CHAR(1) NOT NULL
);

CREATE TABLE t_bttf_personagem (
    id_personagem  NUMBER(10) NOT NULL,
    id_artista     NUMBER(10) NOT NULL,
    nm_personagem  VARCHAR2(80) NOT NULL,
    dt_nascimento  DATE NOT NULL,
    ds_personagem  VARCHAR2(2000) NOT NULL
);

CREATE TABLE t_bttf_personagem_evento (
    id_personagem_evento  NUMBER(10) NOT NULL,
    id_evento             NUMBER(10) NOT NULL,
    id_personagem         NUMBER(10) NOT NULL
);

ALTER TABLE t_bttf_artista ADD CONSTRAINT pk_bttf_artista PRIMARY KEY ( id_artista );

ALTER TABLE t_bttf_evento ADD CONSTRAINT pk_bttf_evento PRIMARY KEY ( id_evento );

ALTER TABLE t_bttf_personagem ADD CONSTRAINT pk_bttf_personagem PRIMARY KEY ( id_personagem );

ALTER TABLE t_bttf_personagem_evento ADD CONSTRAINT pk_bttf_personagem_evento PRIMARY KEY ( id_personagem_evento );

ALTER TABLE t_bttf_personagem
    ADD CONSTRAINT fk_bttf_art_pers FOREIGN KEY ( id_artista )
        REFERENCES t_bttf_artista ( id_artista );

ALTER TABLE t_bttf_personagem_evento
    ADD CONSTRAINT fk_bttf_even_pers FOREIGN KEY ( id_evento )
        REFERENCES t_bttf_evento ( id_evento );

ALTER TABLE t_bttf_personagem_evento
    ADD CONSTRAINT fk_bttf_pers_even FOREIGN KEY ( id_personagem )
        REFERENCES t_bttf_personagem ( id_personagem );

/*
-- DROP SEQUENCE SQ_BTTF_ARTISTA;

-- DROP SEQUENCE SQ_BTTF_EVENTO;

-- DROP SEQUENCE SQ_BTTF_PERSONAGEM;

-- DROP SEQUENCE SQ_BTTF_PERSONAGEM_EVENTO;
*/

CREATE SEQUENCE SQ_BTTF_ARTISTA START WITH 1 INCREMENT BY 1 NOMAXVALUE NOCACHE NOCYCLE ORDER;

CREATE SEQUENCE SQ_BTTF_EVENTO START WITH 1 INCREMENT BY 1 NOMAXVALUE NOCACHE NOCYCLE ORDER;

CREATE SEQUENCE SQ_BTTF_PERSONAGEM START WITH 1 INCREMENT BY 1 NOMAXVALUE NOCACHE NOCYCLE ORDER;

CREATE SEQUENCE SQ_BTTF_PERSONAGEM_EVENTO START WITH 1 INCREMENT BY 1 NOMAXVALUE NOCACHE NOCYCLE ORDER;


-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             4
-- CREATE INDEX                             0
-- ALTER TABLE                              7
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
