# divulgatudo
Aplicação Web de anúncios


<h1>Desafio de Programação - Academia Capgemini</h1>

<h3>O QUE É</h3>

O Projeto Divulga Tudo é uma aplicação Web de Gerenciamento de Anúncios. 
<br/>

<h3>OBJETIVO</h3>

A aplicação Divulga Tudo é um Projeto Web que tem como objetivo, gerenciar o cadastro de anúncios e com base no valor investido, mostrar uma projeção de cliques, compartilhamentos e visualizações dos anúncios cadastrados, permitindo assim uma análise de seus resultados.

<h3>PRÉ-REQUISITOS</h3>
Será necessário para a compilação do projeto:
<ul>
  <li>IDE ECLIPSE;</li>
  <li>JAVA 11;</li>
  <li>Base de Dados(Foi utilizado o PostgreSQL, porém pode ser outro banco);</li>
  <li>PGAdmin(Pode ser outro SGBD também).</li>
</ul>

<h3>TECNOLOGIAS UTILIZADAS</h3>

<ul>
  <li>JAVA;</li>
  <li>HTML;</li>
  <li>CSS;</li>
  <li>JAVASCRIPT;</li>
  <li>THYMELEAF;</li>
  <li>BOOTSTRAP;</li>
  <li>SPRING BOOT.</li>
</ul>

<h3>TELAS DO PROJETO</h3>
<h5>Tela HOME</h5>

![dt1](https://user-images.githubusercontent.com/30990442/118333616-65e44780-b4e2-11eb-8dc0-168ee8054ef0.jpg)

<h5>Tela ANÚNCIOS</h5>

![image](https://user-images.githubusercontent.com/30990442/118336866-e9a13280-b4e8-11eb-9b0e-73b7f3600489.png)

<h5>Tela CADASTRAR ANÚNCIOS</h5>

![image](https://user-images.githubusercontent.com/30990442/118337072-574d5e80-b4e9-11eb-95ba-51bdc303aa39.png)

<h5>Tela EDITAR ANÚNCIOS</h5>

![image](https://user-images.githubusercontent.com/30990442/118337256-ccb92f00-b4e9-11eb-8255-2455ad840e61.png)


<h3>COMO EXECUTAR O PROJETO</h3>

Para executar o projeto será necessario seguir os seguintes passos:
<h5>1 PASSO:</h5> Será necessário baixar o arquivo ou fazer um clone no repositório.
<h5>2 PASSO:</h5>Uma vez que o projeto estiver no ambiente de desenvolvimento, de preferencia o "ECLIPSE". Faça a configuração do arquivo:  ”aplication.properties”
<h5>3 PASSO:</h5>Acesse o arquivo "aplication.properties" em: <b>divulgatudo/src/main/resources/application.properties</b>  
![image](https://user-images.githubusercontent.com/30990442/118336271-b8743280-b4e7-11eb-94bd-2b0dfaa887f9.png)

<h5>4 PASSO:</h5>Em:<h5>spring.datasource.url=jdbc:postgresql://localhost:5432/divulgaTudo </h5>
Mude o nome do "banco" e a "porta" para que você possa utilizar em sua máquina.

Faça o mesmo em:
<b>username</b> e <b>password</b> coloque a os definidos em sua máquina.
<h5>spring.datasource.username=<b>postgres</b></h5>
<h5>spring.datasource.password=<b>password</b></h5>

No arquivo pom.xml caso esteja utilizando um banco que não seja o postgres, mude a dependência:

![image](https://user-images.githubusercontent.com/30990442/118337778-dd1dd980-b4ea-11eb-9313-ff8582857bf1.png)

<dependency>
<groupId>org.postgresql</groupId>
<artifactId>postgresql</artifactId>
<scope>runtime</scope>
</dependency>

Após configurar o aplication.properties e o pom.xml, crie uma base de dados no seu SGBD com o nome (divulgaTudo). Feito isso, volte para o ECLIPSE e execute a aplicação acessando o pacote com.cap.divulgatudo > DivulgatudoApplication.java:

![image](https://user-images.githubusercontent.com/30990442/118338382-641f8180-b4ec-11eb-85f9-7e5eacffd2f1.png)

Feito isso, insira no seu brwser a url: http://localhost:8080/

<h3>AGRADEÇO A ATENÇÃO DE TODOS E O EMPENHO PARA FAZER A APLICAÇÃO RODAR!</h3>





