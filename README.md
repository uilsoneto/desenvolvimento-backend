
docker run -d \
  --name mysql-tarefas \
  -e MYSQL_ROOT_PASSWORD=senha \
  -e MYSQL_DATABASE=tarefas_db \
  -p 3306:3306 \
  -v mysql_tarefas_data:/var/lib/mysql \
  mysql:8.0
