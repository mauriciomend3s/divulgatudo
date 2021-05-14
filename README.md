# divulgatudo
Aplicação Web de anúncios


<h1>Desafio de Programação - Academia Capgemini</h1>

<h3>O QUE É</h3>

O Projeto Divulga Tudo é uma aplicação web de gerenciamento de anúncios. 


OBJETIVO

A aplicação Divulga Tudo é um projeto web que tem como objetivo, gerenciar o cadastro de anúncios e com base no valor investido, mostrar uma projeção de cliques, compartilhamentos e visualizações dos anúncios cadastrados permitindo assim uma análise de seus resultados.


PRÉ-REQUISITOS

•	Será necessário para a compilação do projeto:
•	IDE ECLIPSE;
•	JAVA 11;
•	Base de Dados(Foi utilizado o PostgreSQL, porém pode ser outro banco);
•	PGAdmin(Pode ser outro SGBD também).

TECNOLOGIAS UTILIZADAS

Foi utilizado no projeto as seguintes tecnologias:
•	JAVA;
•	HTML;
•	CSS;
•	JAVASCRIPT;
•	BOOTSTRAP;
•	SPRING BOOT.

TELAS DO PROJETO
![image](https://user-images.githubusercontent.com/30990442/118333889-ec008e00-b4e2-11eb-9e57-0b6b8916bdb6.png)


COMO EXECUTAR O PROJETO

Para executar o projeto, será necessário baixar o arquivo ou fazer um clone no repositório.
Uma vez que o projeto estiver no ambiente de desenvolvimento. Faça a configuração do arquivo:”aplication.properties”
spring.jpa.hibernate.ddl-auto=none
spring.datasource.url=jdbc:postgresql://localhost:5432/divulgaTudo
spring.datasource.username=postgres
spring.datasource.password=password![dt1](https://user-images.githubusercontent.com/30990442/118333616-65e44780-b4e2-11eb-8dc0-168ee8054ef0.jpg)

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

Em “spring.datasource.url=jdbc:postgresql://localhost:5432/divulgaTudo ”
Mude o nome do banco e a porta para a que você utiliza em sua máquina.

Faça o mesmo em:

spring.datasource.username=postgres
spring.datasource.password=password


No arquivo pom.xml caso esteja utilizando um banco que não seja o postgres, mude a dependência:

<dependency>
<groupId>org.postgresql</groupId>
<artifactId>postgresql</artifactId>
<scope>runtime</scope>
</dependency>




