hombre(pepe,alto,castaño,adulto).
hombre(pepin,bajo,rubio,joven).
hombre(pepon,medio,negro,viejo).
mujer(pepa,alto,castaño,adulto).
mujer(pepina,bajo,rubio,joven).
mujer(pepona,medio,negro,viejo).
gusta(pepe,jazz,aventura,tenis).
gusta(pepin,pop,ciencia-ficción,natación).
gusta(pepon,clasica,aventura,natación).
gusta(pepa,jazz,aventura,tenis).
gusta(pepina,pop,ciencia-ficción,natación).
gusta(pepona,clasica,aventura,natación).

busca(pepe,alto,castaño,adulto).
busca(pepin,bajo,rubio,joven).
busca(pepon,medio,negro,viejo).
busca(pepa,alto,castaño,adulto).
busca(pepina,bajo,rubio,joven).
busca(pepona,medio,negro,viejo).

convieneFisico(N1,N2):-busca(N1,X,Y,Z),((hombre(N1,_,_,_),mujer(N2,X,Y,Z));(mujer(N1,_,_,_),hombre(N2,X,Y,Z))).
conviene(N1,N2):-gusta(N1,X,Y,Z),gusta(N2,X,Y,Z),convieneFisico(N1,N2),convieneFisico(N2,N1).
adecuado(N1,N2):-conviene(N1,N2),conviene(N2,N1).

