gauss(1,R,I):-R is I+1,!.
gauss(N,R,I):-N1 is N-1, I1 is I+1,gauss(N1,R1,I1),R is	R1+N+I.
sumaGauss(X,R):- gauss(X,R1,1), R is R1/2.

fibo(1,1):-!.
fibo(2,1):-!.
fibo(N,R):-N1 is N-1, N2 is N-2, fibo(N2,R2),fibo(N1,R1), R is R1+R2.

factorial(0,1):-!.
factorial(N,R):-N1 is N-1, factorial(N1,R1), R is N*R1.

producto(X,1,R):-R is X,!.
producto(X,Y,R):-Y1 is Y-1, producto(X,Y1,R1),R is X+R1.

potencia(X,1,R):-R is X.
potencia(X,Y,R):-Y1 is Y-1, potencia(X,Y1,R1), R is X*R1.

division(0,_,R):-R is 0,!.
division(X,Y,R):-X1 is X-Y, division(X1,Y,R1), R is 1 + R1.


mcd(X,0,R):-R is X,!.
mcd(X,Y,R):-Re is X mod Y,mcd(Y,Re,R).

