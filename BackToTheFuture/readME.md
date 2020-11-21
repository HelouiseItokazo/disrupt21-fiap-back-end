**Back to the Future - Disrupt21 - Fiap**
===================

**Tecnologias: Java, Java Script , JSP, Servlet, HTML e CSS**

Este projeto foi desenvolvido em para atender ao desafio **Disrupt21** proposto pela **Faculdade de Informática e Administração Paulista - FIAP**, para os alunos do segundo semestres do curso de Tecnologia Análise e Desenvolvimento de Sistemas.

Desafio
----------
Implemente um algoritmo que permita a ordenação a partir de diversos critérios da linha do tempo dos personagens.

Instalação
----------
Baixe o projeto .war

Informaçães importantes de <i class="icon-cog"></i> **Settings** :

IDE Eclipse
Driver ojdbc6.jar
Java versão 11
Tomcat 9.0.38

Inicialização
-------------
Após abertura do projeto, executar os scripts .sql disponpiveis no projeto, na seguinte ordem:

> - **bttf_ddl.sql** - para criação/deleção de tabelas, relacionamentos e sequences.
> - **bttf_dml.sql** - para população/deleção da massa de dados.

Encontre os arquivos em:
<i class="icon-folder-open"></i> BackToTheFuture/src/banco

Para exibir o projeto em seu navegador no Eclipse:
>- Window/Web Browser/Chrome (sugestão)
>- Clique com botão direito em cima do projeto:
>- Run As/Run or Server/Finish

Configurações
-------------

Para que o projeto seja executado em seu ambiente, configure o banco de dados:
```javascript
database.url=
database.user=
database.password=
```
Encontre os arquivos em:
<i class="icon-folder-open"></i> BackToTheFuture/src/main/resources

>**Note:** 
>Caso execute o projeto com o banco de dados default, recomendamos que execute os comandos <i class="icon-trash"></i>**DELETE FROM** e <i class="icon-trash"></i>**DROP TABLE**  presentes nos arquivos **.sql** descritos acima. Desabilitar o auto commit