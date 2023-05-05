# Bem vindo ao Teste técnico do DBC

Sejam bem vindos. Venho por esta, explanar brevemente o que foi aprendido com esse teste e também os erros cometidos.

# Erros e Acertos
Por nunca ter utilizado a classe Pojo em validações com RestAssure, tive que aprender o seu funcionamento, sua implementação e como utilizar suas variáveis. Confesso que eu ainda não havia conhecimento algum sobre essa definição de objetos. Foi então que tive que estudar um pouco sobre o mesmo. Havia uma certa dificuldade em desvincular a visão de annotations e rest. Mas após estudar e colocar a mão na massa, o Pojo foi se tornando bastante claro e mais organizado para mim.  

# Arquivos

Separei dois projetos. O primeiro é chamado RestAssure. Nele, há o código com a validação do statusCode e body da request sem o emprego do POJO. Com o exemplo desse projeto que iniciei o estudo para a classe Pojo.

O segundo projeto é chamado de RestAssurePojo2. Nele, há o código com a validação do statusCode da request e também das variáveis com o emprego do Pojo. 

## Criando arquivos e pastas

São dois projetos distintos, sendo que o de relevância ao teste é o **RestAssurePojo2**.
Ao importá-lo, o runner encontra-se dentro de src/test/java. Dentro desse diretório, estará presente o Pacote "sessao1". Dentro deste pacote, encontram-se duas classes. A "user.java", onde estão os objetos da classe Pojo. E a outra classe é a "serializarUser". Essa é a classe que será responsável em executar o script. 



