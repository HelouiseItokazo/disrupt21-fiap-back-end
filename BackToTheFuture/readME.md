**Back to the Future - Disrupt21 - Fiap**
===================

**Tecnologias: Java, Java Script , JSP, Servlet, HTML e CSS**

Este projeto foi desenvolvido em para atender ao desafio **Disrupt21** proposto pela **Faculdade de Inform�tica e Administra��o Paulista - FIAP**, para os alunos do segundo semestres do curso de Tecnologia An�lise e Desenvolvimento de Sistemas.

Desafio
----------
Implemente um algoritmo que permita a ordena��o a partir de diversos crit�rios da linha do tempo dos personagens.

Instala��o
----------
Baixe o projeto .war

Informa��es importantes de <i class="icon-cog"></i> **Settings** :

IDE Eclipse
Driver ojdbc6.jar
Java vers�o 11
Tomcat 9.0.38

Inicializa��o
-------------
Ap�s abertura do projeto, executar os scripts .sql disponpiveis no projeto, na seguinte ordem:

> - **bttf_ddl.sql** - para cria��o/dele��o de tabelas, relacionamentos e sequences.
> - **bttf_dml.sql** - para popula��o/dele��o da massa de dados.

Encontre os arquivos em:
<i class="icon-folder-open"></i> BackToTheFuture/src/banco

Para exibir o projeto em seu navegador no Eclipse:
>- Window/Web Browser/Chrome (sugest�o)
>- Clique com bot�o direito em cima do projeto:
>- Run As/Run or Server/Finish

Configura��es
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