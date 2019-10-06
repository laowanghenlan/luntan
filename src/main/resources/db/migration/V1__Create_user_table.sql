create table USER
(
    ID           INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_EDA9501F_E016_405B_81DD_03F9EF267046) auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        VARCHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    constraint USER_PK
        primary key (ID)
);
