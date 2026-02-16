Este repositório foi criado com o objetivo de consolidar o aprendizado prático em Docker e Containerização, utilizando uma aplicação Spring Boot como base. O foco aqui não é o código Java em si, mas toda a orquestração do ambiente de desenvolvimento e produção.

O que foi explorado neste projeto:
Dockerfile Automatizado: Criação de uma imagem otimizada utilizando o JDK 25, garantindo que a aplicação seja "buildada" e executada dentro de um ambiente isolado e imutável.

Gerenciamento de Imagens: Fluxo completo de docker build, versionamento com tags e envio para o Docker Hub.

Orquestração de Containers: Uso de containers para separar as responsabilidades: um container para a API Java e outro para o banco de dados PostgreSQL.

Redes Isoladas (Networking): Criação e configuração de uma rede customizada (convidados-network) para permitir a comunicação segura entre a API e o banco de dados através dos nomes dos containers.

Variáveis de Ambiente Dinâmicas: Configuração do Spring Boot para se conectar ao banco de dados usando variáveis de ambiente (DB_HOST, DB_PORT), tornando a aplicação pronta para rodar em qualquer lugar (Local, Docker ou AWS).

Inspeção e Logs: Uso avançado de comandos como docker inspect para validar IPs de rede e docker logs para monitorar a saúde da aplicação em tempo real.
