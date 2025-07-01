-- Crear tabla de usabilidad
CREATE TABLE IF NOT EXISTS usability_log (
    id INTEGER PRIMARY KEY, 
    estado VARCHAR(50) CHECK (estado IN ('satisfecho', 'insatisfecho'))
);

-- Insertar datos de ejemplo (relacionados con los IDs de participants)
INSERT INTO usability_log (id, estado) VALUES
    (1, 'satisfecho'),
    (2, 'insatisfecho'),
    (3, 'satisfecho')
ON CONFLICT (id) DO NOTHING;