## Variáveis tipos básicos do Java
### Conceito informal
### Declaração de variáveis: = valor;
### Tipos primitivos:
  - Números inteiros: byte, short, int, long
  - Números com ponto flutuante: float, double
  - Valor verdade: boolean
  - Um caractere Unicode: char
- Tipo String: cadeia de caracteres (palavras, textos)
- Nomes de variáveis / padrão camel case "salarioDoFuncionario"

## Saída de dados em Java
- System.out.print
- System.out.println
- System.out.printf
  - %d = int
  - %f = double ou float
  - %s = texto
  - %n = quebra de linha
- Locale
- Como concatenar vários elementos em um mesmo comando de escrita
- Exemplos

## Processamento de dados em Java, Casting
### Comando de atribuição
```
<variável> = <expressão>
```
### Casting
  - É a conversão explícita de um tipo para outro. 
    - É necessário quando o compilador não é capaz de “adivinhar” que o resultado de uma expressão deve ser de outro tipo.
  ```
  // Exemplo de casting
   a = 5
   b = 2
  resultado = (double) a / b
  ```
  
## Entrada de dados em Java

### Scanner 
  - é usada para ler entrada do usuário
    - nextLine(): Lê uma linha inteira de texto.
    - nextInt(): Lê um número inteiro.
    - nextDouble(): Lê um número decimal.
    - next().charAt(0) Lê apenas o primeiro caracter
    - next(): Lê uma única palavra.
    - hasNext(): Verifica se há outro elemento na entrada


### Locale
- é usada para configurar a localização (idioma e país) do programa.

### Como ler até a quebra de linha
  - nextLine()
  - como limpar o buffer de leitura, consumir a quebra de linha que fica pendente
