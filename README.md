# Projeto de Herança - Sistema de Caminhões

Este projeto é um exercício prático de **Programação Orientada a Objetos (POO)** desenvolvido em Java, com o objetivo principal de demonstrar o conceito de **Herança**. O sistema modela diferentes tipos de caminhões, aproveitando características em comum e especificando comportamentos baseados no tipo do compartimento de carga.

## 💻 O que foi feito?

Foi implementada uma estrutura de classes que representa uma frota de caminhões. A arquitetura do código baseia-se em uma classe "mãe" (superclasse) genérica e classes "filhas" (subclasses) especializadas:

- **`Caminhao` (Superclasse):** Define as propriedades genéricas que todo caminhão possui, como número, modelo, ano de fabricação, capacidade total de carga, unidade de medida e carga atual.
- **`CaminhaoBau` (Subclasse de `Caminhao`):** Especialização que adiciona propriedades específicas de um caminhão tipo baú, como comprimento, largura, altura e a capacidade de calcular o seu volume e manusear a sua carga de maneira específica.
- **`CaminhaoTanque` (Subclasse de `Caminhao`):** Especialização que adiciona características para transporte de líquidos/gases (ex: água, combustível), como o tipo de material transportado e ações específicas como encher, esvaziar, abastecer ou descarregar o tanque em litros.
- **`Main`:** Classe principal onde a execução acontece. Foi criada uma estrutura de armazenamento (`ArrayList`) capaz de guardar diferentes tipos de objetos instanciados (`CaminhaoBau` e `CaminhaoTanque`) utilizando o conceito de polimorfismo através de uma lista de `Caminhao`.

## 🚀 Tecnologias Utilizadas

- **Linguagem:** Java
- **Bibliotecas padrão:** `java.util.List`, `java.util.ArrayList`
- **Paradigmas:** Programação Orientada a Objetos (POO), Encapsulamento, Herança, Polimorfismo.

## 📋 Como executar o projeto

Para executar o código localmente certifique-se de ter o [JDK - Java Development Kit](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.

1. Clone o repositório ou baixe os arquivos fonte.
2. Navegue até a pasta do projeto (`Heranca-main`).
3. Compile todos os arquivos `.java` rodando o comando:
   ```bash
   javac app/*.java
   ```
4. Execute o projeto chamando a classe Main:
   ```bash
   java app.Main
   ```
