## Bookstore API

### Spec
- Springboot
- Kotlin
- MySQL
- Gradle

### Prerequisite
- Table Schema
```sql
create table book_store (
    id bigint(20) not null primary key auto_increment,
    name varchar(20),
    createdAt timestamp(6) not null,
    updatedAt timestamp(6) not null
);
 
create table book (
    id bigint(20) not null primary key auto_increment,
    name varchar(20), 
    bookstore_id bigint(20),
    createdAt timestamp(6) not null,
    updatedAt timestamp(6) not null
);
```

### To-Do
- Apply Vault for getting secret like database information
- Logger
- Unit Test
- Exception handling
