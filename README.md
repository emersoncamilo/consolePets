# Adopet Console Application

Este repositório contém uma **aplicação simples em Java**, desenvolvida com o objetivo de demonstrar **refatoração de código** e boas práticas de organização de projetos. O código foi inicialmente estruturado em uma única classe chamada `AdopetConsoleApplication.java`. Após a refatoração, as responsabilidades foram distribuídas corretamente em **pacotes específicos**, melhorando a legibilidade e a manutenção do código.

O projeto foi desenvolvido no **IntelliJ IDEA** utilizando o **Java JDK 17**.

---

## 📁 Estrutura do Projeto

O projeto foi organizado em três pacotes principais:

- **domain**  
  Contém as entidades e objetos de domínio da aplicação.

- **service**  
  Responsável pelas regras de negócio e operações relacionadas aos serviços da aplicação.

- **main**  
  Inclui a classe principal que inicializa a aplicação (`AdopetConsoleApplication`), mantendo apenas a função de ponto de entrada.

---

## 🚀 Como Executar

1. Certifique-se de ter o **Java 17** instalado na sua máquina.

2. Clone o repositório:
   ```bash
   git clone https://github.com/emersoncamilo/consolePets.git
   ```  
3. Navegue até o diretório do projeto:
   ```bash
   cd consolePets/app
   ```  

4. **Inicie o servidor da API**:  
   Antes de rodar a aplicação, é necessário iniciar um **jar** localizado em `\diversos\api.jar`, que disponibiliza **endpoints** para comunicação.  
   Execute o seguinte comando:
   ```bash
   java -jar diversos/api.jar
   ```  

5. **Execute a aplicação principal**:  
   Após iniciar o servidor da API, compile e execute o projeto:
   ```bash
   javac -d bin src/**/*.java  
   java -cp bin main.AdopetConsoleApplication
   ```  

---

## 🧪 Testes

Pequenos testes unitários foram desenvolvidos utilizando as bibliotecas **JUnit** e **Mockito** para validar funcionalidades da aplicação. Eles garantem que as principais regras de negócio estejam funcionando corretamente e simulam cenários com dependências controladas.

Para executar os testes:
```bash
mvn test  # Se estiver usando Maven  
ou  
gradle test  # Se estiver usando Gradle  
```  

---

## 💡 Motivo da Refatoração

Esta refatoração teve como objetivo:
- **Melhorar a legibilidade e modularidade** do código.
- **Aplicar o conceito de responsabilidade única** (SRP).
- Facilitar futuras manutenções e adições de funcionalidades.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **JUnit**
- **Mockito**
- **Git/GitHub**
- **IntelliJ IDEA**

---

## 📋 Próximos Passos

- Aumentar a cobertura dos testes unitários.
- Implementar logs para monitoramento.
- Melhorar o tratamento de erros.

---

## 🤝 Contribuição

Fique à vontade para sugerir melhorias ou abrir issues para discutir problemas e ideias!

---

## 📢 Contato

Caso tenha interesse em discutir mais sobre o projeto ou oportunidades de colaboração, você pode entrar em contato pelo [LinkedIn](https://www.linkedin.com/in/ecamiloit/).
