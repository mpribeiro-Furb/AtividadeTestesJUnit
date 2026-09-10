# 🧪 Atividade — Testes Unitários com JUnit

Atividade prática da disciplina de **Programação Orientada a Objetos (POO)** do curso de Ciência da Computação da **FURB — Universidade Regional de Blumenau**.

---

## 📚 Sobre a Atividade

O objetivo desta atividade é aprender a escrever e executar **testes unitários** em Java utilizando o framework **JUnit 4**, validando o comportamento de classes e métodos de forma automatizada.

---

## 🗂️ Estrutura do Projeto

```
AtividadeTestesJUnit/
├── src/
│   ├── Pessoa.java               # Classe com atributos nome e idade
│   ├── main.java                 # Métodos utilitários (somar, subtrair, isPositivo)
│   └── AtvCalculadora/
│       ├── Calculadora.java      # Classe de calculadora com as 4 operações
│       ├── TestCalculadora.java  # Testes unitários da Calculadora
│       └── main.java
├── testes/
│   └── PessoaTest.java           # Testes unitários da classe Pessoa
├── lib/
│   ├── junit-4.13.2.jar
│   └── hamcrest-core-1.3.jar
└── README.md
```

---

## 🧰 Tecnologias Utilizadas

- **Java** — JDK 26
- **JUnit 4.13.2** — Framework de testes unitários
- **Hamcrest 1.3** — Biblioteca de matchers para asserções
- **IntelliJ IDEA** — IDE de desenvolvimento

---

## ✅ Testes Implementados

### `mainTest.java`
| Teste | Descrição |
|---|---|
| `testSomarDoisMaisDoisDeveriaRetornarQuatro` | Verifica se 2 + 2 = 4 |
| `testSomarNegativoComPositivo` | Verifica se -4 + 5 = 1 |
| `testSubtrairCincoMenosTresDeveriaRetornarDois` | Verifica se 5 - 3 = 2 |
| `testIsPositivoComNumeroPositivo` | Verifica se 10 é positivo |
| `testIsPositivoComNumeroNegativo` | Verifica se -5 não é positivo |
| `testIsPositivoComZero` | Verifica se 0 não é positivo |

### `PessoaTest.java`
| Teste | Descrição |
|---|---|
| `testPessoa` | Verifica se o nome é atribuído corretamente via setter |

### `TestCalculadora.java`
| Teste | Descrição |
|---|---|
| `operacoes` | Verifica se a soma 20 + 20 retorna 40 |

---

## ▶️ Como Executar

1. Clone o repositório
2. Abra o projeto no **IntelliJ IDEA**
3. Certifique-se que os JARs da pasta `lib/` estão configurados como dependências em **Project Structure → Dependencies**
4. Abra qualquer classe de teste e clique no ícone ▶ verde para rodar os testes

---

## 👨‍💻 Autor

**Matheus Ribeiro**  
Ciência da Computação — FURB  
📧 mpribeiro.furb@gmail.com
