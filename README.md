# Projeto Final ItauTECH - Equipe fiveiTech

  <div>
    <img src="imagens/five.PNG" width = 60%>
  </div>

## Sumário
* [Visão Geral](#visão-geral)
* [Objetivos](#objetivos)
* [Especificações](#especificações)
* [Entregáveis](#entregáveis)
* [Tecnologias Usadas](#tecnologias-usadas)
* [Autores](#autores)
* [Agradecimentos](#agradecimentos)

## Visão Geral
Estamos em um contexto de gerenciamento de clientes e contas bancárias da instituição. <br>
Precisamos disponibilizar uma API que forneça dados de clientes e contas (inicialmente para
consulta).

## Objetivos
Construir uma API Spring BOOT que possua 2 endpoints principais: <br>
a. Recuperação de todas as contas bancárias <br>
b. Recuperação dos detalhes de 1 conta bancária (inclusive dados do seu titular)

## Especificações
Algumas tecnologias são obrigatórias para este projeto: <br>
Banco de Dados: MySQL <br>
API: SpringBoot <br>
Modelagem de Dados: <br>
Toda conta bancária possui os seguintes dados <br>
* numero
* agência
* tipo da conta (0 - conta corrente, 1 - poupança, 2 - investimento)
* saldo
* titular da conta (nome do titular)

## Entregáveis
Endpoint para consulta de todas as contas (deve retornar uma lista de objetos do tipo
que armazena Conta Bancária): <br>
*/contas*<br>
Endpoint para consultas do detalhe da conta <br>
*/contas/{id}*<br>
Todos os dados devem ser retornados em formato JSON.

## Tecnologias Usadas
- [GIT](https://git-scm.com/downloads)
- [JAVA](https://www.java.com/pt-BR/download/)
- [MySQL](https://www.mysql.com/downloads/)
- [Visual Studio Code](https://code.visualstudio.com/)

## Autores
- [Jacqueline Poletto Tulio Rodrigues](https://github.com/jacquepoletto)
- [João Roberto dos Santos Ramos Guidugli](https://github.com/engjobe)
- [Jonatas Willian de Freitas](https://github.com/jonataswf)
- [Jonathan Euzebio Boza](https://github.com/jebcode2021)
- Jones Bastos da Silva

## Agradecimentos
A todos os professores que contribuíram com o nosso aprendizado nesta jornada com paciência e atenção.

À Gama Academy e todos os seus colaboradores que sempre nos ajudaram com prontidão.

Ao Banco Itaú que acreditou no nosso potencial e nos proporcionou a realização desse sonho de fazer parte do time de itubers.
