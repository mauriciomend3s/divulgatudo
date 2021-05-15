# divulgatudo
Aplicação Web de anúncios


<h1>Desafio de Programação - Academia Capgemini</h1>

<h3>O QUE É</h3>

O Projeto Divulga Tudo é uma aplicação Web de Gerenciamento de Anúncios. 

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

Para executar o projeto será necessário seguir os seguintes passos:
<h5>1 PASSO:</h5> Será necessário baixar o projeto ou fazer um clone do repositório na branch <b>master</b>: <b>https://github.com/mauriciomend3s/divulgatudo/tree/master</b> 
<h5>2 PASSO:</h5>Uma vez que o projeto estiver no ambiente de desenvolvimento, de preferência o "ECLIPSE". Faça a configuração do arquivo:  ”application.properties”
<h5>3 PASSO:</h5>Acesse o arquivo "aplication.properties" em: <b>divulgatudo/src/main/resources/application.properties</b>

![image](https://user-images.githubusercontent.com/30990442/118336271-b8743280-b4e7-11eb-94bd-2b0dfaa887f9.png)

<h5>4 PASSO:</h5> Em: <b>spring.datasource.url=jdbc:postgresql://localhost:5432/divulgaTudo.</b>
Mude o nome do "banco" e a "porta" caso não tenha o PostgreSQL instalado em sua máquina para o banco e porta instalados em seu ambiente, a configuração correta deste passo é de extrema importância, assim como todos os passos. 

Faça o mesmo em: <b> username </b> e <b> password. </b> 

<h5>5 PASSO:</h5> Em: <b>spring.datasource.username=postgres</b> e <b>spring.datasource.password=password</b>

Coloque o username e password definidos quando foi feita a instalação do banco em sua máquina.

<h5>6 PASSO:</h5>No arquivo <b>pom.xml</b> caso esteja utilizando um banco que não seja o PostgreSQL, mude a dependência para dependência do respectivo banco instalado em sua máquina!

![image](https://user-images.githubusercontent.com/30990442/118337778-dd1dd980-b4ea-11eb-9313-ff8582857bf1.png)

Exemplos de dependências de drives de outros bancos e as portas padrões:

<h4>MS SQL Server Driver = `Porta: 1433</h4>
<h4>Oracle driver = Porta: 1521</h4>
<h4>MySQL Driver = Porta: 3306</h4>

![image](https://user-images.githubusercontent.com/30990442/118366423-937ad080-b576-11eb-94b3-cef555821a5c.png)


<b>*Você pode ter configurado com outra porta, neste caso é esta que você irá utilizar.</b>


<h5>7 PASSO:</h5>Após configurar o <b>aplication.properties</b> e o <b>pom.xml</b>, crie uma base de dados no seu <b>SGBD</b> com o nome (divulgaTudo). Feito isso, volte para o ECLIPSE e execute a aplicação acessando o pacote <b>com.cap.divulgatudo > DivulgatudoApplication.java.</b></h5> <i>*O Springboot irá criar a tabela anuncio na base de dados que você criou no seu banco. Lembrando que o nome do banco deve ser exatamente assim:</i> <b>divulgaTudo</b>

![image](https://user-images.githubusercontent.com/30990442/118338382-641f8180-b4ec-11eb-85f9-7e5eacffd2f1.png)

![image](https://user-images.githubusercontent.com/30990442/118368136-e6a15300-b577-11eb-8c21-a3e9726a3abb.png)

<h5>8 PASSO:</h5>Feito isso, insira no seu browser a url: <b>http://localhost:8080/</b> e faça os cadastros na aplicação.

<h3>AGRADEÇO A ATENÇÃO DE TODOS E O EMPENHO PARA FAZER A APLICAÇÃO RODAR!!</h3>

<h5><i>Maurício Mendes</i><h5>

