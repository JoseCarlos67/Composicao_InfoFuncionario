# Composição - Informações de Funcionário

------------------------------------------------------------------------
![JAVA](https://camo.githubusercontent.com/011a4e2bb803e4ae1111f9d1bf17e9619952a0d1fc7d0ee625f85fc12ad6ffa5/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4a6176612d4544384230303f7374796c653d666f722d7468652d6261646765266c6f676f3d6f70656e6a646b266c6f676f436f6c6f723d7768697465)
![IDE](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

Este repositório contém a resolução de um exercício sobre **composição
de objetos em Java**.\
A proposta foi trabalhar com entidades que se relacionam entre si,
praticando conceitos como **enumerações, classes auxiliares, listas e
encapsulamento**.

------------------------------------------------------------------------

## 📝 Descrição do Exercício

O programa deve ler os dados de um funcionário e seus contratos por hora
de trabalho.\
Com base nessas informações, o sistema deve calcular a **renda do
funcionário em um determinado mês e ano**.

### Estrutura do problema:

-   Cada **funcionário** pertence a um **departamento**.
-   O funcionário pode ter vários **contratos por hora**.
-   Um contrato de hora possui:
    -   Data
    -   Valor por hora
    -   Duração em horas
-   O usuário informa:
    -   Nome do departamento
    -   Dados do funcionário (nome, nível, salário base)
    -   Quantos contratos ele possui
    -   Dados de cada contrato
-   O programa retorna o valor total ganho pelo funcionário no mês/ano
    desejado.

------------------------------------------------------------------------

## 🛠️ Conceitos Praticados

-   **Composição de objetos**
    -   Um funcionário possui (tem) um departamento.\
    -   Um funcionário possui (tem) vários contratos.\
        Essa modelagem permite estruturar melhor os relacionamentos
        entre classes.
-   **Enumerações (enum)**
    -   Definição de níveis de funcionário (`Junior`, `MidLevel`,
        `Senior`).\
    -   Torna o código mais legível e menos sujeito a erros de
        digitação.
-   **Classes auxiliares**
    -   `Department`: representa o departamento do funcionário.\
    -   `HourContract`: representa os contratos de trabalho temporário.
-   **Listas**
    -   Uso de `List<HourContract>` para armazenar múltiplos contratos
        associados a um único funcionário.
-   **Encapsulamento e métodos de apoio**
    -   Cálculo de renda com base nos contratos de um mês específico.\
    -   Reuso de métodos como `income(year, month)`.
-   **Leitura de dados e manipulação de datas**
    -   Uso da classe `Date` e `SimpleDateFormat` para trabalhar com
        datas.\
    -   Uso de `ByteArrayInputStream` para simular **entrada
        automatizada de dados**, facilitando testes do programa.

------------------------------------------------------------------------

## 📂 Estrutura do Projeto

    src/
     ├── application/
     │    └── Program.java        # Classe main, com entrada de dados
     └── entities/
          ├── Department.java     # Classe que representa o departamento
          ├── HourContract.java   # Classe que representa um contrato por hora
          ├── Worker.java         # Classe principal (funcionário), com composição
          └── WorkerLevel.java    # Enum com os níveis do funcionário

------------------------------------------------------------------------

## 🎯 Objetivo do Exercício

Fixar os conceitos de: - **Relacionamento entre classes** (composição)\
- **Uso de enumerações**\
- **Coleções em Java (List)**\
- **Trabalho com datas**\
- **Organização de projeto orientado a objetos**

------------------------------------------------------------------------****