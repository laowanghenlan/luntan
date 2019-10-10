create table USER
(
    ID           INTEGER  auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        VARCHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    BIO          VARCHAR(256),
    AVATAR_URL   VARCHAR(100),
    constraint USER_PK
        primary key (ID)
);