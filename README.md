# Desafio Extrema Pobreza
Sistema para prover a quantidade de pessoas em situação de extrema pobreza no mundo.
<hr>


# Historias de Usuário
# H1 - Consultar dados de cotação na API do Banco Mundial
Microsserviço responsável por solicitar os dados à API do Banco Mundial.


# H2 - Provimento de interface gráfical
Microsserviço de provimento de interface gráfica para viabilização de interação com o usuário. O microsserviço não deve se comunicar diretamente com a API do Banco Mundial.
<Br><br><br>
  <hr>

# instalação do projeto
O docker-compose.yml contempla toda a solução.

Para rodar em ambiente de teste e somente o básico <br>
1º Gerer o pacote <i><b>mvnw clean install</i></b> em ./Quarkus <br>
2º Iniciar dockers com <i><b>docker-compose up --build -d</i></b>

