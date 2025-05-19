INSERT INTO roles (role) VALUES
    ('Estudiante'),
    ('Propietario'),
    ('Administrador');

INSERT INTO users (name, last_name, email, role_id) VALUES
    ('Juan', 'Pérez', 'juan.perez@example.com', 1),
    ('Ana', 'Gómez', 'ana.gomez@example.com', 2),
    ('Carlos', 'Rodríguez', 'carlos.rodriguez@example.com', 1);

INSERT INTO rooms (description, address, available, user_id) VALUES
    ('Habitación individual amueblada', 'Calle Principal 123', TRUE, 1),
    ('Apartamento de 2 habitaciones', 'Avenida Central 456', FALSE, 2),
    ('Estudio con vista al mar', 'Calle Costanera 789', TRUE, 1);

INSERT INTO posts (title, price, image, status, user_id, room_id) VALUES
    ('Habitación en el centro', 250.00, 'habitacion1.jpg', 'Disponible', 1, 1),
    ('Apartamento amplio', 500.00, 'apartamento2.jpg', 'Alquilado', 2, 2),
    ('Estudio moderno', 300.00, 'estudio3.jpg', 'Disponible', 1, 3);
