CREATE TABLE IF NOT EXISTS task (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    description VARCHAR(1000),
    category VARCHAR(255),
    due_date TIMESTAMP,
    completed BOOLEAN
);
