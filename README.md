# Polimorfismo: Sobrecarga de Métodos (Overload)

Este projeto em Java tem como objetivo demonstrar o conceito de **Polimorfismo**, mais especificamente a **Sobrecarga de Métodos (Overload)**, fundamental na Programação Orientada a Objetos.

## 🎯 Objetivo do Projeto

O projeto ilustra como um mesmo objeto (um `Personagem`) pode ter múltiplos comportamentos para uma mesma ação (o método `receberGolpe`), dependendo dos argumentos fornecidos. Através da sobrecarga de métodos, o sistema calcula de forma diferente o dano (perda de pontos) recebido pelo personagem.

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem base do projeto.

## 🧩 Estrutura do Código

O projeto é composto por duas classes no pacote `app`:

### `Personagem.java`
Representa um personagem com atributos como `id`, `nome` e `pontos`. 
A **Sobrecarga de Métodos (Overload)** é implementada no método `receberGolpe`:

- **`receberGolpe(int aceleracao)`**: Calcula a perda de pontos baseando-se apenas na aceleração.
- **`receberGolpe(char tipoArma, int aceleracao)`**: Calcula a perda de pontos de forma dinâmica, dependendo do tipo da arma (`'m'`, `'M'` ou `'E'`) e da aceleração.

### `App.java`
Classe principal contendo o método `main`, responsável por instanciar um `Personagem` e demonstrar a invocação das diferentes versões sobrecarregadas de `receberGolpe()`, imprimindo no console o estado atualizado do personagem após cada ação.

## 🚀 Como Executar

1. Certifique-se de ter o [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.
2. Navegue até o diretório raiz do projeto.
3. Compile os arquivos Java:
   ```bash
   javac app/*.java
   ```
4. Execute a aplicação:
   ```bash
   java app.App
   ```
