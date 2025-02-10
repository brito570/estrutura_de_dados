
Célula de texto <gb8UgPwh8Zmj>
# %% [markdown]
##Revisão da Sintaxe Python: Tipos Primitivos, Variáveis, Operadores, Expressões, Entrada e Saída Básicas


Célula de texto <fRwAhDi5IXM->
# %% [markdown]
#Atribuindo variáveis

Célula de código <TE5DQW1rH1AM>
# %% [code]
# Atribuição de variáveis
idade = 29
nome = "Alice"
altura = 1.70

Célula de código <QELb-4n7O3_R>
# %% [code]
print(nome)
Saída da execução
0KB
	Stream
		Alice

Célula de texto <dTIrg2PwnasI>
# %% [markdown]
##Tipos Primitivos
Inteiros (int)
Ponto Flutuante (float)
Booleanos (bool)
Strings (str)

Célula de código <g275SDnh8PLr>
# %% [code]
# Inteiros
numero_inteiro = 10

# Ponto Flutuante
numero_flutuante = 10.9

# Booleanos
booleano_verdadeiro = True
booleano_falso = False

# Strings
texto = "Olá, mundo!"


Célula de código <veYCXhAS55w6>
# %% [code]
type(texto)
Saída da execução
0KB
	text/plain
		str

Célula de texto <vWEVQ4q6I2dL>
# %% [markdown]
#Testando!

Célula de código <M0wbaQ-88rpj>
# %% [code]
#print(numero_inteiro)
#type(numero_inteiro )

Célula de texto <z_q9cfWSIheD>
# %% [markdown]
#Operadores
##Aritméticos: +, -, *, /, // (divisão inteira), % (módulo), ** (exponenciação)
##Relacionais: ==, !=, >, <, >=, <=
##Lógicos: and, or, not

Célula de texto <KaDt9cK5IuJi>
# %% [markdown]
# Operadores Aritméticos




Célula de código <ZOE5mq9sA-c8>
# %% [code]
soma = 10 + 5
subtracao = 10 - 5
multiplicacao = 10 * 5
divisao = 10 / 5
divisao_inteira = 10 // 3
modulo = 11 % 3
exponenciacao = 2 ** 4

Célula de código <gPUdxmzaDuAC>
# %% [code]
print(exponenciacao)
Saída da execução
0KB
	Stream
		16

Célula de código <BKA1bgJIDo7Q>
# %% [code]
# Operadores Relacionais
igual = (10 == 10)
diferente = (10 !=11)
maior = (10 > 5)
menor = (15 < 10)
maior_igual = (10 >= 10)
menor_igual = (15 <= 10)



Célula de código <QRFlxTttGlyZ>
# %% [code]
# Operadores Lógicos
e_logico = False and True
ou_logico = False or False
nao_logico = not False

Célula de texto <DYTVai6aJAnq>
# %% [markdown]
#Testando!

Célula de código <lT-54jBNEsIG>
# %% [code]
print(nao_logico)
Saída da execução
0KB
	Stream
		True

Célula de texto <PQet0FTzJJ2P>
# %% [markdown]
#Expressões

Célula de código <P341Qza7JLQo>
# %% [code]
# Expressões combinando operadores
resultado = (10 + 10) * 2 / 3

Célula de código <jeOC7dotTN_i>
# %% [code]
print(resultado)
Saída da execução
0KB
	Stream
		13.333333333333334

Célula de texto <Sqak2lm2JT0c>
# %% [markdown]
#Entrada e Saída Básicas

Célula de código <gPrq6MHNJVcG>
# %% [code]
# Saída de dados
print("Olá, mundo!")

# Entrada de dados
nome = input("Digite seu nome: ")
idade = int(input("Digite sua idade: "))
print(f"Nome: {nome}, Idade: {idade}")

Célula de texto <1ayf0skKjwhr>
# %% [markdown]
As f-strings (ou formatted string literals) são uma forma concisa e legível de incluir expressões dentro de strings, usando chaves {}. O f antes das aspas indica que é uma f-string, e as expressões dentro das chaves são avaliadas no contexto atual e inseridas na string.

Célula de texto <VnPLivrYJbBq>
# %% [markdown]
#Testando!

Célula de texto <05EaAkVkJiH8>
# %% [markdown]
#Estruturas de Decisão
#if, elif, else

