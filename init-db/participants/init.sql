-- Crear tabla de participantes
CREATE TABLE IF NOT EXISTS participant (
    id SERIAL PRIMARY KEY, 
    nombre VARCHAR(100), 
    apellido VARCHAR(100), 
    correo VARCHAR(100)
);

-- Insertar datos de ejemplo
INSERT INTO participant (nombre, apellido, correo) VALUES
    ('Ana', 'García', 'ana.garcia@email.com'),
    ('Carlos', 'Rodríguez', 'carlos.rodriguez@email.com'),
    ('María', 'López', 'maria.lopez@email.com')
ON CONFLICT (id) DO NOTHING;