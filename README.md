Conversor de Moedas em Java
Este projeto implementa um Conversor de Moedas em Java que utiliza a API ExchangeRate-API para obter taxas de câmbio em tempo real e a biblioteca Gson para manipular dados JSON.

Funcionalidades
Obtenção dinâmica de taxas de câmbio da API ExchangeRate-API.
Conversão entre pelo menos seis moedas diferentes.
Interface de linha de comando (CLI) para interação com o usuário.
Pré-requisitos
Para executar este projeto, você precisará das seguintes ferramentas:

Java JDK 8 ou superior
IDE de sua preferência (como IntelliJ IDEA, Eclipse, etc.)
Chave de API da ExchangeRate-API (substituir YOUR-API-KEY no código pelo seu próprio)
Configuração
Clone o repositório para sua máquina local:

bash
Copiar código
git clone https://github.com/seu-usuario/conversor-de-moedas.git
Abra o projeto na sua IDE.

Substitua YOUR-API-KEY pela sua chave de API da ExchangeRate-API no arquivo ApiClient.java.

Executando o Projeto
Compile e execute a classe Main.java na sua IDE.

No menu de opções, escolha a conversão desejada digitando o número correspondente.

Insira o valor a ser convertido quando solicitado.

O resultado da conversão será exibido na tela.

Exemplo de Uso
markdown
Copiar código
Menu de Conversão de Moedas:
1. USD para ARS
2. ARS para USD
3. USD para BOB
4. BOB para USD
5. USD para BRL
6. BRL para USD
7. USD para CLP
8. CLP para USD
9. USD para COP
10. COP para USD
0. Sair
Escolha uma opção: 1
Digite o valor: 100
Resultado: 982.40
Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests com melhorias, correções de bugs ou novas funcionalidades.

Licença
Este projeto está licenciado sob a MIT License.
