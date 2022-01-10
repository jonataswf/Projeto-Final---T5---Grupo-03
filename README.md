# <div align="center"> Programa de Formação Tech | Itaú - Equipe fiveiTech </div>

  <div>
    <img src="imagens/cincoitech.png">
  </div>

### Sumário
● [Visão Geral](#visão-geral)

● [Objetivos](#objetivos)

● [Especificações](#especificações)

● [Entregáveis](#entregáveis)

● [Configurar e Executar o Projeto](#configurar-e-executar-o-projeto)

● [Tecnologias Usadas](#tecnologias-usadas)

● [Autores](#autores)

● [Agradecimentos](#agradecimentos)

### Visão Geral
Estamos em um contexto de gerenciamento de clientes e contas bancárias da instituição. <br>
Precisamos disponibilizar uma API que forneça dados de clientes e contas (inicialmente para
consulta).
#

### Objetivos
Construir uma API Spring BOOT que possua 2 endpoints principais: <br>

A. `Recuperação de todas as contas bancárias`

B. `Recuperação dos detalhes de 1 conta bancária (inclusive dados do seu titular)`
#

### Especificações
Algumas tecnologias são obrigatórias para este projeto: <br>

● `Banco de Dados: MySQL`

● `API: SpringBoot`

Modelagem de Dados: 
Todo cliente possui os seguintes dados para serem cadastrados

### Toda conta bancária possui os seguintes dados 

● `Telefone` 

● `numero`

● `agência`

● `tipo da conta (0 - conta corrente, 1 - poupança, 2 - investimento)`

● `saldo`

● `titular da conta (nome do titular)`
#

### Entregáveis:

Endpoint para consulta de todas as contas (deve retornar uma lista de objetos do tipo
que armazena Conta Bancária):

    /contas

Endpoint para consultas do detalhe da conta

    /contas/{id}

Todos os dados devem ser retornados em formato JSON.
#

### Configurar e Executar o Projeto
1. Crie uma pasta em seu computador para salvar o projeto.

2. Instale o Git.

3. Abra a pasta criada, clique com o botão direito do mouse e selecione a opção Git Bash Here ou navegue ate a pasta através de linha de comandos "cd" pelo Git Bash.

4. Execute um dos comandos para clonar o projeto dentro da pasta que você criou, você pode escolher fazer o clone pelo SSH: git clone [git@github.com:jonataswf/Projeto-Final---T5---Grupo-03.git]() ou pelo Https: git clone https://github.com/jonataswf/Projeto-Final---T5---Grupo-03.git depende do que você tenha configurado no seu git.

5. Instale e configure o MySql Workbench com uma senha.

6. Com o Workbench aberto, execute o seguinte comando SQL para criar a base de dados do projeto: 

   create database bd_fiveitech_itau;

7. Abra o projeto pelo Visual Studio Code ou com uma IDE de sua preferencia (com a sdk do Java já instalada e configurada) e espere ele terminar de baixar e instalar todas as dependências do projeto.

8. Com o projeto aberto, abra o arquivo Projeto-Final---T5---Grupo-03\fiveitech\src\main\resources\application.properties e altere a senha para a que você configurou no seu MySql Workbench, na linha de código: spring.datasource.password = "SuaSenhaAqui" e salve o arquivo.

9. Execute o projeto, para executar pelo Visual Studio Code, acesse no menu lateral esquerdo "Spring Boot Dashboard" e clique no botão de play na frente da palavra fiveitech, aguarde o projeto inicializar.

10. Após a inicialização do projeto, abra seu navegador e entre no link http://localhost:8080/, este link vai abrir o site do projeto.
#

### Tecnologias Usadas
- [GIT](https://git-scm.com/downloads)
- [JAVA](https://www.java.com/pt-BR/download/)
- [MySQL](https://www.mysql.com/downloads/)
- [Visual Studio Code](https://code.visualstudio.com/)
#

### Autores

<summary>Jacqueline Poletto Tulio Rodrigues</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jacquelinepoletto/)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/jacquepoletto)

<summary>João Roberto dos Santos Ramos Guidugli</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jo%C3%A3o-guidugli-pcd-58897a1a2/)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/engjobe)

<summary>Jonatas Willian de Freitas</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jonatas-willian-de-freitas/)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/jonataswf)

<summary>Jonathan Euzebio Boza</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jonathaneboza/)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/jebcode2021)

<summary>Jones Bastos da Silva</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jones-bastos-73b22372)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/jonesbastos)
#

### Agradecimentos
A todos os professores que contribuíram com o nosso aprendizado nesta jornada com paciência e atenção. :heartpulse:

À Gama Academy e todos os seus colaboradores que sempre nos ajudaram com prontidão. :heartpulse:

Ao Banco Itaú que acreditou no nosso potencial e nos proporcionou a realização desse sonho de fazer parte do time de itubers. :heartpulse:
