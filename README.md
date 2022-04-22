# Cadastro de Usuários

API Rest simples, criada com o objetivo de estudo da tecnlogia e aplicação a um uso prático. A API faz parte de um projeto para uso de comerciantes locais, com o intuito de democratizar o acesso a tecnlogia a todos os comerciantes.

A aplicação é baseada no conceito de microserviços. Serà implementada tambem outra camadas para comunicaçâo do serviço.

## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

Consulte **Implantação** para saber como implantar o projeto.

### 📋 Pré-requisitos

De que coisas você precisa para utilizar a API?

```
 Java 17
 
 Postgres
 
 Docker
 
 Maven
 
 SDKMAN!
 
 Spring Boot
```

### 🔧 Instalação

Uma série de exemplos passo-a-passo que informam o que você deve executar para ter um ambiente de desenvolvimento em execução.

Para instalação do "SDKMAN!" em sua máquina, siga a instrução do link a seguir:

[SDKMAN!](https://sdkman.io/install) 

```
SDKMan é um gerenciador de kits de desenvolvimento. Com ele você pode instalar o várias versões do Java ou Maven, por exemplo.
```

Para instalação do Java utlizando o SDKMAN!, siga o tutorial a seguir:

[Java](https://medium.com/@luksrn/dica-sdkman-gerenciador-de-sdks-na-plataforma-java-dd594fb538f4) 

```
O tutorial acima, irá auxiliar na compreensão do funcionamento da instação e gerenciamento de versões. 
```

Para instalação do Maven utlizando o SDKMAN!, siga o tutorial a seguir:

[Maven](https://franciscochaves.com.br/blog/instale-o-maven-com-sdkman) 

```
O tutorial acima, irá auxiliar na compreensão do funcionamento da instação e gerenciamento de versões. 
```
### 🔧 Para instalação do SGBD Postgres, foi utilizado o Docker. 

(No desenvolvimento do projeto, uso o SO Linux Mint)

Primeiro passo para instalação do Docker (atualizando os pacotes do SO):

```
sudo apt update
```
O segundo passo é remover os pacotes antigos do Docker (Se vc não tiver instalado o docker, o comando a baixo não faz diferença):

```
sudo apt remove docker docker-engine docker.io
```

O terceiro passo é instalar o Docker em sua máquina:

```
sudo apt install docker.io
```

Como operação final, o comando systemctl adiciona o Docker como um serviço do SO e faz com que ele seja iniciado sempre que a máquina for inicializada.

```
sudo systemctl start docker
sudo systemctl enable docker

```

Uma forma de visualizar se a instalação foi feita corretamente, basta executar o comando "docker version". O resultado será como esse:

Client: Docker Engine - Community
Version:
19.03.1

Para instalação nos ambientes Windows e no Mac, existe uma ferramenta que facilita bastante a instalação do Docker para ambos os SO's.
Basta clicar no site da ferramenta e seguir os passos indicados no mesmo.

[Docker for Desktop](https://www.docker.com/products/docker-desktop/) 

Essa ferramenta além de instalar,permite criação e execução de contêineres.


### Instalação Postgres com imagem do Docker

Criando contêiner que execute o PostgreSQL. Executar o seguinte comando:

```
docker run -d -p 5432:5433 -e POSTGRES_PASSWORD=postgres postgres
```
Esse comando cria um contêiner usando a imagem postgres. Se ela não existe em sua máquina, não há problema, o Docker baixará a imagem diretamente do [DockerHub](https://hub.docker.com/) e a instalará em seu registro Docker local. A opção -p faz o mapeamento da porta local damáquina para a porta do contêiner, o que permitirá que o PostgreSQL seja
acessado no endereço http://localhost:5432.

### 🔩 SWAGGER

O desenvolvimento tem o uso do SWAGGER, para utilizar basta abrir o link disponibilizado abaixo, após execução do projeto.

[SWAGGER](http://localhost:8080/swagger-ui.html#/) 


## 🛠️ Construído com

Mencione as ferramentas que você usou para criar seu projeto

* [Spring Boot](https://spring.io/) - O framework web usado
* [Maven](https://maven.apache.org/) - Gerente de Dependência
* [SDKMAN!](https://sdkman.io/) - Gerenciador de kit de desenvolvimento
* [SWAGGER](https://swagger.io/) - Usada para teste e documentação



## ✒️ Autores

* **Paulo Andre** - *Desenvolvimento* - [Linkedin](https://www.linkedin.com/in/paulo-andr%C3%A9-mendes-costa/)


## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE.md](https://github.com/pauloandremendes/CadastroProduto/blob/main/LICENSE) para detalhes.



---
