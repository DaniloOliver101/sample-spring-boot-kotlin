import requests
import json

# Dados do cliente a serem enviados
data = {
    "name": "Doido da Silva Sauro",
    "documentNumber": "444444444"
}

# Converte os dados para JSON
data_json = json.dumps(data)

# URL do endpoint
url = "http://localhost:8080/customer"

# Envia a requisição POST
response = requests.post(url, data=data_json, headers={'Content-Type': 'application/json'})

# Imprime a resposta
print(response.status_code)
print(response.text)