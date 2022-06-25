drop table if exists member;

create table member
(
    id         bigint not null auto_increment,
    email      varchar(255),
    password   varchar(255),
    has_survey bit,
    primary key (id)
);
