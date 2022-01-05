# Projeto Final ItauTECH - Equipe fiveiTech

  <div>
    <img src="imagens/five.PNG" width = 100%>
  </div>

### Sumário
● `Visão Geral`

● `Objetivos`

● `Especificações`

● `Entregáveis`

● `Tecnologias Usadas`

● `Autores`

● `Agradecimentos`

#
## Visão Geral
Estamos em um contexto de gerenciamento de clientes e contas bancárias da instituição. <br>
Precisamos disponibilizar uma API que forneça dados de clientes e contas (inicialmente para
consulta).

## Objetivos
Construir uma API Spring BOOT que possua 2 endpoints principais: <br>

A. `Recuperação de todas as contas bancárias`

B. `Recuperação dos detalhes de 1 conta bancária (inclusive dados do seu titular)`

## Especificações
Algumas tecnologias são obrigatórias para este projeto: <br>

● `Banco de Dados: MySQL`

● `API: SpringBoot`

Modelagem de Dados: 

Toda conta bancária possui os seguintes dados <br>

● `Telefone` 

● `numero`

● `agência`

● `tipo da conta (0 - conta corrente, 1 - poupança, 2 - investimento)`

● `saldo`

● `titular da conta (nome do titular)`

### Entregáveis:

Endpoint para consulta de todas as contas (deve retornar uma lista de objetos do tipo
que armazena Conta Bancária):

    /contas

Endpoint para consultas do detalhe da conta

    /contas/{id}

Todos os dados devem ser retornados em formato JSON.

#

## Tecnologias Usadas
- [GIT](https://git-scm.com/downloads)
- [JAVA](https://www.java.com/pt-BR/download/)
- [MySQL](https://www.mysql.com/downloads/)
- [Visual Studio Code](https://code.visualstudio.com/)

## Autores

<summary>Jacqueline Poletto Tulio Rodrigues</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jacquelinepoletto/)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/jacquepoletto)

<summary>João Roberto dos Santos Ramos Guidugli</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)]()
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/engjobe)

<summary>Jonatas Willian de Freitas</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jonatas-willian-de-freitas/)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/jonataswf)

<summary>Jonathan Euzebio Boza</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jonathaneboza/)
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/jebcode2021)

<summary>Jones Bastos da Silva</summary>

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)]()
[![Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)]()

## Agradecimentos
A todos os professores que contribuíram com o nosso aprendizado nesta jornada com paciência e atenção.

À Gama Academy e todos os seus colaboradores que sempre nos ajudaram com prontidão.

Ao Banco Itaú que acreditou no nosso potencial e nos proporcionou a realização desse sonho de fazer parte do time de itubers.
