#language: pt

Funcionalidade: Pesquisa no site da NTT

  Eu como usuáriuo do google
  quero digitar na pesquisa o site da nttdata
  para que eu acesse o primeiro link apresentado na pesquisa


  Cenario: Acessar o site da nttdata pesquisando via google

    Dado que estou no site da google
    Quando digito na pesquisa o site da nttdata e clico em pesquisar
    Então devo acessar o primeiro link apresentado na pesquisa

  Cenario: Pesquisar por vaga de arquiteto no site da NTT

    Dado que estou no site da ntt
    E clico em carreira
    Quando acesso junte-se a nossa equipe
    Então em lista de vagas pesquiso por arquiteto