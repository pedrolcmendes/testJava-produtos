1. clonar o repositório:
git clone https://github.com/pedrolcmendes/testJava-produtos.git

2. Extrair o arquivo e abrir com INTELLIJ (Clicar em load no canto inferior esquerdo da tela para instalar as dependências)
 
3. Verificar se possui todas as dependências utilizadas:
- Spring Web (WEB)
- Spring Data JPA (SQL)
- Lombok (Developer Tools)
- H2 Database (SQL)

4. Em produtoApplication rodar o arquivo para verificar e testar no POSTMAN.

5. Colocar a URL http://localhost:8080/produtos para testar os endpoints da API.
   Exemplo:

Criação do Produto
- POST http://localhost:8080/produtos 
{
    "nome": "celular",
    "descricao": "iphone 15",
    "preco": 2500.00,
    "status": "DISPONIVEL"
}

  Buscar todos os Produtos
- GET http://localhost:8080/produtos 
{
    "nome": "celular",
    "descricao": "iphone 15",
    "preco": 2500.00,
    "status": "DISPONIVEL"
}

  Buscar Produto por ID
- GET http://localhost:8080/produtos/1 
{
    "nome": "celular",
    "descricao": "iphone 15",
    "preco": 2500.00,
    "status": "DISPONIVEL"
}

  Atualizar Produto por ID
- PUT http://localhost:8080/produtos/1 
{
    "nome": "celular",
    "descricao": "iphone 16",
    "preco": 3500.00,
    "status": "ESGOTADO"
}

  Deletar Produto por ID
- DELETE http://localhost:8080/produtos/1 
{
    "nome": "celular",
    "descricao": "iphone 16",
    "preco": 3500.00,
    "status": "ESGOTADO"
}
