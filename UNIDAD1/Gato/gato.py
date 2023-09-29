tablero = [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ']

def imprimir_instrucciones():
    print("Vamos a jugar al gato")
    print("El tablero tiene la siguiente estructura")
    print(" 1 | 2 | 3")
    print("---+---+---")
    print(" 4 | 5 | 6")
    print("---+---+---")
    print(" 7 | 8 | 9")

def dibujar_tablero(tablero):
    print(" %c | %c | %c " % (tablero[0], tablero[1], tablero[2]))
    print("---+---+---")
    print(" %c | %c | %c " % (tablero[3], tablero[4], tablero[5]))
    print("---+---+---")
    print(" %c | %c | %c " % (tablero[6], tablero[7], tablero[8]))
    print("---+---+---")

def estado_juego(tablero):
    # Revisar horizontales
    if tablero[0] == tablero[1] == tablero[2] != ' ':
        estado_actual = "ganador"
    elif tablero[3] == tablero[4] == tablero[5] != ' ':
        estado_actual = "ganador"
    elif tablero[6] == tablero[7] == tablero[8] != ' ':
        estado_actual = "ganador"
    # Revisar verticales
    elif tablero[0] == tablero[3] == tablero[6] != ' ':
        estado_actual = "ganador"
    elif tablero[1] == tablero[4] == tablero[7] != ' ':
        estado_actual = "ganador"
    elif tablero[2] == tablero[5] == tablero[8] != ' ':
        estado_actual = "ganador"
    # Revisar diagonales
    elif tablero[0] == tablero[4] == tablero[8] != ' ':
        estado_actual = "ganador"
    elif tablero[6] == tablero[4] == tablero[2] != ' ':
        estado_actual = "ganador"
    else:
        estado_actual = "jugando"
    return estado_actual

jugador_actual = "X"
estado_actual = "jugando"
turno = 1
imprimir_instrucciones()

while True:
    print("El turno del jugador %s " % jugador_actual)
    posicion = int(input("Elija la posición a jugar (1-9): ")) - 1

    if 0 <= posicion <= 8:
        if tablero[posicion] == " ":
            tablero[posicion] = jugador_actual
            turno = turno + 1
        else:
            print("La posición %s ya está ocupada, elija otra" % str(posicion + 1))
            continue
    else:
        print("Posición no válida")
        continue

    dibujar_tablero(tablero)
    estado_actual = estado_juego(tablero)

    if estado_actual == "jugando":
        jugador_actual = "O" if jugador_actual == "X" else "X"
    elif estado_actual == "ganador":
        print("El jugador %s es el GANADOR " % jugador_actual)
        break
    elif turno >= 9:
        print("Ya no hay más casillas, juego empatado")
        break
