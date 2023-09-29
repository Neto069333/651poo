import time

class Tamagotchi:
    def __init__(self, nombre):
        self.nombre = nombre
        self.hambre = 0
        self.felicidad = 0
        self.energia = 100
        self.salud = 100

    def alimentar(self):
        self.hambre -= 10
        self.felicidad += 5

    def jugar(self):
        self.felicidad += 10
        self.hambre += 5
        self.energia -= 10

    def dormir(self):
        self.energia += 20

    def cuidar_salud(self):
        self.salud += 10

    def mostrar_estado(self):
        print(f"{self.nombre}:")
        print(f"Hambre: {self.hambre}")
        print(f"Felicidad: {self.felicidad}")
        print(f"Energía: {self.energia}")
        print(f"Salud: {self.salud}")

def main():
    nombre = input("Dale un nombre a tu Tamagotchi: ")
    mi_tamagotchi = Tamagotchi(nombre)

    while True:
        print("\n¿Qué quieres hacer?")
        print("1. Alimentar")
        print("2. Jugar")
        print("3. Dormir")
        print("4. Cuidar salud")
        print("5. Salir")

        opcion = input("Selecciona una opción: ")

        if opcion == "1":
            mi_tamagotchi.alimentar()
        elif opcion == "2":
            mi_tamagotchi.jugar()
        elif opcion == "3":
            mi_tamagotchi.dormir()
        elif opcion == "4":
            mi_tamagotchi.cuidar_salud()
        elif opcion == "5":
            print("Adiós, ¡vuelve pronto!")
            break
        else:
            print("Opción no válida. Inténtalo de nuevo.")

        mi_tamagotchi.mostrar_estado()
        time.sleep(1)

if __name__ == "__main__":
    main()
