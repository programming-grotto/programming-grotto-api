create table if not exists users(
    id serial primary key,
    username varchar(50),
    email varchar(100),
    created timestamp without time zone not null
                                DEFAULT (current_timestamp at TIME ZONE 'UTC')
);