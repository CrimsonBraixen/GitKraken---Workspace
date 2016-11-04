hombre(pedro).
hombre(manuel).
hombre(arturo).
mujer(mar�a).
padre(pedro, manuel).
padre(pedro, arturo).
padre(pedro, mar�a).

ni�o(X,Y):-padre(Y,X).
hijo(X,Y):-padre(Y,X),hombre(X).
hija(X,Y):-padre(Y,X),mujer(X).
hermanoOHermana(X,Y):-padre(Z,X),padre(Z,Y),not(X==Y).
hermano(X,Y):-padre(Z,X),padre(Z,Y),not(X==Y),hombre(X).
hermana(X,Y):-padre(Z,X),padre(Z,Y),not(X==Y),mujer(X).