Célula de código <FsWNGkWQJb-P>
# %% [code]
idade = int(input("Digite sua idade: "))

if idade < 18:
    print("Você é menor de idade.")
elif idade < 60:
    print("Você é adulto.")
else:
    print("Você é idoso.")
Saída da execução
0KB
	Stream
		Digite sua idade: 33
		Você é adulto.

Célula de texto <ZjL1iVSrWqFm>
# %% [markdown]
#Estruturas de Repetição
#for
#while

Célula de código <qqipOvGZWbrc>
# %% [code]
# Estrutura for
for i in range(5):
    print(i)

Saída da execução
0KB
	Stream
		0
		1
		2
		3
		4

Célula de código <uLUL2OBGXTfb>
# %% [code]
# Estrutura while
contador = 0
while contador <= 3:
    print(contador)
    contador += 1
Saída da execução
0KB
	Stream
		0
		1
		2
		3

Célula de texto <CGJaCAh71o3h>
# %% [markdown]
## **Continuação passo 3 slide da aula: Configurar o Ambiente para Java (On-line)**

O Codespace já vem com muitas ferramentas pré-instaladas, mas você pode personalizá-lo para Java. Para isso, use um arquivo de configuração chamado **`devcontainer.json`**.

1. No Codespace, crie uma pasta chamada `.devcontainer` na raiz do seu repositório.
2. Dentro dessa pasta, crie um arquivo chamado `devcontainer.json`.
3. Adicione o seguinte conteúdo ao arquivo `devcontainer.json`:
```json
{
  "name": "Java Development",
  "image": "mcr.microsoft.com/devcontainers/java:17",
  "features": {
    "ghcr.io/devcontainers/features/java:1": {
      "version": "17",
      "installMaven": true,
      "installGradle": true
    }
  },
  "customizations": {
    "vscode": {
      "extensions": [
        "vscjava.vscode-java-pack"
      ]
    }
  }
}
```

Célula de texto <TvWkVFCS4tFd>
# %% [markdown]
### **Continuação passo 5 slide da aula:  Criar e Executar um Projeto Java**

Crie um arquivo `HelloWorld.java`:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

Compile e execute:

```
javac HelloWorld.java
java HelloWorld
```

Célula de texto <cTiGkcKL_ZLR>
# %% [markdown]
#### Se você criou uma pasta (exemplo de nome de pasta-->src) dentro da pasta do codespace (execute assim):

```
javac src/HelloWorld.java
java -cp src HelloWorld
```

Célula de texto <XaSeFWAtBfW2>
# %% [markdown]
###Revisão sintaxe JAVA

Célula de texto <jh34NogWB0KI>
# %% [markdown]
Em Java, não existe uma função exatamente igual ao `type()` do Python, que retorna o tipo de um objeto diretamente. No entanto, você pode usar o método `getClass()` para obter a classe de um objeto, o que é semelhante a saber o tipo do objeto.

Aqui está um exemplo de como você pode usar `getClass()`:

```java
public class Main {
    public static void main(String[] args) {
        Object obj1 = "Isso é uma string";
        Object obj2 = 42;
        Object obj3 = 3.14;

        System.out.println("Tipo de obj1: " + obj1.getClass().getSimpleName());
        System.out.println("Tipo de obj2: " + obj2.getClass().getSimpleName());
        System.out.println("Tipo de obj3: " + obj3.getClass().getSimpleName());
    }
}
```

Neste exemplo, `getClass()` retorna a classe do objeto, e `getSimpleName()` retorna o nome simples da classe (sem o pacote). Execute O pograma acima para verificar isso.

Célula de texto <OG16c5n4CuWC>
# %% [markdown]
###Operadores aritméticos

