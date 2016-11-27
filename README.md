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



###7 MODELO CONCEITUAL

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Modelos/Conceitual/Modelo%20conceitual.jpg)

####7.1 Validação do Modelo Conceitual
[Grupo01]: [Pedro Henrique e Romildo Costa Silva]
[Grupo02]: [Ian]

####7.2 DECISÕES DE PROJETO

- Foi sugerida uma ideia pelo professor de criar mais duas outras entidades CONTATO e TIPO_CONTATO, mas não foi implementada no banco por questões de tempo para entrar o projeto para outra disciplina.

####7.3 DESCRIÇÃO DOS DADOS

TABLE TEMPERATURA: Tabela que guarda as temperaturas das caixa.
- TERMOMETRO_INTERNO: Guarda a temperatura interna da caixa.
- HORA_TEMP: Guarda a hora que foi coletadas as temperaturas.
- TERMOMETRO_EXTERNO: Guarda a temperatura externa da caixa.

TABLE ORGAO: Tabela que guarda as informações dos órgãos doados.
- HORA_CAPTACAO: Guarda a hora da captação do órgão
- ORGAO: Guarda o tipo do órgão(pulmão, coração)
- TEMPO_VIDA TIME: Guarda o tempo de vida do órgão;

TABLE TRANSPLANTE: Tabela que guarda as informações sobre os transplantes.
- DATA_TRANSPLANTE:  Guarda a data que o transplante irá ser realizado.

TABLE CAIXA: Tabela que guarda as informações sobre as caixas que transportam os órgãos.
- CAPACIDADE: Guarda a capacidade da caixa em litros.
- IDENTIFICACAO: Guarda a identificação da caixa.
- VALIDADE: Guarda a validade da caixa.


TABLE APARELHO: Tabela que guarda as informações do aparelho que monitora a caixa.
- MODELO: Guarda o modelo do aparelho.
- VALIDADE: Guarda a validade do aparelho.
- SERIE: Guarda a série do aparelho.

TABLE LOCALIZACAO: Tabela que guarda informações sobre a localização da caixa.
- LONGITUDE: Guarda a longitude da caixa.
- HORA_LOC: Guarda a hora que foram capturados os dados sobre localização da caixa.
- LATITUDE: Guarda a latidute da caixa.

TABLE TRANSPORTE (
- TEMP_FINAL: Guarda a temperatura final da caixa depois do transporte ter sido realizado.
- DATA: Guarda a data do transporte.
- LATITUDE_INICIAL: Guarda a latitude inicial da caixa.
- LONGITUDE_INICIAL: Guarda a longitute inicial da caixa.
- HORA_SAIDA: Guarda a hora de saída da caixa para o transporte.
- TEMP_INICIAL: Guarda a temperatura inicial da caixa.
- DESTINO: Guarda o destino para onde a caixa irá ser transportada.
- ORIGEM: Guarda a origem de onde a caixa foi enviada.
- LONGITUDE_FINAL: Guadar a longitude final da caixa.
- LATITUDE_FINAL: Guada a latidude final da caixa.

TABLE PESSOA: Tabela que guarda os dados das pessoas (doador, usuario, motorista e etc)
- NOME: Guarda o nome da pessoa.
- CIDADE: Guarda a cidade da pessoa.
- NASCIMENTO: Guarda a data de nascimento da pessoa.
- UF: Guarda o estado da pessoa.
- CEP: Guarda o CEP da pessoa.
- RG: Guarda o RG da pessoa.
- CPF: Guarda o CPF da pessoa.
- ENDERECO: Guarda o endereço da pessoa.
- BAIRRO: Guarda o bairro da pessoa.


TABLE MOTORISTA: Tabela que guarda os motoristas responsáveis pelo transporte
- CNH: Guarda o número da CNH do motorista.
- TELEFONE: Guarda o telefone.
- EMAIL: Guarda o email.
- VALIDADE_CNH: Guarda a data de validade da CNH
- OBS.: Essa tabela herda da tabela PESSOA então todos os campos da tabela PESSOA também pertencem a essa tabela.


TABLE DOADOR: Tabela que guarda os doadores
- TIPO_SANGUINEO: Guarda o tipo sanguineo.
- HORA_OBITO: Guarda a hora de obito.
- OBS.: Essa tabela herda da tabela PESSOA então todos os campos da tabela PESSOA também pertencem a essa tabela.

TABLE RESPONSAVEL: Tabela que guarda os responsáveis pelo doador.
- EMAIL: Guarda o email.
- TELEFONE: Guarda o telefone
- OBS.: Essa tabela herda da tabela PESSOA então todos os campos da tabela PESSOA também pertencem a essa tabela.

TABLE RECEPTOR: Tabela que guarda os dados de quem vai receber os órgãos doador.
- TIPO_SANGUINEO: Guarda o tipo sanguineo.
- TELEFONE: Guarda o telefone
- EMAIL: Guarda o email.
- OBS.: Essa tabela herda da tabela PESSOA então todos os campos da tabela PESSOA também pertencem a essa tabela.

TABLE USUARIO: Tabela que guarda as informações do usuario do sistema.
- TELEFONE: Guarda o telefone
- EMAIL: Guarda o email.
- LOGIN: Guarda o login.
- SENHA: Guarda a senha.
- OBS.: Essa tabela herda da tabela PESSOA então todos os campos da tabela PESSOA também pertencem a essa tabela.

###8 MODELO LÓGICO

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Modelos/L%C3%B3gico/Modelo%20l%C3%B3gico.jpg)

