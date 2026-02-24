INSERT INTO users (email, password, name, role)
VALUES ('admin@gmail.com', 'admin', 'Administrator', 'ROLE_ADMIN'),
       ('user@gmail.com', 'secret', 'Premium User', 'ROLE_USER');

INSERT INTO short_urls (short_key, original_url, created_by, created_at, expires_at, is_private, click_count)
VALUES
    -- Rock Classics
    ('pfloyd', 'https://www.youtube.com/watch?v=IXdNnw99-Ic', 1, TIMESTAMP '2024-07-15', NULL, FALSE, 0),
    ('zep-st', 'https://www.youtube.com/watch?v=QkF3oxziUI4', 1, TIMESTAMP '2024-07-16', NULL, FALSE, 0),
    ('queen1', 'https://www.youtube.com/watch?v=fJ9rUzIMcZQ', 1, TIMESTAMP '2024-07-17', NULL, FALSE, 0),
    ('acdc01', 'https://www.youtube.com/watch?v=v2AC41dglnM', 1, TIMESTAMP '2024-07-18', NULL, TRUE, 0),

    -- Gameplays & Trailers
    ('eldenr', 'https://www.youtube.com/watch?v=AKXiKBnzpBQ', 1, TIMESTAMP '2024-07-19', NULL, FALSE, 0),
    ('gow-ra', 'https://www.youtube.com/watch?v=hfJ4Km46A-0', 1, TIMESTAMP '2024-07-25', NULL, FALSE, 0),
    ('gta-vi', 'https://www.youtube.com/watch?v=QdBZY2fkU-0', 1, TIMESTAMP '2024-07-26', NULL, FALSE, 0),
    ('cyberp', 'https://www.youtube.com/watch?v=P99qJGrPNLs', 1, TIMESTAMP '2024-07-27', NULL, TRUE, 0),

    -- Tech & AI (Que não podem faltar)
    ('ollama', 'https://www.youtube.com/watch?v=OxzS3Y6L-V4', 1, TIMESTAMP '2024-07-28', NULL, FALSE, 0),
    ('ag-ai', 'https://www.youtube.com/watch?v=XunAonvT-r8', 1, TIMESTAMP '2024-07-29', NULL, FALSE, 0),
    ('lchain', 'https://www.youtube.com/watch?v=aywZrzNaKjs', 1, TIMESTAMP '2024-08-10', NULL, FALSE, 0),
    ('r-gen', 'https://www.youtube.com/watch?v=T-D1OfcDW1M', 1, TIMESTAMP '2024-08-11', NULL, FALSE, 0),

    -- Outros & Lo-Fi para Codar
    ('lofi01', 'https://www.youtube.com/watch?v=jfKfPfyJRdk', 1, TIMESTAMP '2024-08-12', NULL, FALSE, 0),
    ('coding', 'https://www.youtube.com/watch?v=S7XpYv8A_6Y', 1, TIMESTAMP '2024-08-13', NULL, FALSE, 0),
    ('spring', 'https://www.youtube.com/watch?v=nvO17ASmX90', 1, TIMESTAMP '2024-08-14', NULL, FALSE, 0),
    ('docker', 'https://www.youtube.com/watch?v=fqMOX6JJhGo', 1, TIMESTAMP '2024-08-15', NULL, FALSE, 0),
    ('v-game', 'https://www.youtube.com/watch?v=60Yp-YtS_m8', 1, TIMESTAMP '2024-08-16', NULL, FALSE, 0),
    ('top-10', 'https://www.youtube.com/watch?v=O91DT1pR1ew', 1, TIMESTAMP '2024-08-17', NULL, FALSE, 0);