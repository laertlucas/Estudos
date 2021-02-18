Algoritmo "semnome"

Var
N:inteiro
peso, MPeso: real
nome,pesado:caractere
procedimento topo ()
inicio
Limpatela
escreval("O Maior peso ate agora foi do(a) ",nome, " Seu peso é ",peso)
fimprocedimento
Inicio
topo ()
para N <- 1 ate 3 faca
  escreval("Informe um nome: ")
  leia(nome)
  escreval("Informe o peso do(a) ", nome)
  leia(peso)
  se (peso > MPeso) entao
    MPeso <- peso
    pesado <- nome
  fimse
topo ()
escreval("A pessoa mais pesada foi ", pesado, " com", MPeso, " quilos...")
fimpara
Fimalgoritmo