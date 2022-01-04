# 🚀 Projeto Final - ItauTECH

<h4 align="center"> 
	🚧  Imagem em desenvolvimento . . . 🚧
</h4>

## Sumário
* [Visão Geral](#visão-geral)
* [Objetivos](#objetivos)
* [Especificações](#especificações)
* [Entregáveis](#entregáveis)
* [Tecnologias Usadas](#tecnologias-usadas)
* [Contribuição](#contribuição)
* [Autores](#autores)
* [Licença](#licença)
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

## Contribuição
Leia o arquivo [CONTRIBUTING.md](CONTRIBUTING.md) para saber detalhes sobre o nosso código de conduta e o processo de envio de solicitações *pull* (*Pull Request*) para nós.

## Autores
- [Jacqueline Poletto Tulio Rodrigues](https://github.com/jacquepoletto)
- [João Roberto dos Santos Ramos Guidugli](https://github.com/engjobe)
- [Jonatas Willian de Freitas](https://github.com/jonataswf)
- <img src="Jonathanjpg" width="50px" /> - [Jonathan Euzebio Boza](https://github.com/jebcode2021)
- Jones Bastos da Silva

## Licença
Este projeto está licenciado sob a Licença MIT, consulte o arquivo [LICENSE.md](LICENSE.md) para mais detalhes.

## Agradecimentos
<h4 align="center"> 
	🚧  Em desenvolvimento . . . 🚧
</h4>