Célula de texto <GkOnMckYCzVq>
# %% [markdown]
```java
public class OperacoesMatematicas {
    public static void main(String[] args) {
        // Soma (similar ao Python)
        int soma = 10 + 5;
        System.out.println("Soma: " + soma); // Saída: 15

        // Subtração (similar ao Python)
        int subtracao = 10 - 5;
        System.out.println("Subtração: " + subtracao); // Saída: 5

        // Multiplicação (similar ao Python)
        int multiplicacao = 10 * 5;
        System.out.println("Multiplicação: " + multiplicacao); // Saída: 50

        // Divisão (comportamento diferente em Java para inteiros)
        double divisao = 10 / 5; // Resultado é 2.0 (divisão de inteiros em Java resulta em double)
        System.out.println("Divisão: " + divisao); // Saída: 2.0

        // Divisão inteira (em Java, a divisão de inteiros já é inteira)
        int divisaoInteira = 10 / 3; // Resultado é 3 (descarta a parte decimal)
        System.out.println("Divisão inteira: " + divisaoInteira); // Saída: 3

        // Módulo (similar ao Python)
        int modulo = 11 % 3;
        System.out.println("Módulo: " + modulo); // Saída: 2

        // Exponenciação (Java não tem operador **, usa-se Math.pow)
        double exponenciacao = Math.pow(2, 4); // 2 elevado a 4
        System.out.println("Exponenciação: " + exponenciacao); // Saída: 16.0
    }
}
```

Célula de texto <FjFfd4bAD4Wz>
# %% [markdown]
## Comentários **Diferenças e Similaridades**:

#### Soma, Subtração e Multiplicação:
- São idênticas em Python e Java. Os operadores `+`, `-` e `*` funcionam da mesma forma.

#### Divisão:
- Em Python, a divisão `/` sempre retorna um `float`, mesmo que os operandos sejam inteiros.
- Em Java, a divisão `/` entre inteiros retorna um inteiro (descarta a parte decimal). Para obter um resultado `double`, pelo menos um dos operandos deve ser `double`.

#### Divisão Inteira:
- Em Python, o operador `//` é usado para divisão inteira.
- Em Java, a divisão entre inteiros já é uma divisão inteira, então não há necessidade de um operador separado.

#### Módulo:
- O operador `%` funciona da mesma forma em Python e Java, retornando o resto da divisão.

#### Exponenciação:
- Em Python, o operador `**` é usado para exponenciação.
- Em Java, não há um operador nativo para exponenciação. Em vez disso, usa-se o método `Math.pow(base, expoente)`, que retorna um `double`.

#### Tipos de Dados:
- Python é dinamicamente tipado, enquanto Java é estaticamente tipado. Em Java, você precisa declarar explicitamente o tipo das variáveis (por exemplo, `int`, `double`).

#### Saída:
- Em Python, você pode usar `print()` diretamente.
- Em Java, você usa `System.out.println()` para exibir resultados no console.

Célula de texto <R3xgCyKREiqc>
# %% [markdown]
###Operadores lógicos

Célula de texto <pf9Q1RMHEsaz>
# %% [markdown]
```java
public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operador lógico AND (equivalente ao "and" do Python)
        boolean eLogico = false && true; // false and true
        System.out.println("AND lógico: " + eLogico); // Saída: false

        // Operador lógico OR (equivalente ao "or" do Python)
        boolean ouLogico = false || false; // false or false
        System.out.println("OR lógico: " + ouLogico); // Saída: false

        // Operador lógico NOT (equivalente ao "not" do Python)
        boolean naoLogico = !false; // not false
        System.out.println("NOT lógico: " + naoLogico); // Saída: true
    }
}
```

Célula de texto <klylSIM8E2Nn>
# %% [markdown]
### Comentários **Diferenças e Similaridades**:

#### Operador AND:
- Em Python, o operador `and` é usado para a operação lógica AND.
- Em Java, o operador equivalente é `&&`.
- Ambos funcionam da mesma forma: retornam `true` apenas se ambos os operandos forem `true`.

#### Operador OR:
- Em Python, o operador `or` é usado para a operação lógica OR.
- Em Java, o operador equivalente é `||`.
- Ambos funcionam da mesma forma: retornam `true` se pelo menos um dos operandos for `true`.

#### Operador NOT:
- Em Python, o operador `not` é usado para a operação lógica NOT.
- Em Java, o operador equivalente é `!`.
- Ambos funcionam da mesma forma: invertem o valor booleano (`true` vira `false` e vice-versa).

####Tipos de Dados:
- Em Python, os valores booleanos são escritos como `True` e `False` (com a primeira letra maiúscula).
- Em Java, os valores booleanos são escritos como `true` e `false` (tudo em minúsculas).

Célula de texto <Ii-JIKvdF1AX>
# %% [markdown]
- A lógica dos operadores é a mesma em Python e Java.

- A principal diferença está na sintaxe:
  - Python usa `and`, `or`, `not`.
  - Java usa `&&`, `||`, `!`.

