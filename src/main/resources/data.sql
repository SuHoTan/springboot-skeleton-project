INSERT INTO MEMBER (USERNAME, PASSWORD, EMAIL, NAME, ROLE, CREATED_AT, DELETED)
VALUES
    /* password : 'password' << 해싱 */
    ('user1', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user1@email.com', 'User One', 'USER', NOW(), false),
    ('user2', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user2@email.com', 'User Two', 'USER', NOW(), false),
    ('admin', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'admin@email.com', 'Admin User', 'ADMIN', NOW(), false),
    ('user3', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user3@email.com', 'User Three', 'USER', NOW(), false),
    ('user4', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user4@email.com', 'User Four', 'USER', NOW(), false),
    ('user5', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user5@email.com', 'User Five', 'USER', NOW(), false),
    ('user6', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user6@email.com', 'User Six', 'USER', NOW(), false),
    ('user7', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user7@email.com', 'User Seven', 'USER', NOW(), false),
    ('user8', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user8@email.com', 'User Eight', 'USER', NOW(), false),
    ('user9', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user9@email.com', 'User Nine', 'USER', NOW(), false),
    ('user10', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user10@email.com', 'User Ten', 'USER', NOW(), false),
    ('user11', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user11@email.com', 'User Eleven', 'ADMIN', NOW(), false),
    ('user12', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user12@email.com', 'User Twelve', 'USER', NOW(), false),
    ('user13', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user13@email.com', 'User Thirteen', 'USER', NOW(), false),
    ('user14', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user14@email.com', 'User Fourteen', 'USER', NOW(), false),
    ('user15', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user15@email.com', 'User Fifteen', 'ADMIN', NOW(), false),
    ('user16', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user16@email.com', 'User Sixteen', 'USER', NOW(), false),
    ('user17', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user17@email.com', 'User Seventeen', 'USER', NOW(), false),
    ('user18', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user18@email.com', 'User Eighteen', 'USER', NOW(), false),
    ('user19', '$2b$12$bMcSk8bwAzLVAi3sO3MLhuIuIt5lPhIAtsqxzZlRonic6Pk9gFo0m', 'user19@email.com', 'User Nineteen', 'ADMIN', NOW(), false);
