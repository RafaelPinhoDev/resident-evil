# Mini Projeto: Resident Evil - Programação Orientada a Objetos (Java)

Este projeto foi desenvolvido como atividade prática da disciplina de Desenvolvimento para Servidores I na FATEC São Roque.

## 📋 Sobre o Projeto
O sistema simula entidades do universo de Resident Evil utilizando os pilares da Orientação a Objetos (POO) em Java. O código foi estruturado de forma organizada utilizando pacotes e classes executáveis de teste na IDE NetBeans.

---

## 🛠️ Conceitos Aplicados
* **Classes e Objetos**: Definição de moldes para instanciar entidades concretas e abstratas na memória RAM.
* **Encapsulamento**: Atributos definidos como private com controle de acesso centralizado através de métodos Getters e Setters.
* **Herança (extends)**: Reaproveitamento de código e especialização, onde classes filhas (Zumbi e MrX) herdam os atributos e comportamentos de uma classe mãe genérica (Inimigo).

---

## 📂 Estrutura de Classes

1. **`Jogo`**: Representa os títulos da franquia (Atributos: titulo, anoLancamento).
2. **`Personagem`**: Modela os protagonistas (Atributos: nome, vida, aparicao).
3. **`Arma`**: Gerencia o arsenal de combate (Atributos: nomeArma, municao, danoArma).
4. **`Inimigo` (Classe Mãe)**: Base genérica para os oponentes (Atributos: nome, dano, vida).
5. **`Zumbi` (Classe Filha)**: Estende Inimigo com o atributo exclusivo tipoVirus.
6. **`MrX` (Classe Filha)**: Estende Inimigo com o atributo exclusivo ternoLimitador.

---

## 🚀 Classes de Teste
O projeto conta com classes executáveis dotadas do método main para validação individual e integrada:
* `TestaJogo`
* `TestaPersonagem`
* `TestaArma`
* `TestaZumbi`
* `TestaMrX`
* **`TestaTudoJogo`**: Classe integradora que unifica todas as instâncias e exibe os dados consolidados no console de forma estruturada.

---

## 📁 Onde Encontrar os Arquivos
Os códigos-fonte desenvolvidos para este projeto estão organizados no repositório local e remoto no seguinte caminho:
`resident-evil > ResidentEvil > src > packageResidentEvil`