- Java é estaticamente tipado, então os valores booleanos são sempre `true` ou `false`, enquanto Python usa `True` e `False`.

Célula de texto <sc6Pv10VF6Es>
# %% [markdown]
###O que significa o Java ser **estaticamente tipado** em relação ao Python?

#### Tipagem Estática vs. Dinâmica

Em termos gerais, dizemos que uma linguagem de programação é **estaticamente tipada** quando a verificação dos tipos das variáveis ocorre em tempo de compilação (antes da execução do código). Já uma linguagem **dinamicamente tipada** realiza a verificação de tipos em tempo de execução (durante a execução do código).

#### No caso do Java:

- **Java é estaticamente tipado**: Isso quer dizer que você precisa declarar o tipo de cada variável no momento em que a cria (por exemplo, `int`, `String`, etc.) e o compilador realiza checagens para garantir que essas variáveis sejam usadas de acordo com seu tipo. Se você tentar atribuir um valor incompatível (por exemplo, atribuir uma `String` em uma variável `int`), o código nem compila.
- O tipo de cada variável está fixado (ou seja, não pode mudar durante a execução). Se você declarou uma variável como `int`, por exemplo, ela sempre será `int` dentro daquele escopo, e não poderá depois receber um valor do tipo `String`.

#### No caso do Python:

- **Python é dinamicamente tipado**: Você não precisa informar o tipo das variáveis quando as declara. O interpretador descobre o tipo com base no valor que está sendo atribuído.
- Durante a execução do programa, pode acontecer de uma variável inicialmente conter um valor `int` e, posteriormente, receber um valor `String`, sem nenhum problema — quem decide se a atribuição é válida ou não é o interpretador, em tempo de execução.

#### Em suma, a principal diferença está no momento em que a verificação de tipos é feita:

- **Java (estático)**: Verifica os tipos antes de executar o programa, impedindo a execução se houver inconsistência de tipos.
- **Python (dinâmico)**: Só descobre e verifica tipos durante a execução do programa, o que pode levar a erros sendo identificados em tempo de execução, mas também dá mais flexibilidade ao código.




Célula de texto <QPqR4BwgMg-m>
# %% [markdown]
#Estruturas de Decisão
#if, elif, else

Célula de texto <NARlGlX2MlUD>
# %% [markdown]
```java
import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Verifica a faixa etária
        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade < 60) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é idoso.");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
```

Célula de texto <f2rqeiuVNZ_k>
# %% [markdown]
### Comentários **Diferenças e Similaridades**:

#### Similaridades

- **Estrutura Condicional (if, else if, else)**  
  - Tanto Python quanto Java usam `if`, `elif` (em Python) / `else if` (em Java) e `else` para estruturas condicionais.  
  - A lógica de verificação da idade é a mesma nos dois códigos.

- **Entrada de Dados**  
  - Ambos os códigos solicitam a entrada do usuário para obter a idade.  
  - Em Python, usa-se `input()`, enquanto em Java, usa-se a classe `Scanner`.

- **Saída de Dados**  
  - Ambos usam funções/métodos para exibir mensagens no console (`print()` em Python e `System.out.println()` em Java).

#### Diferenças

- **Sintaxe**  
  - Python usa indentação para definir blocos de código, enquanto Java usa chaves `{}`.  
  - Em Python, o `elif` é usado para "else if", enquanto em Java, é escrito como `else if`.

- **Tipagem**  
  - Python é uma linguagem **dinamicamente tipada**, ou seja, não é necessário declarar o tipo da variável `idade`.  
  - Java é **estaticamente tipado**, então é necessário declarar o tipo da variável (`int idade`).

- **Entrada de Dados**  
  - Em Python, `input()` retorna uma string, e é necessário converter para inteiro com `int()`.  
  - Em Java, o método `nextInt()` da classe `Scanner` já lê diretamente um valor inteiro.

- **Gerenciamento de Recursos**  
  - Em Java, é necessário fechar o objeto `Scanner` após o uso para liberar recursos (`scanner.close()`).  
  - Em Python, o gerenciamento de recursos é mais simplificado e não requer fechamento explícito.

- **Estrutura do Programa**  
  - Em Java, o código precisa estar dentro de uma classe (`VerificaIdade`) e de um método `main`.  
  - Em Python, o código pode ser executado diretamente sem a necessidade de uma estrutura de classe ou método principal.

