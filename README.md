# Desafio: Colaboradores
O programa tem como objetivo ler os dados de um departamento, que inclui seu endereço e seus empregados. Em seguida mostrar na tela um relatório de folha de pagamento. As regras para este desafio são:

1. **Diagrama de classe UML:**
   - Seguir exatamente o diagrama de classe abaixo:
   
   ![Diagrama de classe](https://github.com/LucasFrancoBN/colaboradores/blob/master/img/diagrama_classe.png)
   
2. **Métodos:**
   - payroll: Responsável por retornar o valor total da folha de pagamento do departamento.

## Exemplo
```plaintext
Nome do departamento: Vendas
Dia do pagamento: 10
Email: vendas@lojatop.com
Telefone: 99883355
Quantos funcionários tem o departamento? 2
Dados do funcionário 1:
Nome: João Silva
Salário: 8000.00
Dados do funcionário 2:
Nome: Maria Torres
Salário: 10000.00
FOLHA DE PAGAMENTO:
Departamento Vendas = R$ 18000.00
Pagamento realizado no dia 10
Funcionários:
João Silva
Maria Torres
Para dúvidas favor entrar em contato: vendas@lojatop.com
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/colaboradores.git

# Acesse o diretório da classe Program
cd colaboradores/src/application
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java ../entities/Address.java ../entities/Department.java ../entities/Employee.java
```
Retroceda ao diretório src e compile o programa
```
# Retrocedendo ao diretório src
cd ../

# Execute o programa
java application.Program
```
