Este README.md apresenta o conteúdo, os objetivos e os resultados práticos da disciplina de Engenharia de Software: Clean Code e Boas Práticas.

O foco principal deste trabalho é a aplicação rigorosa de padrões de design, princípios SOLID e técnicas de refatoração para transformar código legado em soluções altamente coesas, de baixo acoplamento e fáceis de manter.

## 🎯 Objetivos do Projeto

O objetivo primordial deste repositório é demonstrar o desenvolvimento de software de alta qualidade, que:

1. **Aumente a Legibilidade:** O código deve ser autoexplicativo e reduzir a carga cognitiva (o esforço mental necessário para entender o código).
2. **Melhore a Manutenibilidade:** Dado que desenvolvedores passam a maior parte do tempo mantendo código escrito por outros, o código deve facilitar a adição de novas funcionalidades e a correção de bugs.
3. **Garanta a Extensibilidade:** Aplicar princípios para que o sistema seja aberto para extensão, mas fechado para modificação (OCP).
4. **Promova a Qualidade:** A qualidade do código é um indicador da velocidade com que se pode agregar valor comercial ao software.

A principal linguagem utilizada para os exercícios e refatorações é **Java**.

---

## 🧱 Princípios Fundamentais Aplicados

Todo o trabalho de refatoração neste projeto foi baseado em três pilares conceituais da Engenharia de Software:

1. **Princípios S.O.L.I.D.**
Os cinco princípios da Orientação a Objetos (OOP) foram aplicados para estruturar as classes e interfaces:
    - **S (Single Responsibility Principle - SRP):** Cada classe deve ter uma única responsabilidade, evitando misturar lógica de negócio, acesso a dados ou regras de apresentação (como o uso de System.out.println).
    - **O (Open/Closed Principle - OCP):** Permite a extensão de funcionalidades sem modificar a classe original, geralmente através de herança e abstrações.
    - **L (Liskov Substitution Principle - LSP):** Classes base devem ser substituíveis pelas suas classes filhas. Este princípio é essencial para o baixo acoplamento.
    - **I (Interface Segregation Principle - ISP):** Criação de interfaces enxutas, garantindo que uma classe não seja forçada a implementar métodos que não pertencem ao seu contexto.
    - **D (Dependency Inversion Principle - DIP):** O sistema deve depender de abstrações (interfaces ou classes abstratas) e não de implementações concretas, geralmente implementado via Injeção de Dependência.

2. **Design Patterns (Padrões de Projeto)**
Padrões de projeto são soluções comuns para problemas conhecidos e recorrentes:
    - **Criacionais:** Focados na criação de objetos, como o Builder (para construção passo a passo de objetos com configurações distintas) e Factory (para encapsular a lógica de criação de instâncias).
    - **Estruturais:** Focados na composição de classes, como Adapter (para intermediar interfaces incompatíveis, agindo como uma ponte) e Bridge (para desacoplar hierarquias de comportamento, evitando duplicação de código).
    - **Comportamentais:** Focados na interação entre objetos, como Strategy (utilizado para substituir grandes blocos if/else com polimorfismo).

3. **Boas Práticas de Clean Code**
Regras essenciais para a legibilidade e robustez do código:
    - **Nomenclatura Significativa:** Variáveis e métodos devem revelar a intenção do que fazem, evitando nomes de uma letra ou abreviações obscuras.
    - **Funções Coesas:** Funções devem ser pequenas e fazer somente uma coisa, fazendo-a bem feita.
    - **Eliminação de Magic Numbers:** Uso de constantes nomeadas para tornar o código rastreável e legível.
    - **Tratamento de Erros Robusto:** Uso de Exceções específicas em vez de retornar códigos de erro ou mascarar falhas. Funções nunca devem retornar null e nunca devem receber null como parâmetro.
    - **Comentários:** Comentários são desnecessários se o código for autoexplicativo. Devem ser evitados comentários redundantes (noise comments).

---

## 📋 Módulos e Refatorações Chave

O projeto inclui a refatoração de códigos legados (como os do TP1) para demonstrar a aplicação desses princípios:

| Módulo/Exercício | Problema Estrutural (Code Smell) | Princípios Aplicados |
| :--- | :--- | :--- |
| **Sistema de Notificações Multicanal** | Lógica de envio concentrada em uma única classe com condicionais `if/else`. | SOLID completo (OCP, DIP, ISP), Injeção de Dependência. |
| **Sistema de Pagamentos (Ex. 1)** | Uso de `String` para tipo de pagamento, *Magic Numbers* (taxas) e `if/else` complexo. | OCP, Enums (para eliminar *strings* e condicionais), Constantes nomeadas. |
| **Sistema de Recomendação de Filmes (Ex. 2)** | Lógica de *parsing* e regra de recomendação misturadas em um único bloco, usando `List<String>`. | SRP, Modularização, criação de classes **Modelo** (Filme) e **Serviço**. |
| **Motor de Cálculo de Impostos (Ex. 3)** | Lógica de cálculo duplicada para diferentes tipos de impostos. | OCP, uso de **Interfaces** (Imposto) e **Serviço** para delegar cálculo. |
| **TP1 - Sistema Financeiro/Carrinho** | Uso de **listas paralelas** (contas e valores; produtos, preços, quantidades) e violação do SRP. | SRP, criação de classes **Modelo** para garantir a coesão dos dados (um objeto coeso deve substituir listas paralelas). |
| **TP1 - RelatorioFinanceiro** | Função monolítica (`gerarRelatorio`) que executa múltiplas tarefas (cabeçalho, iteração, formatação e rodapé). | Regra: Funções devem fazer **somente uma coisa**. |

---

## 💡 Conclusão

A Engenharia de Software exige que o desenvolvedor atue como um artesão, seguindo práticas e convenções para criar códigos que humanos entendam.
A refatoração constante, seguindo a Regra dos Três (refatorar na terceira vez que algo semelhante ocorre), garante que o software se mantenha adaptável e aberto a evolução.
