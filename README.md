
# Conversor de Moedas em Java

Este projeto é um Conversor de Moedas desenvolvido em Java utilizando a IDE IntelliJ. Ele utiliza uma API de taxas de câmbio para obter as taxas mais recentes e realizar conversões entre diferentes moedas.

## Funcionalidades

- Conversão dinâmica de moedas baseada nas taxas de câmbio atuais.
- Suporte para várias opções de conversão de moedas, incluindo USD, ARS, BOB, BRL, CLP e COP.
- Histórico de conversões realizado pelo usuário.
- Registro de logs das operações de conversão utilizando `java.time`.

## Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Gson para manipulação de dados JSON

## Como Usar

### Pré-requisitos

- JDK 8 ou superior instalado
- IntelliJ IDEA (ou outra IDE de sua preferência)

### Configuração

1. Clone este repositório para o seu ambiente local.
2. Abra o projeto na IntelliJ IDEA.

### Execução

1. Compile e execute o projeto na sua IDE.
2. O programa apresentará um menu de opções de conversão de moedas. Escolha uma das opções digitando o número correspondente e siga as instruções no console.
3. O histórico de conversões será exibido quando a opção correspondente for selecionada no menu.

### Exemplo de Uso

```java
// Exemplo de código para realizar uma conversão
CurrencyConverter converter = new CurrencyConverter();
double valorConvertido = converter.convertCurrency(100.0, "USD", "EUR");
System.out.println("100 USD equivalem a " + valorConvertido + " EUR");
```

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request para adicionar novas funcionalidades, melhorias de código ou correções de bugs.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

Adapte o conteúdo conforme necessário para refletir todos os detalhes específicos do seu projeto.
