# divulgatudo
Aplicação Web de anúncios


<h1>Desafio de Programação - Academia Capgemini</h1>

<h3>O QUE É</h3>

O Projeto Divulga Tudo é uma aplicação web de gerenciamento de anúncios. 


<h3>OBJETIVO</h3>

A aplicação Divulga Tudo é um projeto web que tem como objetivo, gerenciar o cadastro de anúncios e com base no valor investido, mostrar uma projeção de cliques, compartilhamentos e visualizações dos anúncios cadastrados permitindo assim uma análise de seus resultados.


<h3>PRÉ-REQUISITOS</h3>

•	Será necessário para a compilação do projeto:
•	IDE ECLIPSE;
•	JAVA 11;
•	Base de Dados(Foi utilizado o PostgreSQL, porém pode ser outro banco);
•	PGAdmin(Pode ser outro SGBD também).

<h3>TECNOLOGIAS UTILIZADAS</h3>

Foi utilizado no projeto as seguintes tecnologias:
•	JAVA;
•	HTML;
•	CSS;
•	JAVASCRIPT;
•	BOOTSTRAP;
•	SPRING BOOT.

<h3>TELAS DO PROJETO</h3>
<h5>Tela HOME</h5>

![dt1](https://user-images.githubusercontent.com/30990442/118333616-65e44780-b4e2-11eb-8dc0-168ee8054ef0.jpg)

<h5>Tela ANÚNCIOS</h5>

![image](https://user-images.githubusercontent.com/30990442/118336866-e9a13280-b4e8-11eb-9b0e-73b7f3600489.png)

<h5>Tela CADASTRAR ANÚNCIOS</h5>

![image](https://user-images.githubusercontent.com/30990442/118337072-574d5e80-b4e9-11eb-95ba-51bdc303aa39.png)

<h5>Tela EDITAR ANÚNCIOS</h5>

![image](https://user-images.githubusercontent.com/30990442/118337256-ccb92f00-b4e9-11eb-8255-2455ad840e61.png)


<h3>COMO EXECUTAR O PROJETO

Para executar o projeto, será necessário baixar o arquivo ou fazer um clone no repositório.
Uma vez que o projeto estiver no ambiente de desenvolvimento, de preferencia "ECLIPSE". Faça a configuração do arquivo:”aplication.properties”

![image](https://user-images.githubusercontent.com/30990442/118336271-b8743280-b4e7-11eb-94bd-2b0dfaa887f9.png)

Em, <h5>spring.datasource.url=jdbc:postgresql://localhost:5432/divulgaTudo </h5>
Mude o nome do banco e a porta para a que você utiliza em sua máquina.

Faça o mesmo em:

<h5>spring.datasource.username=postgres</h5>
<h5>spring.datasource.password=password</h5>

No arquivo pom.xml caso esteja utilizando um banco que não seja o postgres, mude a dependência:

<dependency>
<groupId>org.postgresql</groupId>
<artifactId>postgresql</artifactId>
<scope>runtime</scope>
</dependency>




