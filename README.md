🧮 Calculadora Simples

Serviço web REST desenvolvido com Spring Boot para realizar operações matemáticas básicas. Projeto desenvolvido como trabalho prático da disciplina de Desenvolvimento de Serviços com Spring Boot.

📋 Sobre o Projeto

A Calculadora Simples disponibiliza cinco endpoints REST para as operações de adição, subtração, multiplicação, divisão e exponenciação. Cada endpoint aceita requisições via métodos GET e POST.

🛠️ Tecnologias Utilizadas

Java 17,
Spring Boot 3.2,
Maven,
Spring Web


▶️ Como Rodar o Projeto

1. Clone o repositório:
   
2. Acesse a pasta do projeto:
bash cd calculadora-simples

3. Execute a aplicação:
bash ./mvnw spring-boot:run

4. Acesse no navegador:
http://localhost:8080

🔗 Endpoints Disponíveis

Base URL: http://localhost:8080/calculadora

Todos os endpoints aceitam GET e POST.

📌 Exemplos de Uso

Adição (GET):
GET http://localhost:8080/calculadora/somar?a=10&b=5
Resposta: Resultado da adição: 15.0

Subtração (GET):
GET http://localhost:8080/calculadora/subtrair?a=10&b=5
Resposta: Resultado da subtração: 5.0

Multiplicação (GET):
GET http://localhost:8080/calculadora/multiplicar?a=10&b=5
Resposta: Resultado da multiplicação: 50.0

Divisão (GET):
GET http://localhost:8080/calculadora/dividir?a=10&b=5
Resposta: Resultado da divisão: 2.0

Exponenciação (GET):
GET http://localhost:8080/calculadora/potencia?base=2&expoente=8
Resposta: Resultado da potência: 256.0
