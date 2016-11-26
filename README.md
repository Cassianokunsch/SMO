# SMO
Trabalho desenvolvido durante a disciplina de BD e POO2

#Sumário

###1	COMPONENTES<br>
Cassiano Künsch das Neves<br>

###2	INTRODUÇÃO E MOTIVAÇAO<br>
Este documento contém a especificação de uma aplicação que será usada para a disciplina de Banco de Dados 1 e Programação Orientada a Objetos 2 do Curso de Sistemas de Informação/IFES Campus Serra.<br>

###3	MINI-MUNDO<br>
Hoje no estado do Espirito Santo existe um órgão público chamado Central de Notificação, Captação e Distribuição de Órgãos do Espírito Santo (CNCDO/ES). Esse órgão coordena o funcionamento da iniciativa e as demais ações, como gerenciamento da lista de espera e controle e fiscalização das atividades de doações e transplantes do Estado. Visto isso o objetivo do trabalho é tentar criar uma aplicação desktop que controlará as atividades de doações, transplante e transporte, a aplicação também fará relatórios de transportes e transplantes.

###4    REQUISITOS DE USUÁRIO<br>

####4.1 REQUISITOS FUNCIONAIS
|  ID  | Descrição                                                 |  Prioridade |
| -----|:---------------------------------------------------------:| -----------:|
| RF01 | O usuário deve conseguir realizar um CRUD de usuário      |     Alta    |
| RF02 | O usuário deve consegui realizar um CRUD de motorista     |     Alta    |
| RF03 | O usuário deve consegui realizar um CRUD de aparelho      |     Alta    |
| RF04 | O usuário deve consegui realizar um CRUD de doador        |     Alta    |
| RF05 | O usuário deve consegui realizar um CRUD de caixa         |     Alta    |
| RF06 | O usuário deve consegui realizar um CRUD de responsavel   |     Alta    |
| RF07 | O usuário deve consegui realizar um CRUD de receptor      |     Alta    |
| RF08 | O usuário deve consegui realizar um CRUD de transporte    |     Alta    |
| RF09 | O usuário deve consegui realizar um CRUD de transplante   |     Alta    |
| RF10 | O usuário deve consegui gerar um relatório                |     Alta    |
| RF11 | O usuário deve consegui monitorar um orgão                |     Alta    |

####4.2 REQUISITOS NÃO - FUNCIONAIS
|  ID   | Descrição                                                                 |  Prioridade |    Categoria    |  Escopo |
| ----- |:-------------------------------------------------------------------------:| :----------:|:---------------:|--------:|
| RNF01 | Oferecer ao usuário uma interface intuitiva e de fácil compreensão        |     Alta    |                 |         |
| RNF02 | A aplicação deve ser desenvolvida na linguagem Java                       |     Alta    | Manutebilidade  | Sistema |
| RNF03 | A aplicação tem que oferecer conexão com o banco de dados                 |     Alta    |                 | Sistema |

####4.3 REGRAS DE NEGÓCIO
|  ID  | Descrição                                                                                      |  Prioridade |
| -----|:----------------------------------------------------------------------------------------------:| -----------:|
| RN01 | O usuário só pode acessar o sistema se estiver cadastrado                                      |     Alta    |
| RN02 | Toda ação alteração feita no sistema deve-se guardar o usuário                                 |     Alta    |
| RN03 | Um doador só poderá ser cadastrado se tiver um responsável por ele                             |     Alta    |
| RN04 | Um orgão só poderá ser cadastrado se tiver um doador relacionado a ele                         |     Alta    |
| RN05 | Um transplante só poderá ser criado se tiver um orgão e um receptor relacionados a ele         |     Alta    |
| RN06 | Um transporte só poderá ser criado se tiver uma caixa e um motorista relacionados a ele        |     Alta    |
| RN07 | Toda ação que for realizada no sistema deve-se guardar o usuário                               |     Alta    |

###5 TECNOLOGIA USADA
Nesta seção descrevemos objetivamente as tecnologias utilizadas na primeira parte do desenvolvimento do projeto.

O sistema em questão trata-se de um Sistema de Informação e levando em consideração suas características, optamos por escolher as seguintes tecnologias:

