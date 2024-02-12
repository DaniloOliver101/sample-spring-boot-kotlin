from faker import Faker
import requests
import json

# Cria um gerador de dados falsos
fake = Faker()

# Gera dados de produto falsos
data = {
    "productName": fake.catch_phrase(),
    "productDescription": fake.sentence(),
    "price": fake.random_number(digits=2),
    "quantity": fake.random_number(digits=2)
}

# Converte os dados para JSON
data_json = json.dumps(data)

# URL do endpoint
url = "http://localhost:8080/product"

# Envia a requisição POST
response = requests.post(url, data=data_json, headers={'Content-Type': 'application/json'})

# Imprime a resposta
print(response.status_code)
print(response.text)