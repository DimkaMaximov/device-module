# device-module
Module of Medical Clinic App 🩺📈

Проект Центр обработки медицинских данных
В приложение поступают показатели из медицинских датчиков: "Температура тела", "Артериальное давление", 
"Функция дыхания", "Уровень глюкозы". Приложение обрабатывает данные, логирует, в случае критической ситуации
выводит предупреждение и отправляет сообщение в скорую помощь.
Стек технологий: Java 11, Spring Boot, PostgreSQL, RabbitMQ, LiquiBase, MyBatis, Maven, Docker

Medical Data Center Project
The application receives indicators from medical sensors: "Body temperature", "Blood pressure", 
"Respiratory function", "Glucose level". The application processes data, logs, in case of a critical situation
displays a warning and sends a message to the ambulance.
Stack: Java 11, Spring Boot, PostgreSQL, RabbitMQ, LiquiBase, MyBatis, Maven, Docker

![лига проект](https://user-images.githubusercontent.com/64979862/168281678-063c19d2-2151-48d7-9f30-23f31abf4e61.jpg)

# Настройка:

Запустить docker контейнер с брокером сообщений RabbitMQ:

# run rabbitmq in docker container:

docker run -lt --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management 
docker run --help (информация о командах)
docker ps - посмотреть запущенные контейнеры docker stop [название контейнера]
