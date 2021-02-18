Algoritmo "semnome"

Var
N: inteiro
R: caractere
funcao ParOuImpar(V:inteiro):caractere
inicio
  Se (V%2 = 0) entao
    retorne "Par"
  senao
    retorne "Impar"
  fimse
fimfuncao
Inicio
escreval("Informe um número:")
leia (N)
R <- ParOuImpar(N)
escreval("O numero",N," e um valor ",R)
Fimalgoritmo