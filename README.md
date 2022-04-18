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



[Boson Treinamentos](https://www.youtube.com/watch?v=Z_SPrzlT4Fc&list=PLucm8g_ezqNoAkYKXN_zWupyH6hQCAwxY) 

```
Foi utilizado o Docker como forma facilitadora do uso do SGBD...

```


### ⚙️ Credenciais do Banco

Após a instalação das ferramentas indicadas, é preciso alterar as credenciais do banco de dados, para executar localmente conforme segue o exemplo baixo.

```
Arquivo com credenciais do SGBD: 

src/main/resources/application.properties

Inserir credenciais conforme o exemplo: 

2 |spring.datasource.username=postgres
3 |spring.datasource.password=postgres377

```

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
