# filmoteka
Pet-project about films
Небольшое веб-приложение для оценки фильмов. Каждый зритель сможет добавить оценку и комментарий к фильму. Оценки и комментарии будут известны для выбранной группы пользователей. Можно оценивать исходя из того, что фильм смотрели вместе.

Описание проекта.
Были сделаны два микро-сервиса. Один для обработки запросов к БД. Второй для авторизации пользователей(https://github.com/gerfaot/authfilmoteka). 
Для маршрутизации API был использован Spring Cloud Gateway(https://github.com/gerfaot/filmgateway). База данных с фильмами и оценками находится в docker-контейнере(image: postgre:12-alpine). 


-Java
-SpringBoot
-Spring Web 
-SpringGateway
-SpringJPA
-PostgreSQL
-Docker
-Gradle