###8	MODELO FÍSICO<br>

https://github.com/Cassianokunsch/SMO/blob/master/Modelos/F%C3%ADsico/CRIACAO%20DO%20BANCO%20SMO.sql

###9	INSERT APLICADO NAS TABELAS DO BANCO DE DADOS<br>
####9.1 DETALHAMENTO DAS INFORMAÇÕES
        Detalhamento sobre as informações e processo de obtenção ou geração dos dados.
        Referenciar todas as fontes referentes a :
        a) obtenção dos dados
        b) obtenção de códigos reutilizados
        c) fontes de estudo para desenvolvimento do projeto


####9.2 INCLUSÃO DO SCRIPT PARA CRIAÇÃO DE TABELA E INSERÇÃO DOS DADOS
        a) inclusão das instruções para criação das tabelas e estruturas de amazenamento do BD
        b) inclusão das instruções de inserção dos dados nas referidas tabelas
        c) inclusão das instruções para execução de outros procedimentos necessários


        Entrega até este ponto em 01/11/2016


###10	TABELAS E PRINCIPAIS CONSULTAS<br>
####10.1	CONSULTAS DAS TABELAS COM TODOS OS DADOS INSERIDOS (Todas)
https://github.com/Cassianokunsch/SMO/tree/master/C%C3%B3digos%20SQL/9.1

####10.2	CONSULTAS DAS TABELAS COM FILTROS WHERE (Mínimo 3)
https://github.com/Cassianokunsch/SMO/tree/master/C%C3%B3digos%20SQL/9.2

####10.3	CONSULTAS QUE USAM OPERADORES LÓGICOS, ARITMÉTICOS E CAMPOS RENOMEADOS (Mínimo 2)
https://github.com/Cassianokunsch/SMO/tree/master/C%C3%B3digos%20SQL/9.3

####10.4	CONSULTAS QUE USAM OPERADORES LIKE (Mínimo 3)
https://github.com/Cassianokunsch/SMO/tree/master/C%C3%B3digos%20SQL/9.4

####10.5	ATUALIZAÇÃO E EXCLUSÃO DE DADOS (Mínimo 6)
https://github.com/Cassianokunsch/SMO/tree/master/C%C3%B3digos%20SQL/9.5

####10.6	CONSULTAS COM JUNÇÃO E ORDENAÇÃO (Todas Junções)
        Entrega até este ponto em 22/11/2016
        
####10.7	CONSULTAS COM GROUP BY (Mínimo 5)
https://github.com/Cassianokunsch/SMO/tree/master/C%C3%B3digos%20SQL/9.7

####10.8	CONSULTAS COM LEFT E RIGHT JOIN (Mínimo 4)

####10.9	CONSULTAS COM SELF JOIN E VIEW (Todas Possíveis)

####10.10	SUBCONSULTAS (Mínimo 3)
        Entrega até este ponto em 29/11/2016
        
###11 DESCRIÇÃO DOS PADRÕES DE PROJETO UTILIZADOS

- MVC

De acordo com GAMMA (1998), MVC consiste em três tipos de objetos que compõem camadas bem definidas: Modelo (Model) é o objeto da aplicação, responsável por implementar a lógica da regras de negócio tal qual o armazenamento persistente. Visão (View) é camada que compõe a apresentação do sistema para o usuário. RUBY (2009) define o controlador (Controller) conduz a aplicação recebendo eventos do mundo externo, interagindo com o modelo e exibe uma visão apropriada.

Outro motivo que levou o grupo a escoher esse padrão foi que esse padrão se bem aplicado e estruturado corretamente, a troca de Views, por exemplo, se eu apliquei esse padrão para criar uma interface desktop e quiser mudar para uma interface web, eu apenas preciso fazer alterações na visão, sem precisa mexer em nada no Controle e no Modelo.

- DAO - Data Access Object

Foi escolhido esse padrão pois, é um padrão para persistência de dados que permite separar regras de negócio das regras de acesso a banco de dados fornecendo uma interface para que as diversas outras camadas da aplicação possam se comunicar com o data source, com o padrão MVC a camada seria o Controle.

- Singleton

O objetivo do Singleton é garantir que uma classe tenha somente uma instância e fornece um ponto global de acesso para a mesma. Com o uso do padrão garantimos que só teremos uma instância de um determinada classe, e como na aplicação temos várias telas e vários controles sendo chamados, esse padrão vai garantir que não usemos mais memória do que precisamos.

###11 DIAGRAMA DE CLASSE

![Alt text](https://github.com/Cassianokunsch/SMO/blob/master/Class%20Diagram0.png)

###11	ATUALIZAÇÃO DA DOCUMENTAÇÃO DOS SLIDES PARA APRESENTAÇAO FINAL (Mínimo 6 e Máximo 10)

###12	DIFICULDADES ENCONTRADAS PELO GRUPO
- O grupo não encontrou nenhuma dificuldade relação a criação do banco. Apenas em como estrutura-lo.
