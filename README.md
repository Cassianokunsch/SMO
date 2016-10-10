# SMO
Trabalho desenvolvido durante a disciplina de BD e POO2

#Sumário

###1	COMPONENTES<br>
Cassiano Künsch das Neves<br>

###2	INTRODUÇÃO E MOTIVAÇAO<br>
Este documento contém a especificação do projeto do banco de dados <nome do projeto> e motivação da escolha realizada. <br>

###3	MINI-MUNDO<br>
Hoje no estado do Espirito Santo<br>

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

###5 DIAGRAMA DE CLASSE

![Alt text](https://github.com/discipbd1/trab01/blob/master/balsamiq.png?raw=true "Title")


