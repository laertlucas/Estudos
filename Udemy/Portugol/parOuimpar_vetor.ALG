Algoritmo "semnome"

Var
  N: vetor[1..7] de inteiro
  C:inteiro
Inicio
C <- 1
  para C <- 1 ate 7 faca
    escreval("Informe o", C,"º. valor:")
    leia(N[C])
    se (N[C]%2 = 0) entao
      escreval ("Par")
    senao
      escreval("Impar")
    fimse
  fimpara
Fimalgoritmo
