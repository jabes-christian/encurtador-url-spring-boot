# 🔗 Encurtador de URL - Spring Boot

Aplicação web para **encurtamento de URLs** desenvolvida com **Java +
Spring Boot**, utilizando **Spring Security**, **Spring Data JPA**,
**Thymeleaf** e **PostgreSQL**.

O sistema permite que usuários criem links encurtados, armazenem essas
URLs no banco de dados e realizem redirecionamentos automáticos ao
acessar a URL curta.

------------------------------------------------------------------------

# 📌 Objetivo do Projeto

Este projeto foi desenvolvido para praticar e demonstrar conceitos
importantes do ecossistema **Spring**:

-   Arquitetura em camadas
-   Desenvolvimento web com **Spring Boot**
-   Persistência com **Spring Data JPA**
-   Segurança com **Spring Security**
-   Templates server-side com **Thymeleaf**
-   Versionamento de banco com **Flyway**
-   Containerização com **Docker**

------------------------------------------------------------------------

# 🧰 Stack Utilizada

## Backend

-   Java 21
-   Spring Boot
-   Spring Web
-   Spring Data JPA
-   Spring Security
-   Hibernate
-   Flyway
-   Maven

## Frontend

-   Thymeleaf
-   HTML
-   CSS

## Banco de Dados

-   PostgreSQL

## Infraestrutura

-   Docker
-   Docker Compose

------------------------------------------------------------------------

# 🏗 Arquitetura do Projeto

A aplicação segue uma arquitetura em camadas:

Controller → Service → Repository → Entity → Database

Também existem camadas auxiliares para configuração, exceções e DTOs.

------------------------------------------------------------------------

# 📂 Estrutura do Projeto

src/main/java/dev/jchristian/EncurtadorUrl

config\
└── WebSecurityConfig

domain\
├── entity\
├── Repository\
├── Service\
├── models\
└── exceptions

web\
├── controller\
└── dtos

GlobalExceptionHandler

ApplicationProperties

EncurtadorUrlApplication

------------------------------------------------------------------------

# 🔐 Segurança

A aplicação utiliza **Spring Security** para controle de acesso.

Funcionalidades:

-   Autenticação de usuários
-   Proteção de rotas
-   Controle de sessão
-   Associação de URLs ao usuário autenticado

------------------------------------------------------------------------

# ⚙️ Funcionalidades

-   Cadastro de usuários
-   Login e autenticação
-   Criação de URLs encurtadas
-   Redirecionamento automático
-   Listagem de URLs criadas
-   Associação das URLs ao usuário

------------------------------------------------------------------------

# 🗄 Banco de Dados

O banco utilizado é **PostgreSQL**.

As migrations são gerenciadas com **Flyway**.

Exemplo:

V1\_\_create_user_table.sql\
V2\_\_create_short_url_table.sql\
V3\_\_create_relations.sql

------------------------------------------------------------------------

# 🚀 Executando o Projeto

## Rodar Localmente

Clone o repositório:

git clone https://github.com/seu-usuario/encurtador-url.git

Entre no diretório:

cd encurtador-url

Execute:

mvn clean install\
mvn spring-boot:run

Aplicação disponível em:

http://localhost:8080

------------------------------------------------------------------------

# 🐳 Executando com Docker

Build da aplicação:

docker compose build

Subir containers:

docker compose up

Rodar em background:

docker compose up -d

Parar containers:

docker compose down

------------------------------------------------------------------------

# 📦 Containers

Aplicação: encurtador_url_app\
Banco: PostgreSQL

------------------------------------------------------------------------

# 🔗 Fluxo de Funcionamento

1.  Usuário cria uma URL
2.  O sistema gera um código curto
3.  A URL é salva no banco
4.  Ao acessar http://localhost:8080/{codigo}
5.  O sistema busca a URL original
6.  Redireciona automaticamente

------------------------------------------------------------------------

## 👨‍💻 Autor

**Jabes Christian**\

Github:
https://github.com/jabes-christian

Linkedin:
https://www.linkedin.com/in/jabes-christian/