import requests
import json

# Dados do cliente
documentNumber = "12345678901"
token = "seu_token_aqui"

# Dados dos produtos
product_data = [
    {
        "id": "65c5043aaafd3366730711aa",
        "productName": "Realigned directional core",
        "productDescription": "Usually sometimes man thought radio relate physical.",
        "price": 57,
        "quantity": 71
    },
    {
        "id": "65c5043faafd3366730711ab",
        "productName": "Compatible foreground intranet",
        "productDescription": "Tax whether in grow clearly PM hold.",
        "price": 78,
        "quantity": 50
    }
]

# URL do endpoint
url = "http://localhost:8080/purchase"

# Envia a requisição POST
response = requests.post(url, params={"documentNumber": documentNumber, "token": token}, json=product_data)

# Imprime a resposta
print(response.status_code)
print(response.text)