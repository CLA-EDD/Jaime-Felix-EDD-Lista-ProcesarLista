# Proyecto - Procesar Lista

El alumno debe implementar la clase ProcesarLista para realizar algunas operaciones con una lista desordenada

## Ejecución

Tu programa debería ejecutarse de la siguiente manera:

```
Procesar Lista
==============

Proporcione el numero de elementos:5
Proporcione el elemento 1:1
Proporcione el elemento 2:2
Proporcione el elemento 3:3
Proporcione el elemento 4:4
Proporcione el elemento 5:5
La suma es:15
El promedio es:3.0
Los elementos mayores que el promedio son:
4
5
Los elementos pares son:
2
4
```

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: ProcesarLista
---
classDiagram
      ProcesarLista: -TDAListaDesordenada<Integer> lista
      ProcesarLista: ProcesarLista(int[] valores)
      ProcesarLista: +int sumar()
      ProcesarLista: +double promediar()
      ProcesarLista: TDAListaDesordenada<Integer> elementosMayoresQuePromedio()
      ProcesarLista: TDAListaDesordenada<Integer> elementosPares()
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -encoding utf-8 -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -encoding utf-8 -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#testSumar()
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)