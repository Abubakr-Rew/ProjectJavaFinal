# 🛒 Shop API (Spring Boot)

Backend-проект интернет-магазина, разработанный на Spring Boot с использованием JPA, H2 Database и REST API.

---

## 🚀 Технологии

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (in-memory)
- Gradle
- Swagger / OpenAPI

---

## 📌 Основной функционал

### 👤 Пользователи
- Регистрация пользователей
- Получение списка пользователей

### 📦 Продукты
- Создание продукта
- Просмотр всех продуктов
- Обновление количества (stock)

### 🛒 Заказы
- Создание заказа (POST /orders/create)
- Оплата заказа (POST /orders/pay)
- Проверка статуса заказа

---

## 📡 API Endpoints

### Products

```
POST /products - создать продукт
GET /products - список продуктов
GET /products/{id} - получить продукт
PUT /products/{id} - обновить stock
```

### Orders

```
POST /orders/create - создать заказ
POST /orders/pay - оплатить заказ
```

### Users

```
POST /users - создать пользователя
GET /users - список пользователей
```

---

## 📖 Swagger UI

После запуска проекта:

```
http://localhost:8081/swagger-ui/index.html
```

---

## 🗄️ База данных

Используется H2 in-memory база.

Консоль доступна:

```
http://localhost:8081/h2-console
```

---

## ▶️ Запуск проекта

```bash
./gradlew bootRun
```

---

## 📦 Сборка

```bash
./gradlew build -x test
```

---

## 📌 Особенности архитектуры

- Layered architecture (Controller → Service → Repository)
- REST API
- Spring Data JPA
- Swagger UI

---

## 📷 Статус

✔ Проект готов к запуску  
✔ REST API реализован  
✔ Swagger подключен  