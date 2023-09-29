import unicodedata

def quitar_acentos(palabra):
    palabra_sin_acentos = ''.join((c for c in unicodedata.normalize('NFD', palabra) if unicodedata.category(c) != 'Mn'))
    return palabra_sin_acentos

while True:
    palabra_con_acentos = input("Ingresa una palabra con acentos (o presiona Enter para salir): ")
    
    if not palabra_con_acentos:
        break
    
    palabra_sin_acentos = quitar_acentos(palabra_con_acentos)
    print("Palabra sin acentos:", palabra_sin_acentos)