#### Considerações

- O código Java é mais verboso e requer uma estrutura mais rígida (classe e método `main`).  
- Python é mais conciso e flexível, com menos preocupações com tipos e gerenciamento de recursos.  
- A lógica de ambos os códigos é a mesma, mas a sintaxe e os detalhes de implementação variam conforme as características de cada linguagem.


Célula de texto <hC2Gs27AN69->
# %% [markdown]
#Estruturas de Repetição
#for
#while

Célula de texto <rOV1mLi8N8jW>
# %% [markdown]
```java
public class EstruturaFor {
    public static void main(String[] args) {
        // Estrutura for em Java
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
```

Célula de texto <QHEgy4gCOcLl>
# %% [markdown]
### Comentários **Diferenças e Similaridades**:

### Similaridades

#### Estrutura `for`
- Tanto Python quanto Java possuem a estrutura `for` para loops.
- Ambos os códigos iteram sobre uma sequência de números e executam uma ação (imprimir o valor de `i`).

#### Objetivo do Loop
- O objetivo é o mesmo nos dois códigos: iterar de 0 a 4 e imprimir o valor de `i` em cada iteração.

### Diferenças

#### Sintaxe do `for`
- Em Python, o `for` é mais simplificado e usa a função `range()` para gerar uma sequência de números:

```python
for i in range(5):

```

#### Em Java, o `for é mais explícito e requer a inicialização, condição e incremento:

```java
for (int i = 0; i < 5; i++)
```
#### Função `range()` vs. Inicialização Manual
- **Python** usa `range(5)` para gerar uma sequência de 0 a 4 automaticamente.
- **Java** não tem uma função equivalente ao `range()`, então você precisa configurar manualmente o loop com `int i = 0; i < 5; i++`.

#### Impressão de Valores
- Em **Python**, usa-se `print(i)` para exibir o valor de `i`.
- Em **Java**, usa-se `System.out.println(i)` para o mesmo propósito.

#### Estrutura do Programa
- Em **Java**, o código precisa estar dentro de uma classe (`EstruturaFor`) e de um método `main`.
- Em **Python**, o código pode ser executado diretamente sem a necessidade de uma estrutura de classe ou método principal.

#### Tipagem
- Em **Python**, a variável `i` é dinamicamente tipada, e seu tipo é inferido automaticamente.
- Em **Java**, a variável `i` precisa ser declarada com um tipo explícito (`int`).



Célula de texto <nj740yOvQM9t>
# %% [markdown]
#While

Célula de texto <6ZWn2QlyP95m>
# %% [markdown]
```java
public class EstruturaWhile {
    public static void main(String[] args) {
        // Inicializa o contador
        int contador = 0;

        // Estrutura while em Java
        while (contador <= 3) {
            System.out.println(contador);
            contador++; // Incrementa o contador
        }
    }
}
```

Célula de texto <FNhUSY4rQRrO>
# %% [markdown]
# Diferenças e Similaridades

## Similaridades

### Estrutura `while`
- Tanto Python quanto Java possuem a estrutura `while` para loops.
- Ambos os códigos iteram enquanto a condição `contador <= 3` for verdadeira.

### Objetivo do Loop
- O objetivo é o mesmo nos dois códigos: iterar enquanto o contador for menor ou igual a 3, imprimir o valor do contador e incrementá-lo.

### Inicialização e Incremento
- Em ambos os códigos, o contador é inicializado com 0 e incrementado em 1 a cada iteração.

---

## Diferenças

### Sintaxe do `while`
- **Python**: a sintaxe é mais simples e não requer parênteses ou chaves:
  ```python
  while contador <= 3:
```
-**Java**: a condição do while deve estar entre parênteses, e o bloco de código deve estar entre chaves {}:
```java
while (condição) {
    // Bloco de código a ser repetido
}
```

    - **Parênteses ()**: A condição do while em Java deve estar sempre entre parênteses. Isso é obrigatório e ajuda a distinguir a condição do bloco de código que será executado.

    - **Chaves {}**: O bloco de código que será repetido enquanto a condição for verdadeira deve estar delimitado por chaves {}. Isso define o escopo do loop.

Exemplo:

```java
while (contador <= 3) {
    System.out.println(contador);
    contador++;
}
```



Célula de texto <yPZ1_pC8RaPy>
# %% [markdown]
#Vamos para os exercicios!!!