| Ferramenta | Tipo                                     |
| ---------- |:----------------------------------------:|
|Java        |Linguagem de Programação                  |
|PostgreSQL	 |Banco de Dados Relacional                 |
|JPA	       |API de Persistência                       |
|JDBC        |API de Persistência                       |
|Hibernate   |Frameworks de Mapeamento objeto/relacional|
|Java        |Swing	API de Interface Gráfica            |

- JAVA

Foi optada essa linguagem de programação pois, é de maior domínio dos integrantes do grupo. Além de ser uma linguagem gratuita.

- PostgreSQL

Optamos pelo PostgreSQL por ser um banco bem robusto e ser open source.

- JPA

JPA é uma especificação de Persistência da plataforma Java, para persistir as classes java em bancos de dados relacionais. Java Persistence API. Usaremos ela para facilitar a utilização do banco em Java.

- JDBC

JDBC é um conjunto de classes e interfaces (API) escritas em Java que fazem o envio de instruções SQL para qualquer banco de dados relacional. O JDBC será usado por nós por ser uma API de baixo nível e servir de base para a API JPA de mais alto nível.

- Hibernate

Hibernate é um framework de mapeamento objeto/relacional que implementa as funcionalidades da JPA. Usaremos esse framework para simplificar o desenvolvimento.

- Java Swing

O Swing é um framework que disponibiliza um conjunto de elementos gráficos para ser utilizado na plataforma Java, usado para desenhasr as telas da aplicação.

###6 TELAS DO SISTEMA

- Na tela de login

Nessa tela o usuário entrará com o login e a senha para poder acessar o sistema.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Tela%20Login.png "Title")


- Na tela principal

Nessa tela é onde o usuário terá acesso as funcionalidades do sistema.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Tela%20principal.png)


- Tela de cadastro de Aparelhos

Nessa tela o usuário irá cadastrar os aparelhos que monitoraram a temperatura e localização das caixas utilizadas para o transporte.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Cadastro%20Aparelho.png)


- Tela de cadastro de Caixas

Nessa tela o usuário irá cadastrar as caixas utilizadas para o transporte de órgãos.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Cadastro%20Caixa.png)


- Tela de cadastro de Doadores

Nessa tela o usuário irá cadastrar os Doadores que doaram seus orgãos para serem transplantados.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Cadastro%20Doador.png)


- Tela de cadastro de Motoristas

Nessa tela o usuário irá cadastrar os Motoristas que realizaram o transporte dos orgãos para serem transplantados.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Cadastro%20Motorista.png)


- Tela de cadastro de Órgão

Nessa tela o usuário irá cadastrar os Órgãos para serem transplantados.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Cadastro%20Org%C3%A3o.png)


- Tela de cadastro de Receptor

Nessa tela o usuário irá cadastrar os Receptores, são aqueles que iram receber o órgão.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Cadastro%20Receptor.png)


- Tela de cadastro de Transplante

Nessa tela o usuário irá cadastrar o Transplante que vai ser realizado do órgão.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Cadastro%20Transplante.png)



- Tela de cadastro de Transporte

Nessa tela o usuário irá cadastrar o Transporte que vai ser realizado do órgão.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Cadastro%20Transporte.png)



- Tela de cadastro de Transporte

Nessa tela o usuário irá cadastrar o Transporte que vai ser realizado do órgão.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Cadastro%20usuario.png)



- Tela de Autorização para monitorar o órgão

Nessa tela o usuário irá colocar as credenciais para pode ter acesso ao monitoramento do órgão.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Consultar%20Orgao.png)



- Tela Monitorar

Nessa tela o usuário irá ver todas as informações sobre o órgão em transporte

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Monitorar.png)



- Tela Relatório

Nessa tela o usuário irá colocar um filtro para gerar um relatório dos transportes feitos.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Relatorio.png)



- Tela de CRUD

Nessa tela o usuário poderá fazer as operações de Cadastrar, Excluir, Visualizar e Editar.
OBS.: essa vai ser uma tela padrao para todos os outros cadastros que serão realizados.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Tela%20crud.png)



- Tela de cadastrar Responsável

Nessa tela o usuário irá cadastrar o responsável pelo doador.

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Mockups/Cadastro%20Respons%C3%A1vel.png)


###5 DIAGRAMA DE CLASSE

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Class%20Diagram0.jpg "Title")

###6 MODELO CONCEITUAL
![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/BD.jpg "Title")


