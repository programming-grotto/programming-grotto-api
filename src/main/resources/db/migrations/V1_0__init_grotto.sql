create table if not exists users(
    id serial primary key,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    username varchar(50) not null,
    email varchar(100) not null,
    created timestamp without time zone not null
                                DEFAULT (current_timestamp at TIME ZONE 'UTC')
);