CREATE TABLE roles (
    id SERIAL PRIMARY KEY,
    role VARCHAR(255)
);

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    role_id INTEGER,
    FOREIGN KEY (role_id) REFERENCES roles(id)
);

CREATE TABLE rooms (
    id SERIAL PRIMARY KEY,
    description TEXT,
    address VARCHAR(255),
    available BOOLEAN,
    user_id INTEGER,
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE posts (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    price DECIMAL,
    image VARCHAR(255),
    status VARCHAR(50),
    user_id INTEGER,
    room_id INTEGER,
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (room_id) REFERENCES rooms(id)
);