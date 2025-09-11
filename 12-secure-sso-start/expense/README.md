
Linux or MacosX
===============

curl -s http://localhost:8080/oidc -H "Authorization: Bearer $TOKEN" | jq

Windows
===============
Invoke-RestMethod -Uri http://localhost:8080/expense -Headers @{ Authorization = "Bearer $env:TOKEN" }

