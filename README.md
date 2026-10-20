# 🎬 API Cinema

API REST para gerenciamento de filmes de um cinema, desenvolvida com Spring Boot. Permite cadastrar, listar, buscar, atualizar e remover filmes.

## Tecnologias

- Java 17
- Spring Boot 4.1.1
- Spring Data JPA
- Bean Validation
- MySQL
- Lombok
- Maven

## Estrutura do projeto

```
src/main/java/com/cinema/cinema
├── controller   # Endpoints REST
├── entity       # Entidade Filme
├── repository   # Acesso ao banco (JPA)
└── service      # Regras de negócio
```

## Modelo de dados

**Filme**

| Campo          | Tipo    | Regras                          |
| -------------- | ------- | ------------------------------- |
| `idFilme`      | Long    | Gerado automaticamente          |
| `tituloFilme`  | String  | Obrigatório, único, até 40 car. |
| `diretorFilme` | String  | Obrigatório, até 30 caracteres  |
| `generoFilme`  | String  | Obrigatório, até 30 caracteres  |
| `tempoFilme`   | Integer | Obrigatório (duração do filme)  |

## Endpoints

Base URL: `http://localhost:8080/api/filmes`

| Método   | Rota                | Descrição               |
| -------- | ------------------- | ----------------------- |
| `POST`   | `/api/filmes`       | Cadastra um filme       |
| `GET`    | `/api/filmes`       | Lista todos os filmes   |
| `GET`    | `/api/filmes/{id}`  | Busca um filme pelo ID  |
| `PUT`    | `/api/filmes/{id}`  | Atualiza um filme       |
| `DELETE` | `/api/filmes/{id}`  | Remove um filme         |

### Exemplo de corpo (POST / PUT)

```json
{
  "tituloFilme": "Interestelar",
  "diretorFilme": "Christopher Nolan",
  "generoFilme": "Ficção científica",
  "tempoFilme": 169
}
```

## Como executar

### Pré-requisitos

- JDK 17+
- MySQL em execução
- Maven (ou use o `mvnw` incluso)

### 1. Clone o repositório

```bash
git clone https://github.com/Marcello-Belchior/NOME-DO-REPOSITORIO.git
cd NOME-DO-REPOSITORIO/cinema
```

### 2. Crie o banco de dados

```sql
CREATE DATABASE cinema;
```

### 3. Configure o `application.properties`

Em `src/main/resources/application.properties`:

```properties
spring.application.name=cinema

spring.datasource.url=jdbc:mysql://localhost:3306/cinema
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> ⚠️ Não envie sua senha real para o GitHub.

### 4. Execute

```bash
./mvnw spring-boot:run
```

No Windows: `mvnw.cmd spring-boot:run`

A API ficará disponível em `http://localhost:8080`.

## Autor

**Marcello Belchior**
[GitHub](https://github.com/Marcello-Belchior)
