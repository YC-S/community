## 社区

## 资料
1. [Elastic Search 中文社区](https://elasticsearch.cn/)
2. [Spring 文档](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-documentation)
3. [github developer 文档](https://help.github.com/en/github/authenticating-to-github/connecting-to-github-with-ssh)
4. [jQuery 文档](https://jquery.com/)
5. [BootStrap 文档](https://getbootstrap.com/)
6. [Github OAuth 文档](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

## 工具
1. [Git](https://git-scm.com/)
2. [Intellij](https://www.jetbrains.com/idea/)
3. [Visual Paradigm](https://www.visual-paradigm.com/)
4. [Flyway](https://flywaydb.org/)
5. [Lombok](https://projectlombok.org/)

## 脚本
```sql
create table USER
(
	ID INT auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	constraint USER_PK
		primary key (ID)
);
```
```bash
mvn flyway:migrate
```