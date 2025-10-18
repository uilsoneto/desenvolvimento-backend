
---

````markdown
# 🧩 Projeto — Desenvolvimento Web Back-End

Este projeto foi desenvolvido para o **Trabalho de Desenvolvimento Web — Back-End**, implementando uma **API RESTful de gerenciamento de tarefas** com **Java 21**, **Spring Boot 3** e **MySQL**.

---

## 🐳 Banco de Dados (Docker)

Para subir o banco de dados de teste, execute o comando abaixo:

```bash
docker run -d \
  --name mysql-tarefas \
  -e MYSQL_ROOT_PASSWORD=senha \
  -e MYSQL_DATABASE=tarefas_db \
  -p 3306:3306 \
  -v mysql_tarefas_data:/var/lib/mysql \
  mysql:8.0 \
  --default-authentication-plugin=mysql_native_password
````

📦 **Explicação:**

* Cria o container `mysql-tarefas`
* Usa senha do root: `senha`
* Cria automaticamente o banco `tarefas_db`
* Persiste dados no volume `mysql_tarefas_data`
* Expõe a porta `3306` local

---

## ⚙️ Configuração do Projeto

No arquivo `src/main/resources/application.properties`, configure o acesso ao banco:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tarefas_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## ▶️ Executando o Projeto

Para compilar e iniciar a aplicação, execute:

```bash
mvn spring-boot:run
```

Após iniciar, a aplicação estará disponível em:

🔗 [http://localhost:8080](http://localhost:8080)

---

## 🌐 Endpoints da API

| Método   | Endpoint            | Descrição                     |
| -------- | ------------------- | ----------------------------- |
| `POST`   | `/api/tarefas`      | Cria uma nova tarefa          |
| `GET`    | `/api/tarefas`      | Lista todas as tarefas        |
| `GET`    | `/api/tarefas/{id}` | Busca uma tarefa específica   |
| `PUT`    | `/api/tarefas/{id}` | Atualiza uma tarefa existente |
| `DELETE` | `/api/tarefas/{id}` | Remove uma tarefa             |

---

## 📦 Exemplo de Requisição JSON

### Criar uma Tarefa (`POST /api/tarefas`)

```json
{
  "nome": "Retirar lixo",
  "dataEntrega": "18/10/2025",
  "responsavel": "Uilson Vasconcelos"
}
```

---

## 🧑‍💻 Autor

**Uilson Vasconcelos**
Disciplina: Desenvolvimento Web — Back-End
Professora: **Luciane Kanashiro, Me**

```


```
