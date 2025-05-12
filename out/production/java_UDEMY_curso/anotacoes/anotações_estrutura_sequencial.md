# Estrutura Sequencial
---
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
---
## Saída de dados em Java
- System.out.print
- System.out.println
- System.out.printf
  - %d = int
  - %f = double ou float
  - %s = texto
  - %n = quebra de linha
  - - %.2f%n
- Locale
- Como concatenar vários elementos em um mesmo comando de escrita
- Exemplos
---
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
  ---
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
---
## Funções matemáticas em java
- A = Math.sqrt(x); == Variável A recebe a raiz quadrada de x
- A = Math.pow(x, y); == Variável A recebe o resultado de x elevado a y
- A = Math.abs(x); == Variável A recebe o valor absoluto de x

Funções de funções mais complexas

```
// Formula de Baskara
- delta = Math.pow(b, 2.0) - 4*a*c;
  x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
  x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
```
---

