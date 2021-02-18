Algoritmo "semnome"

Var
N, F: inteiro
Inicio
funcao fatorial(V:inteiro):inteiro
var
C, R:inteiro
inicio
  R <- 1
  para C <- 1 ate V faca
    R <- R * C
  fimpara
  retorne R
fimfuncao
escreval("Informe 1 número:")
leia(N)
F <- fatorial(N)
escreval("O fatorial de",N," é:",F)
Fimalgoritmo